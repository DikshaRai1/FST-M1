#Write a Python program that throws a NameError.
try:
    print(assign())
except NameError:                                               #Using NameError to print error message
    print("assign method is not defined")