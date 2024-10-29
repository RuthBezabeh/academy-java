--CREATE [OR REPLACE] FUNCTION function_name (arguments) 
--RETURNS return_datatype AS $variable_name$
--   DECLARE
--      variable_declaration(s);
--[...]
--   BEGIN
--      function_body
--      [...]
--   RETURN { variable_name | value }
--   END; 
--LANGUAGE plpgsql;

-- exampple 1
-- creat a function to add two numbers and return the result
create or replace function "addNumbers" (num1 integer, num2 integer) returns integer as
$$
	begin 
		return num1+num2;
	end;
$$
language plpgsql;

--DROP FUNCTION "addNumbers"(integer,integer);
	
-- execute function
select "addNumbers"(2,3) as "sum";

-- Example 2
CREATE OR REPLACE FUNCTION totalRecordsInStudents()
RETURNS INTEGER AS $total$
DECLARE
    total INTEGER;
BEGIN
   SELECT COUNT(*) INTO total FROM "students";
   RETURN total;
END;
$total$ 
LANGUAGE plpgsql;

-- To call this function and check the total records in the students table, run this statement:
SELECT totalRecordsInStudents();

--example 3: create function to return the maximum courseId from courses table
create or replace function "getMaxCourseId"() returns integer as 
$$
declare maxCourseId integer;
begin
	select max("courseId") into maxCourseId from courses;
	return maxCourseId;
end;
$$
language plpgsql;

--drop function "getMaxCourseId"(); 
--drop function getMaxCourseId(); 

select "getMaxCourseId"();

-- example 4: create a function to return the rows based on a courseId
create or replace function "getCoursesByCourseId"("_courseId" integer)
returns table("courseId" integer, "courseName" varchar) as
$$
begin
	return query select * from "courses" where "courses"."courseId" = _courseId;
end;
$$
language plpgsql;

select * from "getCoursesByCourseId"(4);



