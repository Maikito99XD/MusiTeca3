-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-02-2022 a las 17:00:47
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `musiteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancion`
--

CREATE TABLE `cancion` (
  `id` bigint(20) NOT NULL,
  `enlace_cancion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `genero_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cancion`
--

INSERT INTO `cancion` (`id`, `enlace_cancion`, `nombre`, `genero_id`) VALUES
(2, 'https://www.youtube.com/watch?v=hTWKbfoikeg', 'Feels Like Spirit', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE `genero` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`id`, `nombre`) VALUES
(1, 'Rock');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `play_list`
--

CREATE TABLE `play_list` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `valoracion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `play_list`
--

INSERT INTO `play_list` (`id`, `nombre`, `valoracion`) VALUES
(3, 'Rock', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `play_list_canciones`
--

CREATE TABLE `play_list_canciones` (
  `play_list_id` bigint(20) NOT NULL,
  `canciones_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cancion`
--
ALTER TABLE `cancion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKg3quqs0xh32l972wnn5mcu9a5` (`genero_id`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `play_list`
--
ALTER TABLE `play_list`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `play_list_canciones`
--
ALTER TABLE `play_list_canciones`
  ADD KEY `FKtir79vtcetnjob7jnxdu6fof3` (`canciones_id`),
  ADD KEY `FKan9y6qngcaq61tvr8rnw354jy` (`play_list_id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cancion`
--
ALTER TABLE `cancion`
  ADD CONSTRAINT `FKg3quqs0xh32l972wnn5mcu9a5` FOREIGN KEY (`genero_id`) REFERENCES `genero` (`id`);

--
-- Filtros para la tabla `play_list_canciones`
--
ALTER TABLE `play_list_canciones`
  ADD CONSTRAINT `FKan9y6qngcaq61tvr8rnw354jy` FOREIGN KEY (`play_list_id`) REFERENCES `play_list` (`id`),
  ADD CONSTRAINT `FKtir79vtcetnjob7jnxdu6fof3` FOREIGN KEY (`canciones_id`) REFERENCES `cancion` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
