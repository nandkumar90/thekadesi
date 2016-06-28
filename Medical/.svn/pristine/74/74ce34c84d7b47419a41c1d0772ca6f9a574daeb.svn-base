-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2014 at 08:03 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `medical`
--

-- --------------------------------------------------------

--
-- Table structure for table `med_appointment_info`
--

CREATE TABLE IF NOT EXISTS `med_appointment_info` (
  `appointment_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `appointment_token` varchar(10) NOT NULL,
  `appointment_type` enum('phone','presence','online','vip') NOT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `patient_id` varchar(50) NOT NULL,
  `appointment_time` time NOT NULL,
  `symptoms` varchar(1000) NOT NULL,
  `status` enum('open','hold','closed','') NOT NULL,
  PRIMARY KEY (`appointment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `med_doctor_edu_info`
--

CREATE TABLE IF NOT EXISTS `med_doctor_edu_info` (
  `doctor_id` varchar(50) NOT NULL,
  `education` varchar(1000) NOT NULL,
  PRIMARY KEY (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `med_doctor_experience`
--

CREATE TABLE IF NOT EXISTS `med_doctor_experience` (
  `doctor_id` varchar(50) NOT NULL,
  `designation` varchar(200) NOT NULL,
  `hospital_name` varchar(200) NOT NULL,
  `duration_years` varchar(10) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `doctor_id_idx` (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `med_doctor_info`
--

CREATE TABLE IF NOT EXISTS `med_doctor_info` (
  `doctor_id` varchar(50) NOT NULL,
  `hospital_id` varchar(50) DEFAULT NULL,
  `hospital_name` varchar(500) NOT NULL,
  `in_time` time NOT NULL,
  `out_time` time NOT NULL,
  `days` varchar(7) NOT NULL DEFAULT '111111',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `doctorId_idx` (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `med_personal_details`
--

CREATE TABLE IF NOT EXISTS `med_personal_details` (
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

--
-- Dumping data for table `med_personal_details`
--

INSERT INTO `med_personal_details` (`user_id`, `user_name`, `password`, `mobile`, `email`, `date_Of_Birth`, `gender`, `user_type`, `address_line1`, `address_line2`, `city`, `state`, `pinCode`) VALUES
('ashu.saxena', 'Ashu Saxena', 'hungama', '9535526012', 'ashusaxe007@gmail.com', '1987-01-01', '\0', 'patient', 'F 504', 'Sri Ram Samruddhi', 'Bangalore', 'Karnataka', 560066);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `med_doctor_edu_info`
--
ALTER TABLE `med_doctor_edu_info`
  ADD CONSTRAINT `doctorId` FOREIGN KEY (`doctor_id`) REFERENCES `med_personal_details` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `med_doctor_experience`
--
ALTER TABLE `med_doctor_experience`
  ADD CONSTRAINT `doctor_id` FOREIGN KEY (`doctor_id`) REFERENCES `med_personal_details` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `med_doctor_info`
--
ALTER TABLE `med_doctor_info`
  ADD CONSTRAINT `doctor` FOREIGN KEY (`doctor_id`) REFERENCES `med_personal_details` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
