package vezba2;

public class TelefonGen2 extends Telefon{
	
	private Kamera k;
	
	TelefonGen2()
	{
		
	}
	TelefonGen2(String borj, Kamera k)
	{
		super.setBroj(borj);
		this.k = k;
	}
	
	public boolean slikajSliku()
	{
		return k.slikaj();
	}
	
	public Kamera getK() {
		return k;
	}
	public void setK(Kamera k) {
		this.k = k;
	}
}
