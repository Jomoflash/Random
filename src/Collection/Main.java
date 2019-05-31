import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Person> person= new ArrayList<Person>();
		
		person.add( new Person("Emma",12));
		
		System.out.println(person.size());
		System.out.println(person);
		
		System.out.println(person.get(0).getPerson());
	}
}
