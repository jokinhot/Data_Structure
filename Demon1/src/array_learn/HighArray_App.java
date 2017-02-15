package array_learn;

public class HighArray_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighArray ha=new HighArray(100);
		ha.insert(2);
		ha.insert(21);
		ha.insert(32);
		ha.insert(53);
		ha.insert(11);
		ha.insert(21);
		ha.insert(11);
		ha.insert(21);
		ha.display();
		System.out.println(ha.find(21));
		ha.delete(2);
		ha.display();
		ha.noDup();
		ha.display();		
	}

}
