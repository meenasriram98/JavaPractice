package assignment2.services;

import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.*;

import assignment2.Group;
import assignment2.GroupRepository;
import assignment2.User;
import assignment2.UserRepository;

public class GroupServiceTest {
	//GroupService groupService=new GroupService();
	GroupRepository grouprepository=GroupRepository.getInstance();
	UserRepository usersrepository=UserRepository.getInstance();
	Group g=new Group("g",12);
	Group gr=new Group("gsd",14);
	
	@Test
	public void testCreateGroup() {
		System.out.println(gr.getName());
		assertEquals("gsd",gr.getName());
	}

	@Test
	public void testAddGroup() {
		grouprepository.addGroup(g);
		grouprepository.addGroup(gr);
		assertEquals(2,grouprepository.getSize());
	}
	
	@Test
	public void testRemoveGroup() {
		grouprepository.removeGroup(g.getName());
		assertEquals(0,grouprepository.getSize());
	}
	
	public void testRemoveGroup1() {
		grouprepository.removeGroup("sdkfhu");
		assertEquals(2,grouprepository.getSize());
	}

	@Test
	public void testAddGroupToGroup() {
		Group gr=new Group("g4",19);
		Group g=new Group("g5",3);
		
		grouprepository.addGroup(gr);
		grouprepository.addGroup(g);
		
		g.getJoinedGroups().add(grouprepository.getGroupObject(gr.getName()));
		grouprepository.updateRepository(g);
		Group group=grouprepository.getGroupObject(g.getName());
		assertEquals(true,group.getJoinedGroups().contains(gr));
	}

	@Test
	public void testGroupPresent() {
		Group gr=new Group("g2",13);
		grouprepository.addGroup(gr);
		assertTrue(grouprepository.getGroup("g2"));
	}
	
	@Test
	public void testGroupPresent2() {
		assertFalse(grouprepository.getGroup("meena"));
	}




}
