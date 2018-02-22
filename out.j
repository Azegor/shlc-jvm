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
.limit stack 0
.limit locals 0
return

.end method

