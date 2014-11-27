package photobomb;

import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
	List<User> user;
	Date d = null;
	Blob b = null;
	public UserDaoImpl(){
	user = new ArrayList<User>();
	User user1 = new User("Username","Surname","forename","Email","password","gender","FrozenAccount",1,0,d,b);
	user.add(user1);
	}
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public User getUsers(int userid) {
		// TODO Auto-generated method stub
		return user.get(userid);
	}

	@Override
	public void updateUsers(User u) {
		// TODO Auto-generated method stub
		user.get(u.getUserId()).setUsername(u.getUsername());
	      System.out.println("User: UserID" + u.getUserId() 
	         +", updated in the database");
	}

	@Override
	public void deleteUers(User u) {
		// TODO Auto-generated method stub
		user.remove(u.getUserId());
	      System.out.println("User: UserID " + u.getUserId()
	         +", deleted from database");

	}

}
