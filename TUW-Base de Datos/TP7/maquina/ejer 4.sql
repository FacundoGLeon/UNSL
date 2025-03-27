-- Ejercicio 4

--1. Obtener un listado con la información completa de todos los productos que produce la empresa.
select *
from Productos;

--2. Obtener un listado con nombre dirección y teléfono de todos los empleados ordenados
--alfabéticamente por nombre.
select Enombre,Edireccion,Etel
from Empleados
order by Enombre;

--3. Obtener un listado con legajo, nombre y dirección de todos los empleados que nacieron entre
--'11/06/1882' y '11/11/1992' en orden descendente según su antigüedad en la empresa.
select Elegajo,Enombre,Edireccion
from Empleados
where Efechanac BETWEEN '1882/06/11' and '1992/11/11'
order by Efechaing; 

--4. Listar el nombre, tipo y peso máximo de todos los productos junto con el código del área que los produce.
select Pnombre,Ptipo,Ppeso_max,Acodproduce
from Productos;

--5. Listar el nombre, tipo y peso máximo de todos los productos junto con el nombre y código
--del área que los produce.
select Pnombre,Ptipo,Ppeso_max,Anombre,Acod
from Productos INNER JOIN Areas on Acod = Acodproduce;

--6. Obtener código y nombre de todos los productos de tipo “LACTEOS”, junto al código y
--nombre del área a la cual pertenecen. El listado debe mostrarse ordenado alfabéticamente por
--nombre del producto.
select Pcod,Pnombre,Acod,Anombre
from Productos INNER JOIN Areas on Acod = Acodproduce
where Ptipo='LACTEOS'
order by Pnombre;

--7. Obtener el nombre y código de las áreas que producen productos de tipo “CARNES”.
select Acod,Anombre
from Areas INNER JOIN Productos on Acod=Acodproduce
where Ptipo='CARNES';

--8. Dar el nombre, legajo y dirección completa de los empleados cuya dirección contenga la
--palabra “RIVADAVIA”.
select Enombre,Elegajo,Edireccion
from Empleados
where Edireccion like '%RIVADAVIA%';

--9. Dar el código y nombre de los productos que sea de tipo “LEGUMBRES” o “LACTEOS” y
--cuyo peso máximo sea inferior a 2,5 kg.
select Pcod,Pnombre
from Productos
where (Ptipo='LEGUMBRES' or Ptipo='LACTEOS') and Ppeso_max < 2.5;

--10. Obtener el legajo y nombre de todos los empleados cuyo nombre empiece con la letra “S” y
--hayan ingresado a la empresa antes del 15/10/2015.
select Elegajo,Enombre
from Empleados
where Enombre like 'S%' and Efechaing < '2015/10/15';

--11. Obtener un detalle completo de todos los empleados, en el que se muestre: nombre, legajo y
--ciudad, áreas en las que trabaja junto a la fecha de asignación y cantidad de horas asignadas
--en cada área. El listado deberá estar ordenado por la cantidad de horas asignadas.
select Enombre,Empleados.Elegajo,Eciudad,Acod,Taño_asign,Tcant_horas
from Empleados INNER JOIN Trabaja on Empleados.Elegajo=Trabaja.Elegajo
order by Tcant_horas;

--12. Obtener el nombre de los productos que tengan un peso máximo entre 2 y 7 kilos o que sean
--de tipo “CARNES”.
select Pnombre
from Productos 
where (Ppeso_max BETWEEN 2 and 7) or Ptipo='CARNES';

--13. Dar la cantidad total de productos que son fabricados en la empresa.
select count(Pcod) --as 'cantidad total productos'
from Productos;

--14. Dar la cantidad de empleados que fabrican alimentos de tipo “LEGUMBRES”.
select count(DISTINCT Elegajo) 
from Trabaja INNER JOIN Productos on Acod = Acodproduce
where Ptipo='LEGUMBRES';

--15. Para cada tipo de producto, mostrar la cantidad de productos de ese tipo que son elaborados
--en la empresa.
select Ptipo, count(Pcod) -- AS cantidad
from Productos
group by Ptipo;

--16. Listar nombre, DNI y teléfono de los empleados junto al nombre del área en las que tienen
--asignadas más de 4 horas de trabajo diarias.
select Enombre,Edni,Etel,Anombre
from Empleados INNER JOIN Trabaja on Empleados.Elegajo=Trabaja.Elegajo
INNER JOIN Areas on Areas.Acod=Trabaja.Acod
where Tcant_horas > 4

--17. Mostrar el legajo y nombre de los empleados que trabajan en más de 2 áreas.
select Empleados.Elegajo,Enombre
from Empleados INNER JOIN Trabaja on Empleados.Elegajo = Trabaja.Elegajo
group by Empleados.Elegajo,Enombre
having count(Acod)>2

--18. Para cada área, mostrar su código junto con la cantidad de productos que produce.
select Acodproduce,count(Pcod)
from Productos 
group by Acodproduce

--19. Para cada área, mostrar su nombre junto con la cantidad de productos que produce. El
--listado debe mostrarse ordenado alfabéticamente por nombre de área.
select Anombre, count(Pcod)
from Areas INNER JOIN Productos on Acod=Acodproduce
group by Anombre
order by Anombre

--20. Para cada área, mostrar su nombre junto con la cantidad de productos que produce y peso
--promedio de los productos producidos. El listado debe ordenarse por cantidad de productos producidos.
select Anombre, count(Pcod), avg(Ppeso_max)
from Areas INNER JOIN Productos on Acod=Acodproduce
group by Anombre
order by count(Pcod)
