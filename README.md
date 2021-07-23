# Driving_Licence_Test
This Driving Licence Test  program  grades the written portion of the license exam. 
 * 
 * The exam has 20 multiple choice questions. Here are the correct answers:

1. B    2. D    3. A    4. A
5. C    6. A    7. B    8. A
9. C    10. D   11.B    12. C
13. D   14. A   15. D   16. C
17. C   18. B   19. D   20. A

An applicant must correctly answer 15 questions of the 20 questions to pass the exam.

If he passes the examination he will be approved a Driving Licence.

Program consists a class named DriverExam that holds the correct answers to the exam in an array field. 
The class should have an array field to hold the applicants answers.
 
The class should have the following methods:

passed: The method returns true if the applicant passed the exam, false otherwise.
totalCorrect: returns the total number of correctly answered questions. 
totalIncorrect: returns the total number of incorrectly answered questions. 
questionsMissed: an int array containing the question numbers of the question that the applicant missed.

Another class in a test program that asks the user to enter a student's answers, 
and then display the results returned from the DriverExam class's methods.
 
Input validation: only accept the letters A, B, C, or D
