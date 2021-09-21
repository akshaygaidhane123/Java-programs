package lab5;

public class EmployeeInheritance {

	   String name;
	     int salary;
	     EmployeeInheritance()
	     {
	          name = null;
	          salary = 0;
	     }
	     EmployeeInheritance   (String name, int salary)
	     {
	          this.name = name;
	          this.salary = salary;
	     }
	     int getSalary()
	     {
	          return salary;
	     }
	}




class Manager extends    EmployeeInheritance
{
     int hra, ta;
     Manager()
     {
          super();
          hra = ta = 0;
     }
     Manager(String n, int sal, int h, int t)
     {
          super(n, sal);
          hra = h;
          ta = t;
     }
     int getSalary()
     {
          return (super.getSalary()+hra+ta);
     }
}




class EmployeeTest
{
     public static void main(String[] args)
     {
          Manager m1 = new Manager("Nikhil",20000,500,1500);
          System.out.println("Salary of Manager= "+m1.getSalary());
     }
}