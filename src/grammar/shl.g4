// Language grammar for 'shl'

grammar shl;

@header {
package grammar;
}

TRUE : 'T';
FALSE : 'F';

DEC_NUMBER : ('0'|[1-9][0-9]*('.'[0-9]*)?|'0'?'.'[0-9]+)([eE][0-9]+)? ;
HEX_NUMBER : '0'[xX][0-9a-fA-F]+ ;
OCT_NUMBER : '0'[0-7]+ ;
BIN_NUMBER : '0'[bB][01]+;

IDENTIFIER : [_a-zA-Z][_a-zA-Z0-9]* ;

STRING : '"' (~('"')|'\\"'|'\\?'|'\\0'|'\\a'|'\\b'|'\\f'|'\\n'|'\\r'|'\\t'|'\\v')* '"' ;



unary_expression
 //: '!' unary_expression
 : cast_expression
 ;


multiplication_expression
 : lhs=multiplication_expression '**' rhs=unary_expression #PowExpr
 | lhs=multiplication_expression '*' rhs=unary_expression #MulExpr
 | lhs=multiplication_expression '/' rhs=unary_expression #DivExpr
 | lhs=multiplication_expression '%' rhs=unary_expression #ModExpr
 | unary_expression #MulFT
 ;

arithmetic_expr
 : lhs=arithmetic_expr '+' rhs=multiplication_expression #PlusExpr
 | lhs=arithmetic_expr '-' rhs=multiplication_expression #MinusExpr
 | multiplication_expression #ArithFT
 ;

cmp_expr
 : lhs=cmp_expr '<' rhs=arithmetic_expr #CmpLTExpr
 | lhs=cmp_expr '<=' rhs=arithmetic_expr #CmpLEExpr
 | lhs=cmp_expr '>' rhs=arithmetic_expr #CmpGTExpr
 | lhs=cmp_expr '>=' rhs=arithmetic_expr #CmpGEExpr
 | lhs=cmp_expr '==' rhs=arithmetic_expr #CmpEQExpr
 | lhs=cmp_expr '!=' rhs=arithmetic_expr #CmpNEExpr
 | arithmetic_expr #CmpFT
 ;

log_negation // why here?
 : '!' expr=log_negation #NotExpr
 | cmp_expr #NotFT
 ;

log_and_expr
 : lhs=log_and_expr '&&' rhs=log_negation # AndExpr
 | log_negation #AndFT
 ;

binary_expression
 : lhs=binary_expression '||' rhs=log_and_expr #OrExpr
 | log_and_expr #BinFT
 ;

non_empty_function_call_params
 : list=non_empty_function_call_params ',' expr=expression #FnCallParmList
 | expr=expression #SingleFnCallParm
 ;

function_call_params
 : non_empty_function_call_params #NEFnCallParms
 | #EmptyFnCallParms // nothing
 ;

function_call_expression
 : ident=IDENTIFIER '(' parms=function_call_params ')'
 ;

string_const
 : STRING
 ;

number
 : DEC_NUMBER #DecNr
 | HEX_NUMBER #HexNr
 | OCT_NUMBER #OctNr
 | BIN_NUMBER #BinNr
 ;
 
bool_const
 : TRUE #TrueConst
 | FALSE #FalseConst
 ;

cast_expression
 : expr=primary_expression ':' cast_type=type #CastExpr
 | expr=primary_expression #NormalExpr
 ;

primary_expression
 : IDENTIFIER #VarExpr
 | number #NrExpr
 | bool_const #BoolConstExpr
 | string_const #StringExpr
 | function_call_expression #FnCallExpr
 | '(' expression ')' #ParenExpr
 ;

assign_operator
 : '=' #AssignOp
 | '+=' #PlusAssignOp
 | '-=' #MinusAssignOp
 | '*=' #TimesAssignOp
 | '/=' #DivAssignOp
 | '%=' #ModAssignOp
 | '<<=' #LShiftAssignOp
 | '>>=' #RShiftAssignOp
 | '**=' #PowAssignOp
 ;

assignment_statement
 : ident=IDENTIFIER op=assign_operator expr=expression
 ;

expression
 : binary_expression
 ;

identifier_list
  : ident=IDENTIFIER ',' list=identifier_list #IdentList
  | ident=IDENTIFIER #Ident
  ;

initialized_identifier
  : ident=IDENTIFIER '=' expr=expression
  ;

initialized_identifier_list
  : ident=initialized_identifier #InitIdent
  | list=initialized_identifier_list ',' ident=initialized_identifier #InitIdentList
  ;

declaration
 : 'var' vars=initialized_identifier_list #InitVar
 | 'var' vars=identifier_list ':' var_type=type #TypeVar
 ;

elif_statement
 : 'elif' cond=if_cond stmts=statement_block
 ;

opt_elif_statement_list
 : elif_stmt=elif_statement list=opt_elif_statement_list #ElifList
 | #NoElif// nothing
 ;
 
if_statement
 : 'if' cond=if_cond then=statement_block elifstmt=opt_elif_statement_list else_stmt=else_statement
 ;

else_statement
 : 'el' stmts=statement_block #ElStatement
 | #NoneEl //nothing
 ;
 
if_cond
 : binary_expression
 ;

for_statement
 : 'for' init=for_init ';' cond=for_cond ';' incr=for_incr stmts=statement_block
 ;
 
for_init
 : expression
 | declaration
 ;
 
for_cond
 : expression
 ;
 
for_incr
 : statement
 ;

whl_statement
 : 'whl' cond=whl_cond stmts=statement_block
 ;
 
whl_cond
 : expression
 ;
 
ret_statement
 : 'ret' val=expression #RetTypeStmt
 | 'ret' #RetVoidStmt
 ;

brk_statement
 : 'brk'
 ;

cnt_statement
 : 'cnt'
 ;

statement
 : declaration #DeclStmt
 | assignment_statement #AssignStmt
 | ret_statement #RetStmt
 | brk_statement #BrkStmt
 | cnt_statement #CntStmt
 | expression #ExprStmt
 ;

block_statement
 : statement_block #Block
 | if_statement #If
 | for_statement #For
 | whl_statement #Whl
 // | do_expression #Do
 ;

type
 : 'int' #IntType
 | 'flt' #FloatType
 | 'boo' #BoolType
 | 'chr' #CharType
 | 'str' #StrType
 ;

type_or_void
 : type #NoneVacType
 | 'vac'#Vac
 ;

statement_list
 : list=statement_list stmt=statement ';' #NormalStatement
 | list=statement_list stmt=block_statement #BlockStatement
 | #EmptyStmtList // nothing
 ;

statement_block
  : '{' stmt_list=statement_list '}'
  ;

function_parameter_declaration // no default parameters so far ...
  : parm_type=type id_list=identifier_list
  ;

function_parameter_list
  : parm=function_parameter_declaration ';' list=function_parameter_list #ParamList
  | parm=function_parameter_declaration #SingleParam
  | #NonFnParam // nothing
  ;

opt_return_type
  : ':' type_or_void #RetType
  | #NoneRetType // nothing
  ;

function_declaration
  : 'fn' 'main' '(' ')' body=statement_block #MainFn
  | 'fn' IDENTIFIER '(' params=function_parameter_list ')' ret=opt_return_type body=statement_block #FnDef
  | 'fn' IDENTIFIER '(' params=function_parameter_list ')' ret=opt_return_type ';' #FnDecl
  | 'fn' IDENTIFIER '(' params=function_parameter_list ')' ret=opt_return_type 'native' pkgname=string_const';' #FnNative
  ;

use_statement
 : 'use' module_name=string_const ';'
 ;

function_declaration_list_or_use_statement
 : function_declaration_list_or_use_statement function_declaration #FnDeclList
 | function_declaration_list_or_use_statement use_statement #UseStmt
 | #EmptyFnDeclList // nothing
 ;

start
 : function_declaration_list_or_use_statement
 ;

MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN); // *? is the non-greedy version of *
LINE_COMMENT  : '//' ~('\n')* -> channel(HIDDEN);
WS            : [ \t\v\n\r]   -> channel(HIDDEN);
