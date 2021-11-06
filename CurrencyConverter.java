class CurrencyConverter{
	int Rupee = 72;
	int dhiram = 3;
	
	void printCurrency() {
		System.out.println(" Rupee :" +Rupee);
		System.out.println(" dhiram:" +dhiram);
}
public static void main(String args[]) {
	CurrencyConverter cc= new CurrencyConverter();
        cc.printCurrency();
}
}