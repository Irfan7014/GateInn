# GateInn
A Java Project built using NetBeans IDE and MySql. This is a domesic project i.e.can be used by Housing Society, Gated Community, Offices, Shopping Mall etc. It takes in data of a visitor like Name, Phone No., Purpose of Visit, Date, Entry Time and Exit Time etc and stores it into a database. One can also view the data based on Name, Date or Phone No.
User also needs to have a Login Id and Password, incase the password is forgotten, the password can be changed using a KeyID.

Databases Name:gateinn
Tables:
login
entries

Queries:
create database gateinn;

use gateinn;

create table login(username varchar(50), password varchar(50), keyid varchar(10));

create table entries(Name varchar(50), Purpose varchar(50), Phone varchar(15), Flat varchar(50), Date varchar(15), Entry_Time varchar(15), Exit_Time varchar(15), Watchman_Present varchar(50), Gate varchar(50), Vehicle_Num varchar(50));
