/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Admin
 * Created: Oct 31, 2024
 */
CREATE TABLE student (
   id   INT              NOT NULL,
   name VARCHAR (32)     NOT NULL,
   address  VARCHAR (32) NOT NULL,
   PRIMARY KEY (id)
);
INSERT INTO student(id, name, address) VALUES (1, "Công", "Hanoi");
INSERT INTO student(id, name, address) VALUES (2, "Dung", "Vinhphuc");
INSERT INTO student(id, name, address) VALUES (3, "Ngôn", "Danang");
INSERT INTO student(id, name, address) VALUES (4, "Hạnh", "Hanoi")
