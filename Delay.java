package vendingmachineproject;

public class Delay {
	
	public Delay() {
		loading();
	}
	public static void loading() {
		
	
		wait(1000); // 1000 milliseconds..          |
		System.out.print("loading");
		for(int i = 0; i<2; i++){
			wait(1000); // set time delay to 2 seconds.. 
		  	System.out.print("."); // output : every output will display after 2 seconds..   	
		}
	}
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}

}
