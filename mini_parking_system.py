def parking_into_spot(parking, spot):
    if parking[spot-1] == 1:
        print("Spot is currently occupied")
        print(parking)
        
    elif parking[spot-1] == 0:
        parking[spot-1] = 1
        print("Vehicle parked")
        print(parking)
        return parking
        
    else:
        print("Out of Bounds")
        
        
def parking_leaving_spot(parking, spot):
    if parking[spot-1] == 1:
        parking[spot-1] = 0
        print("Vehicle leaves")
        print(parking)
        return parking
        
    elif parking[spot-1] == 0:
        print("Spot is already empty")
    
    else:
        print("Out of Bounds")



parking_session = True
parking_slots = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

while(parking_session):
    parking_lot = input("""
=================================
===PARKING SESSION IN PROGRESS===
=================================
1.  Show parking lot
2.  Park vehicle
3.  Vehicle leaving  
=================================
---------PRESS 0 TO EXIT---------
=================================
    """)
    
    match parking_lot:
            case "1":
                print(parking_slots)
                
            case "2":
                slot = int(input("which spot? (1-20): "))
                
                if 1 <= slot <= 20:
                    parking_into_spot(parking_slots, slot)
                
            case "3":
                slot = int(input("which spot? (1-20): "))
                
                if 1 <= slot <= 20:
                    parking_leaving_spot(parking_slots, slot)
                
            case "0":
                break
            
            case _:
                print("Input invalid")



   
