package photobomb;

public class UserDaoImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();

	      //print all students
	      for (User user : userDao.getAllUsers()) {
	         System.out.println("Student: [RollNo : "
	            +user.getUserId()+", Name : "+user.getUsername()+" ]");
	      }


	      //update student
	      User user =userDao.getAllUsers().get(0);
	      user.setUsername("Michael");
	      userDao.updateUsers(user);

	      //get the student
	      userDao.getUsers(0);
	      System.out.println("User: [UserID : "
	         +user.getUserId()+", UserName : "+user.getUsername()+" ]");
	}

}
