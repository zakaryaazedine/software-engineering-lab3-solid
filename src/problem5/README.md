# Problem 5 - Written answers

## Question 1

```text
EnrollmentService --> CsvStudentStore
EnrollmentService --> EmailSender
```

The dependencies go from the enrollment policy to the storage and email details.

## Question 2

Next to EnrollmentService, because the service defines what it needs. The CSV and notification classes implement these interfaces.

## Question 6

DIP means depending on interfaces instead of concrete storage or notification classes; question 4 applies it by making the detail classes implement those interfaces. DI means receiving dependencies from outside the class; question 3 applies it through the constructor.
