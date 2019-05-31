
import java.io.*;public class Person
{
	private String name;
	private int age;
	
	//Constructor
	Person(String name, int age){
		this.name= name;
		this.age= age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getPerson(){
		return ("Name: " + name + "\nAge: " + age);
	}
}
