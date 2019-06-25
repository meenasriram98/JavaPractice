import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args)
	{
		
		List<Level> list=new ArrayList<Level>();

		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.enter values into list  2. covert into map ");
			int input=sc.nextInt();
			switch(input)
			{
			case 1:
			{
				System.out.println("enter id and parentid");
				int id=sc.nextInt();
				int parentid=sc.nextInt();
				list.add(new Level(id,parentid));
				break;
			}
			case 2:
			{
				Convert convert=new Convert();
				convert.convertListToMap(list);
				break;
			}
			}
		}
		
	
		
	}
	

	
	
	
	
	
}
