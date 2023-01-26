CREATE DATABASE cniApi;



CREATE TABLE `industrias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data_criacao` date DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `limite_producao_diaria` int DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo_atividade` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
