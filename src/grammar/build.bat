%runANTLR% -listener -visitor shl.g4
%compile% *.java
%grun% shl start