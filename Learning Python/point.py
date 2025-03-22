'''
Created on Apr 13, 2022

@author: ewegner22
''' 
class point:
    ''' Represent a point in a Euclidean plane '''
    def __init__(self, x_coor, y_coor):      
        self.x = x_coor
        self.y = y_coor
    def coordinates(self):
        ''' Return a tuple of the x,y coordinates of a point '''
        return (self.x, self.y)
    def move_to(self, x_coor, y_coor):
        ''' Assign new coordinates to a point '''
        self.x = x_coor
        self.y = y_coor
    '''calculate distance between current point and another point'''
    def distance_to(self, x_coor, y_coor):
        return(((self.x-x_coor)**2+(self.y-y_coor)**2)**0.5)
    '''moves a point relative to it's current location'''
    def move(self, x_coor, y_coor):
        self.x+=x_coor
        self.y+=y_coor
    def getX (self):
        return self.x
    def getY (self):
        return self.y



    
