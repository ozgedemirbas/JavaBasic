
public class bulasik extends BeyazEsya {

	private String program;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public bulasik(String renk, String cihazTipi, String enerjiSinifi, int guc, String program) {
		super(renk, cihazTipi, enerjiSinifi, guc);
		this.program = program;
	}

	@Override
	public String toString() {
		return "bulasik [program=" + program + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
