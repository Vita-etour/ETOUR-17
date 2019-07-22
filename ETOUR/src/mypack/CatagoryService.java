package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CatagoryService {

	@Autowired
	Catagorydao catdao;
	
	@PostMapping(value = "/Catagory")
	public void addCatagory(@RequestBody Catagory catagory)
	{
		//((CatagoryService) catdao).addCatagory(catagory);
		catdao.addCatagory(catagory);
	}
}
