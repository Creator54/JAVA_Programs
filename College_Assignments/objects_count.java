//Java program that counts the number of object created by using static variable

class obj{
	static int obj_count = 0;
	{
		obj_count +=1;
	}
	public obj(String s){
		System.out.println(s+" There!\t\t\t\t\t\t[from object_1]\n");
	}
	public obj(int a){
		System.out.println("This program counts the no. of objects created\t\t[from object_"+a+"]\n");
	}
	public obj(){
		System.out.println("by using static variable.\t\t\t\t[from object_3]\n");
	}
}
public class objects_count extends obj{
	public static void main(String args[]){
		System.out.print("\033[H\033[2J");  
		System.out.flush();
		obj o1 = new obj("Hello");
		obj o2 = new obj(2);
		obj o3 = new obj();
		System.out.println("Total objects created : "+obj.obj_count);
	}
}
