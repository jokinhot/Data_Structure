package array_learn;
/*
 * 数据结构（一）
 * 数组
 * 2017.2.8 by zrj
 */
public class HighArray {
	private int[] a;
	private int nsize=0;
	/*
	 *构造函数 
	 */
	public HighArray(int maxsize){
		a=new int[maxsize];
	}
	/*
	 * 查询数组元素中是否存在值为value的
	 * 如有，返回第一个value的位置信息
	 * 否则返回数组长度
	 */
	public int find(int value){
		int i;
		for(i=0;i<nsize;i++){
			if(value==a[i])
				break;
		}
		if(i==nsize)
			return nsize;
		else 
			return i;
	}
	
	/*
	 * 向无序数组中插入元素value
	 */
	public void insert(int value){
		a[nsize]=value;
		nsize++;
	}
	/*
	 * 删除数组中第一个值为value的元素
	 */
	public boolean delete(int value){
		int i=find(value);
		if(i==nsize)
			return false;//未找到
		else{
			for(int j=i;j<nsize-1;j++){
				a[j]=a[j+1];				
			}
			nsize--;
			return true;
		}
	}
	/*
	 * 打印数组
	 */
	public void display(){
		for(int i=0;i<nsize;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
	/*
	 * 删除无序数组中所有重复的元素
	 */
	public void noDup(){
		int newsize=0;//记录重复元素的个数
		for(int i=0;i<nsize;i++){
			for(int j=i+1;j<nsize;j++){
				if(a[i]==a[j]){
					a[j]=-1;//将重复位置赋值成-1
					newsize++;
				}
			}
		}
		while(newsize!=0){
			newsize--;
			delete(-1);//删除-1元素
		}		
	}
	/*
	 * 返回该数组的长度
	 */
	public int getSize(){
		return nsize;
	}
}
