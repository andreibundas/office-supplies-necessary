CREATE DATABASE  IF NOT EXISTS `office_supplies_inventory` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `office_supplies_inventory`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: office_supplies_inventory
-- ------------------------------------------------------
-- Server version	8.0.15

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
-- Table structure for table `supplies`
--

DROP TABLE IF EXISTS `supplies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplies` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `department` varchar(45) NOT NULL,
  `supplies` varchar(100) NOT NULL,
  `quantity_pcs_pckgs` double NOT NULL,
  `quantity_unit_price` double NOT NULL,
  `value_RON` double NOT NULL,
  `delivery_date` date NOT NULL,
  `completed` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplies`
--

LOCK TABLES `supplies` WRITE;
/*!40000 ALTER TABLE `supplies` DISABLE KEYS */;
INSERT INTO `supplies` VALUES (1,'Sale','paper',5,10,10,'2021-11-29',0),(2,'HR','marker',10,10,10,'2021-11-29',0),(6,'IT','toner',2,50,100,'2021-11-29',0),(13,'accounting','pencils',4,22,88,'2021-12-07',0),(15,'HR','CDs',5,4,20,'2021-12-07',1),(16,'HR','paper',5,10,50,'2021-12-08',0),(17,'accounting','toner',2,60,120,'2021-12-01',1),(20,'Logistic','paper',3,0,30,'2021-12-04',0),(21,'IT','disks',3,5,15,'2021-12-01',0),(24,'IT','Laptop',2,2000,4000,'2022-01-05',0),(31,'hr','paper',1,2,3,'2021-11-24',0),(36,'Logistics','paper',3,10,30,'2021-12-02',0),(37,'HR','disks',3,10,30,'2021-12-04',0),(38,'HR','disks',3,10,30,'2021-12-04',0),(41,'HR','paper',4,10,40,'2022-01-08',0),(43,'IT','laptop',1,2300,2300,'2022-01-05',0),(44,'Logistic ','rope',3,5,15,'2022-01-06',0);
/*!40000 ALTER TABLE `supplies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'office_supplies_inventory'
--

--
-- Dumping routines for database 'office_supplies_inventory'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-14 21:48:30
