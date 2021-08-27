#Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.
list1=[1,2,3,4]
list2=[6,7,8,9]
list3=[]
for number in list1:                                       #Adding odd numbers from list1 to list3
    if (number%2)!=0 :
        list3.append(number)
for number in list2:
    if (number%2)==0 :                                     #Adding even numbers to list3 from list2 
        list3.append(number)
print(list3)                                               #Printing list3