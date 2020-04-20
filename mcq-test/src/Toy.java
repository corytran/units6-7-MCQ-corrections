//unit 6 question 9

public class Toy {

	private int yearFirstSold;
	private String toy;
	
	public Toy(String string) {
		string = toy;
	}

	public int getYearFirstSold()
	{
		return yearFirstSold;
	}

	public static void main(String[] args) {
    
		Toy toyArray[] = new Toy[2];
		toyArray[0] =  new Toy("toy1");
		toyArray[1] =  new Toy("toy2");
		
		
		for (Toy k : toyArray) {
		System.out.println(k.getYearFirstSold());
		}
		
		//this for loop yields same output as for loop above
		for (int k = 0; k < toyArray.length; k++) {
		System.out.println(toyArray[k].getYearFirstSold());
		}

	}
}