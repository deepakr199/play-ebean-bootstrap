# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        numeric(19) identity(1,1) not null,
  create_dt_tm              datetime,
  update_dt_tm              datetime,
  delete_flag               bit default 0,
  firstname                 varchar(255),
  lastname                  varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (id))
;




# --- !Downs

drop table user;

