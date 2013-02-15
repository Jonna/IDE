
public class Cprno {
	
	private long cprno;
	
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
	
	public Cprno(Long cprInd){
		cprno = cprInd;
	}

	public long getCprno(){
		return this.cprno;
	}
	
	
	/**
	 * @param args
	 */
	
	public String toString(){
		String aString = String.format("%06d-%04d", this.cprno / 1000, this.cprno % 1000);
		if (!this.checkCprno())
			aString += ", invalid";
		return aString;
	}
	
	public boolean checkCprno() {
        long sum;
        long restcpr = this.cprno;
        sum = 0L;

        sum += (restcpr % 10) * 1;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 5;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 6;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 7;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        if (sum % 11 == 0 && sum != 0)
          return true;
        else
          return false;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cprno c0 = new Cprno (1704914004L);
		System.out.println(c0);
		Cprno c1 = new Cprno(702900020L);
		System.out.println(c1);
		c1 = new Cprno(4100914001L);
		System.out.println(c1);
	}

}
