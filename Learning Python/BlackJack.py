'''
Created on Apr 29, 2022

@author: ewegner22
'''
from random import randint
from Player import Player

class BlackJack():
    def _init_(self):
        self.deck = []
        self.suits = ("Spades", "Hearts", "Diamonds", "Clubs")
        self.values = (2,3,4,5,6,7,8,9,10,"J","Q","K","A")
    def makeDeck(self):
        for suit in self.suits:
            for value in self.values:
                self.deck.append( (value,suit) )
    def pullCard(self):
        return self.deck.pop(randint(0,len(self.deck)-1))
    
game = BlackJack()
game.makeDeck()
#print(game.pullCard())
name= input("What is your name?")
player= Player(name)
dealer= Player("Dealer")
#print(player.name, dealer.name)
#add 2 cards to the dealer and player hand
for i in range(2):
    player.addCard(game.pullCard())
    dealer.addCard(game.pullCard())
#print("Player Hand : {} \nDealer Hand {}".format(player.hand,dealer.hand))
player.showHand()
dealer.showHand()
print(player.calcHand())
print(dealer.calcHand())
    