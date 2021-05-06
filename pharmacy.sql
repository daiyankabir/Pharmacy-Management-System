-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 17, 2019 at 11:31 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `Company_Id` int(20) NOT NULL,
  `Company_Name` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Contact_No` varchar(20) NOT NULL,
  `Branch` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `drug`
--

CREATE TABLE `drug` (
  `Drug_Id` int(20) NOT NULL,
  `Drug_Name` varchar(20) NOT NULL,
  `Medical_Name` varchar(20) NOT NULL,
  `Price` int(20) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Company_Id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `Inventory_Id` int(20) NOT NULL,
  `Quantity` int(20) NOT NULL,
  `Drug_Id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `Stock_Id` int(20) NOT NULL,
  `Drug_Id` int(20) NOT NULL,
  `Company_Id` int(20) NOT NULL,
  `Arrival_Date` datetime(6) NOT NULL,
  `Expired_Date` datetime(6) NOT NULL,
  `Quantity` int(20) NOT NULL,
  `Shelf_No` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `Transaction_Id` int(20) NOT NULL,
  `Drug_Name` varchar(20) NOT NULL,
  `Drug_Id` int(20) NOT NULL,
  `Inventory_Id` int(20) NOT NULL,
  `Price` int(20) NOT NULL,
  `Quantity` int(20) NOT NULL,
  `Total Price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `User_Id` int(20) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Contact_No` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Type` varchar(20) DEFAULT 'User'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User_Id`, `User_Name`, `Password`, `Email`, `Contact_No`, `Address`, `Type`) VALUES
(1, 'Zilqad', 'zilqad', 'alzilqad@gmail.com', '01827185744', 'Mirpur 14, Dhaka', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`Company_Id`);

--
-- Indexes for table `drug`
--
ALTER TABLE `drug`
  ADD PRIMARY KEY (`Drug_Id`),
  ADD UNIQUE KEY `Medical_Name` (`Medical_Name`),
  ADD KEY `Drug_Name` (`Drug_Name`),
  ADD KEY `Price` (`Price`),
  ADD KEY `Company_Id` (`Company_Id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`Inventory_Id`),
  ADD KEY `Drug_Id` (`Drug_Id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`Stock_Id`),
  ADD KEY `Drug_Id` (`Drug_Id`,`Company_Id`),
  ADD KEY `Company_Id` (`Company_Id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`Transaction_Id`),
  ADD KEY `Drug_Id` (`Drug_Id`),
  ADD KEY `Inventory_Id` (`Inventory_Id`),
  ADD KEY `Drug_Name` (`Drug_Name`),
  ADD KEY `Price` (`Price`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`User_Id`),
  ADD UNIQUE KEY `Password` (`Password`),
  ADD UNIQUE KEY `User_Name` (`User_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `Company_Id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `drug`
--
ALTER TABLE `drug`
  MODIFY `Drug_Id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `Inventory_Id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `Stock_Id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `Transaction_Id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `User_Id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `drug`
--
ALTER TABLE `drug`
  ADD CONSTRAINT `drug_ibfk_1` FOREIGN KEY (`Company_Id`) REFERENCES `company` (`Company_Id`);

--
-- Constraints for table `inventory`
--
ALTER TABLE `inventory`
  ADD CONSTRAINT `inventory_ibfk_1` FOREIGN KEY (`Drug_Id`) REFERENCES `drug` (`Drug_Id`);

--
-- Constraints for table `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`Drug_Id`) REFERENCES `drug` (`Drug_Id`),
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`Company_Id`) REFERENCES `company` (`Company_Id`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`Drug_Id`) REFERENCES `drug` (`Drug_Id`),
  ADD CONSTRAINT `transaction_ibfk_2` FOREIGN KEY (`Inventory_Id`) REFERENCES `inventory` (`Inventory_Id`),
  ADD CONSTRAINT `transaction_ibfk_3` FOREIGN KEY (`Drug_Name`) REFERENCES `drug` (`Drug_Name`),
  ADD CONSTRAINT `transaction_ibfk_4` FOREIGN KEY (`Price`) REFERENCES `drug` (`Price`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
