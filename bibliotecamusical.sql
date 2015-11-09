-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 04-Nov-2015 às 00:03
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bibliotecamusical`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `album`
--

CREATE TABLE IF NOT EXISTS `album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `ano` int(11) DEFAULT NULL,
  `artista_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_album_artista1_idx` (`artista_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Extraindo dados da tabela `album`
--

INSERT INTO `album` (`id`, `nome`, `ano`, `artista_id`) VALUES
(1, 'Closse', 5, 1),
(2, 'estrelas', 5, 1),
(3, 'para sempre', 5, 1),
(4, 'Closse', 5, 1),
(5, 'estrelas', 5, 1),
(6, 'para sempre', 5, 1),
(7, 'Closse', 5, 1),
(8, 'estrelas', 5, 1),
(9, 'para sempre', 5, 1),
(10, 'Closse', 5, 1),
(11, 'estrelas', 5, 1),
(12, 'para sempre', 5, 1),
(13, 'Closse', 5, 1),
(14, 'estrelas', 5, 1),
(15, 'para sempre', 5, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `artista`
--

CREATE TABLE IF NOT EXISTS `artista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `genero_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_artista_genero_idx` (`genero_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `artista`
--

INSERT INTO `artista` (`id`, `nome`, `genero_id`) VALUES
(1, 'Bon jove', 1),
(2, 'Henrique e Diego', 2),
(3, 'Bon jove', 1),
(4, 'Henrique e Diego', 2),
(5, 'Bon jove', 1),
(6, 'Henrique e Diego', 2),
(7, 'Bon jove', 1),
(8, 'Henrique e Diego', 2),
(9, 'Bon jove', 1),
(10, 'Henrique e Diego', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `genero`
--

CREATE TABLE IF NOT EXISTS `genero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Extraindo dados da tabela `genero`
--

INSERT INTO `genero` (`id`, `nome`) VALUES
(1, 'Rock'),
(2, 'Sertanejo'),
(3, 'Funk'),
(4, 'Rock'),
(5, 'Sertanejo'),
(6, 'Funk'),
(7, 'Rock'),
(8, 'Sertanejo'),
(9, 'Funk'),
(10, 'Rock'),
(11, 'Sertanejo'),
(12, 'Funk'),
(13, 'Rock'),
(14, 'Sertanejo'),
(15, 'Funk');

-- --------------------------------------------------------

--
-- Estrutura da tabela `musica`
--

CREATE TABLE IF NOT EXISTS `musica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `nota` int(11) DEFAULT NULL,
  `duracao` int(11) DEFAULT NULL,
  `album_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_musica_album1_idx` (`album_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Extraindo dados da tabela `musica`
--

INSERT INTO `musica` (`id`, `nome`, `nota`, `duracao`, `album_id`) VALUES
(1, 'Aquele 1%', 12, 12, 1),
(2, 'Aquele 1%', 12, 12, 1),
(3, 'Aquele 1%', 12, 12, 1),
(4, 'Aquele 1%', 12, 12, 1),
(5, 'Aquele 1%', 12, 12, 1),
(6, 'Aquele 1%', 12, 12, 1),
(7, 'Aquele 1%', 12, 12, 1),
(8, 'Hoje eu sou seu bem', 12, 12, 1),
(9, 'É fato', 12, 12, 1),
(10, 'Aquele 1%', 12, 12, 1),
(11, 'Hoje eu sou seu bem', 12, 12, 1),
(12, 'É fato', 12, 12, 1),
(13, 'Aquele 1%', 12, 12, 1),
(14, 'Hoje eu sou seu bem', 12, 12, 1),
(15, 'É fato', 12, 12, 1);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `album`
--
ALTER TABLE `album`
  ADD CONSTRAINT `fk_album_artista1` FOREIGN KEY (`artista_id`) REFERENCES `artista` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `artista`
--
ALTER TABLE `artista`
  ADD CONSTRAINT `fk_artista_genero` FOREIGN KEY (`genero_id`) REFERENCES `genero` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `musica`
--
ALTER TABLE `musica`
  ADD CONSTRAINT `fk_musica_album1` FOREIGN KEY (`album_id`) REFERENCES `album` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
