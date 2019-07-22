package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserServiceImpl implements UserDao {

	@Autowired
	UserDao userdao;

	@PostMapping(value="/addUser")
	public void addUser(@RequestBody UserDetails user){
		 userdao.addUser(user);
	}


	@Override
	public List<UserDetails> getAllusers() {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	
}
