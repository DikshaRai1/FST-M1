#Write a Python program to create the multiplication table (from 1 to 10) of a number.
number=input("Enter to number to get multiplication table ")
for i in range(1,11):
    print(number + " X " + str(i) + " = " +str(int(number)*i))