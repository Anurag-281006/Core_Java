//Constructor overloading
package proj2;

class ConsructorOverloading
{
	int id;
	String name;
	int age;
	
    ConsructorOverloading(int i,String n)
	{
		id =i;
		name=n;
	}
	 ConsructorOverloading (int i,String n,int a)
	 {
		 id=i;
		 name=n;
		 age=a;
	 }
	 
	 void display()
	 {
		 System.out.println(id+ ""+name+""+age);
	 }
	 
	 public static void main(String args[])
	 {
		 ConsructorOverloading c1=new ConsructorOverloading(111 ,"Anurag");
		 ConsructorOverloading c2 = new ConsructorOverloading(222,"edf",20);
		 c1.display();
		 c2.display();
	 }
}

