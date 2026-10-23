# Problem 4 - Written answers

## Question 1

- Professor: 2 unsupported methods, enrollInCourse and payTuition.
- Student: 3 unsupported methods, teach, gradeExam and publishPaper.

The shared interface forces each class to implement operations outside its role.

## Question 2

Student must be edited and recompiled even though it never grades exams. Its gradeExam declaration must match the new signature. UniversityMember and Professor must also be updated.

## Question 7

No, not automatically. Interfaces should follow the roles needed by clients, not a rule of one method per interface. Learner, Teacher and Researcher keep related operations together without forcing unrelated capabilities on each class.
