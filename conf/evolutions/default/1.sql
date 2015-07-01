# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table area (
  id                        bigint auto_increment not null,
  codigo                    varchar(255),
  area                      varchar(255),
  constraint pk_area primary key (id))
;

create table personal (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  apellido                  varchar(255),
  constraint pk_personal primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table area;

drop table personal;

SET FOREIGN_KEY_CHECKS=1;

