import java.util.Scanner;
public class DayInTheLife {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Which profession would you like to see the day in the life of?\n" +
				"1-President\n" +
				"2-Waiter\n" +
				"3-Programmer\n" +
				"4-Construction Worker");
		int worker = scn.nextInt();
		WorkingPeople workingPerson = null;
		if(worker == 1){
			workingPerson = new President();
		}else if(worker == 2){
			workingPerson = new Waiter();
		}else if(worker == 3) {
			workingPerson = new Programmer();
		}else if(worker == 4){
			workingPerson = new ConstructionWorker();
		}
		workingPerson.dayInTheLife();
	}
}
