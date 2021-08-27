#Write a function sum() such that it can accept a list of elements and print the sum of all elements
def sum(numbers):                           #sum() function accept a list of elements and adds them
    sum=0
    for number in numbers:
        sum=sum+number
    return sum
print(sum([10,11,12]))                      #Printing sum of all the elements in the list