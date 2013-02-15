
public class Librarian extends Person{

	private double empFrac;
	private String position;
	
	public Librarian(String name, Cprno cpr, String address, double time, String job){
		super(name,cpr,address);
		this.empFrac = time;
		this.position = job;
	}
	
	public double isFulltime(){
		return this.empFrac;
	}
	
	public String getPosition(){
		return this.position;
	}
	
	public String toString()
	{
	return this.getName() + ", " + this.getCprno() + ", " + empFrac + ", " + position;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cprno c = new Cprno(1704914004L);
		Person l1 = new Librarian("Jonna Merks", c, "Skjoldhøj 128", 3.4, "Student");
		System.out.println(l1);
	}

}
