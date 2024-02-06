class Data{
	String name= "manu";
	static int id = 23;
	
	public void meth1() {
		System.out.println("Non-static");
	}
	public static void meth2() {
		System.out.println("Static");
	}
	}
public class Static_nonstatic {
	public static void main(String[] args) {
		Data d = new Data ();
		System.out.println(d.name);
		System.out.println(Data.id);
		Data.meth2();
		d.meth1();
		
	}
}
