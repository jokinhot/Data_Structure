/*
 * 数据结构（三）
 * 栈和队列
 * 2017.2.11 by zrj
 */
package stack_learn;

public class IntegerStack {
	private int[] a;
	private int maxsize;
	private int nitems;
	public IntegerStack(int max){
		maxsize=max;
		a=new int[maxsize];
		nitems=0;
	}
	public int getSize(){
		return nitems;
	}
	public boolean isEmpty(){
		return nitems==0;
	}
	public boolean isFull(){
		return nitems==maxsize;
	}
	public void push(int value){
		if(!isFull())
			a[nitems++]=value;
		else 
			System.out.println("没有存储空间了！");
	}
	public int pop(){
		if(!isEmpty()){			
			return a[--nitems];
		}			
		else{
			System.out.println("没有可读数据");
			return '!';
		}		
	}
	public int peek(){
		return a[nitems-1];
	}
}
