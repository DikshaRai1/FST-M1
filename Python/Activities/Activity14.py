#Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.
def fibonacci(number):                                                      #Fibonacci Function
    if number==0:
        return 0
    elif number==1:
        return 1
    else:
        return fibonacci(number-1)+fibonacci(number-2)

number=int(input("Enter number to generate Fibonacci series"))
for i in range(number+1):                                                   #Printing Fibonacci series
    print(fibonacci(i))
