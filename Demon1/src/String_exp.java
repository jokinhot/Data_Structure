
public class String_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" abc ";
		System.out.println(s.length());
		s+='1';
		s+='3';
		System.out.println(s);
		int[] a=new int[10];
		for(int i=0;i<5;i++){
			a[i]=1;
		}
		System.out.print(a[8]);
		for(int i=0;i<10;i++){
			if(a[i]==0)
				break;
			System.out.println(i);
		}
		int b=0;
		System.out.println(b++);
		System.out.println(++b);
		char k='1';
		int m=(int)k;
		System.out.println(m);
	}

}
