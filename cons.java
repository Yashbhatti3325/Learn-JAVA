//THIS

package Tuition_Test_Unit_3;

public class All {
	int a = 10;
	void A1()
	{
		System.out.println("this is for value a1 = " + this.a);
	}
	void A2(int a)
	{
		this.A1();
		this.a = a;
		System.out.println("this is for value a2 = " + this.a);		
	}
	public static void main(String[]args)
	{
		All x = new All();
		x.A2(5);
	}
}


//STATIC VARIABLE
//package Tuition_Test_Unit_3;
//
//public class All {
//	static int a = 0;
//	void display()
//	{
//		a++;
//		System.out.println(a);
//	}
//	public static void main(String[]args)
//	{
//		All x = new All();
//		All y = new All();
//		All z = new All();
//		x.display();
//		y.display();
//		z.display();
//	}
//}




//STATIC METHOD
//package Tuition_Test_Unit_3;
//public class All {
//	static int a = 20;
//	void f()
//	{
//		System.out.println("this is method f " + (a = a+ 30));
//	}
//	static void f2()
//	{
//		System.out.println("this is method f2 " + a);
//	}
//	public static void main(String[]args)
//	{
//		All a = new All();
//		a.f();
//		All.f2();
//	}
//}



//STATIC BLOCK

//package Tuition_Test_Unit_3;
//public class All {
//	void display()
//	{
//		System.out.println("this is display block");
//	}
//	static
//	{
//		System.out.println("this is static block");
//	}
//	public static void main(String[]args)
//	{
//		All a = new All();
//		a.display();
//	}
//}


//FINAL

//package Tuition_Test_Unit_3;
//class Aaa{
//	final int a =2;
//	final void update()
//	{
//    System.out.println( a = a+2);	//can't update the value of a because that variable is FINAL.
//		System.out.println( a+2);
//	}
//}	
//class Baa extends Aaa{
//  void update()	//if the method will be update() then it will show the error of final method 
//	void updates()
//	{
//		System.out.println( this.a);
//	}
//}
//public class All {
//	public static void main(String[]args)
//	{
//		Baa b = new Baa();
//		b.update();
//		b.updates();
//	}
//}

//CONSTRUCTOR 

//DEFAULT 
//package Tuition_Test_Unit_3;
//
//public class All {
//	int a = 5;
//	All()
//	{
//		System.out.println("this is default constructor : " + a);
//	}
//	All(int a)
//	{
//		this.a = a;
//		System.out.println("this is parameterized constructor :" + a);// Parameterized 
//	}
//	All(All p)
//	{
//		a = p.a;
//		System.out.println("this is copy constructor " + a);
//	}
//	public static void main(String[]args)
//	{
//		All a = new All();
//		All b = new All(50);
//		All c = new All(b);
//	}
//}


//package Tuition_Test_Unit_3;
//
//public class All {
//	int l;
//	All(int i)
//	{
//		l=i;
//	}
//	boolean er(All x)
//	{
//		if(l==x.l)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//	public static void main(String[]args)
//	{
//		All z = new All(9);
//		All z1 = new All(9);
//		All z2 = new All(10);
//		All z3 = new All(10);
//		System.out.print("a==b:" + z2.er(z3));
//	}
//}
