package gume;
/**
 * Klasa predstavlja automobilsku gumu.
 * @author knez
 *
 */
public class AutoGuma {
	/**
	 * Marka modela automobilske gume.
	 */
	private String markaModel = null;
	/**
	 * Precnik automobilske gume.
	 */
	private int precnik = 0;
	/**
	 * Sirina automobilske gume.
	 */
	private int sirina = 0;
	/**
	 * Visina automobilske gume.
	 */
	private int visina = 0;
	/**
	 * Vraca vrednost atributa markaModela.
	 * @return marku modela kao String
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * Postavlja novu vrednost za marku modela.
	 * 
	 * @param markaModel nova vrednost za marku modela
	 * 
	 * @throws java.lang.RuntimeException ako je unet null ili
	 * ako je duzina parametra manja od 3
	 * 
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	/**
	 * Vraca vrednost precnika automobilske gume.
	 * 
	 * @return precnik gume kao int
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * Postavlja novu vrednost za precnik automobilske gume.
	 * @param precnik nova vrednost precnik za automobilske gume.
	 * 
	 * @throws java.lang.RuntimeException ako je unet precnik manji od 13
	 * ili veci od 22
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	/**
	 * Vraca vrednost sirine automobilske gume.
	 * 
	 * @return sirinu automobilske gume kao integer
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * Postavlja novu vrednost za sirinu automobilske gume.
	 * @param sirina nova vrednost za sirinu automobilske gume
	 * 
	 * @throws java.lang.RuntimeException ako je uneta sirina 
	 * manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 || sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	/**
	 * Vraca vrednost visine automobilske gume.
	 * @return visinu automobilske gume kao integer
	 */
	public int getVisina() {
		return visina;
		}
	/**
	 * Postavlja visinu automobilske gume na novu vrednost
	 * @param visina nova vrednost visine automobilske gume
	 * 
	 * @throws java.lang.RuntimeException ukoliko je uneta visina
	 * manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
		}
	/**
	 * @return vraca vrednost svih atributa kao String
	 */
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Uporedjuje uneti objekat sa vec postojecim objektom klase AutoGuma
	 * @return istinitost poredjenja kao boolean
	 * @param obj novi objekat koji je potrebno porediti	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}

}
