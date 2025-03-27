-- ejercicio 1
--a)
--1 Obtener un listado donde, para cada materia rendida, figure código y la cantidad de
--alumnos que la han rendido.
select MCod, count(NroARindio)
FROM Examenes
GROUP by MCod
--2 Obtener un listado donde, para cada alumno que haya rendido una materia, figure su
--número, la cantidad de materias rendidas y el promedio de notas.
SELECT NroARindio, count(MCod), avg(Nota)
FROM Examenes
GROUP by NroARindio
--3 Obtener un listado donde, para cada materia, figure: código, la cantidad de alumnos
--que la han rendido y la nota promedio obtenida por los alumnos. En este listado deben
--figurar sólo aquellas materia rendidas por al menos dos alumnos.
SELECT MCod, count(NroARindio),avg(Nota)
FROM Examenes
GROUP by MCod
HAVING count(NroARindio)>=2
--4 Obtener un listado donde para cada alumno figure: el número y nombre del alumno, la
--cantidad de materias rendidas, la menor y la mayor nota obtenida y el promedio de
--notas. El listado debe ordenarse por el nombre del alumno.
SELECT NroA,NbreA,count(MCod),min(Nota),max(Nota),avg(Nota)
FROM Alumnos INNER JOIN Examenes on NroA=NroARindio
GROUP by NroA,NbreA
ORDER by NbreA