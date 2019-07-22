package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;




@Component
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate template;
	
	
	@Override
	public void addUser(UserDetails user) {
		// TODO Auto-generated method stub
		 template.save(user);
	}

	@Override
	public List<UserDetails> getAllusers() {
		// TODO Auto-generated method stub
		
		List<UserDetails> list=(List<UserDetails>) template.find("from UserDetails");
		
		return list;
	}



}
