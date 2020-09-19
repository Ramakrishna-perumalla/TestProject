package adhii;

public class Mdf_Execution {

	public static void main(String[] args) throws InterruptedException {
		
		Mdf_Ticketbooking a = new Mdf_Ticketbooking();
		
		a.LaunchBrowser();
		
		a.AccessApp();
		
		a.UserLoging();
		
		a.Tkbooking();
	}

}
