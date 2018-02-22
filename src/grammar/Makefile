all:
	antlr4  -no-listener -visitor shl.g4
	javac -cp .:/usr/local/lib/antlr-4.2.1-complete.jar:${CLASSPATH} *.java

test: all
	grun grammar/shl start -gui <../../language_def.txt
