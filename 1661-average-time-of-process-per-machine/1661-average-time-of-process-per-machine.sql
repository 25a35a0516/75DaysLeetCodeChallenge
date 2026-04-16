# Write your MySQL query statement below
SELECT a.machine_id, round(avg(b.timestamp-a.timestamp),3) AS processing_time FROM activity a
JOIN activity b 
ON a.activity_type='start' and b.activity_type='end' and a.machine_id=b.machine_id and a.process_id=b.process_id
GROUP BY a.machine_id;