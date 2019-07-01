package assignment2.services;


import java.util.List;
import java.util.Scanner;

import assignment2.User;
import assignment2.UserRepository;

public class UserService {
	Scanner sc=new Scanner(System.in);
	UserRepository usersrepository=UserRepository.getInstance();
	GroupService groupservice=new GroupService();
	
	public void createUser()
	{
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		if(userPresent(name))
		{
			System.out.println("user already exists");
		}
		else
		{
			User user=new User(name,id);
			usersrepository.addUser(user);
			System.out.println("user added");
		}
		
		
	}
	
	public boolean userPresent(String name)
	{
		return usersrepository.getUser(name);
	}
	
	public void removeUser()
	{
		System.out.println("enter name of the user");
		String name=sc.nextLine();
		
		if(userPresent(name))
		{
			groupservice.removeUserFromAllGroups(name);
			usersrepository.removeUser(name);
			
		}
		else {
			System.out.println("user doesnt exist");
		}
	}
	
	public void removeGroupFromUser(String groupName)
	{
		List<User> users=usersrepository.listOfUsers();
		
		users.forEach(user->{user.getMemberList().removeIf(x->x.equalsIgnoreCase(groupName));
		usersrepository.updateRepository(user);});

	}
	
	public User getUserObject(String userName)
	{
		if(userPresent(userName))
		{
			return usersrepository.getUserObject(userName);
		}
		else
		{
			return null;
		}
	}
	

}
