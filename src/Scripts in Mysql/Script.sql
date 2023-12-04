CREATE TABLE IF NOT EXISTS STOCK (
    Cproducto int,
    Cantidad int CHECK (Cantidad >= 0), 
    primary key(Cproducto)
);

INSERT IGNORE INTO STOCK(Cproducto,Cantidad) VALUES(0,0);

SELECT * FROM STOCK;
