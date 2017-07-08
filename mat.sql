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
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (23,'0117-11-15','PK\0\0\0\0\0!\0\ﬂœõ.í\0\0î\0\0\0\‹[Content_Types].xml ¢\ÿ(†\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\ÃU\…N\√0Ω#ÒëØ®q)B®)ñ# µ|Ä±ßçU«∂<ShˇûIJ+@!\“óDY¸6?\€\„´u\Â≤HhÉ/\ƒi>xåıãB<\Õ\Ó\"CR\ﬁ(<b(Æ&\«G\„\Ÿ&f<\⁄c!J¢x)%\Í*Öyà\‡˘\À<§J?¶ÖåJ/\’\‰h8<ó:xO™1\ƒd|sµrî›Æ˘ıV…≥ı\"ª\ﬁ˛WSB\≈\Ë¨V\ƒB\Âã7_Ha>∑\ZL–´ä°så	î¡Ä*ó\«dô1MÅàç°êìÒõN\÷@ˆ®›´ä\‰\⁄Ib∞Ωû\ÊÏ°óà\Ï§F˘ûi\„\0{S}ˆª\›1∑ƒõ¿\·Ô¨ΩO`\Œ#õ9¿\“F\Ï`\ËŒÆ;ì◊êñ\œ!,ùJ›ÜºR\÷\Ôt∑ïÄ+ÙòBD…Ö\Î-\0\ÍF0É»êê\»\¬>≥6n.`ÌΩ©-\ \Ê6\Í≠\·s5ˆ¯]¥\Ë8˚\':˙Ø øÂ°ï\”\◊%w\Á¿9\Ïqò,U3%\ﬁ\…\ﬂ.>bw\ÈÿØ\r¸>à\›RènY≤9S&o\0\0\0ˇˇ\0PK\0\0\0\0\0!\0µU0#ı\0\0\0L\0\0\0\Œ_rels/.rels ¢\ (†\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0åí\œN\√0\∆\ÔHºC\‰˚\ÍnH°•ªLHª!T¿$\Óµç£$@˜ˆÑÇJc\€\—ˆ\Á\œ?[\ﬁ\Ó\ÊiTb/N√∫(A±3b{\◊jx≠üV†b\"gi\«\ZéaW\›\ﬁl_x§îõb\◊˚®≤ãã\Z∫î¸#b4OÒ\Ïr•ë0Q\ ah—ì®e‹î\Â=ÜøP-<\’¡j{™>˙<˘≤∑4Mox/\Ê}bóNå@û;\Àv\ÂCf©\œ€®öB\ÀIÉÛú\”\…˚\"cû&\⁄\\OÙˇ∂8q\"Kâ\–H\‡Û<ﬂäs@\Î\ÎÅ.üh©¯Ω\Œ<‚ßÑ\·Md¯a¡\≈T_\0\0\0ˇˇ\0PK\0\0\0\0\0!\0Ùı;\0\0Y\0\0\Z\0xl/_rels/workbook.xml.rels ¢(†\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ºî\œJ\ƒ0\∆\ÔÇ\Ô\Ên\”vu\Ÿtä∞W] §”¶lõîL¸”∑7I-,ıRˆòÚ}øL2\ŸÌøªñ}¢£\∆\ZYíC£lŸòZ¿˚Ò\Â\ÊyiJ\ŸZÉ$\ÿ\◊WªWl•õH7=±†bHÄˆæ‰úî\∆NRb{4°RY\◊IBWÛ^™ì¨ë\Ái∫\Â\ÓØ3Mv(∏Cπv˙\‡¸ø∂≠™F\·≥U\Z∆ÇYw\"çËÉ®t5z1E|¨lí@¸<\Ã˝ö0J∂\ÍI\À\∆L01µëØ	è?A\ƒ\‘oGÚ%ò\Ï\¬0\Ÿ\ÃvM\“\“a˘\Ê]ö∫3K/¡‹≠\n\„á6L^|µ4\∆Kˆ∑k\⁄˚0\œ8πè!\◊x|ˆ!?\0\0\0ˇˇ\0PK\0\0\0\0\0!\0k¨m\0\0Ü\0\0\0\0\0xl/workbook.xmlåR\ÀN\√0º#Òñ\Ô4≠˚ÆöTBÄ\Ëq(\Ì\Ÿƒõ∆™cG∂K\⁄\ﬂ@‚ÄÑ\ƒgıwXßJ)á\»;\ﬁ\Ãxg\Ï\ÈlW(Ú\÷I£c\⁄iµ)ù\Z!ı:¶Oãª´%\Œs-∏2\Zb∫Gg\…\Â≈¥2vÛlÃÜ†Äv1ÕΩ/\'Q\‰\“\n\ÓZ¶çù\ÃÿÇ{Ñvπ\“.ÖäXª=à\n.5=*L\Ï4Lñ\…nL∫-@˚£à\≈=é\ÔrY:öL3©`ytDxY>\Á\ﬁ)Jw˛VH\"¶=Ñ¶Çv[^o•\n\›~{H£\‰dÚ\—\ﬂ*ø@{ç:\Ê\≈zå\r¬ü!ä•Ñ\ }ì$ªï\‘\¬T(9\¬h˜\r\Z#®\Í\ŒJ\nü«î\r«É\”\ﬁ=\»u\ÓÉ|\‘\Í—ô| SØD\◊\ÓØá˜\√~oá\œ^X\»xé>∞∂âÖùãN˙ç\ƒ\ŒHXüH\Ï/R˜åÑıâ‘≠Gn\ÊLπJ1ø∞\‘#±˛êM5O(˘\0\0ˇˇ\0PK\0\0\0\0\0!\0\À\ÏZ\„ó\0\0_\0\0\0\0\0xl/theme/theme1.xml\ÏYOoEø#ÒF{oc\'v\ZGu™ÿ±	¥i£\ÿ-\Íqº\ÔN3ª≥ö\'ı\rµG$¢EH©\‚\¬?ïZâK˘˛\0Å\"(Røofv\◊;Òö&m\ÍC≤;Ûõ˜ˇΩy3{Ò\“Ìà°\"$\Âq”´ûØxà\ƒ>\“8hz\◊˚\›skí\n\«C\ÃxLöﬁÑH\Ô\“∆õo\\\ƒ\Î*$A∞>ñ\Î∏\ÈÖJ%\ÎKK“áa,\œÛÑ\ƒ07\‚\"\¬\n^E∞4¯\ËFliπRY]ä0ç=\„\»Nøò~5˝l˙\rö>òﬁü~=˝]ç®OºçåQá∑XI=\‡3\—\”lH∫∫Ä\ÓW5BNdõ	tÄY\”ûC~\ÿ\'∑ïáñ\n&ö^\≈¸º•çãKx=]\ƒ‘ÇµÖu]ÛK◊•Ü˚ÀÜß9\”j∑÷∏∞ï\”7\0¶\ÊqùNß›©\ÊÙ\0˚>hje)“¨u◊™≠åfd\Ái∑+ıJ\Õ\≈\ËØ\Ã\…\‹hµZıF*ã%j@ˆ±6á_´¨\÷6óºY|}_km∂€´ﬁÄ,~uﬂΩ\–X≠πx\nç˜\Á\–⁄°\›nJ=áå8\€.ÖØ|≠í\¬g(àÜ<∫4ãè’¢Xã-.∫\0\–@Üçëö$dÑ}à\Ë6éÇb\Õ\0Ø\\ò±Cæú“ºêÙMT\”{\'¡ê3zœü|˜¸\…#Ù¸\…√£;èè\Ó¸xt˜\Ó—ù,-g\·6éÉ\‚\¬g_~Ù\«\Á\Ô°\ﬂ=xv\Ô~9^Òø|ˇ˛\œ?}\\ÑöIÙÙìáø>~¯Ù\”~˚ˆ^	|S\‡Aﬁßë\Ë*9D{<›åa\\\…\…@únE?\ƒ\‘YÅC†]B∫£BxuÇYÆE\\\„\›P< Äoço9≤ˆB1V¥ÑÛ\Â0rÄ;ú≥•∏¨y,\‹\«A9s1.\‚ˆ0>(\„\›∆±\„\⁄\Œ8Å™ô•c˚vH1wéHL\“s|üê\ÌnR\Í\ÿuá˙ÇK>R\Ë&E-LKM“ß\'êfã∂i~ôî\ÈÆvl≥sµ8+\”zã∏HH\ÃJÑ\Ô\ÊòÒ-<V8*#\Ÿ\«+\Z¸\nVaôêΩâã∏éT\‡\ÈÄ0é:C\"eŸökÙ-8˝2ÜzU\Íˆ6â\\§Ptøå\Ê\Ãyπ\≈˜\€!éí2lè\∆a˚∂‹á\≈hó´2¯w3DøÉpº\–\›7(q\‹˝\‚BpùéH≥\0\—3c°}	Ö⁄©øçˇ™3\n\’\ÿ\∆¿\Îb\‹Ù6ak*Kâ\Ìc%x\Ó_Xx∑8\ﬁ%\ÎÛ\œ\Î∫˚∫\Ózˇ˘∫ª(óOZmgjØnl_l∫\‰haì<¢åı‘Ñë+\“Ù\…6ãaı:sX$˘°)	\·1-\Ó.ÿ¨AÇ´w©\n{!N†«ÆzöH S“ÅD	óp∂3√•¥5˙teOÜu}f∞ı@bµ√ávxEgGÉúå\Ÿrs˛\Ã≠h\'e∂r!%\njø≥™\Í\ƒ‹™F4S\Ínπ\ \‡\√y\’`0∑&t!z∞Ú*\◊5k8õ`FÜ\⁄\Óv\Œ\‹bºpñ.í!í\‘GZ\ÔyUçì≤X1ó;%>\“\ÁºX≠¿≠°…æ∑ì8©»Æ∂Ä]\ÊΩWÒR¡3/\Èº=ñé,.&\'ã\—a\”k‘ó\ÎÚq\“ÙFp¨Ö\«(ØK\›¯a¿=ëØÑ\r˚&≥\…Úô7ôbnT\·¶\¬\⁄}Naß$B™-,C\Zf*\rkNV˛\Â:òı¨∞ë˛R¨¨A0¸cRÄ]◊í—à¯™\Ë\Ï¬à∂ù}MK)+\"z\·\r\ÿX\ÏapøU\–gH%\‹Nòä†_\‡*M[\€Lπ\≈9M∫\‚ñ¡\ŸqÃíß\ÂVßhñ\…nÚ8ó¡º\ƒ\›Je7 ù^ìÚg§J1åˇg™\Ë˝ÆVÜ\⁄>\‹\Í\nåtæ6=.T»°\n%!ıª\ZS; Z\‡:¶!®\‡n\Ÿ¸\‰@ˇ∑9giò¥ÜSü⁄£ˆ#\nBv°,ô\Ë{±j∫wYí,%d\"™ ÆL¨\ÿr@X_\◊¿UΩ∑{(ÑP7\’$-w<˛\‹˜4ÉÅnrä˘\Ê‘ê|\Ôµ9ww>6ôA)∑õÜ&≥.b…Æj◊õ\Â\Ÿ\ﬁ[TDO\Ã⁄¨Zñ¿¨∞4“¥INπ\’⁄ä5ßÒr=º8Ø1\Ê\rQó>HˇÅ˝è\nüŸèzC\ÌÛ=®≠æ5hb6\’\Ál\„ÅtÅ¥Éhú\Ï†\r&M ö6mù¥’≤\Õ˙å;›ú\Ô1ck\…N\‚\ÔS\Z;o\Œ\\vN.û•±S;∂∂cM\rû=û¢04\ 2\∆1\ÊWÒ\√\‹Go¡ˇò)iÇ	>+	≠g\œ\‰$ø\Âhñn¸	\0\0ˇˇ\0PK\0\0\0\0\0!\0;m2K¡\0\0\0B\0\0#\0\0\0xl/worksheets/_rels/sheet1.xml.relsÑè¡ä\¬0E˜˛Cx{ì÷ÖCS7\"∏U\Áb˙\⁄€óê˜˝{≥e¿\Â\Âp\œ\Â6õ˚<©fë,‘∫Ö\‰ch∞{\⁄-øA±8\Í\‹	-<êa\”.æöNNJâ«êX±ÖQ$˝\√~\ƒŸ±é	©ê>\Ê\ŸIây0\…˘ã–¨™jmÚ_¥/Nµ\Ô,\‰}WÉ:=RY˛\Ïé}<n£ø\ŒHÚœÑI9ê`>¢H9\»E\ÌÚÄbA\Îwˆûk}¶m\Ã\ÀÛˆ	\0\0ˇˇ\0PK\0\0\0\0\0!\0o\ÓóU \0\0\ \0\0\0\0\0xl/worksheets/sheet2.xmlåë\—K\√0\∆\ﬂˇáp\Ô6\›t*£\Ì\∆PPôæg\Ì•\rkr%πY˝\ÔM:6_|˚é\À˝æ˚.\≈\Í\Àˆ\‚}0\‰Jòe9t55∆µ%ºo7W˜ +◊®ûñçV\’\ÂE1íﬂáëE$∏PB\«<,•uáVÖåt±£\…[≈±Ù≠ÉG\’LC∂óÛ<øïVG\¬\“ˇáAZõ\Z\◊T,:>B<ˆä\„˛°3CÄ™hL\Ï•@¬£.\·a≤*&\€Éc¯•Ö7m\«[zF\Õ1=àîjG¥OüöÚ4*ˇ\Ãn¶TØ^4®’°\Á7\Z1°\"\‰&õ/ŒÜk\≈*\’\‚ãÚ≠qAÙìWû\›¡\—=ö$\Õ4LjbG\ÃdOUoÜÒ6yv\rBÒ©Hõù°˙\0\0ˇˇ\0PK\0\0\0\0\0!\0o\ÓóU \0\0\ \0\0\0\0\0xl/worksheets/sheet3.xmlåë\—K\√0\∆\ﬂˇáp\Ô6\›t*£\Ì\∆PPôæg\Ì•\rkr%πY˝\ÔM:6_|˚é\À˝æ˚.\≈\Í\Àˆ\‚}0\‰Jòe9t55∆µ%ºo7W˜ +◊®ûñçV\’\ÂE1íﬂáëE$∏PB\«<,•uáVÖåt±£\…[≈±Ù≠ÉG\’LC∂óÛ<øïVG\¬\“ˇáAZõ\Z\◊T,:>B<ˆä\„˛°3CÄ™hL\Ï•@¬£.\·a≤*&\€Éc¯•Ö7m\«[zF\Õ1=àîjG¥OüöÚ4*ˇ\Ãn¶TØ^4®’°\Á7\Z1°\"\‰&õ/ŒÜk\≈*\’\‚ãÚ≠qAÙìWû\›¡\—=ö$\Õ4LjbG\ÃdOUoÜÒ6yv\rBÒ©Hõù°˙\0\0ˇˇ\0PK\0\0\0\0\0!\0$IíU\–\0\0U\0\0\0\0\0xl/worksheets/sheet1.xmlåú[o\„\»Ö\ﬂ\‰?zJbã∫Pía{±lsºdÅ ≥õ\‰Uk\Àc!∂\ÂHöô\›¸˙tuì\ÕS7e^\Ê\¬\‚)~]\›<EJ\"Øø˚\ÌıeÙe{8\Óˆo7\„\Íb2m\ﬂˆèª∑O7\„_~˛ó\’xt<m\ﬁ7/˚∑\Ì\Õ¯˜\Ìq¸\›\Ìˇp˝u¯˜Òyª=çbÜ∑\„\Õ¯˘tzø∫º<><o_7«ã˝˚ˆ-Fûˆá\◊\Õ)˛˜\ÈÚ¯~\ÿnì\Ëı\Âr:ô‘óØõ\›\€8g∏:|Ké˝\”\”\Óa{∑¯¸∫};\Â$á\Ì\À\Ê˘èœª˜\„¯ˆ˙qc4†\—a˚t3˛æ∫˙°ö\œ∆ó∑\◊\È\ÿˇ\ÿmø\·ﬂ£\√\Ó\”Û\È\Á˝_∑OßXÇÒ\Ë¥˘ı\„ˆe˚p\⁄>\Êˇ\Ô\ﬂ)∂//îm∫èhÙø\Ó˜ˇ¶\\?∆Ω&Ò∞«§°\√nNª/\€nˇö*¯üLRØÆ˛ı\·n9!ñ\ÀÉˇ\Ó¡>§∫˝\Ì0z\‹>m>øú˛æˇ˙√ñ8#\—¸b∫†˚ó∏{¸sÙ∫£\…è^7ø•øø\ÓO\œ7\„\≈\≈lπè>O˚\◊\ÊmUßÃöißâwöj}Q\«Ù\ÁD≥Nˇ\ÓDkZ$øø\ƒı¡\”\«<	)˛›ßè¢3<u\'à˜Ç\’EeÛ\\\ÊÒß2\ﬁmNõ\€\Î\√˛\Î(Æ¢Xà\„˚Ü\÷duãüj∂äÙ@¡\Ô)z3û\«iæ\”j˘r[__~âs\–\Ì\—Ù{PâI\‰Ü;\ÿpZéÀàGé«â[ÚpÛÑ&∏T_,\n\…“Æi\"êÙ\ﬂ#\‰=buKé\ﬂ\„N\ÁòÛ=ZΩ«î\ÔÒA\Ô±\‡{\‹\Î=V|èÙ\”eŸÖï3é\ \ŸO\‡,MöÉ#\“\Â˘£<Työl1¢ªúm=ôœÑ™≈åïê\›cpm\”\«%f\–\œ-äóc%&?P\"?ß[/VìÅ\"\r∫e)%>!+~<g\r|Z¥_n\≈\“j\‚æe\ŸUbf%Ús∫u=ùãî-K)Ò1\Ë\‡G1\ÎÑ/\÷}˜H†D~N∑^N\Á\‚4hYJâèA?ˆô≈±ö∏\ÔÄ/\∆(ëÉ\ﬂ2°Ñƒ†Iùm0\⁄˛¸$´’¶\Z˜ ≈©(ëyó\”\≈t*Ü÷≤îÉ>u-çøN¯Ç∞â˚¯b%r[&îêt ´xEfP\∆\ÕTe\·≠\r\Ì=pä\∆R.îK%)ãz®\‘uA´lºÉ(˘S7™H†®W”ª>cΩîæ\‹Ú¨jx\Ãà˘^E˝\…\≈4\\ösCªrvWπ\ŸŸ≠\'Ji◊ì\ÂRxfÀ≥™a\‡1áCÚaP\”3Ü\—uOq¿¶¬Ü6ïà¢e6Ñ¥eR9!˜,\Í±Rá3Xssì)õ\nª\◊T\‡äVQπªL%Ø\'ï˘ñeï«ºgQo\‘\Èåa\‰&\'\ÿT\ÿ≈¶Ç4P\‘F\ﬂ7ór¯-À™áÅ\«ÙÜA\œFnvïp\·¶\¬n6U\rıá\—ı\œz≤XÚ\’À™áÅ\«§¸†\Œ\◊É\ZgJ¸}ï{h%<ºâ€áÛX∂ö@Qo-ìjVL\Ï±R4XsÔ´Ñè76∑©I†hag\«]\Ê†öâìºeYı0ò\ﬁ0®\Z\√\»-µí=µ\¬ˆ7É-\√g\«]¶a,\'K5Ã™áÅQgSlπ\√ âõÈòïhU\r\Ì^:¿TDCJ\÷˜\\1-ì*VıX±\Ák\Ó8’†\ Mwä\rp*¢Å¢•\‰ä•ö£C^vFN±≥knÉ≤\È4¥{©´\\≠!%s\ÎäRÕäQè\€\'∞\Êˆ)]∑ôb˚úâ\“äñ∫ä•\‹2©f\≈\ƒ+∂O`\Ìn5\≈õ)∂Oy\◊(Í≥¢T≥b\‘c\≈	¨π°\…ˆ\—\–\'?e\r\»{\ƒ@\—\¬*ä\ﬁ2©f\≈\ƒ+6B`\Õ]KˆàfäMi.\⁄d†®œäRÕäQè\’\ÓvÒ≥JÚ,\Ÿ#\Z˙≥‘µ•-¨b˘¥L™Y1±\«jwªinM≤4q;\—\‡Ñ\’*t˚tÆW>è\…\◊,É\’\ƒıà©\È\∆6\Õ]>æ\Í\\õL-˚sT\r\’•o)xÜ£\Î\Ã\Ó^qsZ	¢?5¥{9†º	)ô\Á≤L™\Í ¢+5]\◊Ywø4®r]\„v`ç?P\‘]µL™Y1ÒpT÷Ωfv˜äõ©Æ≤?5iwæjór\’v˚ÿ´ñÇeb41F=bªá\Õrì]™â\€\Ây∂îóÛ\›>1ˆ*MåQèòöè±r\'õâ˙53\÷p\‘z†d\Ó\⁄E©f≈®\«J\Õ\«`Õùl&*\◊\Ã–ø\÷\"\Z(ZX\≈0[&’¨,q±>æv©˘¨πì\ÕDØjf¨\·àh†haï˛≈§öï%vX\ÌN6Àùl&‹¥â€á\”d-¢Å¢>+J5+FΩ5`w≤Y\Ód3qK\”\ƒ\ÌD\√&L\‹Önü\ŒKâr\'£\‡O¿®GL\Õ\«X	πì…´¡fñ{#£\n\›>é\'`\«\“5∆®C<∑˚Y‹ú|Wˆ3\⁄}(ë<bH\ŸzSê\'\Z◊ä\Ë=ãz∞fCk\Êπ5a+˘AJ\Ëví3\œN\‰πŸÑö¥ô/¨J\ﬁOÖn\'9O<ø\Ÿ2ö¯\Ìπ\\∏ïº\n\›N\ÁÛì\'´\Â\◊Ã≥U≥˙\»{Å\–\Ìt>La\ÂßÕ≤>b~\√<\Ôt>?7RJ\Z∑\»ox˚\Ôç\Á\Ÿ)ó\È\Î~¸ûxN∂dî-GvªêD\Ó\“E\È\\Ìû§\Â§ñÆ\Èe\ÕMEvµ@\—\‚Ø\‚®-ìj&L\Ï1\rn5Ω*w`\ÕmCvØ@Qü	•ö	£\”b#d¢Õ•ƒ≤KÖ$Ú\ÊéIãzLÉ\Ì0&º¨≠mj&aëM)Øw9w,\√\—LÚ2+YV≈ò\¬Uv»êDnùP™ô0\Í1\rˆ∆ò\“t&:JXdÛ\ÀuC-\œ\‘	£\”`âå	/AgÉ∂õªlò\Œ‹°T\◊	£C^>wÉç2¶∏y¨º\ﬁ^†™ıƒ§\"zO“í∏Ç_p™¡|U\‹\\\ƒsqA\ZŸÉùJ1©¢¬®W©¡\…\ZÆ¸q@Xê\»]\ÂL™ò0\Í1\rNŒò\–pk±ê\√‚úìSp(±b¬®\«D¶ú;cB\√]©3èD}ù\ƒƒ∂î\ÍUéQá©∂ùú6ó¡Æm>Ûí®gïhôT1±Ëêó≠ÒöLY◊â6¶µ8lH\"ó	•ö	£ì\Ì\‰5\Zn%(\\&O∑L´°Xf¯ ùóä|\Ÿ(zn%ø≠	5©\‹Z°Vca‘´≥Ö¶[…ØeBM*\nµ\Z\n£ï[+r¡ã∑x◊≠5\Ì}3N◊≠i\’\ﬂw[æ¡kÚ∂\·H›•pCõ\ÀûÀõ\ﬁ$\Í\«/Ç-óäª\œ{ı&Öº\Õ`BﬂöKÛIø\€uôòT1a\‘c\"o3ò–∑ÊÉ∂3ıL\‚3§∂fR≈Ñ\—!/;£\‚ì-&\⁄\\\Ên!\€~ıL¢´¥L:óL,\Í1ŸÜ∏Dﬂ™&rÚ(\\\n%Õái5fˆ†lG\\¢o-D\√\n-L‚É™ñI5&ˆò\»\ÿÙÇZ¢i\’\‚\‹\n-L™N(\’Lıò\»\◊&Ù¨Ö8lXí®_P\"\ÿR∞¨EÕÑQèâ[aoPKÙ∂Ö8∑E}&îj&åzL∂i.\—4kqˆä˙L(\’Lıòl\”\\¢∑-\ƒ˘(\Í3°T3a\‘c\"ˇ3\÷z[≠ºÄD\ÓzB©f¬®√¥≤\rä6óÖZM‰âóT\”*(ı†lÉZ°è,Ñä∫ÖbRÕÑâ=&Ú\Z=y+ÙëÖ\\\‰ıôP™ô0\Í1ë\◊L\Ë#5w$r\Á•ö	£yç¡Ñ>R\…ﬂØÖ©z(\—zZ\nñ≈®°0\ÍAë\ŸPh$ï¸°ZXë™áíVN¡3Pı†\»m(tíJ˛\Ï,¨H\ÂB°VW\n£\‘⁄æà¢\Õe¥\ÈQI\‘3\…\ŸcR\≈ƒ¢ì\ÌQkÙ®≈†\Õõu\Îƒ§ö	y\Ÿ\≈\Ê⁄∂(\⁄\\\ÍTÀã\Õ$\Í\Î$ìj&L\Ï1ë\€\ËµF\'Y ûGQøN(\’Lıò\»mSªF\'—â1\Í%¶\œ\ÎT\‚fçü\≈-eè†h¨Z®(\’Lıò\»\≈&t®•\Ïkπã•ö	£ôò¡Ñµî=bM¢ûI\’	•ö	£yò¡Ñ˛¥T&C\"ó	•ö	£]g)¶vç\◊P:1Fù\ƒ\’ƒ∂‘¥Ωx\≈ZT9>\ÌB≤~º\“,∏XqÒ∞f˙j[M\–ˇå\‹vs\€˛XM\–«™â<RºåZ\‘$í°\⁄ √∞KFÜß&∫©&\ËfÚ˝q:H\÷OáC±ÜaÃ¥\ Ün∏í=%ÖœÄ°\ÿ\0√∞FÆiU-q%j+F2øb(6¿0ÏÇëu*∞∏L\–ç\‹vsì™\‹q6\–\ﬂV‚ºåÉ&Y?hç`(6¿0ÏÇëZ`hr+˘@¸ê\È,ä\r0ª`¶É∆ä°IÆ\‰ıG\nü©ä\r0{`\È¡A£b\Ï©¿ïºVàüFü´k0v¡Lé\œ¢√ÆîGû{∫0>Bàb\√.ò\„\ﬁ\Ï¡æïºj®(\ÏO%`\ﬂb\ﬁ\ÈQ>5ï˜\’7=ßóû≠ƒÑ\Zù¿˚\Z!˛\ƒ)çæG\Ë7}ã§\'\‡ÜÉı\‘\≈[_∏CXê\ÔZR∏îPXjú[&WH±\n,\\~}\«n\\\‚mnñÜ£äEﬁìëÆw6MÜ\Íµ&c\·íZêëwZdhãÒ\Í§\»{2\“˘d®6\»X∏§ddû˙bº:)Úûåt>™\r2.©ôc∫\Ï\È¥Zuˆxö(h\\f\ÃUıd≤∞ñû3J\∆\”`I\ÊVåâu\≈x\ÿsLó=\\fÄë\ÃcÆ™*\∆r\Á<üJx¿dP±\'\…04]5ïLlT\Ï[L7=\0fM%^\’\Z`gØòŸÉc\Êv+FmÅ\·U≠ñç=ˇ®FW\≈{k,\Z±	ÜmÄë\Ã_c(6¿X\ÿ#∑*Ü˛lÄë\ÃC±\∆\¬y¯\0FGã2∑7w\œxao\Ó6}\”¡»ñáÉï\ﬁ\Ãµö®KUˆúñ0˚¯\“Ù\ÎxøXFöö¡=èªK\⁄Òs˛d\’D]¨≤«≤4\Z:∂ÖÜq-=MeTç=*•\◊NíıkGë1±A\∆\‚.ôc\È\Ï±)É-]ì°•[dw\…»ú≠ö°\Ô\Zd\Ë\Èö\≈\∆]2rgãç\◊ ;k\ÍÙÄU˘H\À\"√∏KFˆlë°Û\Zd$\Î◊ôruˆ∞ïEÜ\…]2Úgã≠\◊ #ôOÜbã\„.Y¥=ì\Ì\– #ôOÜbã\„.7ˆ\‚µ\Ï\…\'Éåd>^¥[dw…ú.¿S2\»H\Êì˝ü&¿íªdN†gï\ \Èeêë\Ã\'C±U3å{d\È)ô\·†\√\≈\À6-^Z_yì]É\’FæQ&æ˙&\ÔEs=\›~¸\Âß?Ö\ŸU\‹:˝Ûı\ÂSz˙W~m\ﬂk£KÙ¸¶\ ¸ä\≈\◊\Ì\·Sz≥\ÂqÙ∞ˇ¸kIÅeky\„f|E\"Ω\„≤\‚ã*\ﬂ7ü∂?müvo\«\—Kz\◊\Ê\‰\"Æ≤Ùˆ\Õ¯M˙˜iˇû˛O\ÿ_˜ß¯\“\ ˛\œÒ≈°\€¯*\∆\…E\ƒ}\⁄\ÔO˝\‚A(\Ô\«\Ì\ÈÛ˚\Ë}Ûæ=|\‹˝7æá2N\≈˛∞ãØMoΩø\Ôß\√fw\Z\”\ÀNOªá\Õ\À\›˚.\Êã«ø\⁄=ﬁå?>f\‚Ú^\”\€ˇ\0\0ˇˇ\0PK\0\0\0\0\0!\0˝CTœã\0\0¸\0\0\0\0\0xl/sharedStrings.xmlÑX[n\€F˝/\–=¯”ØFé[A \…∫ÇvÇ\Õ\∆,\ \Â†›Ö^≈äaI≈µEmh∂\”s\ÓL%w\‰@ãs\Ê>\œ}\–›´øFw\ÊC<Iá\„§Ω~uô8π\ﬂìwΩ\Ëè\ﬂ˚ÒMd\“\È π‹çì∏˝ß\—Uˇ˚\Ô∫i:5∏õ§Ω\Ëv:Ω\€\È§◊∑Òhêæ\Z\ﬂ\«	N˛OFÉ)˛úº\Î§˜ìxpì\ﬁ\∆Òtt◊πº∏¯•3\Zì\»\\èíi/˙\È\Õedí\·˚á¯W˜\‰ı\Â\œQøõ˚\›i\ﬂV∂˘°€ôˆª>[˚Q={∂ª∞ô\›\€¬Æ\‘\ÈÇ2{P\œ7∂¥è8˘Wù\Ã ß•<cWº\›P@¡àÙ5æ\◊x\—@hn∏\\€ï±\r4¥\À\‡\…\Ã.m°î\Ì¿ ¥-\Ó?¢Ω~:c}ÉKÉoï\›+m5êYÿπ- á˘\⁄H˙ÄH\\yVWfpÛ¿`eê\Ÿ@≠ˆ\"w\·ò≤¡Ø\⁄.\ÿ\⁄ˇîx¥í@∂p∫¥Kö\·©˜™\·ØP§\r=0$y Q‰Üí\√poæü\“~RÄ\'ÑÄAr[\“N(WBEF\¬T\‡˜Aò∞b!∂\‘gA•úl®,ZC\Ós¿*u\Ã\ƒ\‰\Zå\0=w∞ù\Ó∑\ p2û\‰Ö$T‚¨≥¥¿≈íÆ\”7\÷8§\‰\Ã\\Æq ñ&\nIÅ£Ç™\»\¬)© Kë/\ \Êvßé)Ω†Lh\Ï, c–ñ\ƒ G\Èt*I;ú¿Z\∆x\Ë^#Ûi≥.C\∆5C\ƒ\0…Ñ˝\⁄FKä\Óˆ\¬feA\r*\∆5≥O\0ÑzóY∏s®\—Yf\Ó}ëfà(]\’=œó	S\Õ\‹h)9§ì`J\Â\"\'çMYLå{\”&ê\‡\Ó\◊8Cäô^]\÷\¬\rès®c`\ÈzíRD\ÿ#PÄ6t\Î,\0ù¯\\u\0˜é\œ*\0≤í|+:0Ö!8W∏\'¯\nnUé•2	lÛíGtø\√<8zS\ÿ5\'\nkà\√EW\"ü\Á¨B´T˚ÆÄπ	l(≥πc\›y¿	ˇ?É≤Ä6p°E\ÿ4\Î¸!i\‡¿Òn%µ¶+\ÿ\rI∏\…Jk%é\‡Sr\\ª\ƒ)W*4lõ≠+z¶´/õ	´SwºÜnê≠Å\¬`º|∑\’ÿà¿\\	ëH\‚Gsx®\…!)\röÑ`?!ß˜(l•b\'û¨]\Î°√à!≠bU\„Ö\Á\Ë|v§c†\"P\€\«9¡\Z\·@\r\ÌRHé≤-)e{ê›ùsF[\Ó9q\¬>éiÄJ–±Pf\ÿS¥SK∏\\ã°∏n\0\ÈnJ}{\r¸?\¬à≥\€\ÊÀ†\\\⁄0(\Ï≤%˚ñísaG˛ÑΩ6Ù-qò}è\\`R[•à•AÉt\n]∏R`V*\‰qÖ˚¨\€t•Sì}úˇLæûò$e-^6\Ã\Ô\Œ\ﬂ4\À\”v 	W#\⁄∑6¯!\›]π≈ûìò˜9´\0lƒ≤¥HÉ¨ıhú\\\Ë\n\Ã\Ì#⁄ï\Ëö8\ ∫k|\È†R7jñ2^z\·do\\]j\r#C˚$\€\”Ú\‹\‹C	\Zq \’I(S∂ã%±{\È1\Âv!∑+ÖµíPC≤¨ô‹∑\Ë∏\Í≥b	∫\ÿKW\œms\÷0\Ó@\‹ÿæ&_Lﬂ¶˜Ékº∞\‚\Õ3ç\'‚®è<1bæ&\≈q∏x^˝R¿°H^HiˇQ2ò4≠05\¬\÷Û£ó-É≤5ßN¡k_OùC∫\»\»NY\„H0æ≤K/Ñ\Œ€ØØámÖ ¥ø\‰VûÛd\ÌFá¯£\0\ÿX#ªeª\„à?æ,áW:_Lôà†(y\'É´@\‹B[C¶cúI≠\·J\–\nÅëÆZysﬁñ|´aá_\‚£3EÜä\÷\n\«\Ï\Zz)£Gô!*PÙá,RfF+`¸xUv\Ô?Ù´0VB<ó\·\¬ûºwﬂõ˛ˇ\0\0\0ˇˇ\0PK\0\0\0\0\0!\0\‡\ÊT\ÿ\0\0m	\0\0\r\0\0\0xl/styles.xml¥V[k\€0~\Ï?ΩØv\“4MÜ\Ì\“É≠\⁄\¬^\ÂXv∫I)I˝é$«óP∑iayp§#ù\Ô|\Áj\'7{¡\—3’Ü)ô\‚\ŸEåïU2Yß¯\È1ˇ∂\¬\»X\"K¬ï§)>PÉo≤Ø_cú>l)µ §IÒ\÷\⁄\Ê{ôÕñ\nb.TC%úTJba´\Î\»4öí\“8%¡£y/#Aò\ƒY\"w\"÷†ç\⁄I<:\n\'?K.∏;Uó\ÿFYµ\ YR)\Ÿc,\0\√	≤ƒº†g\¬`\ÊÆoW\ZY 	^\"â†\·∆≠fÑªKåÇpÓµ∂D5\0]_;ô˜¥\’L*\ÌÑQ∞ûÖªu¥æ8ü≤˛æ•\Œ\ \Â\Á≠l>\Âcgy]])\ŒÛ8˛_˘˝è˚H\»„º´üudIC¨•Z\Ê∞A\Ì˙Ò\–@\Œ%r»îø\Á\‘ﬂ∏]kròÕØ\ŒW0ä≥\“\’^}\Ás\›\∆\"á_\ÏcQ¥LñtO°∞°Æ]\·ª2:á‹©≠∂™/1≤\ÃıQ|qµÜ\ﬂ\ÂjΩúØW≥x±Úé|ÑÅ\'Q.î.aL;4à≤Ñ\” Çö\’[˜oU\œBY´,JFj%	áet\‘h\0ª°ú?∏QÚ∑\Za\Ô´A\Á\√Pr˝‰ÜÄ[Bd\⁄e¿á?D\ÿC\ÿ≤Úq\\¥Ø:#\ÌvΩ«´\”G§i¯\·~\'\n™s?\€˘3B¯:üÙı3á‡ºÜ5bx6\⁄)\√¿{\ ∆Ä\Ô¨\Á∆Üπô\‡\€\"C>˚∞ªÂ¨ñÇ\ﬂ\‰∏E[•\Ÿ8\Í&˘\Œi∑˚j:©\–\≈2Ajh*É\¬{«π÷ùS¨Q2\ŒFõH∆Ñç◊ìa¯p2\ﬁd?HÙ\€\ÿ\Ï\€rßˇÿø–±É±0\Z\n]{#˜>IÒΩ\Î\"é˚d;\∆aÚu˝\⁄¿,˜˝àÒÉÿí>a\‹\È¨@\0KZë∑è\›aä˚ıoZ≤ùXw∑˛∞ge=Dä˚ı/7	gK?\’˚\Ô§\Ï\0\0\0ˇˇ\0PK\0\0\0\0\0!\0ï¸\⁄Bõ\0\0\0(\0\0\'\0\0\0xl/printerSettings/printerSettings1.binÏòΩN\√0\«ˇ¶°M\’!<BáJLHÇÑ\ÿP\·	≤t≠ÑêÄÅ\n©cXò20˜%xXxŒ±\\\◊\n•MEIzn;>\ﬂ˘\Ó\'\À_¶x\¬Øx\∆=Üà0\∆\'qâsÃ©\ÊÇﬁ™\·/x†˜:	\ﬁF\«¡˜õ\Ëc1˝=L@9–°˜5\ŸÜZß¨\\ZßN÷¶\Ëv|≥V\Ë,êΩõ§æ\Ï:#\Â\“˛\Ë\Ôo\Ë˘G‰ªä;ª*V™7ßu¥6\»5eäG«æ\’‹õ$	\Ÿ˘\‡âÿëfK‘ª\ré\„W∞üˇÇ\—#>\Œ5“íú`\Î\nπï;\À˝∂V\œ\Zz≈öW\ﬁ\⁄uã\ÍNπÚê\Î\Ÿa†\›1\‰IÇÙÚˇ\Á~?#ø\ƒOßS÷¶\n\‰Çîñä¨\√v∑=ÚÅvév&øC_±Éª^V≠,H\·\◊\Ë˝\”`Xi\ E&¿ò\0`LÄ	0&P{ÛZÜE∂\—0˘ãáÜ¿\Ó÷ÄÄP∏éûò\È\»˝vY¯H\”\‘\—!Vo\Z]fÄµ(.Ö	0ÅZ(rÅ\\+\«\Ÿ&¿\ÍO\‡\0\0ˇˇ\0PK\0\0\0\0\0!\0ÄGOûì\0\0\0•\0\0\0\0\0\0xl/calcChain.xml<é¡\n!E˜Aˇ o\ﬂ\ËTDÑ:ãÅæ†>@ú\◊(\ËsI\‘\ﬂ\Á™\Â\·¬πGOüú\ƒ+\«B\∆AÅ@Úeâ¥\Zx>\Óá+néó\n°Å/2Lvø\”\ﬁ%?It±Å\–\⁄vìí}¿\Ïx(R_^•f\◊:\÷UÚV\—-[NÚ®\‘E\Ê.\0´Ω®\ÊÒ|{H´\Âˇ¿˛\0\0\0ˇˇ\0PK\0\0\0\0\0!\0\n\ \ÎN\0\0]\0\0\0docProps/core.xml ¢(†\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0Ñí\—J\√0Ü\Ôﬂ°\‰æM⁄é∫Ö∂ï]9ú(ﬁÖ\‰l+6iI¢\›\≈Ò≠ˆ:¶\ÌV+º\Ã˘ˇÛùˇí\Œw≤Ù\ﬁAõ¢R\nÇ<PºÖ\⁄d\Ëqµß\»3ñ)¡\ JAÜˆ`\–<øºHyMy•\·^W5h[ÄÒI\ \Îm≠≠)∆ÜoA28ár\‚∫“íY˜\‘\\3˛\ 6Ä#B,¡2¡,\√-–Ø\":\"êıõ.;Ä\‡Jê†¨¡a\‚Ø-Õü\rù2r\ \¬\Ók∑\”1\Óò-x/\Óù)c\”4Aw1\\˛?/\Ô∫U˝Bµ∑\‚ÄÚTp\ 50[\È¸y¯:|§xTj\œW2có\Ó\“\Î\ƒı~pù+é\’E\ÔÅ <Üˆ\—O\ S|sªZ†<\"a\‚ì+?ö≠HB\'1%\‰•¸´ø\r\◊\‰q¸øƒ©Oíô\—hB\„…àx\‰)>˚˘7\0\0\0ˇˇ\0PK\0\0\0\0\0!\0\‘Oin¨\0\0X\0\0\0docProps/app.xml ¢(†\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0úì\›j\€0\«\Ô{£˚FN:\ ≤Ji;z±≤@\“\ﬁkÚq\"™HF:5\…\ﬁb[{Q(¥Ùr/\‰\◊Ÿ±Ω$\Œ6\‘`8˝˘}àì\’\“&Ñhº\À\ÿpê≤úˆπqÛå]\œ>~`ID\ÂreΩÉå≠!≤˘\Ó@LÇ/!†ÅòêÖã[ ñcŒ£^¿R\≈µu\nñ\n)\rs\Óã\¬h8˜˙n	˘(Mè9¨\\˘aπ5dù\„∏¬∑ö\Ê^7|Òf∂.	Xä”≤¥F+§)\Âï\—¡G_`r±\“`\Ô7\—MA\ﬂÉkô\n\ﬁO\≈T+gd,e#æ+àKPÕ¶Mî	Qä\n\«hÙ!â\Ê+m€à%_TÑ\'cï\nF9$¨F\÷%mlÀàA\÷\ﬂ\Îß˙±~®_\Ëˇô‘Øı7\n~\‘˜Çìæ”¥ai?6\Ô\ÂQ+†`_\ÿt\\\‘\ÿ\'û¥?ıh:¸-Ú\„o\Ë\ÁasLCm£ˇ*:¸˛®\ÌfÙòüåªç\◊\ÂÃü+ÑÕ©\Ï\≈t°\‰têõ˛Æ .\È@ÇmL\Œ\ \Õ!\ﬂh˛n4w\Ë¶{(r8\Z§ÙµWgS|˜$\‰/\0\0\0ˇˇ\0PK-\0\0\0\0\0\0!\0\ﬂœõ.í\0\0î\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0[Content_Types].xmlPK-\0\0\0\0\0\0!\0µU0#ı\0\0\0L\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ü\0\0_rels/.relsPK-\0\0\0\0\0\0!\0Ùı;\0\0Y\0\0\Z\0\0\0\0\0\0\0\0\0\0\0\0\0ã\0\0xl/_rels/workbook.xml.relsPK-\0\0\0\0\0\0!\0k¨m\0\0Ü\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\Ê\0\0xl/workbook.xmlPK-\0\0\0\0\0\0!\0\À\ÏZ\„ó\0\0_\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0Ä\n\0\0xl/theme/theme1.xmlPK-\0\0\0\0\0\0!\0;m2K¡\0\0\0B\0\0#\0\0\0\0\0\0\0\0\0\0\0\0\0H\0\0xl/worksheets/_rels/sheet1.xml.relsPK-\0\0\0\0\0\0!\0o\ÓóU \0\0\ \0\0\0\0\0\0\0\0\0\0\0\0\0\0\0J\0\0xl/worksheets/sheet2.xmlPK-\0\0\0\0\0\0!\0o\ÓóU \0\0\ \0\0\0\0\0\0\0\0\0\0\0\0\0\0\0†\0\0xl/worksheets/sheet3.xmlPK-\0\0\0\0\0\0!\0$IíU\–\0\0U\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ˆ\0\0xl/worksheets/sheet1.xmlPK-\0\0\0\0\0\0!\0˝CTœã\0\0¸\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0¸$\0\0xl/sharedStrings.xmlPK-\0\0\0\0\0\0!\0\‡\ÊT\ÿ\0\0m	\0\0\r\0\0\0\0\0\0\0\0\0\0\0\0\0π*\0\0xl/styles.xmlPK-\0\0\0\0\0\0!\0ï¸\⁄Bõ\0\0\0(\0\0\'\0\0\0\0\0\0\0\0\0\0\0\0\0º-\0\0xl/printerSettings/printerSettings1.binPK-\0\0\0\0\0\0!\0ÄGOûì\0\0\0•\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ú/\0\0xl/calcChain.xmlPK-\0\0\0\0\0\0!\0\n\ \ÎN\0\0]\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0]0\0\0docProps/core.xmlPK-\0\0\0\0\0\0!\0\‘Oin¨\0\0X\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\‚2\0\0docProps/app.xmlPK\0\0\0\0\0\0\0\0\ƒ5\0\0\0\0','◊®◊©◊ô◊û◊™ ◊û◊ï◊ñ◊û◊†◊ô◊ù ◊ó◊™◊ï◊†◊î.xlsx',1,1);
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
INSERT INTO `class` VALUES (0,'b1'),(1,'a1'),(2,'a2'),(3,'a3'),(4,'b1'),(5,'b2'),(6,'b3'),(7,'a7');
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
INSERT INTO `class_has_course` VALUES (1,1,1,123,7),(1,4,NULL,NULL,7),(1,7,NULL,NULL,7),(2,1,2,128,7),(2,5,NULL,NULL,7);
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
INSERT INTO `class_has_course_has_assignment` VALUES (1,1,23,7);
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
INSERT INTO `class_has_student` VALUES (1,1,124,7),(1,2,129,7),(1,3,132,7),(2,3,132,7),(2,4,133,7),(2,5,134,7),(7,1,124,10),(7,2,129,10);
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
  `preCourse` int(11) DEFAULT '0',
  PRIMARY KEY (`courseId`),
  UNIQUE KEY `courseId_UNIQUE` (`courseId`),
  KEY `fk_course_teachingunit1_idx` (`teachingunit_teachingUnitId`),
  CONSTRAINT `fk_course_teachingunit1` FOREIGN KEY (`teachingunit_teachingUnitId`) REFERENCES `teachingunit` (`teachingUnitId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'algebra1',10,1,0),(2,'algebra2',10,1,0),(3,'algebra3',10,1,0),(4,'physics1',10,2,0),(5,'physics2',10,2,0),(6,'physics3',10,2,0),(7,'physics4',10,2,0),(33,'ss',10,1,2);
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
) ENGINE=InnoDB AUTO_INCREMENT=3039 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finished_course_detailes`
--

LOCK TABLES `finished_course_detailes` WRITE;
/*!40000 ALTER TABLE `finished_course_detailes` DISABLE KEYS */;
INSERT INTO `finished_course_detailes` VALUES (3034,0,0,7,0),(3035,0,0,7,0),(3036,0,0,7,0),(3037,0,0,7,0),(3038,0,0,7,0);
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
INSERT INTO `parent` VALUES (1,127),(2,135),(3,136);
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
INSERT INTO `parent_has_student` VALUES (1,1,124,0),(1,2,129,0),(2,3,132,0),(2,4,133,0),(3,5,134,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semester`
--

LOCK TABLES `semester` WRITE;
/*!40000 ALTER TABLE `semester` DISABLE KEYS */;
INSERT INTO `semester` VALUES (6,'2017-11-10','2017-12-10',0),(7,'2017-11-10','2017-12-10',1),(10,'2017-07-10','2017-07-17',0);
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
INSERT INTO `student_has_assignment` VALUES (3028,1,124,1,23,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=3033 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_has_course`
--

LOCK TABLES `student_has_course` WRITE;
/*!40000 ALTER TABLE `student_has_course` DISABLE KEYS */;
INSERT INTO `student_has_course` VALUES (3028,1,124,1,3034,7,1),(3029,1,124,4,3035,7,1),(3030,2,129,1,3036,7,2),(3031,2,129,5,3037,7,2),(3032,1,124,7,3038,7,1);
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
INSERT INTO `teacher` VALUES (1,40,123,1,10),(2,40,128,1,20),(3,40,130,2,40);
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
INSERT INTO `teachingunit` VALUES (1,'Mat'),(2,'Physics');
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
INSERT INTO `user` VALUES (123,'yakov','mora','321',0,1,0),(124,'irit','talmid','421',0,2,0),(125,'tal','mazkira','521',0,3,0),(126,'sapir','menael','621',0,4,0),(127,'tom','ore','721',0,5,0),(128,'shir','mora','821',0,1,0),(129,'kobi','talmid','921',0,2,0),(130,'keren','mora','130',0,1,0),(131,'moshe','marehet','131',0,6,0),(132,'dorin','talmid','231',0,2,0),(133,'shiraz','talmid','331',0,2,0),(134,'bar','talmid','431',0,2,0),(135,'meni','ore','531',0,5,0),(136,'ravit','ore','631',0,5,0);
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

-- Dump completed on 2017-07-08 22:51:26
