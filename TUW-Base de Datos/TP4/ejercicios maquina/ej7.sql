-- ejercicio 7 a
create table Examenes(
MCod integer not null,
NroA integer not null,
Fecha text not null,
Nota REAL not null,
primary key (MCod,NroA,Fecha)
foreign key (MCod) REFERENCES Materias(MCod)
foreign key (NroA) references Alumnos(NroA)
);

-- ejercicio 7 b
insert into Examenes values(40,500,'25/11/2023',9);
insert into Examenes values(10,200,'14/5/2023',8);
insert into Examenes values(20,100,'25/11/2022',8.5);
insert into Examenes values(50,500,'18/5/2022',9);
insert into Examenes values(40,300,'25/11/2023',7);
insert into Examenes values(10,300,'25/11/2023',8);