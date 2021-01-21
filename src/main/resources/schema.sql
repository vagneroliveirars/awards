CREATE TABLE MOVIE (
  year YEAR NOT NULL,
  title VARCHAR(255) NOT NULL,
  studios VARCHAR(255) NOT NULL,
  producers VARCHAR(255) NOT NULL,
  winner BOOLEAN NULL
) as select * from CSVREAD('classpath:movielist.csv', null, 'fieldSeparator=;');