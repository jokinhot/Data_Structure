import java.util.Scanner;
public class ComputerChange {
	public static int changeRmb(int money,int price){
		int count=0;
		if(money>count){
			count=money/price;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("please input a number");
		int money,tenCount,fiveCount,twoCount,oneCount;
		money=input.nextInt();
		 
		tenCount=changeRmb(money,10);
		fiveCount=changeRmb(money-10*tenCount,5);
		twoCount=changeRmb(money-10*tenCount-5*fiveCount,2);
		oneCount=changeRmb(money-10*tenCount-5*fiveCount-2*twoCount,1);
		System.out.print("money has been changed to "+tenCount+" 10yuan "+fiveCount+" 5yuan "+twoCount+" 2yuan "+oneCount+" 1yuan\n");
	} 
}
