package sort_learn;

public class TestSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray sa=new SortArray(100);
		for(int i=0;i<10;i++){
			sa.insert((int)(Math.random()*100));
		}
		sa.display();
		sa.bubbleSort();
		sa.display();
		SortArray sb=new SortArray(100);
		for(int i=0;i<10;i++){
			sb.insert((int)(Math.random()*100));
		}
		sb.display();
		sb.selectSort();
		sb.display();
		SortArray sc=new SortArray(100);
		for(int i=0;i<10;i++){
			sc.insert((int)(Math.random()*100));
		}
		sc.display();
		sc.insertSort();
		sc.display();
		System.out.println(sc.median());
		SortArray sd=new SortArray(100);
		sd.insert(1);
		sd.insert(2);
		sd.insert(3);
		sd.insert(3);
		sd.insert(4);
		sd.insert(5);
		sd.insert(5);
		sd.insert(7);
		sd.insert(7);
		sd.insert(7);
		
		sd.noDups();
		sd.display();
	}

}
