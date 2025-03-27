-- <>

--Obtenga la lista de empleados que trabajan en más de 3 áreas distintas.
SELECT Elegajo as 'Empleados en mas de 3 Areas'
FROM Trabaja
GROUP by Elegajo 
HAVING count(Acod)>3;

--Listar los productos cuyo peso máximo esté entre 1 y 5 kg, ordenados por peso de manera ascendente.
select Pnombre,Ppeso_max
FROM Productos
where Ppeso_max BETWEEN 1 and 5
order by Ppeso_max asc;

--Obtenga el número total de empleados por cada área.
select Acod as 'Codigo del Area',count(Elegajo) as 'Cantidad de Empleados'
from Trabaja
group by Acod;

--Listar el nombre y DNI de los empleados que hayan ingresado a la empresa después del año 2010.
SELECT Enombre,Edni
FROM Empleados
WHERE Efechaing >= '2011/1/1'; 

--Listar los productos del tipo "LEGUMBRES" y el área que los producen, ordenados por nombre de producto.
SELECT Pcod,Pnombre,Anombre as 'Area que lo Produce'
FROM Productos INNER JOIN Areas on Acod=Acodproduce
where Ptipo = 'LEGUMBRES';

--Obtenga el detalle de empleados que trabajan más de 6 horas en al menos un área,
-- ordenados por horas asignadas.
SELECT DISTINCT Empleados.Elegajo,Enombre,Edni,Efechanac
FROM Empleados INNER JOIN Trabaja on Empleados.Elegajo=Trabaja.Elegajo
WHERE Tcant_horas>3
order by Tcant_horas;

--Listar los productos de tipo "LACTEOS" cuyo peso máximo sea mayor a 3 kg.
select Pcod,Pnombre
from Productos
where Ptipo='LACTEOS' and Ppeso_max>3

--Mostrar las áreas que producen productos de más de un tipo.
select Acod,Anombre
from Areas inner join Productos on Acod=Acodproduce
group by Acod,Anombre
having count(DISTINCT Ptipo)>1;

--Obtenga el nombre de los empleados cuyo apellido sea “GOMEZ” 
-- y trabajen en áreas con más de 5 productos fabricados
select DISTINCT Enombre
from Empleados 
inner join Trabaja on Empleados.Elegajo=Trabaja.Elegajo 
inner join Productos on Acod=Acodproduce
where Enombre like 'GOMEZ%'
group by Empleados.Elegajo,Enombre,Acodproduce
having count(Pcod)>1

--Dar la cantidad total de horas asignadas por cada empleado en todas las áreas donde trabaja.
SELECT Elegajo, sum(Tcant_horas)
FROM Trabaja 
group by Elegajo;

--Mostrar los nombres de los productos y las áreas que los producen, cuyo tipo de producto sea "CARNES".
select Pnombre,Anombre
FROM Productos inner join Areas on Acod=Acodproduce
where Ptipo='CARNES';

--Obtenga un listado de empleados que nacieron antes del 1 de enero de 1990 y que trabajan actualmente en más de un área.
select Empleados.Elegajo,Enombre
from Empleados inner join Trabaja on Trabaja.Elegajo=Empleados.Elegajo
WHERE '1990/1/1'>Efechanac
group by Empleados.Elegajo
HAVING count(Acod);

--Listar los productos cuyo peso máximo sea inferior a 2 kg, junto con el código del área que los producen.
SELECT Pcod,Pnombre,Acodproduce
FROM Productos
where 2>Ppeso_max

--Mostrar el promedio de horas asignadas por área para todos los empleados.
select Empleados.Elegajo,Enombre,avg(Tcant_horas)
FROM Trabaja,Empleados
where Empleados.Elegajo=Trabaja.Elegajo
group by Empleados.Elegajo,Enombre;


--Obtener la cantidad de productos fabricados por cada área, junto con el nombre de esa área.
select Anombre,count(Pcod) as 'cant. prod. fabricados'
from areas inner join productos on Acod=Acodproduce 
group by Anombre,Acod;

--Mostrar los nombres y legados de los empleados que hayan trabajado en al menos 3 áreas diferentes
-- desde el año 2015.
select Empleados.Elegajo,Enombre
from Empleados inner join Trabaja on Empleados.Elegajo=Trabaja.Elegajo
WHERE taño_asign >= 2015
group by Empleados.Elegajo,Enombre
HAVING count(Acod)>=3

--<>
--Listar todos los productos, ordenados por el tipo de producto y luego por el nombre del producto.
select Pcod,Pnombre,Ptipo
from Productos
order by Ptipo,Pnombre

--Obtenga el nombre y peso máximo de los productos que pertenecen a áreas que producen solo un tipo de producto.
select Pcod,Pnombre,Ppeso_max
from Productos 
where Acodproduce IN (select Acodproduce
       from Productos 
       group by Acodproduce 
       HAVING count(DISTINCT Ptipo)=1);

--Mostrar los nombres de empleados cuya dirección contiene la palabra "SAN LUIS" y que trabajan en más de 4 áreas.
select Enombre
from Empleados inner join Trabaja on Empleados.Elegajo=Trabaja.Elegajo
where Edireccion like '%SAN LUIS%'
group by Empleados.Elegajo,Enombre
having count(Acod)>4
