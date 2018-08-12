package approximate_matching;
import java.util.Scanner;
public class stringapprox {
	Scanner sc = new Scanner(System.in);
	void check(String str[],String data[])
	{
		String x = new String();
		String temp;
		int i,j,count=0,len=0,match;
		System.out.println("Enter the word: ");
		x = sc.next();
		for(i=0;i<5;i++)
		{
			len = str[i].length();
			if(x.equalsIgnoreCase(str[i]))
			{
				System.out.println(data[i]);
			}
			else
			{
				for(j=0;j<x.length();j++)
				{
					if((x.charAt(j)==str[i].charAt(j)) || ((int)x.charAt(j)==(int)str[i].charAt(j) + 32) )
					{
						count++;
					}
				}
				match = (count*100)/len;
				if(match>=70)
				{
					System.out.println("Are you looking for "+ str[i] + " Y/N");
					temp = sc.next();
					if(temp.equalsIgnoreCase("Y"))
					{
						System.out.println(data[i]);
						break;
					}
				}
				
			}
			len = 0;
		}
	}
	public static void main(String[] args) 
	{
		String str[] = new String[5];
		String data[] = new String[5];
		str[0] = "Cook";
		data[0] = "To make delicious food";
		str[1] = "Lake";
		data[1] = "Small form of a river";
		str[2] = "Rain";
		data[2] = "Nature's way of calming temperature";
		str[3] = "Tree";
		data[3] = "Only source of oxygen";
		str[4] = "Dress";
		data[4] = "Makes you feel confident & you also look good";
		
		stringapprox ob = new stringapprox();
		ob.check(str,data);
	}	
}