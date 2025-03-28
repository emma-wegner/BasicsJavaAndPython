'''
Created on Apr 25, 2022

@author: ewegner22
'''
# Tic Tac Toe
import random
playerLetter=' '
def drawBoard(board):
# This function prints out the board that it was passed.
# "board" is a list of 10 strings representing the board (ignore index 0)
   print('   |   |')
   print(' ' + board[7] + ' | ' + board[8] + ' | ' + board[9])
   print('   |   |')
   print('-----------')
   print('   |   |')
   print(' ' + board[4] + ' | ' + board[5] + ' | ' + board[6])
   print('   |   |')
   print('-----------')
   print('   |   |')
   print(' ' + board[1] + ' | ' + board[2] + ' | ' + board[3])
   print('   |   |')

def inputPlayerLetter():
# Lets the player type which letter they want to be.
   letter = ''
   while not (letter == 'X' or letter == 'O'):
       print('Do you want to be X or O?')
       letter=input().upper()
       #make sure you use quotes when entering the letter on your keybpard

       #the first element in the list is the player's letter, the second is the computer's letter.

   if letter == 'X':
       return ['X', 'O']
   else:
       return ['O', 'X']

def whoGoesFirst():
# Randomly choose the player who goes first.
   if random.randint(0, 1) == 0:
       return 'computer'
   else:
       return 'player'

def playAgain():
  # This function returns True if the player wants to play again, otherwise it returns False.
   print('Do you want to play again? (yes or no)')
   return input().lower().startswith('y')

def makeMove(board, letter, move):
    board[move] = letter

def isWinner(bo, le):
# Given a board and a player's letter, this funciton returns True if that player has won.
# bo for board and le for letter
   return ((bo[7] == le and bo[8] == le and bo[9] == le) or # across the top
   (bo[4] == le and bo[5] == le and bo[6] == le) or # across the middle
   (bo[1] == le and bo[2] == le and bo[3] == le) or # across the bottom
   (bo[7] == le and bo[4] == le and bo[1] == le) or # down the left side
   (bo[8] == le and bo[5] == le and bo[2] == le) or # down the middle
   (bo[9] == le and bo[6] == le and bo[3] == le) or # down the right side
   (bo[7] == le and bo[5] == le and bo[3] == le) or # diagonal
   (bo[9] == le and bo[5] == le and bo[1] == le)) # diagonal


def getBoardCopy(board):
# Make a duplicate of the board list and return it the duplicate.
   dupeBoard = []

   for i in board:
       dupeBoard.append(i)

   return dupeBoard


def isSpaceFree(board, move):
# Return true if the passed move is free on the passed board.

   return board[move] == ' '

def getPlayerMove(board):
# Let the player type in their move.
# must put numbers in quotes when entering
   move = ' '
   while move not in '1 2 3 4 5 6 7 8 9'.split() or not isSpaceFree(board, int(move)):
       print('What is your next move? (1-9)')
       move = input()
   return int(move)

'''now planned'''
def chooseRandomMoveFromList(board, movesList):
# Returns a valid move from the passed list on the passed board.
# Returns None if there is no valid move.
   possibleMoves = []
   playerMoves = []
   nonRandomMove= 0
   for i in movesList:
       if isSpaceFree(board, i):
         possibleMoves.append(i)
       if board[i]==playerLetter:
           playerMoves.append(i)
   nonRandomMove=plannedMoveAcross(board, playerMoves)
   if(nonRandomMove!=0):
       return nonRandomMove
   nonRandomMove=plannedMoveDown(board, playerMoves)
   if(nonRandomMove!=0):
       return nonRandomMove
   nonRandomMove=plannedDiagnol(board, playerMoves)
   print(nonRandomMove)
   if(nonRandomMove!=0):
       return nonRandomMove
   if len(possibleMoves) != 0:
       return random.choice(possibleMoves)
   else:
       return None

def plannedMoveAcross(board, playerMoves):
     #plays last one across if others taken ex: x x _
   for x in range(1,9,3):      
    if playerMoves.__contains__(x) and playerMoves.__contains__(x+1):
        if isSpaceFree(board, x+2):
            return x+2
        #plays middle across if others taken ex: x_x
   for a in range (1,9,3):
    if playerMoves.__contains__(a) and playerMoves.__contains__(a+2):
        if isSpaceFree(board, a+1):
            return a+1    
        #plays first across if others taken ex: _xx
   for b in range (2,9,3):
    if playerMoves.__contains__(b) and playerMoves.__contains__(b+1):
        if isSpaceFree(board, b-1):
            return b-1
   return 0 

def plannedMoveDown(board, playerMoves):
    
   for x in range(1,4):      
    if playerMoves.__contains__(x) and playerMoves.__contains__(x+3):
        if isSpaceFree(board, x+6):
            return x+6
      
   for a in range (1,4):
    if playerMoves.__contains__(a) and playerMoves.__contains__(a+6):
        if isSpaceFree(board, a+3):
            return a+3    
       
   for b in range (4,7):
    if playerMoves.__contains__(b) and playerMoves.__contains__(b+3):
        if isSpaceFree(board, b-3):
            return b-3
   return 0 

def plannedDiagnol(board, playerMoves):
   
   #middle x     
   if playerMoves.__contains__(1) and playerMoves.__contains__(9):
        if isSpaceFree(board, 5):
            return 5
   if playerMoves.__contains__(3) and playerMoves.__contains__(7):
        if isSpaceFree(board, 5):
            return 5
   #top x 
   if playerMoves.__contains__(1) and playerMoves.__contains__(5):
        if isSpaceFree(board, 9):
            return 9
   if playerMoves.__contains__(3) and playerMoves.__contains__(5):
        if isSpaceFree(board, 7):
            return 7    
   #bottom x 
   if playerMoves.__contains__(9) and playerMoves.__contains__(5):
        if isSpaceFree(board, 1):
            return 1
   if playerMoves.__contains__(7) and playerMoves.__contains__(5):
        if isSpaceFree(board, 3):
            return 3    
   return 0 

def getComputerMove(board, computerLetter):
    # Given a board and the computer's letter, determine where to move and return that move.
   if computerLetter == 'X':
       playerLetter = 'O'
   else:
       playerLetter = 'X'


   return chooseRandomMoveFromList(board, [1, 2, 3, 4, 5, 6, 7, 8, 9])

def isBoardFull(board):
   # Return True if every space on the board has been taken. Otherwise return False.
   for i in range(1, 10):
       if isSpaceFree(board, i):
           return False
   return True

print('Welcome to Tic Tac Toe!')

while True:

# Reset the board
   theBoard = [' '] * 10
   playerLetter, computerLetter = inputPlayerLetter()
   turn = whoGoesFirst()
   print('The ' + turn + ' will go first.')
   gameIsPlaying = True

   while gameIsPlaying:

       if turn == 'player':
       #Player's turn
           drawBoard(theBoard)
           move = getPlayerMove(theBoard)
           makeMove(theBoard, playerLetter, move)

           if isWinner(theBoard, playerLetter):
               drawBoard(theBoard)
               print('Hooray! You have won the game!')
               gameIsPlaying = False
           else:
               if isBoardFull(theBoard):
                   drawBoard(theBoard)
                   print('The game is a tie!')
                   break
               else:
                   turn = 'computer'
       else:
           #Computer's turn
           move = getComputerMove(theBoard, computerLetter)
           makeMove(theBoard, computerLetter, move)

           if isWinner(theBoard, computerLetter):
               drawBoard(theBoard)
               print('The computer has beaten you! You lose.')
               gameIsPlaying = False
           else:
               if isBoardFull(theBoard):
                   drawBoard(theBoard)
                   print('The game is a tie!')
                   break
               else:
                   turn = 'player'



   if not playAgain():
       break