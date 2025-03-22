import java.io.IOException;
import java.util.Random;

import bridges.validation.RateLimitException;

import bridges.connect.Bridges;
import bridges.base.GraphAdjList;

public class ChaosGame {
    public static void main(String[] args) throws IOException, RateLimitException {
        //create a new bridges project
        //remember to fill in your own assignment number, username, and api key
        Bridges bridges = new Bridges(7, "ewegner22", "732737780094");

        //set project title and description
        bridges.setTitle("Chaos Game");
        bridges.setDescription("Sierpinski Triangle");

        //create a chaos game of size 600 and generate 1000 points
        ChaosGame chaos = new ChaosGame(600);
        GraphAdjList<Integer, Void, Void> graph = chaos.createGraph(1000);

        //draw points on canvas
        bridges.setDataStructure(graph);
        bridges.visualize();
    }

    //create a record class called 'Point'
    //it should have two fields: 'x' and 'y', both of type 'double'
    //YOUR CODE HERE:
    public class Point
    {
    	    private double x;
    	    private double y;

    	    public Point(double x, double y) 
    	    {
    	        this.x = x;
    	        this.y = y;
    	    }
    	    
    	    public double getX() {
    	        return x;
    	    }

    	    public double getY() {
    	        return y;
    	    }

    }

    //width and height of triangle
    private double width;
    private double height;

    //vertices of triangle
    private Point[] vertices;

    //constructor
    private ChaosGame(double size) {
        //Initialize the instance variables 'width' and 'height'
        //use the proportions of an equilateral triangle
        //YOUR CODE HERE:
         double width=size;
         double height=size*Math.sqrt(3/2);
        //Initialize the array 'vertices' with three Point objects
        //the bottom-left vertex should be at (0, 0)
        //YOUR CODE HERE:
         Point one=new Point (0.0,0.0);
         Point two=new Point (width,0.0);
         Point three=new Point (width/2,height);
         vertices= new Point[] {one,two,three};
    }

    //create a bridges graph so that the program can be visualized
    private GraphAdjList<Integer, Void, Void> createGraph(int numPoints) {
        //generate an array of Point objects
        Point[] points = createPoints(numPoints);

        //create an empty graph
        GraphAdjList<Integer, Void, Void> graph = new GraphAdjList<>();

        //add 'numPoints' nodes to the graph
        //set the location of each node to the same x and y as the corresponding Point object
        //YOUR CODE HERE:
        for (int i=0; i<numPoints;i++)
        {
        	graph.addVertex(i, null);
        	graph.getVertex(i).setLocation(points[i].getX(), points[i].getY());
            

        	
        }
        return graph;
    }

    //create a chaos game with the given number of points
    private Point[] createPoints(int numPoints) {
        //create an empty array
        Point[] points = new Point[numPoints];
        
        //set the first element of the array to a new Point object
        //the x should be a random number between 0 and the width of the triangle
        //the y should be a random number between 0 and the height of the triangle
        //YOUR CODE HERE:
        Random generator=new Random();
        double pointX= generator.nextDouble()*width;
        double pointY=generator.nextDouble()*height;
    	points[0]=new Point(pointX,pointY);
        //create the rest of the points using the 'move' method
        //YOUR CODE HERE:
        for (int i=1;i<points.length;i++)
        {
        	points[i]=move(points[i-1]);
        }
        return points;
    }

    //calculate the midpoint of the given point and a random vertex
    private Point move(Point p) {
        //YOUR CODE HERE: 
    	double x=p.getX();
    	double y=p.getY();
    	Random generator=new Random();
    	int which=generator.nextInt(3);
    	Point vertex=vertices[which];
    	return (new Point ((x+vertex.getX())/2,(y+vertex.getY())/2));
    }
}