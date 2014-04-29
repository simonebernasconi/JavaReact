grammar Common;
    
identifier: hostId DOT observableId DOT method |
			observableId DOT method;

hostId: ID | '*';
observableId: ID;
method: ID'('')';

MUL: '*';
DIV: '/'; 
ADD: '+';
SUB: '-';
EQUAL: '==';
DOT: '.';
AND: '&';
OR: '|';
NOT: '!';
BOOL: 'true'|'false';
MAX: '>';
MIN: '<';
MAXEQ: '>=';
MINEQ: '<=';
SIZE: 'size';
ISEMPTY: 'isEmpty';
CONTAINS: 'contains';
COMMA: ',';
ORDERASC: 'orderAsc';
ORDERDESC: 'orderDesc';
ORDERASCBOOL: 'orderAscBool';
ORDERDESCBOOL: 'orderDescBool';
FILTER: 'filterBy';
AVG: 'avg';
SUM: 'sum';
ASC: 'isAsc';
DESC: 'isDesc';
ALLTRUE: 'isAllTrue';
ALLFALSE: 'isAllFalse';


ID: [a-zA-Z] [a-zA-Z0-9]*;
DIGIT: [0-9]+;
DOUBLE: [0-9]* DOT [0-9]+;
STRING: [a-zA-Z0-9]+;
LISTDIGIT: '[' SEQINT ']';
SEQINT: DIGIT | DIGIT ',' SEQINT;
LISTDOUBLE: '[' SEQDOUBLE ']';
SEQDOUBLE: DOUBLE | DOUBLE ',' SEQDOUBLE;
LISTSTRING: '[' STRING (COMMA STRING)* ']';
LISTBOOL: '[' BOOL (COMMA BOOL)* ']';

WS: [ \n\t]+ -> skip;