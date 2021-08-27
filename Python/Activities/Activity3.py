#Welcome to Rock, Paper, Scissors game
# Rock beats scissors
#Scissors beats paper
#Paper beats rock
print("Welcome to the game")
Player1=input("Its Player1's turn: Enter your choice Rock/Paper/Scissors ")
Player2=input("Its Player1's turn: Enter your choice Rock/Paper/Scissors ")
if(Player1==Player2):
    print("Both win the game")
elif(Player1=="Rock" and Player2=="Scissors"):
    print("Player1 wins the game")
elif(Player2=="Rock" and Player1=="Paper"):
    print("Player1 wins the game")
elif(Player1=="Scissors" and Player2=="Paper"):
    print("Player1 wins the game")
elif(Player2=="Rock" and Player1=="Scissors"):
    print("Player2 wins the game")
elif(Player1=="Rock" and Player2=="Paper"):
    print("Player2 wins the game")
elif(Player2=="Scissors" and Player1=="Paper"):
    print("Player2 wins the game")
else:
    print("Wrong Input! Enter valid choice")
    
    