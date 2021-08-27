#Write a program that asks the user to enter their name and their age.
#Print out a message addressed to them that tells them the year that they will turn 100 years old.
from datetime import date
name=input("My name is ")                                           #Asking user to enter their name and their age
age=input("My age is ")
currentYear = date.today()
year= int(currentYear.year)
print("I will be 100 years old in " + str(year-int(age)+100))       #Printing the year when user will be 100 years old            