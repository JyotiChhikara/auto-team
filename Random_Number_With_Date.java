package test;

public class Random_Number_With_Date {
	String comp="1509613278653";
	public String random() {
		
		String number = String.valueOf(System.currentTimeMillis());
		
		if(comp.equals(number)) {		
			random();		
		}
		return number;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random_Number_With_Date r1 = new Random_Number_With_Date();
        
        System.out.println("unique number: "+r1.random());
		
	}

}
