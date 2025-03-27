-- Ejercicio 3
INSERT INTO EMPLEADOS(Elegajo, Edni, Enombre, Etel, Edireccion, Eciudad, Efechanac, Efechaing)
VALUES ('EPA315', 25789546, 'ROSSI ABEL', '266415789', 'BELGRANO 125','SAN LUIS', '1995/12/12','2014/02/01'),
		('DRT456', 25471254, 'PREZ MATIAS', '265715698', 'RIVADAVIA 314','V MERCEDES', '2000/03/01','2018/03/24'),            
		('QWE123', 28547125, 'PEREZ ARIEL', '266415874', 'MAIPU 425','SAN LUIS', '2000/01/28','2018/02/01'),	
		('ASD423', 28963852, 'SOSA CARINA', '265715741', 'DON BOSCO 585','V MERCEDES', '1985/05/14','2008/05/14'),
		('ZXC753', 21457896, 'BAZAN ANA', '266415963', 'MITRE 214','SAN LUIS', '1981/06/08','2006/05/03'),
		('POI951', 22547856, 'GOMEZ ELISA', '265715632', 'RIVADAVIA 895','V MERCEDES', '1990/08/05','2009/12/04'),
		('JKL357', 23547125, 'GOMEZ JUAN', '266415963', 'PRINGLES 854','SAN LUIS', '1996/09/30','2016/09/18'),
		('BNM741', 23963852, 'PERALTA PEDRO', '265715214', 'COLON 452','V MERCEDES', '1989/10/15','2014/10/06'),
		('WER852', 24125865, 'RUIZ CELESTE', '266415963', 'RIVADAVIA 1025','SAN LUIS', '1987/03/27','2009/12/08'),
		('SDF963', 25125125, 'AGUERO TOMAS', '266415841', 'AYACUCHO 584','SAN LUIS', '1999/01/02','2018/03/05'),
		('XCV357', 24789456, 'LUCERO LAURA', '265715478', 'LAS ERAS 145','V MERCEDES', '1992/06/25','2011/10/25'),
		('OIU125', 26987412, 'LUNA GABRIEL', '265715231', 'ROCA 475','V MERCEDES', '1982/07/20','2000/09/25'),
		('LKJ325', 26852963, 'SANCHEZ ANA', '266415478', 'SUCRE 65','SAN LUIS', '1998/11/08','2017/11/21'),
		('BVC789', 27458452, 'BENITEZ SIMON', '266415241', 'CENTENARIO 58','SAN LUIS', '1993/12/25','2013/08/05'),
		('TGB124', 27325658, 'MANSILLA DELIA', '266415852', 'RIVADAVIA 452','SAN LUIS', '1987/02/24','2018/01/25'),
		('YHN541', 30874265, 'SOSA JUAN', '266415321', 'FALUCHO 584','SAN LUIS', '1994/06/12','2017/09/25'),
		('IKM985', 33985654, 'SANCHEZ JOSE', '265715874', 'MAIPU 852','V MERCEDES', '1998/12/24','2018/03/27');


            
﻿INSERT INTO AREAS(Acod, Anombre)
    VALUES ('AAA789', 'INGRESO'),
	   ('AAA123', 'INGRESO MEDIO'),
           ('AAA852', 'EXPERIENCIA'),
           ('AAA147', 'NIVEL MEDIO'),
           ('AAA985', 'NIVEL COMPLETO'),
           ('AAA357', 'EXPERTO');

﻿INSERT INTO PRODUCTOS(Pcod, Pnombre, Ppeso_max, Ptipo, Acodproduce)
    VALUES ('CAR789', 'POLLO ENVASADO', 4.5, 'CARNES', 'AAA789'),
           ('CAR456', 'COSTELETA ENVASADA', 2, 'CARNES', 'AAA123'),
           ('CAR123', 'PULPA ENVASADA', 1, 'CARNES', 'AAA852'),
           ('CAR147', 'LOMO', 1.5, 'CARNES', 'AAA789'),
           ('CAR258', 'CHIVO', 10, 'CARNES', 'AAA123'),           
           ('CAR369', 'CORDERO', 15, 'CARNES', 'AAA852'),           
           ('CAR321', 'MUSLO DE POLLO', 3, 'CARNES', 'AAA789'),           
           ('CAR654', 'CESOS DE VACA', 0.5, 'CARNES', 'AAA123'),           
           ('CAR987', 'LENGUA DE VACA', 2, 'CARNES', 'AAA852'),           
           ('CAR741', 'CONEJO', 3, 'CARNES', 'AAA852'),           
           ('LEG582', 'LENTEJAS', 5, 'LEGUMBRES', 'AAA147'),           
           ('LEG571', 'LENTEJAS ROJAS', 3, 'LEGUMBRES', 'AAA985'),
           ('LEG593', 'GARBANZO', 4, 'LEGUMBRES', 'AAA357'),
           ('LEG471', 'ALUBIA', 8, 'LEGUMBRES', 'AAA147'),           
           ('LEG482', 'HUMUS',6, 'LEGUMBRES', 'AAA147'),           
           ('LEG493', 'GUISANTES', 3, 'LEGUMBRES', 'AAA985'),           
           ('LEG671', 'SOJA', 2, 'LEGUMBRES', 'AAA852'),
           ('LAC123', 'QUESO CUARTIROLO', 5, 'LACTEOS', 'AAA789'),
           ('LAC547', 'QUESO FETA', 2, 'LACTEOS', 'AAA123'),
           ('LAC654', 'YOGUR', 2, 'LACTEOS', 'AAA852'),           
           ('LAC147', 'HELADO', 5, 'LACTEOS', 'AAA852'),           
           ('LAC741', 'QUESO MUZZARELLA', 10, 'LACTEOS', 'AAA147'),           
           ('LAC258', 'QUESO PARMESANO', 9, 'LACTEOS', 'AAA985'),           
           ('LAC874', 'RICOTTA', 3, 'LACTEOS', 'AAA357'),           
           ('LAC894', 'REQUESON', 6, 'LACTEOS', 'AAA147'); 



INSERT INTO TRABAJA(Elegajo, Acod, Taño_asign, Tcant_horas)
    VALUES ('EPA315', 'AAA789', 2000, 2),
           ('EPA315', 'AAA123', 2002, 2),
           ('EPA315', 'AAA852', 2000, 2),           
           ('EPA315', 'AAA147', 2005, 2),           
           ('DRT456', 'AAA985', 2001, 4),           
           ('DRT456', 'AAA357', 2006, 3),           
			('QWE123', 'AAA985', 2010, 5),	   
			('QWE123', 'AAA789', 2010, 2),	     
			('QWE123', 'AAA123', 2014, 1),	   
			('ASD423', 'AAA852', 2004, 8),	   
			('ZXC753', 'AAA147', 2005, 4),	   
			('ZXC753', 'AAA985', 2007, 4),	   
			('POI951', 'AAA789', 2004, 8),	   
			('JKL357', 'AAA123', 2002, 6),	   
			('BNM741', 'AAA852', 2006, 5),	   
			('WER852', 'AAA147', 2001, 4),	   
			('SDF963', 'AAA985', 2009, 3),	   
			('XCV357', 'AAA357', 2013, 5),	   
			('OIU125', 'AAA985', 2016, 8),	   
			('LKJ325', 'AAA357', 2014, 8),	   
			('BVC789', 'AAA852', 2008, 8),	   
			('TGB124', 'AAA147', 2003, 3),	   
			('YHN541', 'AAA985', 2004, 3),	   
			('IKM985', 'AAA357', 2014, 6);    