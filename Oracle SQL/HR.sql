SELECT * FROM TAB;

desc employees;

create table employees_duplicate
AS
    select * from employees;
    
select * from employees_duplicate;
desc employees_duplicate;

insert into employees_duplicate
                    (last_name, first_name, email, department_id, salary, hire_date, job_id)
                    values
                    ('Wright', 'Eric', 'eric.wright@foo.com', '40', 330000.00, '17-JUN-03', 'HR_REP');