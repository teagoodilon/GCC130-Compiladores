grammar Hekissa;

programa: DELIM ALG declaracoes corpo EOF;
declaracoes: (declaracao)+ ;
declaracao: TIP VAR ;
corpo: (comando)*;
comando: (leitura | escrita | condicional | iterativo | atribuicao) ;
leitura: LER VAR ;
escrita: IMP opcoes ;
opcoes: CAD | VAR;
condicional: SE expressao OPREL expressao ENT corpo SEN corpo ;
iterativo: ENQ  expressao OPREL expressao COM corpo TER ;
atribuicao: VAR IGU expressao ;
expressao: fator OPARIT fator  | fator ;
fator: VAR | NUMI | NUMR | OPBOOL;

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
