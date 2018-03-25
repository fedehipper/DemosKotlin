DROP TABLE persona IF EXISTS;

CREATE TABLE persona (
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20),
    apellido VARCHAR(30),
    edad int
);

INSERT INTO persona
(nombre, apellido, edad) VALUES
('Federico', 'Hipperdinger', 26);