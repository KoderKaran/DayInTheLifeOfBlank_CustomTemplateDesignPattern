public abstract class WorkingPeople {

	public final void dayInTheLife(){
		wakeUp();
		getReady();
		driveToWork();
		work();
		driveToHome();
		eatDinner();
		goToSleep();
	}
	abstract void getReady();
	abstract void work();
	abstract void goToSleep();

	void wakeUp(){
		System.out.println("You wake up, ready to start the day!");
	}

	void driveToWork(){
		System.out.println("You get in the car, and drive to work!");
	}

	void driveToHome(){
		System.out.println("You clock out and get in your car, ready to relax at home!");
	}

	void eatDinner(){
		System.out.println("You eat dinner!");
	}
}
