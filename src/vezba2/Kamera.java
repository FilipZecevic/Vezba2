package vezba2;

public class Kamera {
	
	private int megaPikseli;
	private int freeSpace;
	private static int photoCounter;
	
	Kamera()
	{
		
	}
	Kamera(int megaPikseli, int freeSpace)
	{
		this.megaPikseli = megaPikseli;
		this.freeSpace = freeSpace;
	}
	
	public boolean slikaj()
	{
		if(this.freeSpace <= this.megaPikseli)
		{
			return false;
		}
		this.freeSpace = this.freeSpace - this.megaPikseli;
		return true;
	}
	
	public int getMegaPikseli() {
		return megaPikseli;
	}
	public void setMegaPikseli(int megaPikseli) {
		this.megaPikseli = megaPikseli;
	}
	public int getFreeSpace() {
		return freeSpace;
	}
	public void setFreeSpace(int freeSpace) {
		this.freeSpace = freeSpace;
	}
	public static int getPhotoCounter() {
		return photoCounter;
	}
	public static void setPhotoCounter(int photoCounter) {
		Kamera.photoCounter = photoCounter;
	}
}
