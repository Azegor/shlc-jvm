.source language_def.shl
.class public language_def
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 2
.limit locals 1
getstatic      java/lang/System/out Ljava/io/PrintStream;
ldc            "[Program Start]"
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V
invokestatic language_def/$main$()V
getstatic      java/lang/System/out Ljava/io/PrintStream;
ldc            "[Program End]"
invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method

.method public static cmpTest()V
.limit stack 4
.limit locals 10
cmpTest_scope_start_1:
_scope_start_1:
.var 6 is f Z from _scope_start_1 to _scope_end_1
.var 7 is g Z from _scope_start_1 to _scope_end_1
.var 0 is res Z from _scope_start_1 to _scope_end_1
.var 4 is d Z from _scope_start_1 to _scope_end_1
.var 5 is e Z from _scope_start_1 to _scope_end_1
.var 2 is b Z from _scope_start_1 to _scope_end_1
.var 3 is c Z from _scope_start_1 to _scope_end_1
.var 1 is a Z from _scope_start_1 to _scope_end_1
.var 8 is h Z from _scope_start_1 to _scope_end_1
.var 9 is i Z from _scope_start_1 to _scope_end_1
.line 77
    iconst_0
    istore_0
.line 78
    ldc2_w 7
    ldc2_w 14
    lcmp
    iflt cmp_true_1
    iconst_0
    goto cmp_false_1
cmp_true_1:
    iconst_1
cmp_false_1:
    istore_0
.line 79
    ldc "res: "
    invokestatic stdlib/prt(Ljava/lang/String;)V
; ---
.line 80
    iload_0
    invokestatic stdlib/pln(Z)V
; ---
.line 82
    iconst_1
    istore_1
    iconst_0
    istore_2
.line 83
    iload_1
    iload_2
    iand
    istore_3
.line 84
    iload_1
    iload_2
    ior
    istore 4
.line 85
    iload_1
    iload_2
    if_icmplt cmp_true_2
    iconst_0
    goto cmp_false_2
cmp_true_2:
    iconst_1
cmp_false_2:
    istore 5
.line 86
    iload_1
    iload_2
    if_icmplt cmp_true_3
    iconst_0
    goto cmp_false_3
cmp_true_3:
    iconst_1
cmp_false_3:
    istore 6
.line 87
    iload_1
    iload_2
    if_icmplt cmp_true_4
    iconst_0
    goto cmp_false_4
cmp_true_4:
    iconst_1
cmp_false_4:
    istore 7
.line 88
    iload_1
    iload_2
    if_icmplt cmp_true_5
    iconst_0
    goto cmp_false_5
cmp_true_5:
    iconst_1
cmp_false_5:
    istore 8
.line 89
    iload_1
    istore 9
.line 90
    iload_3
    invokestatic stdlib/pln(Z)V
; ---
.line 91
    iload 4
    invokestatic stdlib/pln(Z)V
; ---
.line 92
    iload 5
    invokestatic stdlib/pln(Z)V
; ---
.line 93
    iload 6
    invokestatic stdlib/pln(Z)V
; ---
.line 94
    iload 7
    invokestatic stdlib/pln(Z)V
; ---
    return
_scope_end_1:
cmpTest_scope_end_1:
.end method

.method public static ifTest()V
.limit stack 1
.limit locals 0
ifTest_scope_start_1:
_scope_start_2:
; --- if
    iconst_1
    ifeq if_else_1
_scope_start_3:
.line 101
    ldc "condition is true"
    invokestatic stdlib/pln(Ljava/lang/String;)V
; ---
_scope_end_2:
    goto if_end_1
if_else_1:
_scope_start_4:
.line 103
    ldc "condition is false"
    invokestatic stdlib/pln(Ljava/lang/String;)V
; ---
_scope_end_3:
if_end_1:
; --- endif
    return
_scope_end_4:
ifTest_scope_end_1:
.end method

.method public static cmplxOpTest()V
.limit stack 4
.limit locals 5
cmplxOpTest_scope_start_1:
_scope_start_5:
.var 0 is res J from _scope_start_5 to _scope_end_5
.var 3 is b Ljava/lang/String; from _scope_start_5 to _scope_end_5
.var 4 is c Ljava/lang/String; from _scope_start_5 to _scope_end_5
.var 2 is a Ljava/lang/String; from _scope_start_5 to _scope_end_5
.line 108
    ldc2_w 0
    lstore_0
.line 109
    ldc2_w 2
    l2d
    ldc2_w 10
    l2d
    invokestatic java/lang/Math/pow(DD)D
    d2l
    lstore_0
.line 110
    ldc "2 ^ 10 = "
    invokestatic stdlib/prt(Ljava/lang/String;)V
; ---
.line 111
    lload_0
    invokestatic stdlib/pln(J)V
; ---
.line 112
    ldc "[a]"
    astore_2
    ldc "[b]"
    astore_3
    ldc ""
    astore 4
.line 113
    aload_2
    aload_3
    invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;
    astore 4
.line 114
    aload 4
    invokestatic stdlib/pln(Ljava/lang/String;)V
; ---
    return
_scope_end_5:
cmplxOpTest_scope_end_1:
.end method

.method public static whlTest()V
.limit stack 4
.limit locals 2
whlTest_scope_start_1:
_scope_start_6:
.var 0 is i J from _scope_start_6 to _scope_end_6
.line 118
    ldc2_w 10
    lstore_0
whl_loop_body_start_1:
    lload_0
    ldc2_w 0
    lcmp
    ifgt cmp_true_6
    iconst_0
    goto cmp_false_6
cmp_true_6:
    iconst_1
cmp_false_6:
    ifeq whl_loop_body_end_1
_scope_start_7:
.line 120
    lload_0
    invokestatic stdlib/pln(J)V
; ---
.line 121
    lload_0
    ldc2_w 1
    lsub
    lstore_0
_scope_end_7:
    goto whl_loop_body_start_1
whl_loop_body_end_1:

.line 124
    ldc2_w 10
    lstore_0
whl_loop_body_start_2:
    lload_0
    ldc2_w 0
    lcmp
    ifgt cmp_true_7
    iconst_0
    goto cmp_false_7
cmp_true_7:
    iconst_1
cmp_false_7:
    ifeq whl_loop_body_end_2
_scope_start_8:
.line 126
    lload_0
    ldc2_w 1
    lsub
    lstore_0
; --- if
    lload_0
    ldc2_w 2
    lrem
    ldc2_w 0
    lcmp
    ifeq cmp_true_8
    iconst_0
    goto cmp_false_8
cmp_true_8:
    iconst_1
cmp_false_8:
    ifeq if_else_2
_scope_start_9:
.line 128
    goto whl_loop_body_start_2
_scope_end_8:
    goto if_end_2
if_else_2:
    lload_0
    ldc2_w 3
    lcmp
    ifeq cmp_true_9
    iconst_0
    goto cmp_false_9
cmp_true_9:
    iconst_1
cmp_false_9:
    ifeq elif_false_1
_scope_start_10:
.line 131
    goto whl_loop_body_end_2
_scope_end_9:
    goto if_end_2
elif_false_1:
if_end_2:
; --- endif
.line 133
    ldc "loop index = "
    invokestatic stdlib/prt(Ljava/lang/String;)V
; ---
.line 134
    lload_0
    invokestatic stdlib/pln(J)V
; ---
_scope_end_10:
    goto whl_loop_body_start_2
whl_loop_body_end_2:

    return
_scope_end_6:
whlTest_scope_end_1:
.end method

.method public static $main$()V
.limit stack 2
.limit locals 1
main_scope_start_1:
_scope_start_11:
.var 0 is t Z from _scope_start_11 to _scope_end_11
.line 144
    iconst_1
    iconst_1
    ixor
    iconst_1
    ixor
    iconst_1
    ixor
    istore_0
.line 145
    iload_0
    invokestatic stdlib/pln(Z)V
; ---
.line 147
    ldc "hi"
    invokestatic stdlib/pln(Ljava/lang/String;)V
; ---
.line 148
    ldc2_w 42
    invokestatic stdlib/pln(J)V
; ---
.line 150
    invokestatic language_def/cmpTest()V
; ---
.line 151
    invokestatic language_def/cmplxOpTest()V
; ---
.line 153
    invokestatic language_def/ifTest()V
; ---
.line 155
    invokestatic language_def/whlTest()V
; ---
.line 157
    invokestatic language_def/someOtherFn()V
; ---
    return
_scope_end_11:
main_scope_end_1:
.end method

.method public static callSomeOtherFn()V
.limit stack 0
.limit locals 0
callSomeOtherFn_scope_start_1:
_scope_start_12:
    return
_scope_end_12:
callSomeOtherFn_scope_end_1:
.end method

.method public static someFn(DDJJ)V
.limit stack 0
.limit locals 8
someFn_scope_start_1:
.var 0 is p4 D from someFn_scope_start_1 to someFn_scope_end_1
.var 2 is p3 D from someFn_scope_start_1 to someFn_scope_end_1
.var 4 is p2 J from someFn_scope_start_1 to someFn_scope_end_1
.var 6 is p1 J from someFn_scope_start_1 to someFn_scope_end_1
_scope_start_13:
.line 164
    invokestatic language_def/callSomeOtherFn()V
; ---
    return
_scope_end_13:
someFn_scope_end_1:
.end method

.method public static otherFn(J)J
.limit stack 2
.limit locals 4
otherFn_scope_start_1:
.var 0 is x J from otherFn_scope_start_1 to otherFn_scope_end_1
_scope_start_14:
.var 2 is y J from _scope_start_14 to _scope_end_14
.line 169
    ldc2_w 0
    lstore_2
    ldc2_w 42
    lreturn
_scope_end_14:
otherFn_scope_end_1:
.end method

.method public static a()J
.limit stack 2
.limit locals 0
a_scope_start_1:
_scope_start_15:
    ldc2_w 42
    lreturn
_scope_end_15:
a_scope_end_1:
.end method

.method public static logTest()V
.limit stack 2
.limit locals 3
logTest_scope_start_1:
_scope_start_16:
.var 1 is b Z from _scope_start_16 to _scope_end_16
.var 0 is c Z from _scope_start_16 to _scope_end_16
.var 2 is a Z from _scope_start_16 to _scope_end_16
.line 181
    iconst_0
    istore_0
    iconst_0
    istore_1
    iconst_0
    istore_2
.line 182
    iload_1
    iload_0
    ior
    istore_2
    return
_scope_end_16:
logTest_scope_end_1:
.end method

.method public static yay()Z
.limit stack 1
.limit locals 0
yay_scope_start_1:
_scope_start_17:
    iconst_1
    ireturn
_scope_end_17:
yay_scope_end_1:
.end method

.method public static then()V
.limit stack 0
.limit locals 0
then_scope_start_1:
_scope_start_18:
    return
_scope_end_18:
then_scope_end_1:
.end method

.method public static nay()V
.limit stack 0
.limit locals 0
nay_scope_start_1:
_scope_start_19:
    return
_scope_end_19:
nay_scope_end_1:
.end method

.method public static afterIf()V
.limit stack 0
.limit locals 0
afterIf_scope_start_1:
_scope_start_20:
    return
_scope_end_20:
afterIf_scope_end_1:
.end method

.method public static doSth()V
.limit stack 0
.limit locals 0
doSth_scope_start_1:
_scope_start_21:
    return
_scope_end_21:
doSth_scope_end_1:
.end method

.method public static doSthDifferent()V
.limit stack 0
.limit locals 0
doSthDifferent_scope_start_1:
_scope_start_22:
    return
_scope_end_22:
doSthDifferent_scope_end_1:
.end method

.method public static whatEverIDontCare()V
.limit stack 0
.limit locals 0
whatEverIDontCare_scope_start_1:
_scope_start_23:
    return
_scope_end_23:
whatEverIDontCare_scope_end_1:
.end method

.method public static conditions()V
.limit stack 4
.limit locals 2
conditions_scope_start_1:
_scope_start_24:
.var 1 is a Z from _scope_start_24 to _scope_end_24
.var 0 is cond Z from _scope_start_24 to _scope_end_24
; --- if
    invokestatic language_def/yay()Z
    ifeq if_else_3
_scope_start_25:
.line 306
    invokestatic language_def/then()V
; ---
_scope_end_25:
    goto if_end_3
if_else_3:
_scope_start_26:
.line 308
    invokestatic language_def/nay()V
; ---
_scope_end_26:
if_end_3:
; --- endif
.line 311
    invokestatic language_def/afterIf()V
; ---
; --- if
    iconst_1
    ifeq if_else_4
_scope_start_27:
.line 316
    invokestatic language_def/doSth()V
; ---
_scope_end_27:
    goto if_end_4
if_else_4:
    iconst_0
    ifeq elif_false_2
_scope_start_28:
.line 320
    invokestatic language_def/doSthDifferent()V
; ---
_scope_end_28:
    goto if_end_4
elif_false_2:
_scope_start_29:
.line 324
    invokestatic language_def/whatEverIDontCare()V
; ---
_scope_end_29:
if_end_4:
; --- endif
.line 328
    iconst_1
    istore_0
    iconst_0
    istore_1
whl_loop_body_start_3:
    iload_0
    ifeq whl_loop_body_end_3
_scope_start_30:
.line 332
    ldc2_w 4
    ldc2_w 5
    ladd
    pop2
; ---
_scope_end_30:
    goto whl_loop_body_start_3
whl_loop_body_end_3:

    return
_scope_end_24:
conditions_scope_end_1:
.end method

.method public static someFn()V
.limit stack 1
.limit locals 0
someFn_scope_start_2:
_scope_start_31:
.line 370
    ldc "I sound my barbaric YAWP over the roofs of the world."
    invokestatic stdlib/prt(Ljava/lang/String;)V
; ---
    return
_scope_end_31:
someFn_scope_end_2:
.end method

.method public static bla()V
.limit stack 1
.limit locals 0
bla_scope_start_1:
_scope_start_32:
.line 374
    ldc "bla"
    invokestatic stdlib/pln(Ljava/lang/String;)V
; ---
    return
_scope_end_32:
bla_scope_end_1:
.end method

.method public static someOtherFn()V
.limit stack 4
.limit locals 4
someOtherFn_scope_start_1:
_scope_start_33:
.var 0 is a J from _scope_start_33 to _scope_end_33
.line 379
    ldc2_w 0
    lstore_0
whl_loop_body_start_4:
    lload_0
    ldc2_w 0
    lcmp
    ifne cmp_true_10
    iconst_0
    goto cmp_false_10
cmp_true_10:
    iconst_1
cmp_false_10:
    ifeq whl_loop_body_end_4
_scope_start_34:
.line 382
    invokestatic language_def/doSth()V
; ---
_scope_end_34:
    goto whl_loop_body_start_4
whl_loop_body_end_4:

for_loop_scope_start_1:
.var 2 is i J from for_loop_scope_start_1 to for_loop_scope_end_1
.line 394
    ldc2_w 0
    lstore_2
for_loop_body_start_1:
    lload_2
    ldc2_w 42
    lcmp
    iflt cmp_true_11
    iconst_0
    goto cmp_false_11
cmp_true_11:
    iconst_1
cmp_false_11:
    ifeq for_loop_body_end_1
_scope_start_35:
.line 395
    invokestatic language_def/bla()V
; ---
_scope_end_35:
.line 394
    lload_2
    ldc2_w 1
    ladd
    lstore_2
    goto for_loop_body_start_1
for_loop_body_end_1:

for_loop_scope_end_1:
    return
_scope_end_33:
someOtherFn_scope_end_1:
.end method

