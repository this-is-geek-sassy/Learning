select * from tab;
desc employees;
info departments;

select * 
from employees e join departments d
using (department_id)
where salary >= (select max (salary)
                    from employees)
        ;
                    
-- correlated subquery
select *
from employees e1
where e1.salary = (select max(salary)
                from employees e2
                where e1.department_id = e2.department_id);

select max(salary), department_id
from employees
group by department_id;

select *
from employees
where (salary IN (select max(salary)
                from employees
                group by department_id)) AND (department_id IN (department_id
                                                              from employees
                                                              group by department_id))
group by department_id;


select *
from employees a
where (salary, department_id) IN (SELECT MAX(salary), department_id
                                    from employees b
                                    group by department_id);

