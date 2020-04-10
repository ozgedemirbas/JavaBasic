
public class bilgisayar extends Elektronik {
	private int disk;
	private String kasa;
	public int getDisk() {
		return disk;
	}
	public void setDisk(int disk) {
		this.disk = disk;
	}
	public String getKasa() {
		return kasa;
	}
	public void setKasa(String kasa) {
		this.kasa = kasa;
	}
	public bilgisayar(String ekranboyutu, double cpuGHz, int ramGB, String cihazTipi, String enerjiSinifi, int guc,
			int disk, String kasa) {
		super(ekranboyutu, cpuGHz, ramGB, cihazTipi, enerjiSinifi, guc);
		this.disk = disk;
		this.kasa = kasa;
	}
	@Override
	public String toString() {
		return "bilgisayar [disk=" + disk + ", kasa=" + kasa + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
