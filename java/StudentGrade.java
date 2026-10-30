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
    int[] total = eachStudentTotal(studentGrade);
    double[] average = eachStudentAverage(studentGrade);
    int[] position = positionIndex(total);

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
      System.out.print("Student"+(count+1)+"\t");
    
      for(int counter = 0; counter < totalStudents; counter++){
        System.out.print(studentGrade[count][counter]+ "\t");
      }
      
        System.out.print(total[count]+ "\t");
        
        System.out.print(average[count]+ "\t");
        
        System.out.print(position[count]+ "\t");
      
        System.out.print("\n");
    }
    
    System.out.println("==========================================================================================================================================================");
    System.out.println();
    System.out.println("==========================================================================================================================================================");
    
    
    
  }
  
  public static int[][] classroomSheet(int student, int subject){
    int[][] grade = new int[student][subject];
    
    Scanner scanner = new Scanner(System.in);
    
    for(int count = 0; count < grade.length; count++){
      for(int counter = 0; counter < grade[count].length;){
        System.out.println("Entering for Student " + (count + 1));
        System.out.println("Enter score for Subject " + (counter + 1));
        int subjectScore = scanner.nextInt();
        
        if(subjectScore >= 1 && subjectScore <= 100){
          grade[count][counter] = subjectScore;
          counter++;
          System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Saved successfully");
          System.out.println();
      }
      else System.out.println("Invalid Input, Try again");
     }  
    }        
    return grade;
  }    
  
  
    public static int[] eachStudentTotal(int[][] grade){
      int[] totalScore = new int[grade.length];
      
      for(int count = 0; count < grade.length; count++){
        int total = 0;
        for(int counter = 0; counter < grade[count].length; counter++){
          total += grade[count][counter];
        }
        totalScore[count] = total;
      }
      
      return totalScore;
      
    }
    
     public static double[] eachStudentAverage(int[][] grade){
      double[] averageScore = new double[grade.length];
      
      for(int count = 0; count < grade.length; count++){
        int total = 0;
        for(int counter = 0; counter < grade[count].length; counter++){
          total += grade[count][counter];
        }
        averageScore[count] = (total*1.0)/grade[count].length;
      }
      
      return averageScore;
      
    }
    
    public static int[] positionIndex(int[] scores){
      int[] positions = new int[scores.length];
      
      for(int count = 0; count < scores.length; count++){
        int position = 0;
        for(int counter = 0; counter < scores.length; counter++){
          if(scores[counter] > scores[count]){
            position++;
          }
        }
        positions[count] = position + 1;
      }
      return positions;
     }
  
    public static int highestSubjectScore(int[][] grade, int subject) {
    int highest = grade[0][subject];

    for (int student = 0; student < grade.length; student++) {
      if (grade[student][subject] > highest) {
        highest = grade[student][subject];
      }
    }

    return highest;
  }
  
  public static int lowestSubjectScore(int[][] grade, int subject) {

    int lowest = grade[0][subject];

    for (int student = 0; student < grade.length; student++) {

      if (grade[student][subject] < lowest) {
        lowest = grade[student][subject];
     }
    }
    return lowest;
  }
  
}
