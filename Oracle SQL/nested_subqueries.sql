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
                
select distinct employee_id, first_name, last_name from employees
where hire_date = any (select max(hire_date)
                    from employees
                    group by employees.department_id);
                    
-- Inline views
select e.employee_id, e.first_name, e.last_name, b.department_name, b.city, b.state_province
from employees e JOIN (SELECT department_id, department_name, state_province, city
                        FROM departments JOIN locations
                        USING(location_id)
                        ORDER BY department_id) b
USING (department_id);


