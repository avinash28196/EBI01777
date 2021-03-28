# Question 1 
Get all students with name John.
Solution:
```mysql based
SELECT * FROM student 
WHERE student_name = 'Jhon';
```
# Question 2 
List the names and IDs of all students who have not appeared in Maths test.
Solution:

Assuming subjectId for math is MATH001
```mysql based
SELECT s.student_id, s.student_name
FROM student s
LEFT JOIN scores s1
ON s.student_id = s1.student_id
WHERE s1.score IS NULL and subject_id = 'MATH001'
ORDER BY s.student_name;
```

# Question 3 
The table for students has grown in size and we have seen it takes some time to return students
when searched by student name. Is there anything that can be done to make it return the results
quicker?

Solution: Creating an "index" will help here.
1. Make a copy of the table sorted by student_name.
2. Do a binary search to find the row where the student_name is "Avinash"
3. Find the index, then do a binary search on the student table that returns the rows that match the index ID.



# Question 4
We have outgrown our current SQL database, and want to implement a graph database instead.
Which steps do you think we need to take, in terms of data modelling, data transfer, data security
and data availability? If you have ever done something similar, briefly describe the old and new
database technologies, and your involvement in that project?

Solution: NA
