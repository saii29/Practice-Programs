package javatut.practice;

public class Car {
	
	private String name;
	private int id;
	
	public Car(int i, String string) {
		this.id = i;
		this.name = string;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return this.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Car){
			System.out.println(Integer.valueOf(((Car)obj).getId()).equals(this.id));
			return Integer.valueOf(((Car)obj).getId()).equals(this.id);
		}
		return false;
	}
	
	
	
}
