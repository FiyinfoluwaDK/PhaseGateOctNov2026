public class LateralInverseArrayIrregular{
  public static  void main (String[]args){
  
  int[][] arrayOne = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                            };
                            
  int[][] arrayTwo = {
                      {8,6},
                      {2,4,5},
                      {3},
                      {1,4,2,8}
                                };
                            
  reverseOfArrays(arrayOne); 
  
  reverseOfArrays(arrayTwo);
  
  for(int count = 0; count < arrayOne.length; count++){
    for(int counter = 0; counter < arrayOne[count].length; counter++){
      System.out.print(arrayOne[count][counter]);      
    }
    System.out.println();
  }
  
  for(int count = 0; count < arrayTwo.length; count++){
    for(int counter = 0; counter < arrayTwo[count].length; counter++){
      System.out.print(arrayTwo[count][counter]);      
    }
    System.out.println();
  }
  
  }
  
  
   public static int[][] reverseOfArrays(int[][] array) {

    for (int count = 0; count < array.length; count++) {

        for (int counter = 0; counter < array[count].length / 2; counter++) {

            int temp = array[count][counter];

            array[count][counter] = array[count][array[count].length - 1 - counter];

            array[count][array[count].length - 1 - counter] = temp;
        }
    }

    return array;
}
    
    
  
}
