-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2022 at 11:00 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coaching`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `username` varchar(34) NOT NULL,
  `userpasword` varchar(34) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`username`, `userpasword`) VALUES
('OWAIS', '12'),
('ABDI', '1');

-- --------------------------------------------------------

--
-- Table structure for table `studentdata`
--

CREATE TABLE `studentdata` (
  `id` int(225) NOT NULL,
  `name` varchar(50) NOT NULL,
  `class` varchar(50) NOT NULL,
  `sec` varchar(50) NOT NULL,
  `month` varchar(40) NOT NULL,
  `date` int(50) NOT NULL,
  `year` int(50) NOT NULL,
  `fees` bigint(50) NOT NULL,
  `other` bigint(50) NOT NULL,
  `total` bigint(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentdata`
--

INSERT INTO `studentdata` (`id`, `name`, `class`, `sec`, `month`, `date`, `year`, `fees`, `other`, `total`) VALUES
(1, 'IBAD', '2', 'B', 'JANUARY', 1, 2022, 5000, 6000, 11000),
(2, 'HASEB', '2', 'C', 'JANUARY', 1, 2022, 3400, 3000, 6400);

-- --------------------------------------------------------

--
-- Table structure for table `teacherdata`
--

CREATE TABLE `teacherdata` (
  `id` int(225) NOT NULL,
  `name` varchar(50) NOT NULL,
  `faculity` varchar(50) NOT NULL,
  `month` varchar(50) NOT NULL,
  `date` int(50) NOT NULL,
  `year` int(50) NOT NULL,
  `sallery` bigint(50) NOT NULL,
  `other` bigint(50) NOT NULL,
  `total` bigint(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacherdata`
--

INSERT INTO `teacherdata` (`id`, `name`, `faculity`, `month`, `date`, `year`, `sallery`, `other`, `total`) VALUES
(1, 'ALI', 'BSCS', 'JANUARY', 1, 2022, 4000, 2000, 6000),
(2, 'ASAD', 'IT', 'JANUARY', 1, 2022, 7000, 1000, 8000),
(3, 'BILAL', 'IT', 'JANUARY', 1, 2022, 34000, 4000, 38000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentdata`
--
ALTER TABLE `studentdata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacherdata`
--
ALTER TABLE `teacherdata`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentdata`
--
ALTER TABLE `studentdata`
  MODIFY `id` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `teacherdata`
--
ALTER TABLE `teacherdata`
  MODIFY `id` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
