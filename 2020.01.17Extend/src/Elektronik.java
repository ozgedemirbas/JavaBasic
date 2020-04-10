
public class Elektronik extends ElektrikliCihaz {

	String ekranboyutu;
	double cpuGHz;
	int ramGB;
	public String getEkranboyutu() {
		return ekranboyutu;
	}
	public void setEkranboyutu(String ekranboyutu) {
		this.ekranboyutu = ekranboyutu;
	}
	public double getCpuGHz() {
		return cpuGHz;
	}
	public void setCpuGHz(double cpuGHz) {
		this.cpuGHz = cpuGHz;
	}
	public int getRamGB() {
		return ramGB;
	}
	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}
	public Elektronik(String ekranboyutu, double cpuGHz, int ramGB,String cihazTipi, String enerjiSinifi, int guc) {
		super();
		this.ekranboyutu = ekranboyutu;
		this.cpuGHz = cpuGHz;
		this.ramGB = ramGB;
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
		
	}
	@Override
	public String toString() {
		return "Elektronik [ElektrikliCihaz["+this.getCihazTipi()+" "+ this.getEnerjiSinifi()+" "+ this.getGucWatt()+"] ,ekranboyutu=" + ekranboyutu + ", cpuGHz=" + cpuGHz + ", ramGB=" + ramGB + "]";
	}
	
	
	
	
	
	
	
	
}
