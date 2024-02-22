
set role newrole1;

select * from hr.employees;

create SYNONYM employees for HR.employees;

select * from employees;

-- drop synonym