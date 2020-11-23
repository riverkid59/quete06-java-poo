
public class Wilder {
	
	private String firstName;
	private Boolean aware;
	
	public Wilder (String firstName, Boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}
	
	public String getFirstName( ) {
		return this.firstName;
	}
	
	public Boolean isAware() {
		return this.aware;
	}
	
	public void setFirstName( String firstName) {
		this.firstName = firstName;
	}
	
	public void setAware( boolean aware) {
		this.aware = aware;
	}
	
	public String whoAmi() { 
		if (this.aware == true) {
		return "Je m'appelle " + this.firstName + " et je suis aware " ;
	} else {
		return "Je m'appelle " + this.firstName + " et je ne suis pas aware" ;
		}
	}
}