create table course
(
	course_id integer not null,
	course_desc varchar(255),
	course_name varchar,
	primary key(course_id)
);

insert into course (course_id,course_desc, course_name) values (101,'java desc','java');