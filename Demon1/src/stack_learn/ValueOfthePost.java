/*
 * 后缀表达式求值
 * 2017.2.12 by zrj
 */
package stack_learn;

public class ValueOfthePost {
	private int value;
	private String postExp;
	IntegerStack stack;
	public ValueOfthePost(String s){
		value=0;
		postExp=s;
		stack=new IntegerStack(s.length());
	}
	/*
	 * 判断一个字符是否代表数值
	 */
	public boolean isNumber(char a){
		return a>=48&&a<=57;
	}
	public int calValue(){
		for(int i=0;i<postExp.length();i++){
			int m,n;
			char s=postExp.charAt(i);
			if(isNumber(s)){
				stack.push((int)s-48);
			}
			else{
				switch(s){
				case '+': m=stack.pop();n=stack.pop();value=m+n;stack.push(value);break;
				case '-': m=stack.pop();n=stack.pop();value=n-m;stack.push(value);break;
				case '*': m=stack.pop();n=stack.pop();value=m*n;stack.push(value);break;
				case '/': m=stack.pop();n=stack.pop();value=n/m;stack.push(value);break;
				default:break;
				}
			}
		}
		return stack.pop();
	}
}
