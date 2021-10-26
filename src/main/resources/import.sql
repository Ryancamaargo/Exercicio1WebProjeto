INSERT INTO paciente (nome, idade) values('Ryan', 19);
INSERT INTO doenca (nome) values('Dor de cabeça');
INSERT INTO cuidadosminimos (id_Doenca, descricao) values(1, 'Não ouvir musica alta e dormir bem');
INSERT INTO medicamento (id_Doenca, nome) values(1, 'Dorflex');
INSERT INTO receituario (observacao, id_paciente, id_doenca) values('Repousar', 1, 1);

