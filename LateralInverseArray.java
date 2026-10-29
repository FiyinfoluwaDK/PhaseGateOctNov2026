public class LateralInverseArray{
  public static  void main (String[]args){
  
  int[][] array = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                            };
     int[][] arrayReverse = new int[3][3];
        
    for(int count = 0; count < array.length; count++){
      for(int counter = 0; counter < array[count].length; counter++){
        arrayReverse[count][counter] = array[count][array.length-1-counter];      
      }
    }
    
  
  for(int count = 0; count < arrayReverse.length; count++){
    for(int counter = 0; counter < arrayReverse[count].length; counter++){
      System.out.print(arrayReverse[count][counter]);      
    }
    System.out.println();
  }
  
  }
  

 
  
}
