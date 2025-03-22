
public static Bicycle[] getChoices(int n, String type, boolean assembled)
{
	int num=0;
	Bicycle[] bikes= new Bicycle[n];
	for (int i=0; i<bicycleList.size()&&num<n;i++)
	{
		if (bicycleList.get(i).getType().equals(type)&&
				bicycleList.get(i).isAssembled==assembled)
		{
			bikes[n]=bicycleList.get(i);
			n++
		}
	}
	return bikes;
}

public BicyclechooseOne(int n, String type, boolean assembled)
{
	Bicycle bikes[]=getChoices(int n, String type, boolean assembled);
     int bike=Math.random()*n;
     return bikes[bike];
}

I would change the Bicycle class and Bicycle wheel class by adding
a wheel size int variable and public int getWheelSize() method to Bicycle.
I would also change the Bicycle constructor to add wheel size.
Finally I would use the information from getWheelSize method in Bicycle to implement
the method get Bicycle by wheelSize in Bicycle Inventory which header
would by public Bicycle [] getBicycleByWheelSize(int n, String type, boolean assembled, int wheelSize)

