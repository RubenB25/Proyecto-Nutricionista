-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 03:56:34
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
-- Base de datos: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidas`
--

CREATE TABLE `comidas` (
  `id_comida` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `cant_calorias` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comidas`
--

INSERT INTO `comidas` (`id_comida`, `nombre`, `detalle`, `cant_calorias`) VALUES
(55, 'Pollo al Wok', 'Pollo salteado con verduras y salsa de soja', 450),
(56, 'Espaguetis a la Boloñesa', 'Espaguetis con salsa de carne y tomate', 600),
(57, 'Ensalada César', 'Lechuga, pollo, crutones y aderezo César', 350),
(58, 'Salmón a la Parrilla', 'Salmón a la parrilla con limón y hierbas', 400),
(59, 'Pizza Margarita', 'Pizza con tomate, mozzarella y albahaca', 800),
(60, 'Hamburguesa con Queso', 'Hamburguesa con queso, lechuga y tomate', 550),
(61, 'Tacos de Carne', 'Tortillas con carne asada, cebolla y cilantro', 700),
(62, 'Arroz con Pollo', 'Arroz con pollo y verduras', 550),
(63, 'Sopa de Tomate', 'Sopa de tomate con albahaca y queso', 200),
(64, 'Pasta Alfredo', 'Pasta con salsa Alfredo y pollo', 700),
(65, 'Ceviche de Camarón', 'Ceviche de camarón con limón y cilantro', 300),
(66, 'Tortilla Española', 'Tortilla de papas, cebolla y huevo', 400),
(67, 'Pollo a la Parrilla', 'Pechuga de pollo a la parrilla', 250),
(68, 'Filete de Ternera', 'Filete de ternera con salsa de champiñones', 700),
(69, 'Sushi Variado', 'Sushi de diferentes tipos y sabores', 450),
(70, 'Pasta Primavera', 'Pasta con verduras y salsa de crema', 500),
(71, 'Ensalada de Frutas', 'Ensalada de frutas frescas', 150),
(72, 'Costillas de Cerdo', 'Costillas de cerdo con salsa barbacoa', 800),
(73, 'Tacos de Pescado', 'Tortillas con pescado frito y repollo', 600),
(74, 'Lasagna', 'Lasaña con carne, pasta y queso', 750);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas`
--

CREATE TABLE `dietas` (
  `id_dieta` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `inicio_dieta` date NOT NULL,
  `fin_dieta` date NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `peso_inicial` double NOT NULL,
  `peso_final` double NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietas`
--

INSERT INTO `dietas` (`id_dieta`, `id_paciente`, `inicio_dieta`, `fin_dieta`, `nombre`, `peso_inicial`, `peso_final`, `estado`) VALUES
(29, 1, '2023-10-20', '2023-11-16', 'Luna', 60, 0, 1),
(30, 2, '2023-10-21', '2023-10-29', 'Keto', 70, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta_comida`
--

CREATE TABLE `dieta_comida` (
  `id_dieta_comida` int(11) NOT NULL,
  `id_comida` int(11) NOT NULL,
  `id_dieta` int(11) NOT NULL,
  `porcion` int(11) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `id_historial` int(11) NOT NULL,
  `peso_actual` double NOT NULL,
  `fecha_registro` date NOT NULL,
  `cuello` double NOT NULL,
  `busto` double NOT NULL,
  `cintura` double NOT NULL,
  `brazo` double NOT NULL,
  `cadera` double NOT NULL,
  `pierna` double NOT NULL,
  `estatura` double NOT NULL,
  `id_dieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`id_historial`, `peso_actual`, `fecha_registro`, `cuello`, `busto`, `cintura`, `brazo`, `cadera`, `pierna`, `estatura`, `id_dieta`) VALUES
(16, 60, '2023-10-29', 70, 50, 100, 50, 100, 50, 170, 29),
(17, 59.9, '2023-10-29', 70, 50, 100, 50, 100, 50, 170, 29),
(18, 70, '2023-10-29', 70, 50, 100, 50, 100, 50, 150, 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingrediente`
--

CREATE TABLE `ingrediente` (
  `id_ingrediente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `calorias_100gr` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ingrediente`
--

INSERT INTO `ingrediente` (`id_ingrediente`, `nombre`, `calorias_100gr`) VALUES
(32, 'Pollo', 165),
(33, 'Papa', 77),
(34, 'Pimiento', 40),
(35, 'Espaguetis', 158),
(36, 'Salsa de Tomate', 82),
(37, 'Lechuga', 5),
(38, 'Crutones', 122),
(39, 'Salmón', 206),
(40, 'Mozzarella', 300),
(41, 'Hamburguesa', 250),
(42, 'Queso', 402),
(43, 'Tortillas', 218),
(44, 'Arroz', 130),
(45, 'Tomate', 18),
(46, 'Albahaca', 23),
(47, 'Cebolla', 40),
(48, 'Cilantro', 23),
(49, 'Huevo', 155),
(50, 'Ternera', 250),
(51, 'Champiñones', 22),
(52, 'Sushi', 350),
(53, 'Crema', 340),
(54, 'Frutas', 52),
(55, 'Costillas de Cerdo', 315),
(56, 'Pescado', 105);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingrediente_comida`
--

CREATE TABLE `ingrediente_comida` (
  `id_ingrediente_comida` int(11) NOT NULL,
  `id_comida` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `id_paciente` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `edad` int(11) NOT NULL,
  `peso_actual` double NOT NULL,
  `peso_deseado` double NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`id_paciente`, `nombre`, `apellido`, `dni`, `domicilio`, `celular`, `fecha_nacimiento`, `edad`, `peso_actual`, `peso_deseado`, `estado`) VALUES
(1, 'Juan', 'González', '123450789', 'Calle 123', '555-1111', '2000-01-15', 22, 75.5, 70, 1),
(2, 'María', 'López', '98765430', 'Avenida XYZ', '555-2272', '1995-05-20', 28, 68, 65.5, 1),
(3, 'Pedro', 'Martínez', '54320278', 'Calle Principal', '555-3363', '1990-11-10', 32, 80.2, 75, 1),
(4, 'Sofía', 'Hernández', '67503218', 'Calle Secundaria', '555-4844', '1998-09-03', 24, 70.1, 68, 1),
(5, 'Carlos', 'Ramírez', '54320628', 'Avenida Principal', '555-5455', '1997-08-12', 25, 85.3, 80, 1),
(6, 'Luisa', 'Díaz', '12378940', 'Calle Central', '555-6606', '1996-04-05', 27, 63.8, 60, 1),
(7, 'Javier', 'Fernández', '90765421', 'Avenida Norte', '555-7797', '1994-03-01', 29, 78.9, 75, 1),
(8, 'Isabella', 'Pérez', '12305679', 'Calle Sur', '555-8808', '1993-10-28', 30, 72.7, 70, 1),
(9, 'Mateo', 'Sánchez', '54220679', 'Calle Oeste', '555-0999', '1992-12-19', 31, 76.5, 74, 1),
(10, 'Valentina', 'Gómez', '10389456', 'Avenida Este', '555-0000', '1991-06-15', 32, 69.2, 67, 1),
(11, 'Diego', 'Martínez', '98054321', 'Calle Central', '555-1111', '1990-09-23', 32, 81, 77.5, 1),
(12, 'Camila', 'López', '12346789', 'Avenida Principal', '555-2222', '1989-11-30', 33, 74.8, 70.5, 1),
(13, 'Lucas', 'González', '50216789', 'Calle Secundaria', '555-3333', '1988-07-14', 34, 68.7, 65, 1),
(14, 'Martina', 'Hernández', '10379456', 'Avenida Norte', '555-4444', '1987-02-06', 35, 82.3, 79, 1),
(15, 'Alejandro', 'Ramírez', '98754321', 'Calle Sur', '555-5555', '1986-05-11', 36, 75.9, 72, 1),
(16, 'Ana', 'Díaz', '12345670', 'Calle Este', '555-6666', '1985-08-18', 37, 79.6, 75.5, 1),
(17, 'David', 'Fernández', '50316789', 'Avenida Oeste', '555-7777', '1984-12-24', 38, 71.2, 68.5, 1),
(18, 'Valeria', 'Pérez', '12309456', 'Calle Central', '555-8888', '1983-04-03', 39, 87.1, 82, 1),
(19, 'Adrián', 'Sánchez', '98654321', 'Avenida Principal', '555-9999', '1982-01-10', 40, 73.4, 70.5, 1),
(20, 'Renata', 'Gómez', '57306789', 'Calle Norte', '555-0000', '1981-03-29', 41, 76.8, 73, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comidas`
--
ALTER TABLE `comidas`
  ADD PRIMARY KEY (`id_comida`);

--
-- Indices de la tabla `dietas`
--
ALTER TABLE `dietas`
  ADD PRIMARY KEY (`id_dieta`),
  ADD KEY `fk_id_paciente` (`id_paciente`);

--
-- Indices de la tabla `dieta_comida`
--
ALTER TABLE `dieta_comida`
  ADD PRIMARY KEY (`id_dieta_comida`),
  ADD KEY `fk_id_comida` (`id_comida`),
  ADD KEY `fk_id_dieta` (`id_dieta`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`id_historial`),
  ADD KEY `fk_id_comida_historial` (`id_dieta`);

--
-- Indices de la tabla `ingrediente`
--
ALTER TABLE `ingrediente`
  ADD PRIMARY KEY (`id_ingrediente`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `ingrediente_comida`
--
ALTER TABLE `ingrediente_comida`
  ADD PRIMARY KEY (`id_ingrediente_comida`),
  ADD KEY `fk_id_comidas` (`id_comida`),
  ADD KEY `fk_id_ingrediente` (`id_ingrediente`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`id_paciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comidas`
--
ALTER TABLE `comidas`
  MODIFY `id_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT de la tabla `dietas`
--
ALTER TABLE `dietas`
  MODIFY `id_dieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `dieta_comida`
--
ALTER TABLE `dieta_comida`
  MODIFY `id_dieta_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `id_historial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `ingrediente`
--
ALTER TABLE `ingrediente`
  MODIFY `id_ingrediente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT de la tabla `ingrediente_comida`
--
ALTER TABLE `ingrediente_comida`
  MODIFY `id_ingrediente_comida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dietas`
--
ALTER TABLE `dietas`
  ADD CONSTRAINT `fk_id_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id_paciente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `dieta_comida`
--
ALTER TABLE `dieta_comida`
  ADD CONSTRAINT `fk_id_comida_dieta` FOREIGN KEY (`id_comida`) REFERENCES `comidas` (`id_comida`),
  ADD CONSTRAINT `fk_id_dieta` FOREIGN KEY (`id_dieta`) REFERENCES `dietas` (`id_dieta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `fk_id_comida_historial` FOREIGN KEY (`id_dieta`) REFERENCES `dietas` (`id_dieta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ingrediente_comida`
--
ALTER TABLE `ingrediente_comida`
  ADD CONSTRAINT `fk_id_comidas` FOREIGN KEY (`id_comida`) REFERENCES `comidas` (`id_comida`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_id_ingrediente` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingrediente` (`id_ingrediente`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
