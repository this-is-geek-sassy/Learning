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
                
select distinct employee_id from employees
where hire_date = any (select max(hire_date)
                    from employees
                    group by employees.department_id);
                    
