1)
SELECT C.CUST_NAME,C.CITY,S.NAME AS SALESMAN,S.COMISSION
FROM customer C,salesman S
WHERE C.SALESMAN_ID=S.SALESMAN_ID
ORDER BY C.CUSTOMER_ID
----------------------------------------------------------------------------
2)
SELECT C.CUST_NAME,C.CITY,S.NAME "SALESMAN",S.COMISSION
FROM customer C,salesman S
WHERE C.SALESMAN_ID=S.SALESMAN_ID AND S.COMISSION>.12
----------------------------------------------------------------------------
3)
SELECT C.CUST_NAME "CUSTOMER NAME",C.CITY,S.NAME "SALESMAN",S.CITY,S.COMISSION
FROM customer C,salesman S
WHERE C.SALESMAN_ID=S.SALESMAN_ID AND S.COMISSION>.12 AND C.CITY!=S.CITY
----------------------------------------------------------------------------
4)
SELECT O.ORD_NO,O.ORD_DATE,O.PURCH_AMT,C.CUST_NAME "Customer Name",C.GRADE,S.NAME AS salesman,S.COMISSION
FROM orders O,customer C,salesman S
WHERE O.CUSTOMER_ID=C.CUSTOMER_ID AND C.SALESMAN_ID=S.SALESMAN_ID
----------------------------------------------------------------------------
5)
SELECT *
FROM salesman S
NATURAL JOIN customer C NATURAL JOIN orders O
----------------------------------------------------------------------------
6)
SELECT C.CUST_NAME,C.CITY,C.GRADE,S.NAME "Salesman Name",S.CITY
FROM salesman S,customer C
WHERE S.SALESMAN_ID=C.SALESMAN_ID AND C.GRADE<300
ORDER BY C.CUSTOMER_ID;
----------------------------------------------------------------------------
7)
SELECT C.CUST_NAME,C.CITY,O.ORD_NO,O.ORD_DATE,O.PURCH_AMT
FROM customer C,orders O,salesman S
WHERE C.CUSTOMER_ID=O.CUSTOMER_ID AND S.SALESMAN_ID=O.SALESMAN_ID
ORDER BY O.ORD_DATE;
----------------------------------------------------------------------------
9)
SELECT C.CUST_NAME,S.NAME "SALESMAN",C.CITY
FROM salesman S,orders O,customer C
WHERE S.SALESMAN_ID=O.SALESMAN_ID AND C.CUSTOMER_ID=O.CUSTOMER_ID
----------------------------------------------------------------------------
12)
SELECT S.NAME "SALESMAN",C.CUST_NAME,C.CITY,C.GRADE
FROM salesman S,customer C
WHERE S.CITY != C.CITY
----------------------------------------------------------------------------
