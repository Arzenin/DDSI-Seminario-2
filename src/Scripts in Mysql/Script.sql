CREATE TABLE IF NOT EXISTS STOCK (
    Cproducto int,
    Cantidad int CHECK (Cantidad >= 0), 
    primary key(Cproducto)
);

INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(1,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(2,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(3,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(4,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(5,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(6,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(7,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(8,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(9,5);
INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(10,5);

SELECT * FROM STOCK;
