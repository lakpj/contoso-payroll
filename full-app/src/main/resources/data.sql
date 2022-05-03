INSERT INTO manager (id, name, password, roles) VALUES (1, 'Bill', 'Clinton', 'ROLE_MANAGER');
INSERT INTO manager (id, name, password, roles) VALUES (2, 'Scott', 'Morrison', 'ROLE_MANAGER');

INSERT INTO employee (id, firstName, lastName, description, managerId) VALUES (1, 'James', 'Broad', 'London', 1);
INSERT INTO employee (id, firstName, lastName, description, managerId) VALUES (2, 'Stuart', 'Anderson', 'Amsterdam', 1);
INSERT INTO employee (id, firstName, lastName, description, managerId) VALUES (3, 'Jason', 'Bell', 'Stockholm', 2);
INSERT INTO employee (id, firstName, lastName, description, managerId) VALUES (4, 'Chris', 'Roy', 'Oslo', 1);
INSERT INTO employee (id, firstName, lastName, description, managerId) VALUES (5, 'Ian', 'Jordon', 'Vienna', 2);

