/*
 * 数据结构（三）
 * 栈和队列
 * 2017.2.11 by zrj
 */
package stack_learn;

public class Stack {
	private char[] a;

	private int maxsize;
	private int nitems;
	public Stack(int max){
		maxsize=max;
		a=new char[maxsize];
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
	public void push(char value){
		if(!isFull())
			a[nitems++]=value;
		else 
			System.out.println("没有存储空间了！");
	}
	public char pop(){
		if(!isEmpty()){			
			return a[--nitems];
		}			
		else{
			System.out.println("没有可读数据");
			return '!';
		}
			
	}
	public char peek(){
		return a[nitems-1];
	}
}
