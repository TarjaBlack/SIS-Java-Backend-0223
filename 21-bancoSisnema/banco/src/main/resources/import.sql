INSERT INTO tb_funcao (autoridade) VALUES ('ROLE_ADMIN');
INSERT INTO tb_funcao (autoridade) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_funcao (autoridade) VALUES ('ROLE_STUDENT');
-- 123456
INSERT INTO tb_usuario (nome, sobrenome, email, senha) VALUES ('Ayrton', 'Senna', 'senna@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_usuario (nome, sobrenome, email, senha) VALUES ('Alain', 'Prost', 'prost@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_usuario (nome, sobrenome, email, senha) VALUES ('Rubens', 'Barrichello', 'rb@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (1L, 1L);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (1L, 2L);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (1L, 3L);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (2L, 2L);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (2L, 3L);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (3L, 3L);

INSERT INTO tb_tipo_conta (tipo) VALUES ('Corrente');
INSERT INTO tb_tipo_conta (tipo) VALUES ('Poupança');
INSERT INTO tb_tipo_conta (tipo) VALUES ('Salário');

INSERT INTO tb_conta (banco, agencia, numero, limite, saldo, tipo_conta_id) VALUES (1, '255', '23541-6', 0.0, 650.25, 3);
INSERT INTO tb_conta (banco, agencia, numero, limite, saldo, tipo_conta_id) VALUES (104, '210', '24551-5', 200.0, 3365.14, 1);
INSERT INTO tb_conta (banco, agencia, numero, limite, saldo, tipo_conta_id) VALUES (1, '552', '65431-2', 5000.0, 4.1, 1);
INSERT INTO tb_conta (banco, agencia, numero, limite, saldo, tipo_conta_id) VALUES (77, '1', '25434-1', 750.0, 369.87, 1);
INSERT INTO tb_conta (banco, agencia, numero, limite, saldo, tipo_conta_id) VALUES (260, '1', '23441-2', 350.0, 14.785, 1);
