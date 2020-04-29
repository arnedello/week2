
public class booleaan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 1.52;
		double moneyInWallet = 4.56;
		short thirstLevel = 5;
		
		boolean shouldBuyIcecream = hasMoneyInPocket && isHotOutside;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk*2;
		
		
	}

}
