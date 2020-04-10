
public class buzdolabi extends BeyazEsya {
	
	private int ichacim;

	public int getIchacim() {
		return ichacim;
	}

	public void setIchacim(int ichacim) {
		this.ichacim = ichacim;
	}

	public buzdolabi(String renk, String cihazTipi, String enerjiSinifi, int guc, int ichacim) {
		super(renk, cihazTipi, enerjiSinifi, guc);
		this.ichacim = ichacim;
	}

	@Override
	public String toString() {
		return "buzdolabi [ichacim=" + ichacim + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
