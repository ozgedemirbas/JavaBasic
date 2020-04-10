
public class camasir extends BeyazEsya {
	
	private int yikamakapasitesi;
	private String program;
	public int getYikamakapasitesi() {
		return yikamakapasitesi;
	}
	public void setYikamakapasitesi(int yikamakapasitesi) {
		this.yikamakapasitesi = yikamakapasitesi;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public camasir(String renk, String cihazTipi, String enerjiSinifi, int guc, int yikamakapasitesi, String program) {
		super(renk, cihazTipi, enerjiSinifi, guc);
		this.yikamakapasitesi = yikamakapasitesi;
		this.program = program;
	}
	@Override
	public String toString() {
		return "camasir [yikamakapasitesi=" + yikamakapasitesi + ", program=" + program + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
