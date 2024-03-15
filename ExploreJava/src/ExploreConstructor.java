
public class ExploreConstructor {

	public static void main(String[] args) {
		User syam = new User();
		syam.setId(146);
		syam.setName("Syam Kakumani");
		
		User giri = new User(121, "Girish");
		
	}
}

class User {
	int id;
	String name;
	
	
	

	public User() {
		super();

	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}