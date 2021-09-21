package Lab6.Lab6Q2;

public class TestMedcine 
{
	public static void main(String[] args)
	{
		Medicne m[] = new Medicne[10];
		double i = Math.random()*4;
		int j = (int) i;
		System.out.println(j);



switch(j)
{
case 1: m[0] = new Medicne();
m[1] = new Tablet();
m[0].displayLabel();
m[1].displayLabel();
break;

case 2: m[2] = new Medicne();
m[3] = new Syrup();
m[2].displayLabel();
m[3].displayLabel();
break;
case 3: m[4] = new Medicne();
m[5] = new Ointment();
m[4].displayLabel();
m[5].displayLabel();
break;
default: 
	System.out.println("Invalid Choice");
	}
}
}
