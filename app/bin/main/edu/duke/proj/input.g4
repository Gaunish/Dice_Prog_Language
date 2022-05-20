grammar input ;

prog : exp EOF ;

exp : Roll                                              # rollExp
    | SingleRoll                                        # singleRollExp
    | leftExp = exp op = ('*'|'/') rightExp = exp       # ArithmeticExp
    | leftExp = exp op = ('+'|'-') rightExp = exp       # ArithmeticExp
    | '(' exp ')'                                       # parensExp
    | exp '?' exp ':' exp                               # conditionalExp
    | ID                                                # varExp
    | value = INT                                       # valueExp
    ;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
Roll : INT KEY INT ;
SingleRoll  : KEY INT;
INT : [0-9]+ ;
KEY : [d] ;
ID : [a-zA-Z][0-9a-zA-Z]* ;
WS: [ \t\r\n]+ -> skip ;