user, sys, count = 0, 0, 0
i = 1
print("Welcome to the Number Game!\nYou have to reach 17 before the system, in every next iteration you can choose current count+1 or current count+2\nwhoever reaches 17 first wins the game!\n[initially current_count = 0]")
while count < 17:
    user = int(input("Enter user's number: "))
    if user == i or user == i+1:
        if user == 1:
            count = 1
            print("count:",count)
            sys = 2
            print("sys choses:", sys)
            count = sys
            print("count:",count)
            
        elif user == 2:
            print("count :", user)
            sys = 3
            print("sys choses:", sys)
            count = sys
            print("count:",count)
            
        elif user == 4 or user == 7 or user == 10 or user == 13 or user == 16:
            print("count :", user)
            sys = user+1
            print("sys choses:", sys)
            count = sys
            print("count:",count)
        
        else:
            print("count:", (user))
            sys += 3
            count = sys
            if count<=17:
                print("sys choses:",sys)
                print("count:",count)
            else:
                break
    else:
        print("Invalid Input!")
    i = count + 1
    
if sys==17:
    print("System Won!")
elif user == 17:
    print("User Won!")
