package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class Catagorydaoimpl implements Catagorydao {

	@Autowired
	HibernateTemplate template;

	@Override
	public void addCatagory(Catagory cat) {
		// TODO Auto-generated method stub
		template.save(cat);
	}



	
	
}
