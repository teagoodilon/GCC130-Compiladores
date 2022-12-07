grammar MinhaGramatica;

ALG: 'ALGORITMO';
TIP: 'MADRID' | 'DEMILAO';
LER: 'LER';
IMP: 'IMPIRMIR';
SE: 'SE';
SEN: 'SENAO';
ENT: 'ENTAO';
ENQ: 'ENQUANTO';
IGU: 'IGUAL';
COM: 'COMECA';
TER: 'TERMINA';
AP: '(';
FP: ')';
DELIM:':';
VAR: LETRA(DIGITO|LETRA)*;
NumI: DIGITO*;
NumR: DIGITO*','DIGITO*;

OpArit: '+'|'-'|'*'|'/'|'%';
OpRel: '<'|'>'|'<='|'>=' | '==';
OpBool: 'REAL' | 'FAKE';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0..9];
WS: [ \r\t\n]* ->skip;