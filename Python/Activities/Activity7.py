#Write a Python program to calculate the sum of all the elements in a list.
#Bonus points if you can make the user enter their own list.
list1=[]
n=int(input("Enter number of elements in list"))
i=0
sum=0
print("Enter elements in the list")
for i in range(0,n):
    element=int(input())
    list1.append(element)
print(list1)
for element in list1:                                               #Calculating the sum of all the elements in a list
  sum += int(element)
print(sum)