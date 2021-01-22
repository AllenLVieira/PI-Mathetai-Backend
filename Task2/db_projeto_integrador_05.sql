CREATE TABLE `tb_usuario` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome_completo` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(20) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_tema` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`assunto` varchar(50) NOT NULL,
	`keywords` varchar(255) NOT NULL,
	`quantidade` int(10) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_postagem` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`descricao` varchar(2000) NOT NULL,
	`data` DATETIME NOT NULL,
	`url_midia` varchar(255) NOT NULL,
	`usuario_id` bigint NOT NULL,
	`tema_id` bigint NOT NULL,
	`interacao` int(10) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`usuario_id`) REFERENCES `tb_usuario`(`id`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`tema_id`) REFERENCES `tb_tema`(`id`);

