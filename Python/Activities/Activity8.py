#Given a list of numbers, return True if first and last number of a list is same.
#Bonus points if you can make the user enter their own list.
list1=[]
n=int(input("Enter number of elements in list"))
i=0
sum=0
print("Enter elements in the list")
for i in range(0,n):
    element=int(input())
    list1.append(element)
print("Entered list: " +str(list1))
if (list1[0]==list1[-1]):                                               #Checking if first and last number of a list is same
    print(True)
else:
    print(False)