import java.util.Scanner;

public class StudentGrade{
  public static void main (String[]args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How many students do you have?");
    int totalStudents = scanner.nextInt();

    System.out.println("How many subjects do they offer?");
    int totalSubjects = scanner.nextInt();

    System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.print("Saved successfully");

    //int[][] studentGrade = classroomSheet(totalStudents, totalSubjects);

    System.out.println("==========================================================================================================================================================");
    System.out.print("STUDENT \t");
    for(int count = 1; count <= totalSubjects; count++){
      System.out.println("SUB"+count+"\t");
    }
    
  }
  
  public static int[][] classroomSheet(int student, int subject){
    int[][] grade = new int[student][subject];
    
    for(int count = 0; count < grade.length; count++){
      for(int counter = 0; counter < grade[count].length; counter++){
        System.out.println("Entering for Student " + (student + 1));
        System.out.println("Enter score for Subject" + (subject + 1));
        int subject_score = scanner.nextInt();
        grade[count][counter] = subject_score;
        System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
      }  
    }        
    return grade;
  }    
      
    
    
  
  
  
  
}
