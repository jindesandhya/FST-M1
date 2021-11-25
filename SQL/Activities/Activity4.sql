REM   Script: Activity4
REM   altering table with column, updating it and displaying the results

ALTER TABLE SALESMAN add (grade int);

select * from salesman 
 
--udpate salesman set grade = 100;

update salesman set grade = 100;

select * from salesman;

