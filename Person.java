class Person{

	private String firstName;
	private int age;

	Person(String firstName, int age){
		this.firstName = firstName;
		this.age = age;
	}

	public void setFirstName(String firstName) throws IllegalArgumentException{
		if(StringUtils.isEmpty(firstName))
			throw new IllegalArgumentException("First name can't be blank.");
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}
}
