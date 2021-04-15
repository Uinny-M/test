create table employee
(
    id       int auto_increment
        primary key,
    name     varchar(255) not null,
    position varchar(255) not null
);

create table manipulation
(
    id    tinyint auto_increment
        primary key,
    title varchar(225)                     not null,
    type  enum ('PROCEDURE', 'MEDICAMENT') not null
);

create table patient
(
    id        int auto_increment
        primary key,
    name      varchar(50) not null,
    insurance bigint      not null
);

create table appointment
(
    id              bigint auto_increment
        primary key,
    patient_id      int                                                                                                                                                                   not null,
    manipulation_id tinyint                                                                                                                                                               not null,
    duration        tinyint                                                                                                                                                               not null,
    start_date      date                                                                                                                                                                  not null,
    dosage          varchar(255)                                                                                                                                                          null,
    weekday         set ('MONDAY', 'TUESDAY', 'WEDNESDAY', 'THURSDAY', 'FRIDAY', 'SATURDAY', 'SUNDAY') default (_utf8mb4'MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY') null,
    daily_chart     tinyint                                                                            default 1                                                                          not null,
    drug            varchar(40)                                                                                                                                                           null,
    constraint appointment_manipulation_id_fk
        foreign key (manipulation_id) references manipulation (id),
    constraint appointment_patient_fk
        foreign key (patient_id) references patient (id)
);

create table `case`
(
    id         bigint auto_increment
        primary key,
    patient_id int                                   not null,
    doctor_id  int                                   not null,
    diagnosis  varchar(255) default 'is not defined' null,
    open       int          default 1                not null,
    constraint case_employee_id_fk
        foreign key (doctor_id) references employee (id),
    constraint case_patient_id_fk
        foreign key (patient_id) references patient (id)
);

create table event
(
    id              bigint auto_increment
        primary key,
    patient_id      int                                                                   not null,
    date            datetime                                                              not null,
    manipulation_id tinyint                                                               not null,
    status          enum ('PLANNED', 'COMPLETED', 'CANCELED', 'FAILED') default 'PLANNED' not null,
    comment         text                                                                  null,
    constraint manipulation_fk
        foreign key (manipulation_id) references manipulation (id),
    constraint patient_fk
        foreign key (patient_id) references patient (id)
);

create table role
(
    id    int auto_increment
        primary key,
    title varchar(20)                                      not null,
    code  enum ('ROLE_ADMIN', 'ROLE_DOCTOR', 'ROLE_NURSE') not null
);

create table employee_role
(
    employee_id int not null
        primary key,
    role_id     int not null,
    constraint employee_fk
        foreign key (employee_id) references employee (id),
    constraint role_fk
        foreign key (role_id) references role (id)
);