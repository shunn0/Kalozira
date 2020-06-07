create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, brand varchar2(255 char), name varchar2(255 char), primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, date timestamp not null, diagnosis varchar2(255 char), gender varchar2(255 char), medicines varchar2(255 char), next_visit_date date, patient_age number(10,0), patient_name varchar2(255 char) not null, primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
create sequence hibernate_sequence start with 1 increment by 1
create table cmuser (id number(19,0) not null, enabled number(1,0) not null, encryted_password varchar2(255 char), username varchar2(255 char), primary key (id))
create table cmuser_roles (cmuser_id number(19,0) not null, roles varchar2(255 char))
create table prescriptions (id number(19,0) not null, date timestamp not null, diagnosis varchar2(255 char), gender varchar2(255 char), medicines varchar2(255 char), next_visit_date date, patient_age number(10,0), patient_name varchar2(255 char) not null, primary key (id))
alter table cmuser_roles add constraint FK9yk4r56xn9codsbweey2fma7t foreign key (cmuser_id) references cmuser
