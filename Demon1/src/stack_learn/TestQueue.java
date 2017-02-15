package stack_learn;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qa=new Queue(5);
		qa.insert('1');
		qa.insert('2');
		qa.insert('3');
		qa.insert('4');
		qa.remove();
		qa.remove();
		qa.remove();
		qa.insert('5');
		qa.insert('6');
		qa.insert('7');
		qa.insert('8');
		qa.display();
		Queue qb=new Queue(5);
		qb.insert('a');
		qb.display();
	}

}
