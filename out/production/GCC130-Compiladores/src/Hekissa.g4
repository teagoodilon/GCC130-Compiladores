grammar Hekissa;

ALG: 'ALGORITMO';
TIP: 'MADRID' | 'DEMILAO';
LER: 'LER';
IMP: 'IMPRIMIR';
SE: 'SE';
SEN: 'SENAO';
ENT: 'ENTAO';
ENQ: 'ENQUANTO';
IGU: 'IGUAL';
COM: 'COMECA';
TER: 'TERMINA';
AP: '(';
FP: ')';
DELIM: ':';
VAR: LETRA(DIGITO|LETRA)*;
NUMI: DIGITO*;
NUMR: DIGITO*','DIGITO*;
CAD: '"'LETRA(DIGITO|LETRA)*'"';

OPARIT: '+'|'-'|'*'|'/'| '%';
OPREL: '<'|'>'|'<='|'>=' | '==';
OPBOOL: 'REAL' | 'FAKE';

fragment LETRA:[a-zA-Z];
fragment DIGITO:[0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;