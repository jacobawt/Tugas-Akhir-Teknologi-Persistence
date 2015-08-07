-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 05, 2015 at 08:04 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenismobil`
--

CREATE TABLE IF NOT EXISTS `jenismobil` (
  `ID` bigint(20) NOT NULL,
  `HARGA` int(11) DEFAULT NULL,
  `KET` varchar(255) DEFAULT NULL,
  `MEREK` varchar(255) DEFAULT NULL,
  `NAMAMOBIL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `listmobil`
--

CREATE TABLE IF NOT EXISTS `listmobil` (
  `ID` bigint(20) NOT NULL,
  `JUMLAHKURSI` varchar(255) DEFAULT NULL,
  `PLATNOMER` varchar(255) DEFAULT NULL,
  `WARNA` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE IF NOT EXISTS `member` (
  `ID` bigint(20) NOT NULL,
  `ALAMAT` varchar(255) DEFAULT NULL,
  `ID_MEMBER` varchar(255) DEFAULT NULL,
  `JENIS_KELAMIN` varchar(255) DEFAULT NULL,
  `NAMA` varchar(255) DEFAULT NULL,
  `NOMOR_IDENTITAS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`ID`, `ALAMAT`, `ID_MEMBER`, `JENIS_KELAMIN`, `NAMA`, `NOMOR_IDENTITAS`) VALUES
(1, 'test', 'test', 'ss', 'test', '223asd'),
(51, 'apa', '1', NULL, 'apa', 'asds'),
(101, 'see', '3', 'Laki-laki', 'pole', '233fsa'),
(151, 'bla', '43', 'Perempuan', 'bla', 't32'),
(201, '', '', 'Laki-laki', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `sequence`
--

CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '250');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `ID` bigint(20) NOT NULL,
  `NIK` varchar(255) DEFAULT NULL,
  `BIAYA` varchar(255) DEFAULT NULL,
  `DURASI` varchar(255) DEFAULT NULL,
  `ID_MEMBER` varchar(255) DEFAULT NULL,
  `ID_TRANSAKSI` varchar(255) DEFAULT NULL,
  `ID_USER` varchar(255) DEFAULT NULL,
  `JAM` varchar(255) DEFAULT NULL,
  `PLAT_NOMOR` varchar(255) DEFAULT NULL,
  `TANGGAL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `ID` bigint(20) NOT NULL,
  `ALAMAT` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `ID_USER` varchar(255) DEFAULT NULL,
  `NAMA` varchar(255) DEFAULT NULL,
  `PASWORD` varchar(255) DEFAULT NULL,
  `TELP` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `ALAMAT`, `EMAIL`, `ID_USER`, `NAMA`, `PASWORD`, `TELP`) VALUES
(1, 'test', 'test', 'a', 'markus', 'markus', '3772'),
(2, 'Jepara', 'willydocksha@gmail.com', 'b', 'willy', 'willy', '085641194070');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
