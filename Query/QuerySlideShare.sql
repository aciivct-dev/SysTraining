1)
SELECT DISTINCT DEPARTMENT,(LENGTH(DEPARTMENT))  AS LENGTH
FROM worker;
----------------------------------------------------------------------------
2)
SELECT * 
FROM worker 
ORDER BY FIRST_NAME DESC;
----------------------------------------------------------------------------
3)
SELECT *
FROM worker
WHERE FIRST_NAME IN ('VIPUL','SATISH');
----------------------------------------------------------------------------
4)
SELECT *
FROM worker 
WHERE SALARY BETWEEN 100000 AND 500000;
----------------------------------------------------------------------------
5)
SELECT *
FROM worker
WHERE WORKER_ID IN (SELECT WORKER_REF_ID
FROM title 
WHERE WORKER_TITLE = 'MANAGER');
----------------------------------------------------------------------------
6)
SELECT A1.SALARY
FROM worker A1
WHERE 5=(SELECT COUNT(DISTINCT(A2.SALARY))
FROM worker A2
WHERE A1.SALARY<A2.SALARY);
----------------------------------------------------------------------------
7)
SELECT DISTINCT W.WORKER_ID,W.FIRST_NAME,W.SALARY
FROM worker W,worker W1
WHERE W.SALARY=W1.SALARY AND 
W.WORKER_ID!=W1.WORKER_ID;
----------------------------------------------------------------------------
8)
SELECT * 
FROM worker
WHERE WORKER_ID IN (SELECT MAX(WORKER_ID)
FROM worker);
----------------------------------------------------------------------------
9)
SELECT W.FIRST_NAME,W.DEPARTMENT,W.SALARY
FROM
		(SELECT MAX(SALARY) AS TSAL,DEPARTMENT
		FROM worker
		GROUP BY DEPARTMENT) AS T,worker W
WHERE T.TSAL=W.SALARY AND T.DEPARTMENT = W.DEPARTMENT;
----------------------------------------------------------------------------
10)
SELECT MAX(SALARY)
FROM worker
WHERE SALARY<(SELECT MAX(SALARY) 
FROM worker 
WHERE SALARY<(SELECT MAX(SALARY)
FROM worker));
----------------------------------------------------------------------------
11
SELECT DEPARTMENT, COUNT(WORKER_ID) NO_OF_WORKERS
FROM worker
GROUP BY DEPARTMENT
ORDER BY NO_OF_WORKERS DESC;
----------------------------------------------------------------------------
12 CORRELATED SUBQUERY
SELECT *
FROM worker W,title T
WHERE T.WORKER_TITLE='MANAGER'
AND W.WORKER_ID=T.WORKER_REF_ID;
----------------------------------------------------------------------------
13 GROUP_BY_FUNCTION
SELECT WORKER_TITLE,COUNT(WORKER_TITLE)
FROM title
GROUP BY WORKER_TITLE,AFFECTED_FROM;
----------------------------------------------------------------------------
14
SELECT NOW();
----------------------------------------------------------------------------
15 
SELECT *
FROM worker 
ORDER BY SALARY DESC
LIMIT 5;
----------------------------------------------------------------------------
16
SELECT W1.FIRST_NAME FROM worker W1 WHERE W1.DEPARTMENT='HR'
UNION ALL 
SELECT W2.FIRST_NAME FROM worker W2 WHERE W2.DEPARTMENT='HR';
----------------------------------------------------------------------------
17
SELECT DEPARTMENT,COUNT(WORKER_ID) AS COUNT
FROM worker
GROUP BY DEPARTMENT
HAVING COUNT(*) <5
ORDER BY COUNT DESC ;
----------------------------------------------------------------------------
18
