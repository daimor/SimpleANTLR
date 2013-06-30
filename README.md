SimpleANTLR
===========
Simple Netbeans Platform Application Editor with ANTLRLexer

Lexer grammar

Label
    : {(getCharPositionInLine()==0)}? ID; 

ID  :  [a-zA-Z] [a-zA-Z0-9]*;

INT :	[0-9]+;

EOL : [\r\n]+;

WS  : [ \t]+;

For use, create a simple text file *.m, and open in this application

Text on first position in line must be highlighted red color
other text - blue, and numbers - green
