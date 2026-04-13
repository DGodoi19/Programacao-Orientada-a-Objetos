-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: aula17
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
-- Table structure for table `esp_especie`
--

DROP TABLE IF EXISTS `esp_especie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `esp_especie` (
  `ESP_ID` int NOT NULL AUTO_INCREMENT,
  `ESP_DESCRICAO` varchar(200) NOT NULL,
  PRIMARY KEY (`ESP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `esp_especie`
--

LOCK TABLES `esp_especie` WRITE;
/*!40000 ALTER TABLE `esp_especie` DISABLE KEYS */;
INSERT INTO `esp_especie` VALUES (1,'Habeas Corpus'),(2,'Mandado de Segurança'),(3,'Agravo de Instrumento'),(4,'Embargos de Declaração');
/*!40000 ALTER TABLE `esp_especie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prc_processo`
--

DROP TABLE IF EXISTS `prc_processo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prc_processo` (
  `PRC_ID` int NOT NULL AUTO_INCREMENT,
  `PRC_NUMERO` varchar(19) NOT NULL,
  `PRC_IDESPECIE` int NOT NULL,
  `PRC_VARA` varchar(100) NOT NULL,
  PRIMARY KEY (`PRC_ID`),
  KEY `FK_IDESPECIE_idx` (`PRC_IDESPECIE`),
  CONSTRAINT `FK_ESPECIE` FOREIGN KEY (`PRC_IDESPECIE`) REFERENCES `esp_especie` (`ESP_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prc_processo`
--

LOCK TABLES `prc_processo` WRITE;
/*!40000 ALTER TABLE `prc_processo` DISABLE KEYS */;
INSERT INTO `prc_processo` VALUES (1,'aaaaaaaaaaaaaaa',3,'aaaaaaaaaa'),(2,'aaaaaaaaaaaa',1,'aaaaaaaa');
/*!40000 ALTER TABLE `prc_processo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prc_prt`
--

DROP TABLE IF EXISTS `prc_prt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prc_prt` (
  `PRC_PRT_ID` int NOT NULL AUTO_INCREMENT,
  `PRC_PRT_IDPROCESSO` int NOT NULL,
  `PRC_PRT_IDPARTE` int NOT NULL,
  PRIMARY KEY (`PRC_PRT_ID`),
  KEY `PRC_PROCESSO_idx` (`PRC_PRT_IDPROCESSO`),
  KEY `FK_PARTE_idx` (`PRC_PRT_IDPARTE`),
  CONSTRAINT `FK_PARTE` FOREIGN KEY (`PRC_PRT_IDPARTE`) REFERENCES `prt_parte` (`PRT_ID`),
  CONSTRAINT `FK_PROCESSO` FOREIGN KEY (`PRC_PRT_IDPROCESSO`) REFERENCES `prc_processo` (`PRC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prc_prt`
--

LOCK TABLES `prc_prt` WRITE;
/*!40000 ALTER TABLE `prc_prt` DISABLE KEYS */;
INSERT INTO `prc_prt` VALUES (1,2,2),(2,2,3),(3,2,4),(4,2,5);
/*!40000 ALTER TABLE `prc_prt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prt_parte`
--

DROP TABLE IF EXISTS `prt_parte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prt_parte` (
  `PRT_ID` int NOT NULL AUTO_INCREMENT,
  `PRT_CPF` varchar(11) NOT NULL,
  `PRT_NOME` varchar(200) NOT NULL,
  `PRT_TIPO` tinyint NOT NULL,
  PRIMARY KEY (`PRT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prt_parte`
--

LOCK TABLES `prt_parte` WRITE;
/*!40000 ALTER TABLE `prt_parte` DISABLE KEYS */;
INSERT INTO `prt_parte` VALUES (1,'aaaaaaaaaa','aaaaaaaaaaaaaaaaaaaa',1),(2,'aaaaaaa','aaaaaaaaaaaaaaaaa',1),(3,'aaaaaaa','aaaaaaaaaaaaaaaaa',1),(4,'aaaaaaa','aaaaaaaaaaaaaaaaa',1),(5,'aaaaaaa','aaaaaaaaaaaaaaaaa',1);
/*!40000 ALTER TABLE `prt_parte` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-25 11:06:41
