SELECT a.name AS name FROM Employee a
JOIN Employee b
ON a.Id = b.managerId
GROUP BY a.name, a.Id
HAVING count(b.managerID)>=5;