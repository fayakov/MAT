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
INSERT INTO `assignment` VALUES (23,'0117-11-15','PK\0\0\0\0\0!\0\�ϛ.�\0\0�\0\0\0\�[Content_Types].xml �\�(�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\�U\�N\�0�#����q)B�)�# �|����UǶ<Sh��IJ+@!\��DY�6?\�\�u\�Hh�/\�i>x���B<\�\�\"CR\�(<b(�&\�G\�\�&f<\�c!J�x)%\�*�y�\��\�<�J?���J/\�\�h8<�:xO�1\�d|s�r�ݮ��Vɳ�\"�\��WSB\�\�V\�B\�7_Ha>�\ZLЫ��s�	���*�\�d�1M��������N\�@��ݫ�\�\�Ib���\�졗�\�F��i\�\0{S}��\�1�ě�\�﬽O`\�#�9�\�F\�`\�ή;�א�\�!,�J݆�R\�\�t���+��BDɅ\�-\0\�F0�Ȑ�\�\�>�6n.`�-\�\�6\�\�s5��]�\�8�\':��ʿ塕\�\�%w\��9\�q�,U3%\�\�\�.>bw\�د\r�>�\�R�nY�9S&o\0\0\0��\0PK\0\0\0\0\0!\0�U0#�\0\0\0L\0\0\0\�_rels/.rels �\�(�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\�N\�0\�\�H�C\��\�nH���LH�!T�$\����$@����Jc\�\��\�\�?[\�\�\�iTb/Nú(A�3b{\�jx��V�b\"gi\�\Z�aW\�\�l_x���b\������\Z���#b4O�\�r��0Q\�ahѓ�eܔ\�=��P-<\��j{�>�<���4Mox/\�}b�N�@�;\�v\�Cf�\�ۨ�B\�I��\�\��\"c�&\�\\O���8q\"K�\�H\��<ߊs@\�\�.�h���\�<⧄\�Md�a�\�T_\0\0\0��\0PK\0\0\0\0\0!\0��;\0\0Y\0\0\Z\0xl/_rels/workbook.xml.rels �(�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\�J\�0\�\�\�\�n\�vu\�t��W] �Ӧl��L�ӷ7I-,�R���}�L2\���}��\�\ZY�C�l٘Z���\�\�yiJ\�Z�$\�\�W�Wl��H7=��bH���䜔\�NRb{4�RY\�IBW�^����\�i�\�\�3Mv(�C�v�\������F\�U\ZƂYw\"�胨t5z1E|�l�@�<\���0J�\�I\�\�L01���	�?A\�\�oG�%�\�\�0\�\�vM\�\�a�\�]��3K/�ܭ\n\�6L^|�4\�K��k\��0\�8��!\�x|�!?\0\0\0��\0PK\0\0\0\0\0!\0k�m\0\0�\0\0\0\0\0xl/workbook.xml�R\�N\�0�#��\�4����TB�\�q(\�\�ěƪcG�K\�\�@ \�g�wX�J)�\�;\�\�xg\�\�lW(�\�I�c\�i�)�\Z!�:�O���%\�s-�2\Zb�Gg\�\�Ŵ2v�l̆��v1ͽ/\'Q\�\�\n\�Z���\�؂{�v�\�.���X�=�\n.5=*L\�4L�\�nL�-@���\�=�\�rY:�L3�`ytDxY>�\�\�)Jw�VH\"�=���v[^o�\n\�~{H�\�d�\�\�*�@{�:\�\�z�\r!���\�}�$��\�\�T(9\�h�\r\Z#�\�\�J\n�ǔ\rǃ\�\�=\�u\�|\�\�љ| S�D\�\����\�~o�\�^X\�x�>������N��\�\�HX�H\�/R�����ԭGn\�L�J1��\�#���M5O(�\0\0��\0PK\0\0\0\0\0!\0\�\�Z\�\0\0_\0\0\0\0\0xl/theme/theme1.xml\�YOoE�#�F{oc\'v\ZGu�ر	�i�\�-\�q�\�N3���\'�\r�G$�EH�\�\�?�Z�K��\0�\"(R�ofv\�;�&m\�C�;����y3{�\�툡\"$\�qӫ��x�\�>\�8hz\��\�sk�\n\�C\�xL�ބH\�\�ƛo\\\�\�*$A�>�\�\�J%\�KK҇a,\��\�07\�\"\�\n^E�4�\�Fli�RY]�0�=\�\�N��~5�l�\r�>�ޟ~=�]��O���Q��XI=\�3\�\�lH���\�W5BNd�	t�Y\��C~\�\'����\n&�^\������Kx=]\�Ԃ��u]�Kץ��ˆ�9\�j�ָ��\�7\0�\�q�N�ݩ\��\0�>hje)Ҭuת��fd\�i�+�J\�\�\�\�\�\�h�Z�F*�%j@��6�_��\�6��Y|}_km�۫ހ,~u߽\�X��x\n��\�\�ڡ\�nJ=��8\�.��|��\�g(��<�4��բX��-.�\0\�@����$d�}�\�6��b\�\0�\\��C��Ҽ��MT\�{\'��3zϟ|��\�#��\�ã;��\��xt�\�ѝ,-g\�6��\�\�g_~�\�\�\�\�=xv\�~9^�|��\�?}\\��I�����>~��\�~��^	|S\�Aާ�\�*9D{<݌a\\\�\�@�nE?\�\�Y�C�]B��Bxu�Y�E\\\�\�P<ʀo�o9��B1V���\�0r�;�����y,\�\�A9s1.\��0>(\�\�Ʊ\�\�\�8����c�vH1w�HL\�s|��\�nR\�\�u���K>R\�&E-LKMҧ\'�f��i~��\��vl�s�8+\�z��HH\�J�\�\��-<V8*#\�\�+\Z�\nVa��������T\�\�0�:C\"eٚk�-8�2�zU\��6�\\�Pt��\�\�y�\��\�!��2l�\�a��܇\�h��2�w3D��p�\�\�7(q\��\�Bp��H�\0\�3c�}	�ک����3\n\�\�\��\�b\��6ak*K�\�c%x\�_Xx��8\�%\��\�\���\�z����(�OZmgj�nl_l�\�ha�<���Ԅ�+\��\�6�a�:sX$��)	\�1-\�.جA��w�\n{!N�Ǯz�H SҁD	�p�3å�5�teO�u}f��@b�ÇvxEgG���\�rs�\��h\'e�r!%\nj���\�\�ܪF4S\�n�\�\�\�y\�`0�&t!z��*\�5k8�`F�\�\�v\�\�b�p�.�!�\�GZ\�yU���X1�;%>\�\�X����ɾ��8�Ȯ��]\�W�R�3/\�=��,.&\'�\�a\�kԗ\��q\��Fp��\�(�K\��a�=���\r�&�\��7�bnT\�\�\�}Na�$B�-,C\Zf*\rkNV�\�:������R��A0�cR�]גш��\�\���}MK)+\"z\��\r\�X\�ap�U\�gH%\�N���_\�*M[\�L�\�9M�\���\�q̒�\�V�h�\�n�8���\�\�Je7ʝ^��g�J1��g�\���V�\�>\�\�\n�t�6=.Tȡ\n%!��\ZS; Z\�:�!�\�n\��\�@��9gi���S�ڣ�#\nBv�,�\�{�j�wY�,%d\"� �L�\�r@X_\��U��{(�P7\�$-w<�\��4��nr��\�Ԑ|\�9�ww>6�A)���&�.bɮjכ\�\�\�[TDO\�ڬZ����4ҴIN�\�ڊ5��r=�8�1\�\rQ�>H����\n�ُzC\��=���5hb6\�\�l\�t���h�\�\r&Mʚ6m��ղ\���;ݜ\�1ck\�N\�\�S\Z;o\�\\vN.���S;��cM\r�=��04\�2\�1\�W�\�\�Go���)i�	>+	�g\�\�$�\�h�n�	\0\0��\0PK\0\0\0\0\0!\0;m2K�\0\0\0B\0\0#\0\0\0xl/worksheets/_rels/sheet1.xml.rels����\�0E��Cx{�օCS7\"�U\�b�\�ۗ���{�e�\�\�p\�\�6��<�f�,Ժ�\�ch��{\�-�A�8\�\�	-<�a\�.��NNJ�ǐX��Q$�\�~\�ٱ�	��>\�\�I�y0\���Ь�jm�_�/N�\�,\�}W�:=RY�\�}<n��\�H�τI9�`>�H9\�E\��bA\�w��k}�m\�\���	\0\0��\0PK\0\0\0\0\0!\0o\�U \0\0\�\0\0\0\0\0xl/worksheets/sheet2.xml��\�K\�0\�\���p\�6\�t*�\�\�PP��g\�\rkr%�Y�\�M:6_|��\����.\�\�\��\�}0\�J�e9t55Ƶ%�o7W� +ר����V\�\�E1�߇�E$�PB\�<,�u�V��t��\�[ű���G\�LC���<��VG\�\���AZ�\Z\�T,:>B<��\���3C��hL\�@£.\�a�*&\��c���7m\�[zF\�1=��jG�O���4*�\�n�T�^4�ա\�7\Z1�\"\�&�/Άk\�*\�\��qA��W�\��\�=�$\�4LjbG\�dOUo��6yv\rB�H����\0\0��\0PK\0\0\0\0\0!\0o\�U \0\0\�\0\0\0\0\0xl/worksheets/sheet3.xml��\�K\�0\�\���p\�6\�t*�\�\�PP��g\�\rkr%�Y�\�M:6_|��\����.\�\�\��\�}0\�J�e9t55Ƶ%�o7W� +ר����V\�\�E1�߇�E$�PB\�<,�u�V��t��\�[ű���G\�LC���<��VG\�\���AZ�\Z\�T,:>B<��\���3C��hL\�@£.\�a�*&\��c���7m\�[zF\�1=��jG�O���4*�\�n�T�^4�ա\�7\Z1�\"\�&�/Άk\�*\�\��qA��W�\��\�=�$\�4LjbG\�dOUo��6yv\rB�H����\0\0��\0PK\0\0\0\0\0!\0$I�U\�\0\0U\0\0\0\0\0xl/worksheets/sheet1.xml��[o\�\��\�\�?zJb��P�a{�ls�d� ��\�Uk\�c!�\�H��\���tu�\�S7e^\�\�\�)~]\�<EJ\"���\��e�e{8\��o7\�\�b2m\�����O7\�_~��\�xt<m\�7/��\�\���\�q�\�\��p�u���y�=�b��\�\���tz���<><o_7ǋ���-F���\�\�)���\���~\�n�\��\�r:�ԗ��\�\�8g�:|K��\�\�\�a{����};\�$�\�\�\���ϻ�\����qc4�\�a�t3������\�Ɨ�\�\�\��\�m�\�ߣ\�\�\��\�\��_�O�X��\���\��e�p\�>\��\�\�)�//�m��h��\����\\?ƽ&�Ǥ�\�nN�/\�n��*��LR����\�n9!�\���\��>���\�0z\�>m>������Ö8#\��b�����{�s���\��^7����\�O\�7\�\�\�l��>O�\�\�mU�̚i��w�j}Q\��\�D�N�\�DkZ$��\���\�\�<	)�ݧ��3<u\'���\�Ee�\\\��2\�mN�\�\�\��\�(��X�\���\�du��j���@�\�)z3�\�i�\�j�r[__~�s�\�\�\��{P�I\�;\�pZ�ˈG�ǉ[�p�&�T_,\n\�Үi\"��\�#\�=buK�\�\�N\��=Z�ǔ\��A\�\�{\�\�=V|��\�eم�3�\�\�O\�,M��#\�\���<Ty�l1���m=�τ�Ō��\�cpm\�\�%f\�\�-��c%&?P\"?�[/V��\"\r�e)%>!+~<g\r|Z�_n\�\�j\�e\�Ubf%��s�u=���-K)�1\�\�G1�\�/\�}��H�D~N�^N\�\�4hYJ��A?���ű��\�/\�(��\�2��ĠI�m0\���$�զ\Z� ũ(�y�\�\�t*�ֲ��>u-��N������b%r�[&��t �xEfP\�\�Te\�\r\�=p�\�R.�K%)�z�\�uA�l��(�S7�H��Wӻ>c���\��jx\���^E�\�\�4\\�sC�rvW�\�٭\'Jiד\�Rxf˳�a\�1�C�aP\�3�\�uOq��6���e6��eR9!�,\�R�3Xss�)�\n�\�T\��VQ��L%�\'����e�ǼgQo\�\�a\�&\'\�T\�Ŧ�4P\�F\�7�r�-˪��\��A\�Fnv�p\�\�n6U\r��\��\�z�X�\�˪��\����\�\��\ZgJ�}�{h%<��ۇ�X��@Qo-�jVL\�R4Xs醙�76��I�hag\�]\������eY�0�\�0�\Z\�\�-��=�\��7�-\�g\�]�a,\'K5̪��QgSl�\�ʉ�阕hU\r\�^:�TDCJ\��\\1-�*V�X�\�k\�8ՠ\�Mw�\rp*����\����C^vFN��kn��\�4�{��\\�!%s\�R͊Q�\�\'�\��)]��b���\������\�2�f\�\�+�O`\�n5\��)�Oy\�(곢T�b\�c\�	���\��\�\�\'?e\r\�{\�@\�\�*�\�2�f\�\�+6B`\�]K��f�Mi.\�d��ϊR͊Q�\�\�v�J�,\�#\Z��Ե�-�b��L�Y1�\�jw�inM�4q;\�\��\�*t�t�W>�\�\�,�\�\����\�\�6\�]>�\�\\�L-�sT\r\��o)x��\�\�\�^qsZ	�?5�{9��	)�\�L�\�ʢ+5]\�Yw�4�r]\�v`�?P\�]�L�Y1�pTֽfv������?5iw�j�r\�v�ث��eb41F=b��\�r�]��\�\�y����\�>1�*M�Q�����r\'���53\�p\�z�d\�\�E�fŨ\�J\�\�`͝l&*\�\�п\�\"\Z(ZX\�0[&լ,q�>�v�����\�D�jf�\�h�ha��Ť��%vX\�N6˝l&ܴ�ۇ\�d-���>+J5+F�5`w�Y\�d3qK\�\�\�D\�&L\��n�\�K�r\'�\�O��GL\�\�X	��ɫ�f�{#�\n\�>�\'`\�\�5ƨC<��Yܜ|W�3\�}(�<bH\�zS�\'\Z׊\�=�z�fCk\�5a+�AJ\�v�3\�N\�ل���/�J\�O�n\'9O<�\�2��\�\\���\n\�N\��\'�\�\�̳U��\�{�\�\�t>La\�Ͳ>b~\�<\�t>?7RJ\Z�\�ox�\�\�\�)�\�\�~��xN�d�-Gv��D\�\�E\�\\힤\��\�e\�MEv�@\�\�\�-�j&L\�1\rn5�*w`\�mCv�@Q�	��	�\�b�#d�ͥĲK�$�\�I�zL�\�0&���mj&a�M)�w9w,\�\�L�2+YVŘ�\�UvȐDn�P��0\�1\r�Ƙ�\�t&:JXd�\�uC-\�\�	�\�`��	/Ag����l�\�ܡT\�	�C^>w��2��y��\�^���Ĥ\"zOҒ��_p��|U\�\\\�sqA\Zك�J1��¨W��\�\Z��q@X�\�]\�L��0\�1\rNΘ\�pk��\�✓Sp(�b¨\�D��;cB\�]�3�D}�\�Ķ�\�U�Q�����6���m>�g�h�T1�萗��LY׉6��8lH\"�	��	��\�\�5\Zn%(\\&O�L��Xf�ʝ��|\�(zn%��	5�\�Z�Vcaԫ���[ɯeBM*\n�\Z\n��[+r���x׭5\�}3N׭i\�\�w[��k�\�HݥpC�\��˛\�$\�\�/�-���\�{�&��\�`BߚK�I�\�u��T1a\�c\"o3�з惶3�L\�3��fRń\�!/;�\��-&\�\\\�n!\�~�L���L:�L,\�1ن�Dߪ&r�(\\\n%͇i5f��lG\\�o-D\�\n-L⃪�I5&��\�\��Z�i\�\�\�\n-L�N(\�L��\�\�&���8lX��_P\"\�R��Ë́Q��[aoPK���8�E}&�j&�zL�i.\�4kq���L(\�L��l\�\\��-\��(\�3�T3a\�c\"�3\�z[���D\�zB�f¨ô�\r�6��ZM䉗T\�*(��l�Z��,����bR̈́�=&�\Z=y+���\\\���P��0\�1�\�L\�#5w$r\���	�y���>R\�߯��z(\�zZ\n�Ũ�0\�A�\�Ph$���ZX����VN�3P��\�m(t�J�\�,�H\�B�VW\n�\�ھ��\�e�\�QI\�3\�\�cR\�Ģ�\�Qk��Š\��u\�Ĥ�	y\�\�\�ڶ(\�\\\�Tˋ\�$\�\�$�j&L\�1�\�\��F\'YʞGQ�N(\�L��\�mS�F\'щ1\�%�\�\�T\�f��\�-e��h�Z�(\�L��\�\�&t��\�k����	�������=bM��I\�	��	�y�����T&C\"�	��	�]g)�v�\�P:1F�\�\�ĶԴ�x\�ZT9>\�B�~�\�,�Xq�f�j[M\���\�vs\��XM\�Ǫ�<R��Z\�$��\� ðKF��&��&\�f��q:H\�O�C��a̴\��n��=%�π�\�\0ðF�iU-q%j+F2�b(6�0삑u*��L\��\�vs��\�q6\�\�V⼌�&Y?h�`(6�0삑Z`hr+�@��\�,�\r0�`��Ɗ�I�\��G\n���\r0{`\��A�b\����V��F��k0v�L�\��î�G�{�0>B�b\�.�\�\�\�����j�(\�O%`\�b\�\�Q>5��\�7=����Ą\Z���\Z!�\�)��G\�7}��\'\����\�\�[_�CX�\�ZR��PXj�[&WH�\n,\\~}\�n\\\�mn����Eޓ��w6M�\�&c\�Z��wZdh��\�\�{2\��d�6\�X��dd��b�:)�t>�\r2.��c�\�\�Zu�x�(h\\f\�U�d����3J\�\�`I\�V��u\�x\�sL�=\\f��\�c��*\�r\�<�Jx�dP�\'\�04]5�LlT\�[L7=\0fM%^\�\Z`g��كc\�v+Fm�\�U���=��FW\�{k,\Z�	�m��\�_c(6�X\�#�*��l��\�C�\�\�y�\0FG�2�7w\�xao\�6}\��Ȗ���\�\����KU���0��\��\�x�XF���=��K\��s�d\�D]��ǲ4\Z:���q-=MeT�=*�\�N��kG�1�A\�\�.�c\�\�)�-]���[dw\�Ȝ���\�\Zd\�\�\�\�]2rg��\� ;k\��U�H\�\"øKF�l���\Zd$\�יru���E�\�]2�g��\� #�O�b�\�.Y�=�\�\� #�O�b�\�.7�\�\�\�\'��d>^�[dwɜ.�S2\�H\���&���dN�g�\�\�e��\�\'C�U3�{d\�)�\��\�\�\�6-^Z_y�]�\�F�Q&��&\�Es=\�~�\�?�\�U\�:���\�Sz�W~m\�k�K���\���\�\�\�\�Sz�\�q����kI�eky\�f|E\"�\�\�*\�7��?m�vo\�\�Kz\�\�\�\"����\��M��i���O\�_���\�\��\��š\��*\�\�E\�}\�\�O�\�A(\�\�\�\���\�}�=|\��7��2N\�����Mo��\��\�fw\Z\�\�NO��\�\�\��.\�ǿ\�=ތ?>f\��^\�\��\0\0��\0PK\0\0\0\0\0!\0�CTϋ\0\0�\0\0\0\0\0xl/sharedStrings.xml�X[n\�F�/\�=�ӯF�[A \���v�\�\�,\�\�݅^ŊaIŵEmh�\�s\�L%w\�@��s\�>\�}\�ݫ�Fw\�C<I�\��~u�8�\��w�\�\���Md\�\� �܍����\�U��\�i:5����\�v:�\�\�׷�h��\Z\�\�	N�OF�)���\���xp�\�\��tt׹����3\Z�\�\\��i/�\�\�ed�\����W�\��\�\�Q���\�i\�V���ۙ��>�[�Q={����\�\�®\�\��2{P\�7���8�W�\� ��<cW�\�P@����5�\�x�\�@hn�\\ە�\r4�\�\�\�\�.m��\��ʴ-\�?��~:c}�K�o�\�+m5�Yع- ��\�H��H\\yVWfp��`e�\�@��\"w\����\�.\�\���x��@�p��K�\���\�P�\r=0$y Q䆒\�po��\�~R�\'��Ar[\�N(WBEF\�T\��A��b!�\�gA��l�,ZC\�s�*u\�\�\�\Z�\0=w��\�\�p2�\�$T⬳��Œ�\�7\�8�\�\�\\�q �&\nI����\�\�)� K�/\�\�v��)��Lh\�, cЖ\� G\�t*I;��Z\�x\�^#�i�.C\�5C\�\0Ʉ�\�FK�\��\�feA\r*\�5�O\0�z�Y�s�\�Yf\�}�f�(]\�=ϗ	S\�\�h)9��`J\�\"\'�MYL�{\�&�\�\�\�8C��^]\�\�\r�s�c`\�z�RD\�#P�6t\�,\0��\\u\0��\�*\0��|+:0�!8W�\'�\nnU��2	l�Gt�\�<8zS\�5\'\nk�\�EW\"�\�B�T����	l(��c\�y�	�?���6p�E\�4\��!i\���n%��+\�\rI�\�Jk%�\�Sr\\�\�)W*4l��+z��/�	�Sw��n���\�`�|��\�؈�\\	�H\�Gsx�\�!)\r��`?�!��(l�b\'��]\�È!�bU\��\�\�|v�c�\"P\�\�9�\Z\�@\r\�RH��-)e{�ݝsF[\�9q\�>�i�JбPf\�S�SK�\\���n\0\�nJ}{\r�?\���\�\�ˠ\\\�0(\�%���saG���6�-q�}�\\`R[���A�t\n]�R`V*\�q���\�t�S�}��L���$e-^6\�\�\�\�4\�\�v 	W#\��6�!\�]�Ş���9�\0lĲ�H���h�\\\�\n\�\�#ڕ\�8\��k|\�R7j�2^z\�do\\]j\r#C�$\�\��\�\�C	\Zq \�I(S��%�{\�1\�v!�+���PC���ܷ\�\�b	�\�KW\�ms\�0\�@\�ؾ&_Lߦ��k��\�\�3�\'⨏<1b�&\�q�x^�R���H^Hi�Q2�4�05\�\��-��5�N�k_O�C�\�\�NY\�H0���K/�\�ۯ��m� ��\�V��d\�F���\0\�X#�e�\�?�,�W:_L���(y\'��@\�B[C�c�I�\�J\�\n���Zysޖ|�a�_\�3E��\�\n\�\�\Zz)�G�!*P��,RfF+`�xUv\�?��0VB<�\�\���w�ߛ��\0\0\0��\0PK\0\0\0\0\0!\0�\�\�T\�\0\0m	\0\0\r\0\0\0xl/styles.xml�V[k\�0~\�?��v\�4M�\�\���\�\�^\�Xv�I)I��$ǗP�iayp�#�\�|\�j\'7{�\�3Ն)�\�\�E��U2Y��\�1��\�\�X\"K�)>P�o��_c�>l)� �I�\�\�\�{�͖\nb.TC%�TJba�\�\�4��\�8%��y/#A�\�Y\"w\"֠�\�I<:\n\'?K.�;U�\�FY�\�YR)\�c,\0\�	�ļ�g\�`\�oW\ZY 	^\"��\�ƭf��K��pD�5\0]_;���\�L*\�Q����u���8�����\�\�\�\�l>\�cgy]])\��8�_����H\�㼫�udIC��Z\�A\���\�@\�%rȔ�\�\�߸]kr�ͯ\�W0��\�\�^}\�s\�\�\"�_\�cQ�L�tO����]\��2:�ܩ���/1�\��Q|q��\�\�j���W�x��|��\'Q.�.aL;4���\�ʂ�\�[�oU\�BY�,JFj%	�et\�h\0���?�Q�\Za\�A\�\�Pr�䆀[Bd\�e��?D\�C\���q\\��:#\�v�ǫ\�G�i�\�~\'\n�s?\��3B�:���3�༆5bx6\�)\��{\�ƀ\�\�Ɔ��\�\�\"C>���嬖�\�\�E[�\�8\�&�\�i��j:�\�\�2Ajh*�\�{ǹ֝S�Q2\�F�HƄ�דa�p2\�d?H�\�\�\�\�r��ؿб��0\Z\n]{#�>I�\�\"��d;\�a�u�\��,����ؒ>a\��\�@\0KZ���\�a���oZ��Xw���ge=D���/7	gK?\��\�\�\0\0\0��\0PK\0\0\0\0\0!\0��\�B�\0\0\0(\0\0\'\0\0\0xl/printerSettings/printerSettings1.bin옽N\�0\����M\�!<B�JLH��\�P\�	�t�����\n�cX�20�%xXxα\\\�\n�MEIzn;>\��\�\'\�_�x\��x\�=��0\�\'q�s̩\�ު\�/x��:	\�F\����\�c1�=L@9С�5\��Z��\\Z�N֦\�v|�V\�,�����\�:#\�\��\�\�o\��G今;�*V�7�u�6\�5e�GǾ\�ܛ$	\��\��ؑfKԻ\r�\�W����\�#>\�5Ғ�`\�\n��;\���V\�\ZzŚW\�\�u�\�N��\�\�a�\�1\�I����\�~?#�\�O�S֦\n\�����\�v�=�v�v&�C_���^V�,H\�\�\��\�`Xi\�E&��\0`L�	0&P{�Z�E�\�0�����\�ր�P����\�\��vY�H\�\�\�!Vo\Z]f��(.�	0�Z(r�\\+\�\�&�\�O\�\0\0��\0PK\0\0\0\0\0!\0�GO��\0\0\0�\0\0\0\0\0\0xl/calcChain.xml<��\n!E�A� o\�\�TD�:����>@�\�(\�s�I\�\�\�\�\�¹GO��\�+\�B\�A�@�e��\Zx>\�+n��\n��/2Lv�\�\�%?It��\�\�v��}�\�x(R_^�f\�:\�U�V\�-[N�\�E\�.\0���\��|{H�\����\0\0\0��\0PK\0\0\0\0\0!\0\n\�\�N\0\0]\0\0\0docProps/core.xml �(�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\�J\�0�\�ߡ\�Mڎ����]9�(ޅ\�l+6iI�\�\���:�\�V+�\������\�w��\�A��R\n�<P��\�d\�q��\�3�)�\�JA��`\�<��HyMy�\�^W5h[��I\�\�m��)ƆoA28�r\�ҒY�\�\\3�\�6�#B,�2�,\�-Я\":\"���.;�\�J����a\��-͟\r�2r\�\�\�k�\�1\�-x/\�)c\�4Aw1\\�?/\��U�B��\��Tp\�50[\���y�:|�xTj\�W2c�\�\�\�\��~p�+�\�E\� <��\�O\�S|s�Z�<\"a\�+?��HB\'1%\����\r\�\�q��ĩO��\�hB\�Ɉx\�)>��7\0\0\0��\0PK\0\0\0\0\0!\0\�Oin�\0\0X\0\0\0docProps/app.xml �(�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0��\�j\�0\�\�{��FN:\��Ji;z��@\�\�k�q\"�HF:5\�\�b[{Q(��r/\�\�ٱ�$\�6\�`8��}��\�\�&�h�\�\�p�����q�]\�>~`ID\�re����!��\�@L�/!������[ �cΣ^�R\��u\n�\n)\rs\�\�h8��n	�(M�9�\\�a�5d�\�·�\�^7|�f�.	X�Ӳ�F+�)\�\��G_`r�\�`\�7\�MA\��k�\n\�O\�T+gd,e#�+�KPͦM�	Q�\n\�h�!�\�+mۈ%_T�\'c�\nF9$�F\�%mlˈA\�\�\���~�_\���ԯ�7\n~\�����Ӵai?6\�\�Q+�`_\�t\\\�\�\'��?��h:�-�\�o\�\�asLCm��*:���\�f������\�\�̟+�ͩ\�\�t�\�t���� .\�@�mL\�\�\�!\�h�n4w\�{(r8\Z���WgS|�$\�/\0\0\0��\0PK-\0\0\0\0\0\0!\0\�ϛ.�\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0[Content_Types].xmlPK-\0\0\0\0\0\0!\0�U0#�\0\0\0L\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0_rels/.relsPK-\0\0\0\0\0\0!\0��;\0\0Y\0\0\Z\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0xl/_rels/workbook.xml.relsPK-\0\0\0\0\0\0!\0k�m\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\�\0\0xl/workbook.xmlPK-\0\0\0\0\0\0!\0\�\�Z\�\0\0_\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\n\0\0xl/theme/theme1.xmlPK-\0\0\0\0\0\0!\0;m2K�\0\0\0B\0\0#\0\0\0\0\0\0\0\0\0\0\0\0\0H\0\0xl/worksheets/_rels/sheet1.xml.relsPK-\0\0\0\0\0\0!\0o\�U \0\0\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0J\0\0xl/worksheets/sheet2.xmlPK-\0\0\0\0\0\0!\0o\�U \0\0\�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0xl/worksheets/sheet3.xmlPK-\0\0\0\0\0\0!\0$I�U\�\0\0U\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\0\0xl/worksheets/sheet1.xmlPK-\0\0\0\0\0\0!\0�CTϋ\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�$\0\0xl/sharedStrings.xmlPK-\0\0\0\0\0\0!\0�\�\�T\�\0\0m	\0\0\r\0\0\0\0\0\0\0\0\0\0\0\0\0�*\0\0xl/styles.xmlPK-\0\0\0\0\0\0!\0��\�B�\0\0\0(\0\0\'\0\0\0\0\0\0\0\0\0\0\0\0\0�-\0\0xl/printerSettings/printerSettings1.binPK-\0\0\0\0\0\0!\0�GO��\0\0\0�\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�/\0\0xl/calcChain.xmlPK-\0\0\0\0\0\0!\0\n\�\�N\0\0]\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0]0\0\0docProps/core.xmlPK-\0\0\0\0\0\0!\0\�Oin�\0\0X\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\�2\0\0docProps/app.xmlPK\0\0\0\0\0\0�\0\0\�5\0\0\0\0','רשימת מוזמנים חתונה.xlsx',1,1);
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
