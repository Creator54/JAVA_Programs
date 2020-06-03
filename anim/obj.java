import java.util.Scanner;
public class obj{
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
	public static void main(String[] args){
	int i=0;
	while(2>1){
		for(int j=0;j!=i;j++) System.out.print("      ");
		System.out.print(" ]:~:> \n");
		wait(1000);
		i++;
		cls();
		if(i==10) i=0;
		}
	}
}
