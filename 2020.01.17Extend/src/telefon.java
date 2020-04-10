
public class telefon extends Elektronik {
	private int hatsayisi;
	private String marka;
	
	
	
	
	
	
	
	public int getHatsayisi() {
		return hatsayisi;
	}







	public void setHatsayisi(int hatsayisi) {
		this.hatsayisi = hatsayisi;
	}







	public String getMarka() {
		return marka;
	}







	public void setMarka(String marka) {
		this.marka = marka;
	}







	public telefon(String ekranboyutu, double cpuGHz, int ramGB, String cihazTipi, String enerjiSinifi, int guc,
			int hatsayisi, String marka) {
		super(ekranboyutu, cpuGHz, ramGB, cihazTipi, enerjiSinifi, guc);
		this.hatsayisi = hatsayisi;
		this.marka = marka;
	}







	@Override
	public String toString() {
		return "telefon [hatsayisi=" + hatsayisi + ", marka=" + marka + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
