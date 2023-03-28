package com.chalapathi;

public class Topic 
{
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Topic(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}
	public Topic() 
	{
		System.out.println("This is default constructor");
	}

	private Integer id;
	private String name;
	private String Description;
	
	
	

}
