-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: aula16
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cli_cliente`
--

DROP TABLE IF EXISTS `cli_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cli_cliente` (
  `CLI_ID` int NOT NULL AUTO_INCREMENT,
  `CLI_NOME` varchar(200) NOT NULL,
  `CLI_CARTAO` varchar(16) NOT NULL,
  PRIMARY KEY (`CLI_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cli_cliente`
--

LOCK TABLES `cli_cliente` WRITE;
/*!40000 ALTER TABLE `cli_cliente` DISABLE KEYS */;
INSERT INTO `cli_cliente` VALUES (1,'Junior','4984'),(2,'Houston','12345678'),(3,'Fulana','0987654321098765');
/*!40000 ALTER TABLE `cli_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cmp_compra`
--

DROP TABLE IF EXISTS `cmp_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cmp_compra` (
  `CMP_ID` int NOT NULL AUTO_INCREMENT,
  `CMP_IDPRODUTO` int NOT NULL,
  `CMP_IDCLIENTE` int NOT NULL,
  `CMP_DATA` date NOT NULL,
  `CMP_QUANTIDADE` int NOT NULL,
  PRIMARY KEY (`CMP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cmp_compra`
--

LOCK TABLES `cmp_compra` WRITE;
/*!40000 ALTER TABLE `cmp_compra` DISABLE KEYS */;
INSERT INTO `cmp_compra` VALUES (1,1,1,'2006-12-19',3);
/*!40000 ALTER TABLE `cmp_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prd_produto`
--

DROP TABLE IF EXISTS `prd_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prd_produto` (
  `PRD_ID` int NOT NULL AUTO_INCREMENT,
  `PRD_PRECO` double NOT NULL,
  `PRD_NOME` varchar(45) NOT NULL,
  PRIMARY KEY (`PRD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prd_produto`
--

LOCK TABLES `prd_produto` WRITE;
/*!40000 ALTER TABLE `prd_produto` DISABLE KEYS */;
INSERT INTO `prd_produto` VALUES (1,14999.99,'iphone'),(2,3499.99,'Nintendo switch 2'),(3,47.99,'Blusa de frio'),(4,169.99,'Livro do mestre DnD'),(5,516.9,'Livro do Jogador Dnd');
/*!40000 ALTER TABLE `prd_produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-18 10:47:38
