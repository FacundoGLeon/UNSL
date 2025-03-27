-- Ejercicio 2

create table Empleados(
Elegajo TEXT not null,
Edni INTEGER not null,
Enombre TEXT not null,
Etel INTEGER not null,
Edireccion TEXT not null,
Eciudad TEXT not null,
Efechanac TEXT not null,-- formato: yyyy/mm/dd
Efechaing TEXT not null,-- formato: yyyy/mm/dd
PRIMARY KEY(Elegajo)
UNIQUE(Edni)
)

CREATE TABLE Areas(
Acod TEXT not null,
Anombre TEXT not null,
PRIMARY KEY(Acod)
UNIQUE(Anombre)
)

CREATE TABLE Productos(
Pcod TEXT not null,
Pnombre TEXT not null,
Pdescripcion TEXT,
Ppeso_max REAL not null,
Ptipo TEXT not null,
Acodproduce TEXT not null,
PRIMARY KEY(Pcod)
FOREIGN KEY(Acodproduce) references Areas(Acod)
)

CREATE TABLE Trabaja(
Elegajo TEXT not null,
Acod TEXT not null,
Taño_asign INTEGER not null,
Tcant_horas INTEGER not null,
PRIMARY KEY(Elegajo,Acod)
FOREIGN KEY(Elegajo) references Empleados(Elegajo)
FOREIGN key(Acod) references Areas(Acod)
)