DROP TABLE IF EXISTS "userki";

CREATE TABLE "userki" (
id bigserial UNIQUE PRIMARY KEY,
name varchar(255) NOT NULL,
age bigint
);