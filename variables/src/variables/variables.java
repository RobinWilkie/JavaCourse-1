package variables;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfStudents;
		String name;
		double balance;
		boolean isFinished;
		char firstInitial, lastInitial;
		name="Robin Wilkie";
		balance=102.50;
		numberOfStudents=21;
		isFinished=true;
		firstInitial='R';
		lastInitial='W';
		
		System.out.println(name + " " + firstInitial + " " + balance);
		
		double rate, interest, principal;
		rate=0.7;
		principal=300;
		interest= rate* principal;
		
		System.out.println(interest);
	}
	

	
}
