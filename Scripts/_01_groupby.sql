
SELECT "courseId", count("courseId")
FROM students
WHERE "courseId" > 10
GROUP BY "courseId"
ORDER BY "courseId";
