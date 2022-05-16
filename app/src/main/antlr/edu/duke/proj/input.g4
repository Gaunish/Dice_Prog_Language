grammar input ;

prog : (exp)* ;

roll : INT ID INT ;

simpleRoll  : ID INT;

exp : roll
    | value = INT
    | simpleRoll
    | leftExp = exp op = arithmeticOp rightExp = exp
    | '(' exp ')'
    ;

arithmeticOp : mul = '*'
            | div = '/'
            | plus = '+'
            | minus = '-';

INT : [0-9]+ ;
ID : [d] ;
WS: [ \t\r\n]+ -> skip ;