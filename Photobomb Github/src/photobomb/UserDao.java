package photobomb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author David Roche
 */
public interface UserDao {
    public List<User> getAllUsers();
    public User getUsers(int userid);
    public void updateUsers(User user);
    public void deleteUers(User user);
}
