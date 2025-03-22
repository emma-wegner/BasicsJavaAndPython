'''
Created on Apr 8, 2022

@author: ewegner22
'''
inF = open("promisedLand.txt", "r")
outF = open("promisedLandStats.txt", "w")

def lineStats (infile, outfile):
    lines=infile.read()
    words=lines.split('\n')
    for line in words:
        if len(line)==0:
            
            outfile.write("0 0\n")
        else:
          
            outfile.write(str(line.count(" ")+1)+" "+str(len(line))+"\n")
    infile.close()
    outfile.close()
    outfile = open("promisedLandStats.txt", "r")
    print(outfile.read())
    outfile.close()
 
lineStats(inF, outF)