package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Catagory {

	
	public Catagory()
	{
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(name="cat_id")
	private String cat_id;
	
	@Column(name="subcat_id")
	private String subcat_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image")
	private String image;
	
	@Column(name="flag")
	private String flag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCat_id() {
		return cat_id;
	}

	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}

	public String getSubcat_id() {
		return subcat_id;
	}

	public void setSubcat_id(String subcat_id) {
		this.subcat_id = subcat_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Catagory [id=" + id + ", cat_id=" + cat_id + ", subcat_id=" + subcat_id + ", name=" + name + ", image="
				+ image + ", flag=" + flag + "]";
	}
	
	
}
