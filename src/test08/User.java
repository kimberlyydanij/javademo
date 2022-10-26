package test08;

public class User {
	String id;
	String password;
	String name;
	int age;
	char gender;
	String phone;
	
	public User() {
	
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
	
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return (String.format("%6s %6s %4s %3d %2c %14s",id,password,name,age,gender,phone));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public  Object clone() {
		//User obj = new User(id,password,name,age,gender,phone);
		User obj = new User(getId(),getPassword(),getName(),getAge()
	             ,getGender(),getPhone());
		return obj; }
		
	//public boolean equals(Object obj) {
	//	int cnt=0;

	//	for(int i=0;i<users.length;i++)
			
	//	return false; }
//	}
	
	
} // end class
