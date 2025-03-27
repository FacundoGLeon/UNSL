-- ejercicio 9
-- 1. Obtener el detalle completo de todos los exámenes.
SELECT * FROM Examenes;
-- 2. Obtener código y nombre de las materias de primer año.
SELECT MCod,MNbre FROM Materias WHERE MAño=1;
-- 3. Obtener el detalle de los exámenes rendidos por el alumno número 200.
SELECT * from Examenes WHERE NroA=200;
-- 4. Obtener el número de los alumnos que han regularizado la materia con código 10.
SELECT NroA FROM Regulares WHERE MCod=10;
-- 5. Obtener la cantidad de alumnos que han regularizado la materia con código 10.
SELECT count(NroA) FROM Regulares WHERE MCod=10;
-- 6. Obtener la cantidad de alumnos que han rendido la materia con código 10.
SELECT count(DISTINCT NroA) FROM Examenes WHERE MCod=10;
-- 7. Obtener el detalle de las materias de segundo año.
SELECT * FROM Materias WHERE MAño=2;
-- 8. Obtener el nombre y código de las materias de segundo año.
SELECT MNbre, MCod FROM Materias WHERE MAño=2;
-- 9. Obtener la cantidad de materias de segundo año.
SELECT count(MCod) FROM Materias WHERE MAño=2;
-- 10. Obtener el promedio de notas del alumno número 300.
SELECT avg(Nota) FROM Examenes WHERE NroA=300;
-- 11. Obtener la nota mas alta que haya sacado un alumno en un examen.
SELECT max(Nota) FROM Examenes;
-- 12. Obtener la nota mas alta que haya sacado un alumno en la materia con código 20.
SELECT max(Nota) FROM Examenes WHERE MCod=20;
-- 13. Obtener la nota mas baja que haya sacado el alumno número 300.
SELECT min(Nota) FROM Examenes WHERE NroA=300;
-- 14. Obtener los códigos de las materias regularizadas por el alumno
-- número 200 y la fecha de regularización de las mismas.
SELECT MCod, Fecha FROM Regulares WHERE NroA=200;
-- 15. Obtener la cantidad de materias que ha regularizado el alumno número 100.
SELECT count (MCod) FROM Regulares WHERE NroA=100;
-- 16. Obtener el nombre del alumno que sea primero en orden alfabético.
SELECT min (NbreA) FROM Alumnos; 