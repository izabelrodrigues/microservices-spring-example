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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela supplier-db.info_fornecedor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `info_fornecedor` DISABLE KEYS */;
INSERT IGNORE INTO `info_fornecedor` (`id`, `endereco`, `estado`, `nome`) VALUES
	(1, 'Endereço do fornecedor de Goiás', 'GO', 'Fornecedor 1 - GO');
/*!40000 ALTER TABLE `info_fornecedor` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
