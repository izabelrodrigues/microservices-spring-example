-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.11-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para supplier-db
DROP DATABASE IF EXISTS `supplier-db`;
CREATE DATABASE IF NOT EXISTS `supplier-db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `supplier-db`;

-- Copiando estrutura para tabela supplier-db.info_fornecedor
DROP TABLE IF EXISTS `info_fornecedor`;
CREATE TABLE IF NOT EXISTS `info_fornecedor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `endereco` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela supplier-db.info_fornecedor: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `info_fornecedor` DISABLE KEYS */;
INSERT IGNORE INTO `info_fornecedor` (`id`, `endereco`, `estado`, `nome`) VALUES
	(1, 'Endereço do fornecedor de Minas Gerais', 'MG', 'Fornecedor 1 - MG'),
	(2, 'Endereço do fornecedor de Goiás', 'GO', 'Fornecedor 2 - GO');
/*!40000 ALTER TABLE `info_fornecedor` ENABLE KEYS */;

-- Copiando estrutura para tabela supplier-db.pedido
DROP TABLE IF EXISTS `pedido`;
CREATE TABLE IF NOT EXISTS `pedido` (
pedido  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` varchar(255) DEFAULT NULL,
  `tempo_de_preparo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela supplier-db.pedido: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;

-- Copiando estrutura para tabela supplier-db.pedido_item
DROP TABLE IF EXISTS `pedido_item`;
CREATE TABLE IF NOT EXISTS `pedido_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `quantidade` int(11) DEFAULT NULL,
  `produto_id` bigint(20) DEFAULT NULL,
  `pedido_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8eyfr31j751fjws2y012awmpg` (`produto_id`),
  KEY `FKeyouxfvoi291lpo5168e6wpej` (`pedido_id`),
  CONSTRAINT `FK8eyfr31j751fjws2y012awmpg` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`),
  CONSTRAINT `FKeyouxfvoi291lpo5168e6wpej` FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela supplier-db.pedido_item: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pedido_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido_item` ENABLE KEYS */;

-- Copiando estrutura para tabela supplier-db.produto
DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `preco` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela supplier-db.produto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT IGNORE INTO `produto` (`id`, `descricao`, `estado`, `nome`, `preco`) VALUES
	(1, 'Rosa vermelha - unidade', 'MG', 'Rosa vermelha', 3.00),
	(2, 'Rosa branca - unidade', 'GO', 'Rosa Branca', 3.50),
	(3, 'Cartão simples', 'MG', 'Cartão presente', 0.50),
	(4, 'Cartão pequeno', 'GO', 'Cartão presente', 0.50);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
