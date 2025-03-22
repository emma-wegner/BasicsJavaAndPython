import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Integer> oldList = new ArrayList();

		oldList.add(100);

		oldList.add(200);

		oldList.add(300);

		oldList.add(400);

		ArrayList<Integer> newList = new ArrayList();

		newList.add(oldList.remove(1));

		newList.add(oldList.get(2));

		System.out.println(newList);

	}

}
