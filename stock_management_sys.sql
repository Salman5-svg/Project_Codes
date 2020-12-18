-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2020 at 06:43 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock_management_sys`
--

-- --------------------------------------------------------

--
-- Table structure for table `product_table`
--

CREATE TABLE `product_table` (
  `SL` int(11) NOT NULL,
  `ProductCode` int(11) NOT NULL,
  `ProductName` varchar(200) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `TotalOrdered` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_table`
--

INSERT INTO `product_table` (`SL`, `ProductCode`, `ProductName`, `Quantity`, `Price`, `TotalOrdered`) VALUES
(1, 4344, 'Chocolate', 2, 25, 3),
(2, 900, 'Orange', 7, 100, 4),
(3, 444, 'Biscuit', 5, 200, 30),
(4, 120, 'Orange', 45, 444, 23),
(5, 876, 'Mango', 4, 390, 40);

-- --------------------------------------------------------

--
-- Table structure for table `seller_information`
--

CREATE TABLE `seller_information` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `mobile` varchar(11) NOT NULL,
  `email` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller_information`
--

INSERT INTO `seller_information` (`id`, `name`, `mobile`, `email`, `address`) VALUES
(1, 'Md. Salman Siddique', '01866163635', 'salman.siddique0100@gmail.com', 'Bosilla'),
(2, 'Md. Nazmul Islam', '012345678', 'nazmul@gmail.com', 'Narayangonj'),
(3, 'S.M Mostafijur Rahman', '019999999', 'mostafijur@gmail.com', 'sherpur');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product_table`
--
ALTER TABLE `product_table`
  ADD PRIMARY KEY (`SL`);

--
-- Indexes for table `seller_information`
--
ALTER TABLE `seller_information`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product_table`
--
ALTER TABLE `product_table`
  MODIFY `SL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `seller_information`
--
ALTER TABLE `seller_information`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
