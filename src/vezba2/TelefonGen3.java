package vezba2;

public class TelefonGen3 extends TelefonGen2{
	
	private VideoKamera vk;
	
	TelefonGen3()
	{
		
	}
	TelefonGen3(String broj, Kamera k, VideoKamera vk)
	{
		super.setBroj(broj);
		super.setK(k);
		this.vk = vk;
	}
	
	public boolean snimiVideo(int sekunde)
	{
		return vk.snimaj(sekunde);
	}
	
	public VideoKamera getVk() {
		return vk;
	}
	public void setVk(VideoKamera vk) {
		this.vk = vk;
	}
}
