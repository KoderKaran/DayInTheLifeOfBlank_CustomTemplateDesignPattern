public class ConstructionWorker extends WorkingPeople {

	@Override
	void getReady() {
		System.out.println("You get your hammers and your toolbox, ready to tackle the day!");
	}

	@Override
	void work() {
		System.out.println("You hammer in a few nails on a wooden blank, and put up a few fences! What a productive day!");
	}

	@Override
	void goToSleep() {
		System.out.println("You tuck your hammer in and kiss your screwdriver goodnight before going to bed. You have trouble sleeping so" +
				" you count nails to help yourself fall asleep!");
	}
}
