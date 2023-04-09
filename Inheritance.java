class Person
{
	int eyes;
	int ears;
	int hands;
	int legs;
	String name;
	
	void eat()
	{
	}
	void sleep()
	{
	}
	
}
class Student extends Person
{
	int Sno;
	String SName;
	double fee;
	
	
	void listen() {
		System.out.println(name +"is listening"+ the course);
		}
	void read() {
		 System.out.println(name +"is reading"+ the course);
	}
    void write() {
		  System.out.println(name +"is writing"+ the course);
}
    public void display()
    {
    	System.out.println("eyes\t\t:"+ eyes);
    	System.out.println("ears\t\t:"+ ears);
    	System.out.println("hands\t\t:"+ hands);
    	System.out.println("legs\t\t:"+ legs);
    	System.out.println("name\t\t:"+ name);
    	System.out.println("fee\t\t:"+ fee);
    	System.out.println("Sname\t\t:"+ Sname);
    	System.out.println("Sno\t\t:"+ Sno);
    }
    class college
    {
    	public static void main(Stirng args[]) {
    		Student S1=new Student();
    		S1.display();
    		
    		S1.eyes=2;
    		S1.ears=2;
    		S1.hands=2;
    		S1.legs=2;
    		S1.name='Siva';
    		S1.fee=2500;
    		S1.Sname='Sai';
    		S1.Sno=101;
    		S1.display();
    	}
    }