
public class AnimalTester {

	public static void main(String[] args) {
	  Animal a= new Animal();
	  Dog d=new Dog ("Darel","Salmon");
	  System.out.println(d.getName());
	  a.print();
	  d.print();
     Poodle p=new Poodle();
     p.makeNoise();
	}

}
