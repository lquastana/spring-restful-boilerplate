package fr.lq.lab.api.versioning;

public class PersonV1 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public PersonV1() {
		
	}

	public PersonV1(String name) {
		super();
		this.name = name;
	}
	
	

}
