CREATE TABLE shop
(
    id   INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE user
(
    id      INTEGER AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    age     INTEGER,
    shop_id INTEGER
);
