public class BeyazEsya extends ElektrikliCihaz {
	String renk;
	
	public void ses() {
		
		System.out.println("Beyaz E�yay�m ben... ");
		
		
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public BeyazEsya(String renk,String cihazTipi, String enerjiSinifi, int guc) {
		super();
		this.renk = renk;
		
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
	
	}

	@Override
	public String toString() {
		return "BeyazEsya ElektrikliCihaz["+this.getCihazTipi()+" "+ this.getEnerjiSinifi()+" "+ this.getGucWatt()+"] [renk=" + renk + "]";
	}
	
	
	
	
	

}
