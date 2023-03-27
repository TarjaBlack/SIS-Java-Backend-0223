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