package vezba2;

public class Telefon {
	
	private String broj;
	
	 Telefon()
	 {
		 
	 }
	 Telefon(String broj)
	 {
		 this.broj = broj;
	 }
	 
	 public boolean pozovi(String broj)
	 {
		 if(this.broj == broj)
		 {
			 return false;
		 }
		 return true;
	 }
	 
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
}
