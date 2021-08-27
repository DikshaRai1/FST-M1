# Import pandas
import pandas as pd

#Read from csv file and store data in dataframe
dataframe=pd.read_csv('csvFile.csv')

#Print Usernames 
print(dataframe["Usernames"])

#Print 2nd row of Usernames and Passwords
print(dataframe["Usernames"][1])
print(dataframe["Passwords"][1])

#Sort Usernames
#Print Usernames after sorting
print(dataframe.sort_values("Usernames"))

#Sort Passwords in descending order
#Print passwords after sorting
print(dataframe.sort_values("Passwords", ascending=False))