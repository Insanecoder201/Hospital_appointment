# Hospital_appointment
Steps to run the project: 

Create the tables first by running the script : 

create database hospitaldb;
create table user_credentials(
	pk_seq int not null auto_increment primary key,
	email varchar(40) not null,
	password varchar(100) not null
);

create table user_info(
	pk_seq int not null auto_increment primary key,
	name varchar(20) not null,
	gender varchar(10) not null,
	dob date not null,
	phone varchar(20) not null,
	email varchar(30) not null,
	password varchar(30) not null
);

create table appointment_details(
	pk_seq int not null auto_increment primary key,
	
	startdate date not null,
	time varchar(10),
	comments varchar(500),
	type varchar(30),
	facility varchar(30)
);

install maven in your computer.

go to the folder where you have extracted the project and type the command : 
mvn clean install

after the build is successful type the following command (go to the target folder first from your terminal) : 
java -jar hospital-appointment-0.0.1-SNAPSHOT.war
