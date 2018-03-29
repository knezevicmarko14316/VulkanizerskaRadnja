package gume.radnja;
import java.util.LinkedList;
import gume.AutoGuma;
/**
 * Klasa predstavlja vulkanizersku radnju.
 * @author Marko Knezevic
 *@version 1.0
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista dostupnih automobilskih guma u radnji
	 */
	private LinkedList<AutoGuma> gume =
			new LinkedList<AutoGuma>();
	/**
	 * Dodaje novu gumu u ponudu radnje
	 * 
	 * @param a nova vrednost za automobilsku gumu
	 * @throws	java.lang.RuntimeException ukoliko je 
	 * <ul>
	 * <li> unet null vrednost<*li>
	 * 
	 * <li> uneta guma koja vec postoji u listi </li>
	 * </ul>
	 *  vrednost null ili automobilska guma vec postoji
	 * u listi
	 */
	public void dodajGumu(AutoGuma a) {
			if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
			if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
			gume.addFirst(a);
			}
	/**
	 * Pronalazi i vraca listu automobilskih guma u ponudi koje odgovaraju
	 * unetoj marki i modelu
	 * @param markaModel marka i model automobilske gume
	 * @return lista sa gumama koje odgovaraju upitu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
			if (markaModel == null)
			return null;
			LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
			for(int i=0;i<gume.size();i++)
			if (gume.get(i).equals(markaModel))
			novaLista.add(gume.get(i));
			return novaLista;
			}

}
