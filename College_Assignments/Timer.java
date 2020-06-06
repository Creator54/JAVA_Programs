public class Timer{
	interface window{
		static void wait(int ms){
	        try{
	            Thread.sleep(ms);
	        }
	        catch(InterruptedException ex){
	            Thread.currentThread().interrupt();
	        }
	    }
		static void cls(){
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
	}
	interface count extends window{
		static void countdown(){
			for(int i=10;i!=0;i--){
				window.cls();
				System.out.print(i);
				window.wait(1000);
			}
		}
	}
	static class box implements count{
		static void start(){
			count.countdown();
			window.cls();
			System.out.println("Time's up !");
		}
	}
	public static void main (String[] args) {
		box b1 = new box();		
		box.start();
	}
}