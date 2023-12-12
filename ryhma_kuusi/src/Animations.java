public class Animations {
//All models taken from ASCII Art Archive (aciiart.eu) and modified by Ryhmä 6
	
	public static void car() throws InterruptedException {
		System.out.println("        _______");
		System.out.println("       //  ||\\ \\");
		System.out.println(" _____//___||_\\ \\_");
		System.out.println(" )  _          _    \\");
		System.out.println(" |_/ \\________/ \\___|");
		System.out.println("___\\_/________\\_/______");
		System.out.println();
		//To give a feeling of transition
		for (int i = 0; i < 12; i++)
		{
			Thread.sleep(100);
			System.out.print("· ");
		}
		System.out.println();
		
	}
	public static void boat() throws InterruptedException {
		System.out.println("                 __/___            ");
		System.out.println("           _____/______|       ");
		System.out.println("   _______/_____\\_______\\_____     ");
		System.out.println("   \\              < < <       | ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//To give a feeling of transition
		for (int i = 0; i < 9; i++)
		{
			Thread.sleep(300);
			System.out.print("~   ");
		}
		System.out.println();
	}
	public static void fueling() throws InterruptedException {
        System.out.println("   .-\"\"\"\"\"-.");
        System.out.println("   |==   ==|-.");
        System.out.println("   |~~~ ~~~|`\\");
        System.out.println("   |HAMKOIL| ||");
        System.out.println("   |       |//");
        System.out.println("   |       |/");
        System.out.println("   |       |");
        System.out.println(" __|_______|__");
        System.out.println("[_____________]");
		
		//Because fueling doesn't happen instantly
		System.out.println("Fueling the vehicle");
		for (int i = 0; i < 10; i++)
		{
			Thread.sleep(300);
			System.out.print(". ");
		}
		System.out.println();
	}
}
