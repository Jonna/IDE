
public class Person {

	private String name;
	private Cprno cpr;
	private double balance;
	private String address;
	
	/**
	 * Constructor
	 * to be used once per object, at creation
	 * Cprno myCpr = new Cprno(1704914004L);
	 * 
	 * the constructor name must be identical to the class name.
	 * it has no type.
	 * a class may have several constructors.
	 * The constructors must have different signatures.
	 * 
	 */
	
	public Person(String name, Cprno cpr, String address) {
		this.name = name;
		this.cpr = cpr;
		this.address = address;
		this.balance = 0.0;
	}
	
	public Person (String name, long cpr, String address, double bal) {
		this.name = name;
		this.cpr = new Cprno(cpr);
		this.address = address;
		this.balance = bal;
	}
	
	/**
	 * @param args
	 */
	
	public String getName() {
		return this.name;
	}
	
	public Cprno getCprno(){
		return this.cpr;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setBalance(double amount){
		this.balance = amount;
	}
	
	public void addBalance(double amount){
		this.balance += amount;
	}
	
	public String toString(){
		String s = String.format("%12s %40s: %8.2f", this.cpr, this.getName(), this.getBalance());
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cprno c = new Cprno(1704914004L);
		Person p1 = new Person("Jonna Merks", c, "Skjoldhøj 128");
		Person p2 = new Person("Kristen Zeist", 3209064004L, "Skjoldhøj 126", 4700.3);
		System.out.println(p1);
		p1.addBalance(3333.67);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
