.source test.shl
.class public test
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 2
.limit locals 1
getstatic      java/lang/System/out Ljava/io/PrintStream;
ldc            "[Program Start]"
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V
invokestatic test/$main$()V
getstatic      java/lang/System/out Ljava/io/PrintStream;
ldc            "[Program End]"
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method

.method public static $main$()V
.limit stack 4
.limit locals 14
main_scope_start_1:
_scope_start_1:
.var 2 is l J from _scope_start_1 to _scope_end_1
.var 0 is m J from _scope_start_1 to _scope_end_1
.var 6 is j J from _scope_start_1 to _scope_end_1
.var 4 is k J from _scope_start_1 to _scope_end_1
.var 8 is i J from _scope_start_1 to _scope_end_1
.line 2
    ldc2_w 0
    lstore_0
    ldc2_w 0
    lstore_2
    ldc2_w 0
    lstore 4
    ldc2_w 0
    lstore 6
    ldc2_w 0
    lstore 8
_scope_start_2:
.var 10 is d C from _scope_start_2 to _scope_end_2
.var 12 is b C from _scope_start_2 to _scope_end_2
.var 11 is c C from _scope_start_2 to _scope_end_2
.var 13 is a C from _scope_start_2 to _scope_end_2
.line 4
    iconst_0
    istore 10
    iconst_0
    istore 11
    iconst_0
    istore 12
    iconst_0
    istore 13
_scope_end_2:
.line 6
    ldc2_w 2
    lstore 8
.line 7
    ldc2_w 42
    pop2
; ---
.line 8
    ldc2_w 1
    ldc2_w 2
    ladd
    pop2
; ---
    return
_scope_end_1:
main_scope_end_1:
.end method

.method public static test()V
.limit stack 0
.limit locals 0
test_scope_start_1:
_scope_start_3:
    return
_scope_end_3:
test_scope_end_1:
.end method

