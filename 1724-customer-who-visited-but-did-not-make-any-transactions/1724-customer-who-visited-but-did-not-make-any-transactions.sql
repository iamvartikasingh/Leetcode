# Write your MySQL query statement below
select v.customer_id, count(v.visit_id) AS count_no_trans
from Visits v
left join Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id is NULL
group by v.customer_id;
