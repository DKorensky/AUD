public class RucksackPacken {
	/**
	 * @param groessen
	 *            Die Groessen der einzupackenden Elemente.
	 * @param werte
	 *            Die Werte der einzupackenden Elemente.
	 * @param sackGroesse
	 *            Die Groesse des leeren Rucksacks.
	 * @return Der Gesamtwert des optimal gepackten Rucksacks.
	 */
	public static int packeSack(RucksackPackenProtokoll rpp, int groessen[], int werte[], int sackGroesse) {
		int rucksackWert = 0;
		if(sackGroesse == 0){
			return rucksackWert;
		} else {
			rucksackWert = rucksackWert + packeSackHelfer(rpp, groessen, werte, sackGroesse, groessen.length -1);
			return rucksackWert;
		}	//TODO
	}

	/**
	 * @param groessen
	 *            Die Groessen der einzupackenden Elemente.
	 * @param werte
	 *            Die Werte der einzupackenden Elemente.
	 * @param platzFrei
	 *            Der noch verfuegbare (freie) Platz im Rucksack.
	 * @param naechsterGegenstand
	 *            Index des als naechstes zu betrachtenden Gegenstand.
	 * @return Der Gesamtwert des optimal gepackten Rucksacks.
	 */
	public static int packeSackHelfer(RucksackPackenProtokoll rpp, int groessen[], int werte[], int platzFrei, int naechsterGegenstand) {
		rpp.packeSackHelferAufgerufen(rpp, groessen, werte, platzFrei, naechsterGegenstand); // DO NOT REMOVE OR CHANGE THIS LINE!
		int rucksackWert = 0;
		if(groessen.length == 0){
			return rucksackWert;
		} else if(groessen.length == 1 && naechsterGegenstand <= platzFrei) {
			rucksackWert = werte[naechsterGegenstand];
			return rucksackWert;
		} else {
				int platzFreiOhne = platzFrei;
				int platzFreiMit= platzFrei;
				int rucksackWertOhne = rucksackWert;
				int rucksackWertMit = rucksackWert;
				while (groessen[naechsterGegenstand -1] <= platzFreiOhne) {
					rucksackWertOhne = rucksackWert + werte[naechsterGegenstand - 1] + packeSackHelfer(rpp, groessen, werte, platzFrei, groessen[naechsterGegenstand -1]);
					platzFreiOhne = platzFreiOhne - groessen[naechsterGegenstand -1];
				}
				while (naechsterGegenstand <= platzFreiMit) {
					rucksackWertMit = rucksackWert + werte[naechsterGegenstand] + packeSackHelfer(rpp, groessen, werte, platzFrei, naechsterGegenstand);
					platzFreiMit = platzFreiMit - groessen[naechsterGegenstand];
				}
				if(rucksackWertOhne < rucksackWertMit) {
					return rucksackWertMit;
				} else {
					return rucksackWertOhne;
				}
		}
	}// TODO
}