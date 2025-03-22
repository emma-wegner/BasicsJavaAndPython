'''
Created on Apr 29, 2022

@author: ewegner22
'''
class Player():
    def __init__(self,name):
        self.name=name
        self.hand=[]
    def addCard(self,card):
        self.hand.append(card)
    
    def showHand(self, dealer_start= True):
        print("\n{}".format(self.name))
        print("==============")
        for i in range(len(self.hand)):
            if self.name == "Dealer" and i == 0 and dealer_start:
                print(" - of - ")#hide first card
            else:
                card= self.hand[i]
                print( "{} of {} ".format(card[0], card[1]))
                
    def calcHand (self, dealer_start=True):
        total=0
        aces=0
        card_values = {1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7,8:8,9:9,10:10, "J":10, "Q":10, "K":10, "A":11}
        if self.name == "Dealer" and dealer_start:
            card= self.hand[1]
            return card_values[card[0]]
        for card in self.hand:
            if card[0]=="A":
                aces+=1
            else:
                total += card_values[card[0]]
        for i in range(aces):
            if total +11 >21:
                total+=1
            else:
                total +=11
                return total
            