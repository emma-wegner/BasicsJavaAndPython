'''
Created on Apr 13, 2022

@author: ewegner22
'''
import point
center = point.point(0,0)
point_a = point.point(1,1)
print(center.distance_to(point_a.getX(),point_a.getY()))
point_a.move(5,3)
print(point_a.coordinates())


