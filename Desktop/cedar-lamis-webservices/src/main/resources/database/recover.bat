::===== Database Recovery rountine ======

:: This recovers a corrupted H2 database and create a new database:
echo off
title Database Recovery
echo Recovering records from corrupted database
cd/
cd/lamis2/database
java -cp ./* org.h2.tools.Recover
mkdir old
move lamis.h2.db old/lamis.h2.db
move lamis.trace.db old/lamis.trace.db
echo Creating new database and inserting recovered records
java -cp ./* org.h2.tools.RunScript -url jdbc:h2:./lamis -user admin -password admin -script lamis.h2.sql -continueOnError
move lamis.h2.sql old/lamis.h2.sql
echo Database recovered .......
pause