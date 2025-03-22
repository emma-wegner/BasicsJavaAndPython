'''
Created on Apr 8, 2022

@author: ewegner22
'''


def initialDic(phrase):
 words=phrase.split(' ')
 d= {}
 for i in words:
  firstLetter=i[0].lower()
  d[firstLetter] = i
 print(d)
  
print(initialDic('What Does this actually work?'))
    