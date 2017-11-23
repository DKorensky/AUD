public class Lotterie {
	// (1) computes the binomial coefficient ("n-choose-m")
	public static double binomialkoeffizient(int n, int m) {
		 double binominalK = fakultaet(n) / (fakultaet(m) * (fakultaet(n) - fakultaet(m)));
		 return binominalK;// TODO
	}

	// (2) computes k!
	public static double fakultaet(int k) {
		if(k == 1){
			return 1;
		} else {
			return k * fakultaet(k -1);// TODO
		}
	}

	// (3) computes probability p of winning a "n-choose-m" lottery game
	public static double gewinnchance(int m, int n) {
		double p = 1/binomialkoeffizient(m ,n);
		return p;// TODO
	}
}