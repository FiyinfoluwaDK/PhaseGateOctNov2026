import java.util.Scanner;

public class StudentGrade{
  public static void main (String[]args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How many students do you have?");
    int totalStudents = scanner.nextInt();

    System.out.println("How many subjects do they offer?");
    int totalSubjects = scanner.nextInt();

    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved successfully");

    int[][] studentGrade = classroomSheet(totalStudents, totalSubjects);

    System.out.println("==========================================================================================================================================================");
    System.out.print("STUDENT \t");
    for(int count = 1; count <= totalSubjects; count++){
      System.out.print("SUB"+count+"\t");
    }
    System.out.print("TOTAL\t");
    System.out.print("AVG\t");
    System.out.print("POS\n");
    System.out.println("==========================================================================================================================================================");
    
    for(int count = 0; count < totalStudents; count++){
      System.out.println("Student"+(count+1)+"\t");
    
      for(int counter = 0; counter < totalStudents; counter++){
        System.out.print(studentGrade[counter][count]+ "\t");
      }
      System.out.print("\t");
    }
    
    System.out.println("==========================================================================================================================================================");
    System.out.println();
    System.out.println("==========================================================================================================================================================");
    
    
  }
  
  public static int[][] classroomSheet(int student, int subject){
    int[][] grade = new int[student][subject];
    
    Scanner scanner = new Scanner(System.in);
    
    for(int count = 0; count < grade.length; count++){
      for(int counter = 0; counter < grade[count].length; counter++){
        System.out.println("Entering for Student " + (count + 1));
        System.out.println("Enter score for Subject " + (counter + 1));
        int subject_score = scanner.nextInt();
        grade[count][counter] = subject_score;
        System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        System.out.println();
      }  
    }        
    return grade;
  }    
      
    
    
  
  
  
  
}
