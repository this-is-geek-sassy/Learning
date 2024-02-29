select * from tab;

info employees;

select upper(first_name), lower(last_name), initcap(email)
from employees;

select first_name || ' ' || last_name
from employees;

SELECT first_name, UPPER(first_name), 
       last_name, LOWER(last_name), 
       email, INITCAP(email),
       UPPER('bmw i8')FROM employees
WHERE job_id = 'IT_PROG';

select instr('I am learning how to use functions in Oracle sql', 'o', -1, 1)
from dual;

select first_name, instr(first_name, 'a')
from employees;

select first_name, replace(first_name, 'a') as replaced_output
from employees;

select first_name, replace(first_name, 'a', '-') as replaced_output
from employees;

select first_name, replace(first_name, 'le', '-') as replaced_output
from employees;

select mod(7,4) from dual;