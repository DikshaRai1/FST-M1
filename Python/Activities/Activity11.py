#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.
fruit_dictionary =	{
  "Apple": 120,
  "Mango": 200,
  "Orange": 50,
  "Guava": 50,
  "Kiwi": 200,
  "Malta": 500,
  "Dragonfruit": 300,
  "Lichi": 100
}
fruit = input("Enter a fruit name ")
if (fruit in fruit_dictionary):                                                 #Checking fruit is available or not
    print(fruit +" exists in the dictionary")
else:
    print(fruit +" doesn't exist in the dictionary")