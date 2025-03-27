drop table if EXISTS Alumnos;
create table Alumnos(
NroA integer not null,
NbreA text not NULL, 
DirA text not NULL,
PRIMARY KEY(NroA)
);
drop table if EXISTS Materias;
create table Materias(
MCod integer not null,
MNbre text not null,
MCHS integer not NULL,
MCuat text not NULL,
primary key(MCod)
);
drop table if EXISTS Regulares;
create table Regulares(
MCod integer not null,
NroA integer not null,
Fecha TEXT not null,
primary key(MCod,NroA)
foreign key (MCod) references Materias(MCod)
foreign key (NroA) references Alumnos(NroA)
);
--ejercicio 5 a
insert into Alumnos VALUES(100,'María Celi','Sucre 100');
insert into Alumnos VALUES(200,'Juan Páez','España 200');
insert into Alumnos VALUES(300,'Ana Mica','Junin 123');
insert into Alumnos VALUES(400,'Juana Nohe','Caseros 345');

insert into Materias VALUES(10,'Base de Datos',5,'2');
insert into Materias VALUES(20,'Programacion I',6,'1');
insert into Materias VALUES(30,'Logica',2,'A');
insert into Materias VALUES(40,'Programacion II',4,'2');
insert into Materias VALUES(50,'Algebra',6,'1');

INSERT into Regulares VALUES(10,100,'10/7/2021');
INSERT into Regulares VALUES(20,100,'30/11/2022');
INSERT into Regulares VALUES(10,300,'10/7/2021');
-- ejercicio 5 b: no se puede hacer insert de esas
-- nuplas debido a que el numero del alumno 60 no esta en 
--la base de datos, y la combinacion de 10 300 ya se 
--encuentra cargada en la base de datos 
--entonces no cumpliria con la clave compuesta 

-- ejercicio 5 c: la primer nupla y la tercera de alumnos 
-- no se podria eliminar debido a que ya son usadas de referencias
-- en la relacion regulares debido a la FK 
-- en cambio las nuplas segunda y cuarta si se pueden 
-- eliminar ya que no esta siendo usadas de referencia 
-- por la relacion regulares

-- ejercicios 5 d: 
insert into Alumnos VALUES(500,'Facundo Leon','Mosconi 456');
insert into Materias VALUES(60,'Calculo II',7,'1');
insert into Regulares VALUES(30,500,'20/5/2024');