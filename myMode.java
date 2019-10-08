
import java.util.*;
public class myMode implements interface1 {
	Scanner s = new Scanner(System.in);

	/**
	 * 
	 */
	
	@Override
	public int getMode(int[] aray) {
		int totalCount= 0 ;
		int[] mode = {}; 
	
		
		for(int i=0;i<=aray.length-1;i++)
		{

			 totalCount = 0 ;
			int count = 1 ;
			int a = aray[i] ;
			for(int j=i+1;j<=aray.length;j++)
			{
				if (a==aray[j]) {
					count++;
				}
			}
			if (totalCount<count) {
				totalCount=count;
			}
			
			mode[i]=totalCount;	
			//{1,3,4,2,2,3,4,5,6,2}
			//{1,2,2,3,2,1,1,1,1,1}
			
		}
		int max=0;
		
		for (int i=0;i<mode.length;i++) {
			for (int j=mode.length;j>i;j--) {
				if (mode[i]>mode[j]) {
					max=i;
				}
				else {
					max=j;
				}
			}
				
		}
		int mod=aray[max];
		
		return mod;
	}
	

	public static void main(String[] args) {
		myMode mM= new myMode();
		int[] numArray= {1,3,4,2,2,3,4,5,6,2};
		int modMod= mM.getMode(numArray);
		System.out.println("Mod is "+ modMod);
	}
}
