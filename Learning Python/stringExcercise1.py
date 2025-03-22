'''
Created on Apr 4, 2022
@author: ewegner22
'''
x=input()
y=x.split(' ')
firstLetter=''
vowelWords=''
for word in y:
 firstLetter=word[0]
 if firstLetter=='a' or firstLetter=='e' or firstLetter=='i' or firstLetter=='o' or firstLetter=='u' or firstLetter=='A' or firstLetter=='E' or firstLetter=='I' or firstLetter=='O' or firstLetter=='U':
  vowelWords=vowelWords+word+" "

print(vowelWords)