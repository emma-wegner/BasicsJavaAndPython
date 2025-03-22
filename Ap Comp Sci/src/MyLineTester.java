

public class MyLineTester {

	public static void main(String[] args) {
		
       Line l2=new Line(1,2);
       Line l3=new Line(1,-3);
        System.out.println("Intersects: " +l2.intersects(l3));
        System.out.println("Is Parallel: "+l2.isParallel(l3));
        System.out.println("Is equal: "+l2.equals(l3));
	}

}
