package assignment2.testCases;

import static org.junit.Assert.*;

import org.junit.*;

import assignment2.classes.User;
import assignment2.repositories.UserRepository;

public class UserServiceTest {
	
	UserRepository usersrepository=UserRepository.getInstance();
	User user=new User("u1",1);
	
	@Test
	public void testSaveUser() {
		usersrepository.addUser(user);
		assertEquals(1,usersrepository.getSize());
		
	}

	@Test
	public void testUserPresent() {
		assertEquals(user.getName(),usersrepository.getUserObject("u1").getName());
	}

	@Test
	public void testRemoveUser() {
		usersrepository.removeUser("u1");
		assertEquals(0,usersrepository.userData.size());
	}

}
