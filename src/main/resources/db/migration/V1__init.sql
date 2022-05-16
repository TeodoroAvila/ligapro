CREATE TABLE IF NOT EXISTS campeonato(
    id SERIAL,
    name VARCHAR (100) NOT NULL,
    firstname VARCHAR (100) NOT NULL,
    fechanacimiento VARCHAR (100) NOT NULL,
    dorsal INT,
    phone VARCHAR(12) NOT NULL,
    PRIMARY KEY (id)
)
