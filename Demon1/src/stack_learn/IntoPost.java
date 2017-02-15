/*
 * 将中缀表达式转换为后缀表达式
 * 2017.2.12 by zrj
 */
package stack_learn;
public class IntoPost {
	private String inExp;
	private String postExp;
	private Stack stack;
	public IntoPost(String inexp){
		inExp=inexp;
		stack=new Stack(inExp.length());
		stack.push('#');
		postExp="";
	}
	/*
	 * 判断一个字符是否代表数值
	 */
	public boolean isNumber(char a){
		return a>=48&&a<=57;
	}
	/*
	 * 判断一个字符是左/右括号
	 * 返回0为左括号
	 * 返回1为右括号
	 */
	public int isParentheses(char a){
		if(a==40)
			return 0;
		else if(a==41)
			return 1;
		else return -1;
	}
	/*
	 * 比较两个运算符的优先级
	 * a>b:返回1
	 * a=b:返回0
	 * a<b:返回-1
	 */
	public int compare(char a,char b){
		int result = 1;
		if(a=='#'){
			result=-1;
		}
		if(a=='+'){
			switch(b){
			case '+':result=0;break;
			case '-':result=0;break;
			case '*':result=-1;break;
			case '/':result=-1;break;
			case '#':result=1;break;
			}
		}
		else if(a=='-'){
				switch(b){
				case '+':result=0;break;
				case '-':result=0;break;
				case '*':result=-1;break;
				case '/':result=-1;break;
				case '#':result=1;break;
				}
		}
		else if(a=='*'){
			switch(b){
			case '+':result=1;break;
			case '-':result=1;break;
			case '*':result=0;break;
			case '/':result=0;break;
			case '#':result=1;break;
			}
		}
		else if(a=='/'){
			switch(b){
			case '+':result=1;break;
			case '-':result=1;break;
			case '*':result=0;break;
			case '/':result=0;break;
			case '#':result=1;break;
			}
		}
		return result;
	}
	/*
	 * 转换
	 */
	public String exChange(){
		for(int i=0;i<inExp.length();i++){
			//s为指针读到的字符
			char s=inExp.charAt(i);
			//如果读到是运算数则赋值给postExp			
			if(isNumber(s)){
				if(i+1<inExp.length())
					if(!isNumber(inExp.charAt(i+1))){
						postExp+=s+" ";
					}
					else 
						postExp+=s;
				else
					postExp+=s+" ";
			}
			else if(isParentheses(s)!=-1){
				//读到左括号
				if(isParentheses(s)==0){
					stack.push(s);
				}
				//读到右括号
				else{
					while(isParentheses(stack.peek())!=0){
						postExp+=stack.pop()+" ";
					}
					//最后将左括号出栈
					stack.pop();					
				}
			}
			/*
			 * 如果读到是运算符则入栈
			 */
			else{
				/*
				 * 如果该运算符优先级不大于栈顶优先级，
				 * 那么栈顶出栈
				 */
				while(!stack.isEmpty()&&compare(s,stack.peek())<=0){
					postExp+=stack.pop()+" ";
				}
				//否则压栈
				stack.push(s);														
				}
			}
		while(!stack.isEmpty()&&stack.peek()!='#'){
			postExp+=stack.pop()+" ";
		}		
		return postExp;
	}
}
