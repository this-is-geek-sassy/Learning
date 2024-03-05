select * from employees;

SELECT salary
FROM employees
WHERE first_name = 'John';

select * from employees
where salary > all (SELECT salary
                    FROM employees
                    WHERE first_name = 'John');

select * from employees
where salary > any (SELECT salary
                    FROM employees
                    WHERE first_name = 'John');
                
