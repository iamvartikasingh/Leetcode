# Write your MySQL query statement below
select a.student_id, a.student_name, b.subject_name, count(c.student_id) attended_exams 
from Students a cross join Subjects b left join examinations c 
on a.student_id = c.student_id and b.subject_name=c.subject_name 
group by a.student_id, a.student_name, b.subject_name
order by a.student_id;