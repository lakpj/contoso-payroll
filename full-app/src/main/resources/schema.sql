create table manager (
    id bigint not null,
    name varchar(255),
    password varchar(100) not null,
    roles varchar(100) not null,
    primary key (id)
);

create table employee (
    id bigint not null,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    description varchar(255) not null,
    managerId bigint not null,
    primary key (id)
);

alter table employee
   add constraint FK54uo82jnot7ye32pyc8dcj2eh
   foreign key (managerId)
   references manager (id);