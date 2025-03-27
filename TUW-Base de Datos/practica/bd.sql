create table Autores(
IdA integer not null,
NombreA text not null,
NacionalidadA text not null,
primary key (IdA)
);
create table Libros(
IdL integer not null,
TituloL text not null,
AñoL integer not null,
IdA integer not null,
primary key (IdL)
foreign key (IdA) references Autores (IdA)
);

insert into Autores values(1,'Gabriel García Márquez','Colombia');
insert into Autores values(2,'Isabel Allende','Chile');
insert into Autores values(3,'Julio Cortázar','Argentina');

insert into Libros values(1,'Cien Años de Soledad',1967,1);
insert into Libros values(2,'El Amor en los Tiempos del Cólera',1985,1);
insert into Libros values(3,'La Casa de los Espíritus',1982,2);
insert into Libros values(4,'Paula',1994,2);
insert into Libros values(5,'Rayuela',1963,3);

-- <>
select * from Libros where AñoL > 1980;

select DISTINCT  A.NombreA from Autores A JOIN Libros L ON  A.IdA = L.IdA; 
alter table Autores drop CorreoA;
select DISTINCT IdA,count(IdL) from Libros;
delete from Libros where AñoL<1990;
select * from Libros;
update Libros set TituloL='PAULA' where IdL=4;

alter table Autores add CorreoA text;

SELECT A.NombreA, COUNT(L.IdL) AS cantidad_libros
FROM Autores as A 
JOIN Libros as L ON A.IdA = L.IdA
GROUP BY A.NombreA;

select A.NombreA, count(L.IdL) as cant
from Autores A 
Join Libros L On A.IdA = L.IdA
GROUP by A.NombreA
order by cant desc
LIMIT 1;

ALTER TABLE Autores ADD correo_electronico TEXT UNIQUE;
SELECT * from libros;
select NombreA
from Autores
where IdA In (select IdA from Libros where AñoL < 2000 );
