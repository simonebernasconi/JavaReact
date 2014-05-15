grammar Common;
    
identifierNum: hostId DOT observableId DOT method ':Num';
identifierString: hostId DOT observableId DOT method  ':String';
identifierBool: hostId DOT observableId DOT method  ':Bool';
identifierListInt: hostId DOT observableId DOT method  ':ListInt';
identifierListBool: hostId DOT observableId DOT method  ':ListBool';
identifierListDouble: hostId DOT observableId DOT method  ':ListDouble';
identifierListString: hostId DOT observableId DOT method  ':ListString';

hostId: '*' | ID;
observableId: ID;
method: 'get('')' | 'size('')' | 'contains(' DOUBLE ')';

MUL: '*';
DIV: '/'; 
ADD: '+';
SUB: '-';
DOT: '.';
MIN: '<';
MAX: '>';
NOT: '!';
EQUAL: '==';
AND: '&';
OR: '|';
AVG: 'Avg';
SUM: 'Sum';
ASC: 'orderAsc';
DESC: 'orderDesc';
ALLTRUE: 'isAllTrue';
ALLFALSE: 'isAllFalse';

ID: [A-Z] [a-zA-Z0-9]*;
STRING: '\''[ a-zA-Z0-9]+ '\'';
DIGIT: [0-9]+ ;
DOUBLE: [0-9]* DOT [0-9]+ ;
BOOL: 'true' | 'false' ;


WS: [ \n\t]+ -> skip;