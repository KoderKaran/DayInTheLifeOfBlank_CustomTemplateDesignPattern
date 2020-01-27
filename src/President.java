public class President extends WorkingPeople{

	@Override
	void getReady() {
		System.out.println("You veto three bills and get dressed to tackle the day! You have a nation to run!");
	}

	@Override
	void work() {
		System.out.println("You sit at the oval office and look at your stack of papers! Wow that's a lot of paper!" +
				"You give up on the papers and veto a few more bills!");
	}

	@Override
	void goToSleep() {
		System.out.println("You tuck yourself in while vetoing one more bill for good luck! As you doze off, you dream of all " +
				"of the other bills you could veto tomorrow!");
	}
}
