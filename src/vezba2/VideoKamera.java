package vezba2;

public class VideoKamera extends Kamera{
	
	private static int videoCounter;
	
	VideoKamera()
	{
		
	}
	VideoKamera(int megaPikseli, int freeSpace)
	{
		super.setFreeSpace(freeSpace);
		super.setMegaPikseli(megaPikseli);
	}
	
	public boolean snimaj(int sekunde)
	{
		int space = this.getMegaPikseli() * sekunde;
		if (super.getFreeSpace() < space)
		{
			return false;
		}
		super.setFreeSpace(super.getFreeSpace() - space);
		return true;
	}
	
	public static int getVideoCounter() {
		return videoCounter;
	}
	public static void setVideoCounter(int videoCounter) {
		VideoKamera.videoCounter = videoCounter;
	}
}
