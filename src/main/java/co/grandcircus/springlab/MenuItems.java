package co.grandcircus.springlab;

public class MenuItems {
	private Long id;
	private String name;
	private Double price;
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MenuItems()
	{
		
	}
	public MenuItems(String name,String description,Double price)
	{
	     super();
		this.name=name;
		this.description=description;
		this.price=price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
    public String toString() {
		return "Name :"+ name + "Description:"+description +"Price" +price;
	}
	
	

}



