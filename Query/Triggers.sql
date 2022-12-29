CREATING BEFORE UPDATE TRIGGER (friends AND frnd_trigger)
DELIMITER @@
CREATE TRIGGER BEFORE_UPDATE BEFORE UPDATE 
ON friends 
FOR EACH ROW
BEGIN
INSERT INTO frnd_trigger
SET FNO=OLD.NO,FNAME=OLD.NAME,FGENDER=OLD.GENDER,ACTION='UPDATE',MOD_DATE=NOW();
END @@
DELIMITER ;

ACTION:

UPDATE friends SET NAME = 'bottle' WHERE NO=8;

PERFORM ANY ACTION AND EXECUTE FOLLOWING QUERY,
SELECT * FROM frnd_trigger;
----------------------------------------------------------------------------------------------------
CREATING AFTER UPDATE TRIGGER (friends AND frnd_trigger)
DELIMITER @@
CREATE TRIGGER AFTER_UPDATE AFTER UPDATE 
ON friends 
FOR EACH ROW
BEGIN
INSERT INTO frnd_trigger
SET FNO=OLD.NO,FNAME=OLD.NAME,FGENDER=OLD.GENDER,ACTION='UPDATE',MOD_DATE=NOW();
END @@
DELIMITER ;

ACTION:

UPDATE friends SET NAME = 'ASHIFA' WHERE NO=7;

PERFORM ANY ACTION AND EXECUTE FOLLOWING QUERY,
SELECT * FROM frnd_trigger;

----------------------------------------------------------------------------------------------------
CREATING AFTER DELETE TRIGGER (friends AND frnd_trigger)
DELIMITER @@
CREATE TRIGGER  AFTER_DELETE AFTER DELETE 
ON friends 
FOR EACH ROW
BEGIN
INSERT INTO frnd_trigger
SET FNO=OLD.NO,FNAME=OLD.NAME,FGENDER=OLD.GENDER,ACTION='DELETE',MOD_DATE=NOW();
END @@
DELIMITER ;

ACTION:

DELETE FROM friends WHERE NO=9;

PERFORM ANY ACTION AND EXECUTE FOLLOWING QUERY,
SELECT * FROM frnd_trigger;
----------------------------------------------------------------------------------------------------
CREATING BEFORE DELETE TRIGGER (friends AND frnd_trigger)
DELIMITER @@
CREATE TRIGGER  BEFORE_DELETE BEFORE DELETE 
ON friends 
FOR EACH ROW
BEGIN
INSERT INTO frnd_trigger
SET FNO=OLD.NO,FNAME=OLD.NAME,FGENDER=OLD.GENDER,ACTION='DELETE',MOD_DATE=NOW();
END @@
DELIMITER ;

ACTION:

DELETE FROM friends WHERE NO=9;

PERFORM ANY ACTION AND EXECUTE FOLLOWING QUERY,
SELECT * FROM frnd_trigger;
----------------------------------------------------------------------------------------------------