lexer grammar mLexer;

@header{
    package org.daimor; 
}

Label
    : {(getCharPositionInLine()==0)}? ID; 

ID  :	[a-zA-Z] [a-zA-Z0-9]*;

INT :	[0-9]+;

EOL : [\r\n]+;

WS  : [ \t]+;


