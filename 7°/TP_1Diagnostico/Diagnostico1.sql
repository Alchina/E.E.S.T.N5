CREATE TABLE listaDeComidas (
    numero INT AUTO_INCREMENT PRIMARY KEY,
    plato VARCHAR(25),
    precioPorcion FLOAT
);

INSERT INTO listaDeComidas (plato, precioPorcion) VALUES
('Empanadas de Carne', 1500.00),
('Ensalada Criolla', 2200.00),
('Provoleta', 2800.00),
('Milanesa Napolitana', 8500.00),
('Asado de Tira', 12000.00),
('Chimichurri', 600.00),
('Pizza Fugazzeta', 6500.00),
('Ñoquis de Papa', 9800.00),
('Pollo al Disco', 9300.00),
('Locro', 5000.00),
('Fideos con Tuco', 4600.00),
('Flan con Dulce de Leche', 2500.008)

SELECT * FROM listaDeComidas WHERE numero = 5;
SELECT * FROM listaDeComidas WHERE plato LIKE 'M%';
SELECT * FROM listaDeComidas WHERE precioPorcion > 15000;
SELECT * FROM listaDeComidas WHERE precioPorcion < 9000;