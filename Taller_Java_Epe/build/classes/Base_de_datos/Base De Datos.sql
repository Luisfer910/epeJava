drop database registro_atenciones;
CREATE SCHEMA registro_atenciones;
USE registro_atenciones;

CREATE TABLE Pacientes (
    rut_p VARCHAR(12) NOT NULL PRIMARY KEY,
    nombre_p VARCHAR(100) NOT NULL,
    apellidos_p VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

SELECT * FROM Pacientes;

CREATE TABLE Medicos (
    id_m INT AUTO_INCREMENT PRIMARY KEY,
    nombre_m VARCHAR(50) NOT NULL,
    especialidad_m VARCHAR(50) NOT NULL
);

CREATE TABLE Especialidades_Medicas (
    id_e INT AUTO_INCREMENT PRIMARY KEY,
    nombre_e VARCHAR(50) NOT NULL,
    id_m INT,
    FOREIGN KEY (id_m) REFERENCES Medicos (id_m)
);

CREATE TABLE Diagnostico (
    id_d INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255)  -- Aumenté la longitud a 255 caracteres
);

CREATE TABLE Ingresos (
    I_id INT AUTO_INCREMENT PRIMARY KEY,
    rut_p VARCHAR(12),
    id_m INT,
    id_e INT,
    id_d INT,
    FOREIGN KEY (rut_p) REFERENCES Pacientes (rut_p),
    FOREIGN KEY (id_m) REFERENCES Medicos (id_m),
    FOREIGN KEY (id_e) REFERENCES Especialidades_Medicas (id_e),
    FOREIGN KEY (id_d) REFERENCES Diagnostico (id_d)
);

-- Asegúrate de que los registros existan en las tablas referenciadas antes de insertar en Ingresos.
INSERT INTO Pacientes (rut_p, nombre_p, apellidos_p, email) VALUES
    ('18987345-6', 'Paciente1', 'Apellido1', 'paciente1@example.com'),
    ('19009874-3', 'Paciente2', 'Apellido2', 'paciente2@example.com'),
    ('16123987-1', 'Paciente3', 'Apellido3', 'paciente3@example.com'),
    ('7098345-4', 'Paciente4', 'Apellido4', 'paciente4@example.com'),
    ('16678098-9', 'Paciente5', 'Apellido5', 'paciente5@example.com');

INSERT INTO Medicos (nombre_m, especialidad_m) VALUES
    ('Medico1', 'Cardiología'),
    ('Medico2', 'Neurología'),
    ('Medico3', 'Pediatría'),
    ('Medico4', 'Dermatología'),
    ('Medico5', 'Gastroenterología');

INSERT INTO Especialidades_Medicas (nombre_e, id_m) VALUES
    ('Cardiología', 1),
    ('Neurología', 2),
    ('Pediatría', 3),
    ('Dermatología', 4),
    ('Gastroenterología', 5);

INSERT INTO Diagnostico (descripcion) VALUES
    ('Diagnostico1'),
    ('Diagnostico2'),
    ('Diagnostico3'),
    ('Diagnostico4'),
    ('Diagnostico5');

INSERT INTO Ingresos (rut_p, id_m, id_e, id_d) VALUES
   ('18987345-6', 1, 1, 1),
   ('19009874-3', 2, 2, 2),
   ('16123987-1', 3, 3, 3),
   ('7098345-4', 4, 4, 4),
   ('16678098-9', 5, 5, 5);


SELECT * FROM Medicos;

      -- RESPUESTAS BASE DE DATOS--
 -- Consulta para Obtener Información de los Ingresos --
 
SELECT 
    p.nombre_p AS paciente_nombre, 
    p.apellidos_p AS paciente_apellidos,
    m.nombre_m AS medico_nombre, 
    e.nombre_e AS especialidad_nombre, 
    d.descripcion AS diagnostico_descripcion
FROM 
    Ingresos i
JOIN 
    Pacientes p ON i.rut_p = p.rut_p
JOIN 
    Medicos m ON i.id_m = m.id_m
JOIN 
    Especialidades_Medicas e ON i.id_e = e.id_e
JOIN 
    Diagnostico d ON i.id_d = d.id_d;

-- Consulta para Obtener Ingresos de un Paciente Específico --

SELECT 
    p.nombre_p AS paciente_nombre, 
    p.apellidos_p AS paciente_apellidos,
    m.nombre_m AS medico_nombre, 
    e.nombre_e AS especialidad_nombre, 
    d.descripcion AS diagnostico_descripcion
FROM 
    Ingresos i
JOIN 
    Pacientes p ON i.rut_p = p.rut_p
JOIN 
    Medicos m ON i.id_m = m.id_m
JOIN 
    Especialidades_Medicas e ON i.id_e = e.id_e
JOIN 
    Diagnostico d ON i.id_d = d.id_d
WHERE 
    p.rut_p = '18987345-6';



-- Consulta para Obtener los Ingresos por Especialidad Médica -- 
SELECT 
    e.nombre_e AS especialidad_nombre, 
    COUNT(i.id_e) AS cantidad_ingresos
FROM 
    Especialidades_Medicas e
LEFT JOIN 
    Ingresos i ON e.id_e = i.id_e
GROUP BY 
    e.nombre_e;