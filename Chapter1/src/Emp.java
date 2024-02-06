class Database{
	String name;
	int id;
	double salary;
	String addresss;
	
	
		
		public String toString() 
		{
			return "Database [name=" + name + ", id=" + id + ", salary=" + salary + ", addresss=" + addresss + "]";
		}

		public void displayinfo()
		{
			System.out.println("[name=" + name + ", id=" + id + ", salary=" + salary + ", addresss=" + addresss + "]");
		}

		public Database(String name, int id, double salary, String addresss) {
			super();
			this.name = name;
			this.id = id;
			this.salary = salary;
			this.addresss = addresss;
		}
	}

	

public class Emp {
	public static void main(String[] args) {
		Database d = new Database("Manu",12,50000,"Santacruz");
		System.out.println(d);
		
	}

}
