package auto.test.Random;

public class App {
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
		
		App r1 = new App();
        
        System.out.println("unique number: "+r1.random());
		
	}
}

