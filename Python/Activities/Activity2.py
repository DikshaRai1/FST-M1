#Using Python:
#Ask the user for a number.
#Depending on what number they enter, tell them if the number is an even or odd number.
number=input("Please enter a number: ")
if (int(number)%2)==0:
    print("The number " + str(number) + " is an even number")               #The number is an even 
else:
    print("The number " + str(number) + " is an odd number")                #The number is an odd number