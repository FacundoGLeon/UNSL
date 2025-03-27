select * from Examenes;
select * from Alumnos;
select * from Materias;
select * from Regulares;

update Regulares set Fecha='17/9/2024' where MCod=35 and NroA=300;

insert into Alumnos values (600, 'Juan Pérez', 'Av. Siempre Viva 123'),
(700, 'Ana Gómez', 'Calle Falsa 456'),
(800, 'Luis Fernández', 'Boulevard Central 789');

insert into Materias values (05, 'Matemáticas', 6, '1',1),
(25, 'Física', 8, '1',1),
(35, 'Química', 5, '1',1);

insert into Regulares values (25, 100, '2024/09/15'),
(10, 200, '2024/09/16'),
(35, 300, '2024/09/17');

insert into Examenes values (40, 100, '2024/09/20', 8.5),
(05, 200, '2024/09/21', 4.0),
(40, 300, '2024/09/22', 9.0);

select * from Alumnos where NroA>200;
select NbreA, DirA from Alumnos where DirA like '%calle%'
select * from Alumnos where length(NbreA>10);

select * from Materias where MCuat=2;
select MNbre from Materias where MCHS>6;
select * from Materias where MNbre like 'p%';

select * from Regulares where Fecha Like '%2024%';
select MCod from Regulares where NroA=100;
select * from Regulares where MCod=10;

select * from Examenes where Nota>=8;
select Fecha from Examenes where NroA=100;

select * from examenes;
select MCod, MNbre from Materias where MAño=1;
select * from examenes where NroA=200;
select NroA from Regulares where MCod=10;
select count(NroA) from Regulares where MCod=10;
select count(NroA) from Examenes where MCod=10;
select * from Materias where MAño=2;
select MNbre, MCod from Materias where MAño=2;
select count(MCod) from Materias where MAño=2;
select avg(Nota) from Examenes where NroA=300;
select max(Nota) from Examenes;
select max(Nota) from Examenes where MCod=20;
select min(Nota) from Examenes where NroA=300;
select MCod, Fecha from Regulares where NroA=200;
select count(MCod) from Regulares where NroA=100;
select min(NbreA) from Alumnos;