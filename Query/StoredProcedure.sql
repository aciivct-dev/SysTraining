STORED PROCEDURE in MySQL
-----------------------------------
DELIMITER && 
CREATE PROCEDURE ALLVALUES () 
BEGIN 
SELECT * FROM worker;
END && 
DELIMITER ;   

CALL ALLVALUES();
-----------------------------------
IN
DELIMITER **
CREATE PROCEDURE `ONEE` (IN WID INT)
BEGIN 
SELECT FIRST_NAME FROM worker WHERE WORKER_ID = WID;
END **
DELIMITER; 

CALL ONEE(1);
-----------------------------------
OUT
DELIMITER &&
CREATE PROCEDURE PRINT(IN ID INT,OUT NAME VARCHAR(20))
BEGIN
SELECT FIRST_NAME INTO NAME FROM worker WHERE WORKER_ID=ID;

END &&
DELIMITER;

CALL PRINT(1,@NAME);
SELECT @NAME;
-----------------------------------
INOUT

