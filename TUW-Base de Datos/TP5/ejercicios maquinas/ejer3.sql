select *
from Regulares;
-- 1
-- Obtener nombre y código de las materias regularizadas por el alumno número 200.
-- Ordenar el listado por nombre de materia.
select MNbre, MCod
from Materias, Regulares
where MCod=MCodReg and NroA=200
ORDER by MNbre;

-- 2
-- Obtener nombre y número de los alumnos que hayan regularizado alguna materia cuyo
--nombre sea Base de Datos.
select NbreA,Alumnos.NroA
from Alumnos,Materias,Regulares
where Alumnos.NroA=Regulares.NroA and MCod=MCodReg and MNbre = 'Base de Datos';

-- 3
-- Obtener el código y nombre de las materias rendidas por el alumno número 100.
select Materias.Mcod, MNbre
from Materias, Examenes
where Materias.MCod=Examenes.MCod and NroARindio=100; 

-- 4
-- Obtener nombre y número de los alumnos que hayan regularizado alguna materia cuyo
--nombre contenga la palabra Programación.
select NbreA,Alumnos.NroA
from Alumnos, Materias, Regulares
where Alumnos.NroA=Regulares.NroA and MCod=MCodReg and MNbre Like '%Programaci_n%'

-- 5
-- Obtener nombre y número de los alumnos que hayan rendido alguna materia cuyo nombre
--contenga la palabra Programación y sea de segundo año.
select DISTINCT NbreA,NroA
from Alumnos, Materias, Examenes
where NroA=NroARindio and Materias.MCod=Examenes.MCod and MNbre like '%Programaci_n%' and MAño=2;

-- 6
-- Obtener nombre y número de los alumnos que hayan rendido alguna materia con una nota de 10 puntos
select NbreA,NroA
from Alumnos, Examenes
where NroA=NroARindio and Nota=10;

-- 7
-- Obtener nombre y número de los alumnos que hayan rendido alguna materia con una nota de 10 puntos. 
-- Se necesita saber además el nombre de esas materias y que el resultado esté
--ordenado por número de alumno.
select NbreA,NroA,MNbre
from Alumnos, Materias, Examenes
where NroA=NroARindio and Materias.MCod=Examenes.MCod and Nota=10
order by NroA;

-- 8
-- Obtener nombre y número de los alumnos que hayan regularizado alguna materia de 1° año.
select DISTINCT NbreA,Alumnos.NroA
from Alumnos, Regulares, Materias
where Alumnos.NroA=Regulares.NroA and MCod=MCodReg and MAño=1;

-- 9
-- Obtener la cantidad de exámenes tomados de la materia Programación I.
select count(Examenes.MCod)
from Materias, Examenes
where Materias.MCod=Examenes.MCod and MNbre = 'Programacion I';

-- 10
-- Obtener la cantidad de exámenes aprobados de la materia Programación I.
select count(Examenes.MCod)
from Materias, Examenes
where Materias.MCod=Examenes.MCod and Nota>=6 and MNbre='Programacion I';