CREATE DATABASE  IF NOT EXISTS `mat` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `mat`;
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
-- Table structure for table `assignment`
--

DROP TABLE IF EXISTS `assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assignment` (
  `assignmentId` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `assignmentFile` mediumblob,
  `fileName` varchar(45) DEFAULT NULL,
  `teacherId` int(11) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`assignmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `assignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class` (
  `classId` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES (0,'b1'),(1,'a1'),(2,'a2'),(3,'a3'),(4,'a4'),(5,'a9'),(6,'a8'),(20,'a5'),(21,'asd'),(23,'b2');
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_has_course`
--

DROP TABLE IF EXISTS `class_has_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_has_course` (
  `class_classId` int(11) NOT NULL,
  `course_courseId` int(11) NOT NULL,
  `teacher_teacherId` int(11) DEFAULT NULL,
  `teacher_user_id` int(11) DEFAULT NULL,
  `semester_semesterId` int(11) NOT NULL,
  PRIMARY KEY (`class_classId`,`course_courseId`),
  KEY `fk_class_has_course_course1_idx` (`course_courseId`),
  KEY `fk_class_has_course_class1_idx` (`class_classId`),
  KEY `fk_class_has_course_teacher1_idx` (`teacher_teacherId`,`teacher_user_id`),
  KEY `fk_class_has_course_semester1_idx` (`semester_semesterId`),
  CONSTRAINT `fk_class_has_course_class1` FOREIGN KEY (`class_classId`) REFERENCES `class` (`classId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_course_course1` FOREIGN KEY (`course_courseId`) REFERENCES `course` (`courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_course_semester1` FOREIGN KEY (`semester_semesterId`) REFERENCES `semester` (`semesterId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_course_teacher1` FOREIGN KEY (`teacher_teacherId`, `teacher_user_id`) REFERENCES `teacher` (`teacherId`, `user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_has_course`
--

LOCK TABLES `class_has_course` WRITE;
/*!40000 ALTER TABLE `class_has_course` DISABLE KEYS */;
INSERT INTO `class_has_course` VALUES (1,1,NULL,NULL,7);
/*!40000 ALTER TABLE `class_has_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_has_course_has_assignment`
--

DROP TABLE IF EXISTS `class_has_course_has_assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_has_course_has_assignment` (
  `class_has_course_class_classId` int(11) NOT NULL,
  `class_has_course_course_courseId` int(11) NOT NULL,
  `assignment_assignmentId` int(11) NOT NULL,
  `semester_semesterId` int(11) NOT NULL,
  PRIMARY KEY (`class_has_course_class_classId`,`class_has_course_course_courseId`,`assignment_assignmentId`),
  KEY `fk_class_has_course_has_assignment_assignment1_idx` (`assignment_assignmentId`),
  KEY `fk_class_has_course_has_assignment_class_has_course1_idx` (`class_has_course_class_classId`,`class_has_course_course_courseId`),
  KEY `fk_class_has_course_has_assignment_semester1_idx` (`semester_semesterId`),
  CONSTRAINT `fk_class_has_course_has_assignment_assignment1` FOREIGN KEY (`assignment_assignmentId`) REFERENCES `assignment` (`assignmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_course_has_assignment_class_has_course1` FOREIGN KEY (`class_has_course_class_classId`, `class_has_course_course_courseId`) REFERENCES `class_has_course` (`class_classId`, `course_courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_course_has_assignment_semester1` FOREIGN KEY (`semester_semesterId`) REFERENCES `semester` (`semesterId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_has_course_has_assignment`
--

LOCK TABLES `class_has_course_has_assignment` WRITE;
/*!40000 ALTER TABLE `class_has_course_has_assignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_has_course_has_assignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_has_student`
--

DROP TABLE IF EXISTS `class_has_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_has_student` (
  `class_classId` int(11) NOT NULL,
  `student_idstudent` int(11) NOT NULL,
  `student_user_id` int(11) NOT NULL,
  `semester_semesterId` int(11) NOT NULL,
  PRIMARY KEY (`class_classId`,`student_idstudent`,`student_user_id`),
  KEY `fk_class_has_student_student1_idx` (`student_idstudent`,`student_user_id`),
  KEY `fk_class_has_student_class1_idx` (`class_classId`),
  KEY `fk_class_has_student_semester1_idx` (`semester_semesterId`),
  CONSTRAINT `fk_class_has_student_class1` FOREIGN KEY (`class_classId`) REFERENCES `class` (`classId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_student_semester1` FOREIGN KEY (`semester_semesterId`) REFERENCES `semester` (`semesterId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_has_student_student1` FOREIGN KEY (`student_idstudent`, `student_user_id`) REFERENCES `student` (`idstudent`, `user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_has_student`
--

LOCK TABLES `class_has_student` WRITE;
/*!40000 ALTER TABLE `class_has_student` DISABLE KEYS */;
INSERT INTO `class_has_student` VALUES (1,1,124,7);
/*!40000 ALTER TABLE `class_has_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `teachingHours` int(11) DEFAULT '0',
  `teachingunit_teachingUnitId` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`courseId`),
  UNIQUE KEY `courseId_UNIQUE` (`courseId`),
  KEY `fk_course_teachingunit1_idx` (`teachingunit_teachingUnitId`),
  CONSTRAINT `fk_course_teachingunit1` FOREIGN KEY (`teachingunit_teachingUnitId`) REFERENCES `teachingunit` (`teachingUnitId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'algebra1',0,1),(2,'algebra2',0,1),(3,'algebra3',0,1),(6,'physics1',20,2),(7,'physics2',20,2),(8,'physics3',30,2),(9,'physics4',40,2);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finished_course_detailes`
--

DROP TABLE IF EXISTS `finished_course_detailes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finished_course_detailes` (
  `finished_course_id` int(11) NOT NULL AUTO_INCREMENT,
  `isFinished` tinyint(4) DEFAULT '0',
  `grade` int(11) DEFAULT '0',
  `semester` int(11) DEFAULT '0',
  `isNew` int(11) DEFAULT '0',
  PRIMARY KEY (`finished_course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3035 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finished_course_detailes`
--

LOCK TABLES `finished_course_detailes` WRITE;
/*!40000 ALTER TABLE `finished_course_detailes` DISABLE KEYS */;
INSERT INTO `finished_course_detailes` VALUES (3034,0,0,7,0);
/*!40000 ALTER TABLE `finished_course_detailes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parent`
--

DROP TABLE IF EXISTS `parent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parent` (
  `parentId` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`parentId`,`user_id`),
  KEY `fk_parent_user1_idx` (`user_id`),
  CONSTRAINT `fk_parent_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parent`
--

LOCK TABLES `parent` WRITE;
/*!40000 ALTER TABLE `parent` DISABLE KEYS */;
INSERT INTO `parent` VALUES (1,127);
/*!40000 ALTER TABLE `parent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parent_has_student`
--

DROP TABLE IF EXISTS `parent_has_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parent_has_student` (
  `parent_parentId` int(11) NOT NULL,
  `student_idstudent` int(11) NOT NULL,
  `student_user_id` int(11) NOT NULL,
  `isBlocked` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`parent_parentId`,`student_idstudent`,`student_user_id`),
  KEY `fk_parent_has_student_student1_idx` (`student_idstudent`,`student_user_id`),
  KEY `fk_parent_has_student_parent1_idx` (`parent_parentId`),
  CONSTRAINT `fk_parent_has_student_parent1` FOREIGN KEY (`parent_parentId`) REFERENCES `parent` (`parentId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_parent_has_student_student1` FOREIGN KEY (`student_idstudent`, `student_user_id`) REFERENCES `student` (`idstudent`, `user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parent_has_student`
--

LOCK TABLES `parent_has_student` WRITE;
/*!40000 ALTER TABLE `parent_has_student` DISABLE KEYS */;
INSERT INTO `parent_has_student` VALUES (1,1,124,0);
/*!40000 ALTER TABLE `parent_has_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prev_requested_course`
--

DROP TABLE IF EXISTS `prev_requested_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prev_requested_course` (
  `course_courseId` int(11) NOT NULL,
  `course_teachingunit_teachingUnitId` int(11) NOT NULL,
  `course_courseId1` int(11) NOT NULL,
  `course_teachingunit_teachingUnitId1` int(11) NOT NULL,
  PRIMARY KEY (`course_courseId`,`course_courseId1`,`course_teachingunit_teachingUnitId`,`course_teachingunit_teachingUnitId1`),
  KEY `fk_course_has_course_course2_idx` (`course_courseId1`,`course_teachingunit_teachingUnitId1`),
  KEY `fk_course_has_course_course1_idx` (`course_courseId`,`course_teachingunit_teachingUnitId`),
  CONSTRAINT `fk_course_has_course_course1` FOREIGN KEY (`course_courseId`) REFERENCES `course` (`courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_course_has_course_course2` FOREIGN KEY (`course_courseId1`) REFERENCES `course` (`courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prev_requested_course`
--

LOCK TABLES `prev_requested_course` WRITE;
/*!40000 ALTER TABLE `prev_requested_course` DISABLE KEYS */;
INSERT INTO `prev_requested_course` VALUES (2,2,1,1),(3,0,2,2);
/*!40000 ALTER TABLE `prev_requested_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `request` (
  `requestId` int(11) NOT NULL AUTO_INCREMENT,
  `requestType` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `classId` int(11) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `isHandled` tinyint(4) DEFAULT '0',
  `isConfirmed` tinyint(4) DEFAULT '0',
  `semester_semesterId` int(11) NOT NULL,
  PRIMARY KEY (`requestId`),
  KEY `fk_request_semester1_idx` (`semester_semesterId`),
  CONSTRAINT `fk_request_semester1` FOREIGN KEY (`semester_semesterId`) REFERENCES `semester` (`semesterId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request`
--

LOCK TABLES `request` WRITE;
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
INSERT INTO `request` VALUES (2,2,124,1,1,0,0,7);
/*!40000 ALTER TABLE `request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semester`
--

DROP TABLE IF EXISTS `semester`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `semester` (
  `semesterId` int(11) NOT NULL AUTO_INCREMENT,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `isCurrent` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`semesterId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semester`
--

LOCK TABLES `semester` WRITE;
/*!40000 ALTER TABLE `semester` DISABLE KEYS */;
INSERT INTO `semester` VALUES (6,'2017-11-10','2017-12-10',0),(7,'2017-11-10','2017-12-10',1);
/*!40000 ALTER TABLE `semester` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `idstudent` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`idstudent`,`user_id`),
  UNIQUE KEY `idstudent_UNIQUE` (`idstudent`),
  KEY `fk_student_user1_idx` (`user_id`),
  CONSTRAINT `fk_student_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,124),(2,129),(3,132),(4,133),(5,134);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `student_has_course`
--

DROP TABLE IF EXISTS `student_has_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_has_course` (
  `student_has_courseId` int(11) NOT NULL AUTO_INCREMENT,
  `student_idstudent` int(11) NOT NULL,
  `student_user_id` int(11) NOT NULL,
  `course_courseId` int(11) NOT NULL,
  `finished_course_detailes_finished_course_id` int(11) NOT NULL,
  `semester_semesterId` int(11) NOT NULL,
  `class_classId` int(11) NOT NULL,
  PRIMARY KEY (`student_has_courseId`,`student_idstudent`,`student_user_id`,`course_courseId`),
  KEY `fk_student_has_course_course1_idx` (`course_courseId`),
  KEY `fk_student_has_course_student1_idx` (`student_idstudent`,`student_user_id`),
  KEY `fk_student_has_course_finished_course_detailes1_idx` (`finished_course_detailes_finished_course_id`),
  KEY `fk_student_has_course_semester1_idx` (`semester_semesterId`),
  KEY `fk_student_has_course_class1_idx` (`class_classId`),
  CONSTRAINT `fk_student_has_course_class1` FOREIGN KEY (`class_classId`) REFERENCES `class` (`classId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_course1` FOREIGN KEY (`course_courseId`) REFERENCES `course` (`courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_finished_course_detailes1` FOREIGN KEY (`finished_course_detailes_finished_course_id`) REFERENCES `finished_course_detailes` (`finished_course_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_semester1` FOREIGN KEY (`semester_semesterId`) REFERENCES `semester` (`semesterId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_student1` FOREIGN KEY (`student_idstudent`, `student_user_id`) REFERENCES `student` (`idstudent`, `user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3029 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_has_course`
--

LOCK TABLES `student_has_course` WRITE;
/*!40000 ALTER TABLE `student_has_course` DISABLE KEYS */;
INSERT INTO `student_has_course` VALUES (3028,1,124,1,3034,7,1);
/*!40000 ALTER TABLE `student_has_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_has_course_has_submission`
--

DROP TABLE IF EXISTS `student_has_course_has_submission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_has_course_has_submission` (
  `student_has_course_student_has_courseId` int(11) NOT NULL,
  `student_has_course_student_idstudent` int(11) NOT NULL,
  `student_has_course_student_user_id` int(11) NOT NULL,
  `student_has_course_course_courseId` int(11) NOT NULL,
  `submission_submissionId` int(11) NOT NULL,
  `semester_semesterId` int(11) NOT NULL,
  `isHandled` tinyint(4) DEFAULT '0',
  `grade` tinyint(4) DEFAULT '0',
  `isLate` tinyint(4) DEFAULT '0',
  `submission_responseId` int(11) DEFAULT NULL,
  `teacherComment` varchar(256) DEFAULT NULL,
  `assignmentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_has_course_student_has_courseId`,`student_has_course_student_idstudent`,`student_has_course_student_user_id`,`student_has_course_course_courseId`,`submission_submissionId`),
  KEY `fk_student_has_course_has_submission_submission1_idx` (`submission_submissionId`),
  KEY `fk_student_has_course_has_submission_student_has_course1_idx` (`student_has_course_student_has_courseId`,`student_has_course_student_idstudent`,`student_has_course_student_user_id`,`student_has_course_course_courseId`),
  KEY `fk_student_has_course_has_submission_semester1_idx` (`semester_semesterId`),
  KEY `fk_submission_responseId_submission1_idx` (`submission_responseId`),
  CONSTRAINT `fk_student_has_course_has_submission_semester1` FOREIGN KEY (`semester_semesterId`) REFERENCES `semester` (`semesterId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_has_submission_student_has_course1` FOREIGN KEY (`student_has_course_student_has_courseId`, `student_has_course_student_idstudent`, `student_has_course_student_user_id`, `student_has_course_course_courseId`) REFERENCES `student_has_course` (`student_has_courseId`, `student_idstudent`, `student_user_id`, `course_courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_course_has_submission_submission1` FOREIGN KEY (`submission_submissionId`) REFERENCES `submission` (`submissionId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_submission_responseId_submission1` FOREIGN KEY (`submission_responseId`) REFERENCES `submission` (`submissionId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_has_course_has_submission`
--

LOCK TABLES `student_has_course_has_submission` WRITE;
/*!40000 ALTER TABLE `student_has_course_has_submission` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_has_course_has_submission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submission`
--

DROP TABLE IF EXISTS `submission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `submission` (
  `submissionId` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `file` mediumblob,
  `fileName` varchar(45) DEFAULT NULL,
  `assignment_assignmentId` int(11) NOT NULL,
  PRIMARY KEY (`submissionId`),
  KEY `fk_submission_assignment1_idx` (`assignment_assignmentId`),
  CONSTRAINT `fk_submission_assignment1` FOREIGN KEY (`assignment_assignmentId`) REFERENCES `assignment` (`assignmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submission`
--

LOCK TABLES `submission` WRITE;
/*!40000 ALTER TABLE `submission` DISABLE KEYS */;
/*!40000 ALTER TABLE `submission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `teacherId` int(11) NOT NULL AUTO_INCREMENT,
  `maxHours` int(11) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `teachingUnit_teachingUnitId` int(11) NOT NULL,
  `freeHours` int(11) DEFAULT '0',
  PRIMARY KEY (`teacherId`,`user_id`),
  UNIQUE KEY `teacherId_UNIQUE` (`teacherId`),
  KEY `fk_teacher_user_idx` (`user_id`),
  KEY `fk_teacher_teachingUnit1_idx` (`teachingUnit_teachingUnitId`),
  CONSTRAINT `fk_teacher_teachingUnit1` FOREIGN KEY (`teachingUnit_teachingUnitId`) REFERENCES `teachingunit` (`teachingUnitId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_teacher_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,40,123,1,40),(2,40,128,1,40),(3,40,130,2,40);
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachingunit`
--

DROP TABLE IF EXISTS `teachingunit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachingunit` (
  `teachingUnitId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`teachingUnitId`),
  UNIQUE KEY `teachingUnitId_UNIQUE` (`teachingUnitId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachingunit`
--

LOCK TABLES `teachingunit` WRITE;
/*!40000 ALTER TABLE `teachingunit` DISABLE KEYS */;
INSERT INTO `teachingunit` VALUES (1,'Mat'),(2,'Physic');
/*!40000 ALTER TABLE `teachingunit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `isLocked` tinyint(4) DEFAULT '0',
  `userType` int(11) DEFAULT NULL,
  `isLogged` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (123,'yakov','mora','321',0,1,0),(124,'irit','talmid','421',0,2,0),(125,'tal','mazkira','521',0,3,0),(126,'sapir','menael','621',0,4,0),(127,'tom','ore','721',0,5,0),(128,'yosi','mora','821',0,1,0),(129,'kobi','talmid','921',0,2,0),(130,'kuku','mora','130',0,1,0),(131,'asd','marehet','131',0,6,0),(132,'dorin','talmid','231',0,2,0),(133,'shiraz','talmid','331',0,2,0),(134,'bar','talmid','431',0,2,0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-07  1:05:39