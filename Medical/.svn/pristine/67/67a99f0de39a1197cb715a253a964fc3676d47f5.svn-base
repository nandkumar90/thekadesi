-- MySQL dump 10.13  Distrib 5.5.22, for Win64 (x86)
--
-- Host: localhost    Database: medical
-- ------------------------------------------------------
-- Server version	5.5.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `med_appointment_info`
--

DROP TABLE IF EXISTS `med_appointment_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_appointment_info` (
  `appointment_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `appointment_token` varchar(10) NOT NULL,
  `appointment_type` enum('phone','presence','online','vip') NOT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `patient_id` varchar(50) NOT NULL,
  `appointment_time` time NOT NULL,
  `symptoms` varchar(1000) NOT NULL,
  `status` enum('open','hold','closed','') NOT NULL,
  PRIMARY KEY (`appointment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_appointment_info`
--

LOCK TABLES `med_appointment_info` WRITE;
/*!40000 ALTER TABLE `med_appointment_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_appointment_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_bill_internal`
--

DROP TABLE IF EXISTS `med_bill_internal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_bill_internal` (
  `patientid` varchar(12) NOT NULL,
  `doctorid` varchar(12) DEFAULT NULL,
  `billid` int(20) NOT NULL,
  `paidamount` int(20) NOT NULL,
  `discount` int(20) NOT NULL,
  `bildate` date NOT NULL,
  `totalcost` int(22) DEFAULT NULL,
  `bilstatus` set('paid','unpaid','partialpaid','free') DEFAULT NULL,
  PRIMARY KEY (`billid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_bill_internal`
--

LOCK TABLES `med_bill_internal` WRITE;
/*!40000 ALTER TABLE `med_bill_internal` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_bill_internal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_bill_outer`
--

DROP TABLE IF EXISTS `med_bill_outer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_bill_outer` (
  `patientid` varchar(12) NOT NULL,
  `doctorid` varchar(12) DEFAULT NULL,
  `billid` int(20) NOT NULL,
  `paidamount` int(20) NOT NULL,
  `discount` int(20) NOT NULL,
  `bildate` date NOT NULL,
  `totalcost` int(22) DEFAULT NULL,
  `bilstatus` set('paid','unpaid','partialpaid','free') DEFAULT NULL,
  PRIMARY KEY (`billid`),
  KEY `patientid` (`patientid`),
  CONSTRAINT `med_bill_outer_ibfk_1` FOREIGN KEY (`patientid`) REFERENCES `med_personal_details` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_bill_outer`
--

LOCK TABLES `med_bill_outer` WRITE;
/*!40000 ALTER TABLE `med_bill_outer` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_bill_outer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_billitem`
--

DROP TABLE IF EXISTS `med_billitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_billitem` (
  `itemid` int(22) NOT NULL,
  `itemno` int(22) NOT NULL AUTO_INCREMENT,
  `quantity` int(22) NOT NULL,
  `name` varchar(255) NOT NULL,
  `cost` decimal(10,2) NOT NULL,
  `batchno` int(22) NOT NULL,
  PRIMARY KEY (`itemno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_billitem`
--

LOCK TABLES `med_billitem` WRITE;
/*!40000 ALTER TABLE `med_billitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_billitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_doctor_edu_info`
--

DROP TABLE IF EXISTS `med_doctor_edu_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_doctor_edu_info` (
  `doctor_id` varchar(50) NOT NULL,
  `education` varchar(1000) NOT NULL,
  PRIMARY KEY (`doctor_id`),
  CONSTRAINT `doctorId` FOREIGN KEY (`doctor_id`) REFERENCES `med_personal_details` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_doctor_edu_info`
--

LOCK TABLES `med_doctor_edu_info` WRITE;
/*!40000 ALTER TABLE `med_doctor_edu_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_doctor_edu_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_doctor_experience`
--

DROP TABLE IF EXISTS `med_doctor_experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_doctor_experience` (
  `doctor_id` varchar(50) NOT NULL,
  `designation` varchar(200) NOT NULL,
  `hospital_name` varchar(200) NOT NULL,
  `duration_years` varchar(10) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `doctor_id_idx` (`doctor_id`),
  CONSTRAINT `doctor_id` FOREIGN KEY (`doctor_id`) REFERENCES `med_personal_details` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_doctor_experience`
--

LOCK TABLES `med_doctor_experience` WRITE;
/*!40000 ALTER TABLE `med_doctor_experience` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_doctor_experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_doctor_info`
--

DROP TABLE IF EXISTS `med_doctor_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_doctor_info` (
  `doctor_id` varchar(50) NOT NULL,
  `hospital_id` varchar(50) DEFAULT NULL,
  `hospital_name` varchar(500) NOT NULL,
  `in_time` time NOT NULL,
  `out_time` time NOT NULL,
  `days` varchar(7) NOT NULL DEFAULT '111111',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `doctorId_idx` (`doctor_id`),
  CONSTRAINT `doctor` FOREIGN KEY (`doctor_id`) REFERENCES `med_personal_details` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_doctor_info`
--

LOCK TABLES `med_doctor_info` WRITE;
/*!40000 ALTER TABLE `med_doctor_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_doctor_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_drug`
--

DROP TABLE IF EXISTS `med_drug`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_drug` (
  `drugname` varchar(500) NOT NULL,
  `drugid` int(100) NOT NULL AUTO_INCREMENT,
  `drugsalt` varchar(1000) DEFAULT NULL,
  `drugstrength` int(10) DEFAULT NULL,
  `manufacturer_id` int(100) DEFAULT NULL,
  PRIMARY KEY (`drugid`),
  KEY `manufacturer_id` (`manufacturer_id`),
  CONSTRAINT `med_drug_ibfk_1` FOREIGN KEY (`manufacturer_id`) REFERENCES `med_drugstore_manufacturer` (`manufacturer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_drug`
--

LOCK TABLES `med_drug` WRITE;
/*!40000 ALTER TABLE `med_drug` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_drug` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_drugitems`
--

DROP TABLE IF EXISTS `med_drugitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_drugitems` (
  `orderno` int(255) NOT NULL AUTO_INCREMENT,
  `drugid` int(100) NOT NULL,
  `batchno` varchar(100) DEFAULT NULL,
  `expirydate` date NOT NULL,
  `amountperunit` decimal(10,3) NOT NULL,
  `manufacturingdate` date NOT NULL,
  `availableamount` int(255) NOT NULL,
  `supplier_id` int(10) NOT NULL,
  PRIMARY KEY (`orderno`),
  KEY `supplier_id` (`supplier_id`),
  CONSTRAINT `med_drugitems_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `med_drugstore_supplier` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_drugitems`
--

LOCK TABLES `med_drugitems` WRITE;
/*!40000 ALTER TABLE `med_drugitems` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_drugitems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_drugstore_manufacturer`
--

DROP TABLE IF EXISTS `med_drugstore_manufacturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_drugstore_manufacturer` (
  `manufacturer_name` varchar(500) NOT NULL,
  `manufacturer_id` int(10) NOT NULL AUTO_INCREMENT,
  `manufacturer_description` varchar(1000) DEFAULT NULL,
  `manufacturer_rating` int(2) DEFAULT NULL,
  PRIMARY KEY (`manufacturer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_drugstore_manufacturer`
--

LOCK TABLES `med_drugstore_manufacturer` WRITE;
/*!40000 ALTER TABLE `med_drugstore_manufacturer` DISABLE KEYS */;
INSERT INTO `med_drugstore_manufacturer` VALUES ('parma',1,'company',3),('parma',2,'companyG',3),('parmaGF',3,'companyG',3),('parmaGFX',4,'companyG',3),('parmaGFX',5,'companyG',3);
/*!40000 ALTER TABLE `med_drugstore_manufacturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_drugstore_supplier`
--

DROP TABLE IF EXISTS `med_drugstore_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_drugstore_supplier` (
  `supplier_name` varchar(500) NOT NULL,
  `supplier_id` int(10) NOT NULL AUTO_INCREMENT,
  `supplier_description` varchar(1000) DEFAULT NULL,
  `supplier_rating` int(2) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_drugstore_supplier`
--

LOCK TABLES `med_drugstore_supplier` WRITE;
/*!40000 ALTER TABLE `med_drugstore_supplier` DISABLE KEYS */;
INSERT INTO `med_drugstore_supplier` VALUES ('parma',1,'company',3),('parmanext',2,'company store',4),('Garmanext',3,'company Gen store',5);
/*!40000 ALTER TABLE `med_drugstore_supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_pathology`
--

DROP TABLE IF EXISTS `med_pathology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_pathology` (
  `testorderno` int(10) NOT NULL AUTO_INCREMENT,
  `testid` int(10) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `lab_doctor` varchar(20) NOT NULL,
  `referring_doctor` varchar(20) NOT NULL,
  `lab_test_data` blob,
  PRIMARY KEY (`testorderno`),
  KEY `referring_doctor` (`referring_doctor`),
  KEY `lab_doctor` (`lab_doctor`),
  CONSTRAINT `med_pathology_ibfk_1` FOREIGN KEY (`referring_doctor`) REFERENCES `med_doctor_info` (`doctor_id`),
  CONSTRAINT `med_pathology_ibfk_2` FOREIGN KEY (`lab_doctor`) REFERENCES `med_doctor_info` (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_pathology`
--

LOCK TABLES `med_pathology` WRITE;
/*!40000 ALTER TABLE `med_pathology` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_pathology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_personal_details`
--

DROP TABLE IF EXISTS `med_personal_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_personal_details` (
  `user_id` varchar(50) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `mobile` varchar(13) NOT NULL,
  `email` varchar(100) NOT NULL,
  `date_Of_Birth` date NOT NULL,
  `gender` char(1) NOT NULL,
  `user_type` set('patient','doctor','admin','reception','billDesk','vehicleOperator','diagnostic') NOT NULL,
  `address_line1` varchar(200) NOT NULL,
  `address_line2` varchar(200) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `pinCode` int(11) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_personal_details`
--

LOCK TABLES `med_personal_details` WRITE;
/*!40000 ALTER TABLE `med_personal_details` DISABLE KEYS */;
INSERT INTO `med_personal_details` VALUES ('ashu.saxena','Ashu Saxena','hungama','9535526012','ashusaxe007@gmail.com','1987-01-01','\0','patient','F 504','Sri Ram Samruddhi','Bangalore','Karnataka',560066);
/*!40000 ALTER TABLE `med_personal_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_ward_bed`
--

DROP TABLE IF EXISTS `med_ward_bed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_ward_bed` (
  `bedid` int(10) NOT NULL AUTO_INCREMENT,
  `bednumber` int(10) NOT NULL,
  `bedtype` set('general','private','icu','ccu') NOT NULL,
  `bedstatus` set('free','occupied','maintaince') NOT NULL,
  PRIMARY KEY (`bedid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_ward_bed`
--

LOCK TABLES `med_ward_bed` WRITE;
/*!40000 ALTER TABLE `med_ward_bed` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_ward_bed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `med_ward_bed_allocation`
--

DROP TABLE IF EXISTS `med_ward_bed_allocation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `med_ward_bed_allocation` (
  `assignment_order` int(20) NOT NULL AUTO_INCREMENT,
  `bed_id` int(20) NOT NULL,
  `admission_date` date DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `user_id` varchar(50) NOT NULL,
  PRIMARY KEY (`assignment_order`),
  KEY `bed_id` (`bed_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `med_ward_bed_allocation_ibfk_1` FOREIGN KEY (`bed_id`) REFERENCES `med_ward_bed` (`bedid`),
  CONSTRAINT `med_ward_bed_allocation_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `med_personal_details` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `med_ward_bed_allocation`
--

LOCK TABLES `med_ward_bed_allocation` WRITE;
/*!40000 ALTER TABLE `med_ward_bed_allocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `med_ward_bed_allocation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-23 22:41:56
