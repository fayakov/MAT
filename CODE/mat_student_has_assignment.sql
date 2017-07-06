-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mat
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `student_has_assignment`
--

DROP TABLE IF EXISTS `student_has_assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_has_assignment` (
  `studentHasCourseId` int(11) NOT NULL,
  `studentId` int(11) NOT NULL,
  `studentUserID` int(11) NOT NULL,
  `courseId` int(11) NOT NULL,
  `assignmentId` int(11) NOT NULL,
  `isHandled` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`studentHasCourseId`,`studentId`,`studentUserID`,`courseId`,`assignmentId`),
  KEY `fk_student_has_course_has_assignment_assignment1_idx` (`assignmentId`),
  KEY `fk_student_has_course_has_assignment_student_has_course1_idx` (`studentHasCourseId`,`studentId`,`studentUserID`,`courseId`),
  CONSTRAINT `fk_student_has_course_has_assignment_assignment1` FOREIGN KEY (`assignmentId`) REFERENCES `assignment` (`assignmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_has_assignment_student_has_course1` FOREIGN KEY (`studentHasCourseId`, `studentId`, `studentUserID`, `courseId`) REFERENCES `student_has_course` (`student_has_courseId`, `student_idstudent`, `student_user_id`, `course_courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_has_assignment`
--

LOCK TABLES `student_has_assignment` WRITE;
/*!40000 ALTER TABLE `student_has_assignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_has_assignment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-07  0:52:02
