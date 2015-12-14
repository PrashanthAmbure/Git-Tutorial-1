class Person{

	private String firstName;

	Person(String firstName){
		this.firstName = firstName;
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
