import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment1.Convert;
import assignment1.Level;
import assignment2.services.MenuService;

public class MainClass {
	
	public static void main(String[] args)
	{
		
		//assignment1
		
//		List<Level> list=new ArrayList<Level>();
//
//		Scanner sc=new Scanner(System.in);
//		
//		list.add(new Level(1,-1));
//		list.add(new Level(11,1));
//		list.add(new Level(21,2));
//		list.add(new Level(22,2));
//		list.add(new Level(2,-1));
//		list.add(new Level(331,31));
//		list.add(new Level(31,3));
//		list.add(new Level(3,-1));
//		list.add(new Level(4,-1));
//		list.add(new Level(48,4));
//		list.add(new Level(488,48));
//		list.add(new Level(98,488));
//	
//		Convert convert=new Convert();
//		convert.convertListToMap(list);
		
		//assignment2
		MenuService menu=new MenuService();
		menu.printMenu();
		menu.processMenu();
		
	}
	

	
	
	
	
	
}
