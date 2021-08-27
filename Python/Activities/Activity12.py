#Write a recursive function to calculate the sum of numbers from 0 to 10
def sum(number):
    if number>0:
        return number+sum(number-1)
    else:
        return 0
print(sum(10))                                                  #Calling recursive function sum(number) to calculate sum from 0 to 10
