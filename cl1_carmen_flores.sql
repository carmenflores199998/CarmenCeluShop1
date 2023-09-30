-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-09-2023 a las 21:13:12
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cl1_carmen_flores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_celular`
--

DROP TABLE IF EXISTS `tb_celular`;
CREATE TABLE IF NOT EXISTS `tb_celular` (
  `cod_celular` int NOT NULL AUTO_INCREMENT,
  `des_celular` varchar(255) DEFAULT NULL,
  `pre_celular` double NOT NULL,
  `sto_celular` int NOT NULL,
  `id_marca` int DEFAULT NULL,
  PRIMARY KEY (`cod_celular`),
  KEY `FKx2fdgyoko6i58fmgl1v89ivc` (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `tb_celular`
--

INSERT INTO `tb_celular` (`cod_celular`, `des_celular`, `pre_celular`, `sto_celular`, `id_marca`) VALUES
(1, 'xx', 122, 1, 3),
(3, 'xzxzc', 12312, 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_marca`
--

DROP TABLE IF EXISTS `tb_marca`;
CREATE TABLE IF NOT EXISTS `tb_marca` (
  `cod_marca` int NOT NULL AUTO_INCREMENT,
  `nom_marca` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `tb_marca`
--

INSERT INTO `tb_marca` (`cod_marca`, `nom_marca`) VALUES
(1, 'Samsung'),
(2, 'Apple'),
(3, 'Huawei');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_celular`
--
ALTER TABLE `tb_celular`
  ADD CONSTRAINT `FKx2fdgyoko6i58fmgl1v89ivc` FOREIGN KEY (`id_marca`) REFERENCES `tb_marca` (`cod_marca`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
