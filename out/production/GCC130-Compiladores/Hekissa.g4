grammar Hekissa;

programa: DELIM ALG declaracoes corpo EOF #NPrograma;
declaracoes: (declaracao)+ #NDeclaracoes;
declaracao: TIP VAR #NDeclaracao;
corpo: (comando)* #NCorpo;
comando: (leitura | escrita | condicional | iterativo | atribuicao) #NComando;
leitura: LER VAR #NLeitura;
escrita: IMP opcoes #NEscrita;
opcoes: CAD | VAR #NOpcoes;
condicional: SE expressao OPREL expressao ENT corpo SEN corpo #NCondicional;
iterativo: ENQ  expressao OPREL expressao COM corpo TER #NIterativo;
atribuicao: VAR IGU expressao #NAtribuicao;
expressao: fator OPARIT fator #NExpressao;
fator: VAR | NUMI | NUMR | OPBOOL #NFator;

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
