create table if not exists employee
(
    id int auto_increment
    primary key,
    name varchar(255) not null,
    position varchar(255) not null
    );

create table if not exists manipulation
(
    id tinyint auto_increment
    primary key,
    title varchar(225) not null,
    type enum('PROCEDURE', 'MEDICAMENT') not null,
    constraint manipulation_title_uindex
    unique (title)
    );

create table if not exists patient
(
    id int auto_increment
    primary key,
    name varchar(50) not null,
    insurance bigint not null,
    diagnosis varchar(255) default 'is not defined' null,
    doctor_id int not null,
    openCase int default 1 not null,
    constraint doctor_fk
    foreign key (doctor_id) references employee (id)
    );

create table if not exists appointment
(
    id bigint auto_increment
    primary key,
    patient_id int not null,
    manipulation_id tinyint not null,
    periodicity varchar(255) not null,
    start_date date not null,
    end_date date not null,
    dosage varchar(255) null,
    constraint appointment_manipulation_id_fk
    foreign key (manipulation_id) references manipulation (id),
    constraint appointment_patient_fk
    foreign key (patient_id) references patient (id)
    );

create table if not exists event
(
    id bigint auto_increment
    primary key,
    patient_id int not null,
    date datetime not null,
    manipulation_id tinyint not null,
    status enum('PLANNED', 'COMPLETED', 'CANCELED', 'FAILED') default 'PLANNED' not null,
    comment text null,
    constraint manipulation_fk
    foreign key (manipulation_id) references manipulation (id),
    constraint patient_fk
    foreign key (patient_id) references patient (id)
    );

create table if not exists role
(
    id int auto_increment
    primary key,
    title varchar(20) not null,
    code enum('ROLE_ADMIN', 'ROLE_DOCTOR', 'ROLE_NURSE') not null
    );

create table if not exists employee_role
(
    employee_id int not null
    primary key,
    role_id int not null,
    constraint employee_fk
    foreign key (employee_id) references employee (id),
    constraint role_fk
    foreign key (role_id) references role (id)
    );