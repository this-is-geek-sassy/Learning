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

create table "Table this - that" (
    name   varchar2(10),
    "Memoy cap"  number(10)
);

info "Table this - that";

select substr('John Jacob', instr('John Jacob', ' ')+1, 
                length('John Jacob')) as "last name"   -- length function is optional here
from dual;

select sysdate, current_date, sessiontimezone, systimestamp, current_timestamp
from dual;

select sysdate, sysdate+1, (sysdate + (1/24)), (sysdate + (1 / (24*60))) from dual;

select max(salary), years_since_hired
from ( select employee_id, salary, manager_id, hire_date, sysdate, floor(sysdate - hire_date) as days_since_hired,
        round( floor(sysdate - hire_date) / 365 ) as years_since_hired
from employees )
--where years_since_hired > 19
group by years_since_hired;

select * from employees;