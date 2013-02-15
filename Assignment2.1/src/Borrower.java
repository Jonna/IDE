
public class Borrower extends Person{
	
	private String interests;
	private boolean newsletter;
	private String email;
	
	public Borrower (String name, Cprno cpr, String address, String interests, boolean newsletter, String email){
		super(name, cpr, address);
		this.interests = interests;
		this.newsletter = newsletter;
		this.email = email;
	}
	/**
	 * @param args
	 */

	public String hasInterests(){
		return this.interests;
	}
	
	public String showInterests(){
		return this.interests;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public boolean wantsNewsletter(){
		return this.newsletter;
	}
	
	public String toString(){
		return this.getName() + ", " + this.getCprno() + ", " + this.hasInterests() + ", " + this.getBalance()  ;
				}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cprno c = new Cprno (1704914004L);
		Person l1 = new Borrower("Jonna Merks", c, "Skjoldhøj 128", "Romance", true, "jonnamerks@gmail.com");
		System.out.println(l1);
	}

	
}
