#Import pandas
import pandas as pd

#Reading data from excel and storing in dataframe
dataframe= pd.read_excel('excelFile.xlsx')

#Printing number of rows and columns 
print(dataframe.shape)

#Printing Values in Email
print(dataframe["Email"])

#Sorting data based on FirstName
#Printing after sorting
print(dataframe.sort_values("FirstName", ascending=True))

