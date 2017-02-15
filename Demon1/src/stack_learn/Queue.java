/*
 * 数据结构（三）
 * 栈和队列
 * 2017.2.13 by zrj
 */
package stack_learn;

public class Queue {
	private int maxsize;
	private char[] queArray;
	private int front;
	private int rear;
	private int nitems;
	public Queue(int size){
		maxsize=size;
		queArray=new char[maxsize];
		nitems=0;
		front=0;
		rear=-1;
	}
	public void insert(char a){
		if(rear==maxsize-1){
			rear=-1;
		}
		queArray[++rear]=a;
		nitems++;
	}
	public char remove(){
		char temp=queArray[front++];
		if(front==maxsize){
			nitems--;
			front=0;
		}
		return temp;	
	}
	public boolean isEmpty(){
		return nitems==0;
	}
	public boolean isFull(){
		return nitems==maxsize;
	}
	public char peekFront(){
		return queArray[front];
	}
	public int size(){
		return nitems;
	}
	/*
	 * 按照插入顺序打印队列元素
	 */
	public void display(){
		int i=front;
		while(i<maxsize&&(i-front)<nitems){
			System.out.println(queArray[i]);
			i++;
		}
		if(i==maxsize){
			i=0;
			while(i<=rear){
				System.out.println(queArray[i]);
				i++;
			}
			
		}
	}
}
