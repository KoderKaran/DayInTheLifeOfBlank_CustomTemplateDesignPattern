public class Waiter extends WorkingPeople {

	@Override
	void getReady() {
		System.out.println("You brush your teeth and get your shoes on!");
	}

	@Override
	void work() {
		System.out.println("You have a productive day of serving people!");
	}

	@Override
	void goToSleep() {
		System.out.println("You go to sleep like a normal person!");
	}
}
