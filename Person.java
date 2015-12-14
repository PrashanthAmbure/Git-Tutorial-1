class Person{

	private String firstName;
	private int age;

	Person(String firstName, int age){
		this.firstName = firstName;
		this.age = age;
	}

	public void setFirstName(String firstName){
		if(null !=firstName || !"".equals(firstName))
			this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}
}
