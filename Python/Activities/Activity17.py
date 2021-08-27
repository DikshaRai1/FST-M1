#import Pandas
import pandas as pd

#Copy data into a dictionary
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

#Convert dictionary to a dataframe
dataframe = pd.DataFrame(data)

#Write data to csv file
dataframe.to_csv('csvFile.csv', index=False)