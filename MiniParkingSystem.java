import java.util.Scanner;

public class MiniParkingSystem{
  public static void main (String[]args){
  
  Scanner scanner = new Scanner(System.in);
  
  boolean parkingSession = true;
  int[] parkingSlots = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

  while(parkingSession){
    System.out.println("""
=================================
===PARKING SESSION IN PROGRESS===
=================================
1.  Show parking lot
2.  Park vehicle
3.  Vehicle leaving  
=================================
---------PRESS 0 TO EXIT---------
=================================
    """);
    
    String parkingLot = scanner.nextLine();
    
    switch (parkingLot){
            case "1":
                for(int count = 0; count < parkingSlots.length; count++){
                  System.out.print(parkingSlots[count] + " ");
                  }
                  System.out.println();
                break;
                
            case "2":
                System.out.println("which spot? (1-20): ");
                int slotPark = scanner.nextInt();
                
                if (1 <= slotPark && slotPark <= 20){
                    parkingIntoSpot(parkingSlots, slotPark);
                    }
                
                break;
                
            case "3":
                System.out.println("which spot? (1-20): ");
                int slotUnpark = scanner.nextInt();
                
                if (1 <= slotUnpark && slotUnpark <= 20){
                    parkingLeavingSpot(parkingSlots, slotUnpark);
                }
                
                break;
                
            case "0": parkingSession = false;
                break;
            
            default:
                System.out.println("Input invalid");


      }
    }
  }
  
  public static int[] parkingIntoSpot(int[] parking,int spot){
    if (parking[spot-1] == 1){
        System.out.println("Spot is currently occupied");
        for(int count = 0; count < parking.length; count++){
          System.out.print(parking[count] + " ");
          }
        System.out.println();
        }
        
    else if (parking[spot-1] == 0){
        parking[spot-1] = 1;
        System.out.println("Vehicle parked");
        for(int count = 0; count < parking.length; count++){
          System.out.print(parking[count] + " ");
          }
        System.out.println();  
        }
        
    else
        System.out.println("Out of Bounds");
        
        return parking;
  }
  
  public static int[] parkingLeavingSpot(int[] parking,int spot){
    if (parking[spot-1] == 1){
        parking[spot-1] = 0;
        System.out.println("Vehicle Leaves");
        for(int count = 0; count < parking.length; count++){
          System.out.print(parking[count] + " ");
          }
        System.out.println();
        }
        
    else if (parking[spot-1] == 0){
        System.out.println("Spot is already empty");
        for(int count = 0; count < parking.length; count++){
          System.out.print(parking[count] + " ");
          }
        System.out.println();
        }
        
    else
        System.out.println("Out of Bounds");
        
        return parking;
  }
  
  
}
