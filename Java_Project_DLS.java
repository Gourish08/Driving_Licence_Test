//Gourish S A
//4NI19IS033
//ISE 'B'
/**This Driving Licence Test  program  grades the written portion of the license exam. 
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
 
Input validation: only accept the letters A, B, C, or D*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//package package2;

import java.util.Scanner;                         	 //Needed for scanner class



class DriverExam
{
                                                  				 //An array containing a student's answers
  private String[] correctAnswers = 
                                {"B", "D", "A", "A", "C", "A", 
                                 "B", "A", "C", "D", 
                                 "B", "C", "D", "A", 
                                 "D", "C", "C", "B", "D", "A"}; 
                                 
                                                   				//Store the user's answers
  private String[] userAnswers; 
  int[] missed = new int[correctAnswers.length]; 
  
                                                   				 //Process the user's answers
  public DriverExam (String[] Answers)
  {
     userAnswers = new String[Answers.length]; 
     
     for (int i = 0; i < Answers.length; i++)
     {
        userAnswers[i] = Answers[i]; 
     }
  }
  
                                                 			  //Returns a boolean value if correct answers > 15 
  public boolean passed()
  {
     if (totalCorrect() >= 15)
        return true; 
     else
        return false; 
  }
  
                                                  			  //Determines the total correct answers
  public int totalCorrect()
  {
     int correctCount = 0; 
     
     for (int i = 0; i < correctAnswers.length; i++)
     {
        if (userAnswers[i].equalsIgnoreCase(correctAnswers[i]))
        {
           correctCount++; 


           }
         }
         return correctCount; 
      }
      
                                                 		                 //Determines the total incorrect answers
      public int totalIncorrect()
      {
         int incorrectCount = 0; 
         
         for (int i = 0; i < correctAnswers.length; i++)
         {
            if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i]))   //equalsIgnoreCase() ignores case during comparision
            {
               missed[incorrectCount] = i; 
               incorrectCount++; 
            }
         }
         return incorrectCount; 
      }
   
                                                   				//Determines Missed questions
      public int[] questionsMissed()
      {
         return missed; 
      }
      
   }
                                                    //end of DriverExam class


//----------------------------------------------------------------------------




public class DriverExamApplication
{
	
	   public static boolean isValidAnswer (String answer)          //equalsIgnoreCase() ignores case during comparison
	      {
	         return (("A".equalsIgnoreCase(answer)) || 
	            ("B".equalsIgnoreCase(answer))
	            || ("C".equalsIgnoreCase(answer)) || 
	            ("D".equalsIgnoreCase(answer))); 
	      }
	
  public static void main(String[] args)
  {
     System.out.println("                    Driver's License Exam "); 
     System.out.println("This is a multiple choice examination consisting of 20 questions the user inputs the answers A,B,C,D.\n");
     System.out.println("This program outputs whether pass/fail depending on answers by applicant.\n");
     System.out.println("Depending on output of applicants they are provided/rejected the driving license.\n");
     Scanner input = new Scanner(System.in);               //Object of scanner class
     
     System.out.println("20 Multiple-Choice Questions\n "); 
     System.out.println("Mark A, B, C, D   "); 
                                      
                                                          			 //Inputting string
     String[] answers = new String[20]; 
     String answer; 
     
     for (int i = 0; i < 20; i++)
     {
        do
        {
           System.out.print("\nWhat is your response to question "+(i+1) + ": "); 
           answer = input.nextLine(); 
        } while (!isValidAnswer(answer)); 
        
        answers[i] = answer; 
     }
     
                                                            		                //Process
     DriverExam exam = new DriverExam(answers);               //Creating new object of driver class
     
                                                            		               //Results
     System.out.println("  RESULTS  "); 
     
                                                           			 //Outputting total correct
     System.out.println("Total Correct: " + exam.totalCorrect()); 
     
                                                           			 //Outputting total incorrect
     System.out.println("Total Incorrect: " + exam.totalIncorrect()); 
     
     String passed = exam.passed() ? "YES" : "NO"; 
     
                                                            			//Result pass or fail
     System.out.println("Passed: " + passed); 
     
     if (exam.totalIncorrect() > 0)
     {
         System.out.println("The incorrect answers are: "); 
         
         int missedIndex; 
         
         for (int i = 0; i < exam.totalIncorrect(); i++)
         {
           missedIndex = exam.questionsMissed()[i]+1; 
           System.out.print(" " + missedIndex); 
         }
     }
     
                                                              //Returns true when answer is valid
  
     input.close();
  }                                                           //end of main function
  
  
}