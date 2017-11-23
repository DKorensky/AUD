public class SozialesNetzwerk {
	public static boolean[][] freundschaft;

	// the number of currently registered users
	// TODO

	// initialize the network for max. n users
	public static void initialisiere(int n) {
		int feldWeite = n;
		int feldHoehe = n;
		int[][] network;
		network[][] = new network[feldWeite][feldHoehe];// TODO
	}

	// adds a user with the given name
	public static int fuegeNutzerHinzu(String name) {
		// TODO
	}

	// adds a friendship relationship between the users with the given IDs
	// (regardless of the current state)
	public static void fuegeFreundschaftHinzu(int id0, int id1) {
		// TODO
	}

	// removes a friendship relationship between the users with the given IDs
	// (regardless of the current state)
	public static void entferneFreundschaft(int id0, int id1) {
		// TODO
	}

	// returns true if the users with the given IDs are friends and false if not
	public static boolean testeFreundschaft(int id0, int id1) {
		// TODO
	}

	// returns true if the users with the given IDs are reachable within the given distance e, false otherwise
	public static boolean istErreichbar(SozialesNetzwerkMethodenProtokoll snmp, int id0, int id1, int e) {
		snmp.istErreichbar(id0, id1, e); // DO NOT REMOVE OR CHANGE THIS LINE!
		// TODO
	}
}