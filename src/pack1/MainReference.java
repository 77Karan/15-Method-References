package pack1;


public class MainReference 
{
	public static void main(String[] args) 
	{
		//Lambda implementation
		MyInterface mi = () -> System.out.println("Providing imp to m1() method in MyInterface");
		mi.m1();
		
		
		//Static Method reference
		MyInterface mi2 = Demo1::m2;
		mi2.m1();
		
		//NonStatic Method reference
		Demo1 d1 = new Demo1();
		MyInterface mi3 = d1::m3;
		mi3.m1();
		
	}

}
