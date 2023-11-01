-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:1234
-- Tiempo de generación: 31-10-2023 a las 21:02:36
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `massalud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afiliado`
--

CREATE TABLE `afiliado` (
  `idAfiliado` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `dni` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `afiliado`
--

INSERT INTO `afiliado` (`idAfiliado`, `nombre`, `apellido`, `dni`, `estado`) VALUES
(1, 'Juan', 'Lopez', 54655464, 1),
(2, 'Maria', 'Atim', 34096414, 1),
(3, 'Mario', 'Mamani', 32442371, 1),
(4, 'Pilar', 'Benitez', 39652325, 1),
(5, 'Laura', 'Rios', 31258476, 1),
(6, 'Gladys', 'Juarez', 54236984, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `idEspecialidad` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`idEspecialidad`, `nombre`, `estado`) VALUES
(1, 'Alergias', 1),
(2, 'Radiologia', 1),
(3, 'Diabetologia', 1),
(4, 'Traumatologia', 1),
(5, 'Psicología', 1),
(6, 'Psiquiatria', 1),
(7, 'Neumonia', 1),
(8, 'Pediatria', 1),
(9, 'Gastroenterologia', 1),
(10, 'Geriatría', 1),
(11, 'Oncologia', 1),
(12, 'Hemoterapia', 1),
(13, 'Nefrologia', 1),
(14, 'Cirugía General', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden`
--

CREATE TABLE `orden` (
  `idOrden` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `formaPago` varchar(60) NOT NULL,
  `importe` double NOT NULL,
  `idAfiliado` int(11) NOT NULL,
  `idPrestador` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `orden`
--

INSERT INTO `orden` (`idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`, `estado`) VALUES
(4, '2023-10-29', 'Efectivo', 100, 1, 1, 1),
(5, '2023-11-13', 'Efectivo', 3200, 1, 1, 1),
(6, '2023-11-13', 'Efectivo', 3200, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestador`
--

CREATE TABLE `prestador` (
  `idPrestador` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `dni` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idEspecialidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestador`
--

INSERT INTO `prestador` (`idPrestador`, `nombre`, `apellido`, `dni`, `estado`, `idEspecialidad`) VALUES
(1, 'Anabel', 'Garcia', 36692587, 1, 1),
(2, 'Francisca', 'Guernica', 11546662, 1, 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `afiliado`
--
ALTER TABLE `afiliado`
  ADD PRIMARY KEY (`idAfiliado`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`idEspecialidad`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `orden`
--
ALTER TABLE `orden`
  ADD PRIMARY KEY (`idOrden`),
  ADD KEY `idAfiliado` (`idAfiliado`),
  ADD KEY `idPrestador` (`idPrestador`);

--
-- Indices de la tabla `prestador`
--
ALTER TABLE `prestador`
  ADD PRIMARY KEY (`idPrestador`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `idEspecialidad` (`idEspecialidad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `afiliado`
--
ALTER TABLE `afiliado`
  MODIFY `idAfiliado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `idEspecialidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `orden`
--
ALTER TABLE `orden`
  MODIFY `idOrden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `prestador`
--
ALTER TABLE `prestador`
  MODIFY `idPrestador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `orden`
--
ALTER TABLE `orden`
  ADD CONSTRAINT `Orden_ibfk_1` FOREIGN KEY (`idAfiliado`) REFERENCES `afiliado` (`idAfiliado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Orden_ibfk_2` FOREIGN KEY (`idPrestador`) REFERENCES `prestador` (`idPrestador`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestador`
--
ALTER TABLE `prestador`
  ADD CONSTRAINT `Prestador_ibfk_1` FOREIGN KEY (`idEspecialidad`) REFERENCES `especialidad` (`idEspecialidad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
