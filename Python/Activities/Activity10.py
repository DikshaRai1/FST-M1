#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
#Bonus points if you can make the user enter their own tuple.
list1=[]
n=int(input("Enter number of elements in tuple "))                                  #Taking iput from user
i=0
print("Enter elements in the tuple ")
for i in range(0,n):
    element=int(input())
    list1.append(element)
numbers=tuple(list1)
print("Numbers in the tuple are: " +str(numbers))
print("Numbers divisible by 5 are: ")
for i in numbers:                                                                   #Printing numbers divisible by 5
    if (i%5==0):
        print(i)