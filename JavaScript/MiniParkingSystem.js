const prompt = require('prompt-sync')();
  
function parkingIntoSpot(parking, spot){
    if (parking[spot-1] == 1){
        console.log("Spot is currently occupied");
        console.log(parking);
        }
        
    else if (parking[spot-1] == 0){
        parking[spot-1] = 1;
        console.log("Vehicle parked");
        console.log(parking);  
        }
        
        return parking;
  }

function parkingLeavingSpot(parking, spot){
    if (parking[spot-1] == 1){
        parking[spot-1] = 0;
        console.log("Vehicle Leaves");
        console.log(parking);
        }
        
    else if (parking[spot-1] == 0){
        console.log("Spot is already empty");
        console.log(parking);
        }
         
        return parking;
  }


let parkingSession = true;
const parkingSlots = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];

  while(parkingSession){
    const parkingLot = prompt(`
=================================
===PARKING SESSION IN PROGRESS===
=================================
1.  Show parking lot
2.  Park vehicle
3.  Vehicle leaving  
=================================
---------PRESS 0 TO EXIT---------
=================================
    `);
    
  
    switch (parkingLot){
            case "1":
                  console.log(parkingSlots);
                break;
                
            case "2":
                let slotPark = Number(prompt("which spot? (1-20): "));
                
                if (1 <= slotPark && slotPark <= 20){
                    parkingIntoSpot(parkingSlots, slotPark);
                    }
                
                break;
                
            case "3":
                let slotUnpark = Number(prompt("which spot? (1-20): "));
                
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
  
  

