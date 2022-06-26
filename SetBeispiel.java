import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetBeispiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SET ERSTELLEN
		Set set1 = new TreeSet();      			 					// KEIN DATENTYP vorgegeben (ALLES erlaubt)
		Set<String> setTreeSet = new TreeSet<>();      				// NUR Strings erlaubt (<GENERICS>) -> MÜSSEN als WRAPPER-KLASSEN implementiert werden (Integer, Long, Double..)
		Set<String> setHashSet = new HashSet<>();
		Set<String> setLinkedHashSet = new LinkedHashSet<>();
		
		// DATEIEINGABE: (Werte speichern) - Befehl ".add"
		// TreeSet
		setTreeSet.add("Saki");
		setTreeSet.add("Maki");
		setTreeSet.add("Daki");
		setTreeSet.add("Saki");
		
		// HashSet
		setHashSet.add("Saki");
		setHashSet.add("Maki");
		setHashSet.add("Daki");
		setHashSet.add("Saki");
				
		// LinkedHashSet
		setLinkedHashSet.add("Saki");
		setLinkedHashSet.add("Maki");
		setLinkedHashSet.add("Daki");
		setLinkedHashSet.add("Saki"); 
		
		// DATEIAUSGABE: (Console)
		System.out.println("Ausgabe TreeSet: ");
		System.out.println(setTreeSet);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("TREESET = sortiert in NATÜRLICHER ORDNUNG (a,b,c..z / 1,2,3..");
		//---------------------------------//
		System.out.println("\n\nAusgabe HashSet: ");
		System.out.println(setHashSet);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("HASHSET = UNGEORDNET! (sortiert nicht! Random, Position kann immer anders sein)");
		//---------------------------------//
		System.out.println("\n\nAusgabe LinkedHashSet: ");
		System.out.println(setLinkedHashSet);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("LINKEDHASHSET so wie hinzugefügt, ist auch die Ausgabe! (1zu1 wie eingetippt)");

		//ANMERKUNG:
		System.out.println("\n\n\n--- HABT IHR BEMERKT, dass alle DOPPELTEN EINTRÄGE nicht angezeigt werden? ---\nDOPPELTE EINTRÄGE sind nicht möglich bei SET. - JEDES ELEMENT = einzigartig.");
		
		
		
		
		
		
	}

}
