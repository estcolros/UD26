DROP DATABASE ejercicio3;
CREATE DATABASE ejercicio3;
USE ejercicio3;

CREATE TABLE Cajeros (
  id INT NOT NULL AUTO_INCREMENT,
  nomapels varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Productos (
  id INT NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  precio INT NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Maquinas (
  id INT NOT NULL AUTO_INCREMENT,
  piso INT NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;


CREATE TABLE Ventas (
  id INT NOT NULL AUTO_INCREMENT,
  cajero INT NOT NULL,
  maquina INT NOT NULL,
  producto INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_cajero FOREIGN KEY (cajero) REFERENCES cajero (id),
  CONSTRAINT FK_maquina FOREIGN KEY (maquina) REFERENCES maquina (id),
  CONSTRAINT FK_producto FOREIGN KEY (producto) REFERENCES producto (id) 
);


INSERT INTO Cajeros (nomapels) values ('Estefania Colombo');
INSERT INTO Cajeros (nomapels) values ('Arnau Edofolch');
INSERT INTO Cajeros (nomapels) values ('David Bolivar');

INSERT INTO Productos (nombre,precio) values ('Monitor',299);
INSERT INTO Productos (nombre,precio) values ('Altavoz',89);
INSERT INTO Productos (nombre,precio) values ('Camara',499);

INSERT INTO Maquinas (piso) VALUES (1);
INSERT INTO Maquinas (piso) VALUES (2);
INSERT INTO Maquinas (piso) VALUES (3);

INSERT INTO Ventas (cajero,maquina,producto) VALUES (1,2,3);
INSERT INTO Ventas (cajero,maquina,producto) VALUES (2,1,2);
INSERT INTO Ventas (cajero,maquina,producto) VALUES (3,3,1);


