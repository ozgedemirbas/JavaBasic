
public class ElektrikliCihaz { // tipimi gösteriyor. ilk classým.
//bunlarý yönetmek için get set kullanmam gerekiyor
	private String EnerjiSinifi;
	private String cihazTipi; // tv pc telefon buzdolabi
	private int gucWatt;
	private int gerilimVolt = 220;

	private char currentStatus = 'K'; // þimdiki durumu tutuyorum. açýk yada kapalý

	
	
	
	
	
	@Override
	public String toString() {
		return "ElektrikliCihaz [EnerjiSinifi=" + EnerjiSinifi + ", cihazTipi=" + cihazTipi + ", gucWatt=" + gucWatt
				+ ", gerilimVolt=" + gerilimVolt + ", currentStatus=" + currentStatus + "]";
	}

	public String getEnerjiSinifi() {
		return EnerjiSinifi;
	}

	public void setEnerjiSinifi(String enerjiSinifi) {
		EnerjiSinifi = enerjiSinifi;
	}

	public String getCihazTipi() {
		return cihazTipi;
	}

	public void setCihazTipi(String cihazTipi) {
		this.cihazTipi = cihazTipi;
	}

	public int getGucWatt() {
		return gucWatt;
	}

	public void setGucWatt(int gucWatt) {
		this.gucWatt = gucWatt;
	}

	public char getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(char currentStatus) {
		this.currentStatus = currentStatus;
	}

	public int getGerilimVolt() {
		return gerilimVolt;
	}

	public void ac() {
		if (currentStatus == 'A')
			System.out.println("Cihaz zaten açýk ");
		else {
			currentStatus = 'A';
			System.out.println("Cihaz Açýldý");
		}
	}

	public void kapat() {
		if (currentStatus == 'K')
			System.out.println("Cihaz zaten kapalý ");
		else {
			currentStatus = 'K';
			System.out.println("Cihaz Kapandý");
		}
	}

}
