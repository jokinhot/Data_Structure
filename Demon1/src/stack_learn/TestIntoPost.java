package stack_learn;
import java.util.Scanner;
public class TestIntoPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		IntoPost ip=new IntoPost(s);
		String postExp=ip.exChange();
		ValueOfthePost vop=new ValueOfthePost(postExp);
		System.out.println(postExp);
		System.out.println(vop.calValue());
	}

}
