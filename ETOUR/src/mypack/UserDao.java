package mypack;

import java.util.List;

import org.springframework.stereotype.Component;



@Component
public interface UserDao {

	public void addUser(UserDetails user);
	public List<UserDetails> getAllusers();
}
