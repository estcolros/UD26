DROP DATABASE ejercicio4;
CREATE DATABASE ejercicio4;
USE ejercicio4;

CREATE TABLE Facultad (
  id INT NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Equipos (
  numserie char(4) NOT NULL,
  nombre varchar(100) NOT NULL,
  facultad INT NOT NULL,
  PRIMARY KEY (numserie),
  CONSTRAINT FK_facultad FOREIGN KEY (facultad) REFERENCES facultad (id) 
);


CREATE TABLE Investigadores (
  dni varchar(8) NOT NULL,
  nomapels varchar(100) NOT NULL,
  facultad INT NOT NULL,
  PRIMARY KEY (dni),
  CONSTRAINT FK_facultad1 FOREIGN KEY (facultad) REFERENCES facultad (id) 
);

CREATE TABLE Reserva (
  id INT NOT NULL AUTO_INCREMENT,
  dni varchar(8) NOT NULL,
  numserie char(4) NOT NULL,
  comienzo DATETIME NOT NULL,
  fin DATETIME NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_investigadores FOREIGN KEY (dni) REFERENCES investigadores (dni),
  CONSTRAINT FK_equipo FOREIGN KEY (numserie) REFERENCES equipos (numserie) 
);

INSERT INTO Facultad (nombre) values ('URV');
INSERT INTO Facultad (nombre) values ('UPF');
INSERT INTO Facultad (nombre) values ('UIC');

INSERT INTO Equipos (numserie,nombre,facultad) values ('AAAA','Equipo A',1);
INSERT INTO Equipos (numserie,nombre,facultad) values ('BBBB','Equipo B',2);
INSERT INTO Equipos (numserie,nombre,facultad) values ('CCCC','Equipo C',3);

INSERT INTO Investigadores (dni,nomapels,facultad) VALUES ('47773453','Estefania Colombo',1);
INSERT INTO Investigadores (dni,nomapels,facultad) VALUES ('47773456','Cristina Cano',2);
INSERT INTO Investigadores (dni,nomapels,facultad) VALUES ('47773441','Marta Saladie',3);

INSERT INTO Reserva (dni,numserie,comienzo,fin) VALUES ('47773453','AAAA','2020-09-12','2021-01-16');
INSERT INTO Reserva (dni,numserie,comienzo,fin) VALUES ('47773456','BBBB','2020-09-12','2021-01-16');
INSERT INTO Reserva (dni,numserie,comienzo,fin) VALUES ('47773441','CCCC','2020-09-12','2021-02-11');