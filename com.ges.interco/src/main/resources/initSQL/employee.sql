-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 21 jan. 2020 à 23:58
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `interco`
--

-- --------------------------------------------------------

--
-- Structure de la table `employee`
--

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `age` bigint(20) DEFAULT NULL,
  `anciennete` bigint(20) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `nationalité` varchar(255) DEFAULT NULL,
  `niveau` varchar(255) DEFAULT NULL,
  `score` double DEFAULT NULL,
  `client_id` bigint(20) DEFAULT NULL,
  `domaine_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `employee`
--

INSERT INTO `employee` (`id`, `age`, `anciennete`, `first_name`, `last_name`, `nationalité`, `niveau`, `score`, `client_id`, `domaine_id`) VALUES
(1, 25, 1, 'Anas', 'TARIQ', 'Marocain', 'Confirmé', 600, 1, 1),
(2, 32, 4, 'Jack', 'Bomberman', 'Americain', 'Sénior', 780, 2, 2),
(3, 33, 4, 'Berhoumi', 'Bayram', 'Tunisien', 'Sénior', 680, 3, 1),
(4, 34, 4, 'Badr', 'WldMoufida', 'Tunisien', 'Junior', 780, 4, 3),
(5, 23, 4, 'Jack', 'Leventreur', 'Français', 'Confirmé', 780, 2, 5),
(6, 27, 4, 'Eric', 'Nayssam', 'Marocain', 'Confirmé', 780, 5, 6),
(7, 24, 4, 'Ilyass', 'Stifler', 'Marocain', 'Sénior', 780, 7, 7),
(8, 19, 4, 'Jessica', 'Pearson', 'Algérienne', 'Junior', 780, 1, 1),
(9, 20, 4, 'Harvey', 'Specter', 'Canadien', '>Confirmé', 780, 2, 9),
(10, 45, 4, 'The', 'Man', 'Americain', 'Junior', 780, 0, 3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi4yb1ob1r2hh02jtbpi8pr19g` (`client_id`),
  ADD KEY `FKk7a51y2froxl0g48xlt7i1hxj` (`domaine_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
