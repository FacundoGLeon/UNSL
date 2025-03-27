-- Ejercicio 6
ALTER table Materias add MAño INTEGER;
UPDATE Materias SET MAño=1 WHERE MCod=10 or MCod=20;
UPDATE Materias SET MAño=2 WHERE MCod=30 or MCod=40 or MCod=50 or MCod=60;

--ALTER TABLE Materias alter column MAño SET NOT NULL;
--(modifica la tabla materias, la columna MAño y la setea no null)