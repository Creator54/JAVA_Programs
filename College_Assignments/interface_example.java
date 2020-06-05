public class interface_example{
	interface clearscreen{
		public static void wait(int ms){
	        try
	        {
	            Thread.sleep(ms);
	        }
	        catch(InterruptedException ex)
	        {
	            Thread.currentThread().interrupt();
	        }
	    }
		static void cls(){
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
	}
	static class test implements clearscreen{
		void countdown(){
			int i=10;
			while(2>1){
				System.out.print(i);
				clearscreen.wait(1000);
				clearscreen.cls();
				if(i==0) {
					System.out.println("Program executed successfully!");
					break;
				}
				i--;
			}
		}
	}
	public static void main (String[] args) {
		test t1 = new test();
		clearscreen.cls();
		t1.countdown();
	}
}