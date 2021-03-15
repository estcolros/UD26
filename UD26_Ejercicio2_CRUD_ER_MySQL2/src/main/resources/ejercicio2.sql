DROP DATABASE ejercicio2;
CREATE DATABASE ejercicio2;
USE ejercicio2;

CREATE TABLE Cientifico (
  dni varchar(8) NOT NULL,
  nomapels varchar(255) NOT NULL,
  PRIMARY KEY (dni)
);

CREATE TABLE Proyecto (
  id char(4) NOT NULL,
  nombre varchar(255) NOT NULL,
  horas INT NOT NULL,
  PRIMARY KEY (id)
) ;

CREATE TABLE AsignadoA (
  id INT NOT NULL AUTO_INCREMENT,
  cientifico varchar(8) NOT NULL,
  proyecto char(4) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_cientifico FOREIGN KEY (cientifico) REFERENCES cientifico (dni),
  CONSTRAINT FK_proyecto FOREIGN KEY (proyecto) REFERENCES proyecto (id) 
);

INSERT INTO Cientifico (dni,nomapels) values ('47773451','Estefania Colombo');
INSERT INTO Cientifico (dni,nomapels) values ('47776985','Cristina Cano');
INSERT INTO Cientifico (dni,nomapels) values ('47771234','Maria Fontova');


INSERT INTO Proyecto (id,nombre,horas) values ('AAAA','PICA',5000);
INSERT INTO Proyecto (id,nombre,horas) values ('BBBB','CTII',10000);
INSERT INTO Proyecto (id,nombre,horas) values ('CCCC','GSIT',5000);

INSERT INTO AsignadoA (cientifico,proyecto) VALUES ('47773451','AAAA');
INSERT INTO AsignadoA (cientifico,proyecto) VALUES ('47776985','BBBB');
INSERT INTO AsignadoA (cientifico,proyecto) VALUES ('47771234','CCCC');