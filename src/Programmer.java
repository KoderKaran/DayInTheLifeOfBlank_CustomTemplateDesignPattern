public class Programmer extends WorkingPeople {

	@Override
	void getReady() {
		System.out.println("You strap your keyboard around your shoulder and pocket your mouse. As you brush your teeth you make sure you're in hacker mode before" +
				" you make your way to the door!");
	}

	@Override
	void work() {
		System.out.println("You clickity clack away hackin, smackin and codin. What a productive day!");
	}

	@Override
	void goToSleep() {
		System.out.println("After a long day of productive mainframe hacking you have no trouble falling asleep!");
	}
}
