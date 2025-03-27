-- ejercicio 8
-- 1
SELECT * FROM Alumnos;
-- 2
SELECT * FROM Materias WHERE MCod<=30;
-- 3
SELECT NbreA, DirA FROM Alumnos WHERE NroA=300 or NroA=400;
-- 4
SELECT NbreA, DirA FROM Alumnos WHERE NroA<>300;
-- 5
SELECT NbeA, DirA FROM Alumnos WHERE NroA=300 and NroA=400;
-- no se puede ya que no hay alumnos con el numero 300 y 400 a la ves

-- 6
SELECT count(Mcod) AS 'Cantidad de Materia' FROM Materias;
-- 7
SELECT sum (MCod) FROM Materias;
-- 8
SELECT max (Nota) FROM Examenes;
-- 9
SELECT count (DISTINCT MCHS) FROM Materias;