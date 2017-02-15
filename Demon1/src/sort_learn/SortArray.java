package sort_learn;
/*
 * 数据结构（二）
 * 排序----时间复杂度均为O(n^2)
 * 2017.2.9 by zrj
 */
public class SortArray {
	private int[] a;
	private int nsize;
	/*
	 *构造函数 
	 */
	public SortArray(int maxsize){
		a=new int[maxsize];
		nsize=0;
	}
	/*
	 * 向无序数组中插入元素value
	 */
	public void insert(int value){
		a[nsize]=value;
		nsize++;
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
	 * 交换函数
	 */
	public void swap(int i,int j){
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	/*
	 * 冒泡排序（out标志一边的元素完全有序）
	 */
	public void bubbleSort(){
		int out,in;
		for(out=nsize-1;out>0;out--){
			for(in=0;in<out;in++){
				if(a[in]>a[in+1]){
					swap(in,in+1);
				}
			}
		}
	}
	/*
	 * 选择排序（out标志一边的元素完全有序）
	 */
	public void selectSort(){
		int out,in;
		int min;
		for(out=0;out<nsize-1;out++){
			min=out;
			for(in=out+1;in<nsize;in++){
				if(a[in]<a[min]){
					min=in;
				}
			}
			swap(out,min);
		}
	}
	/*
	 * 插入排序(out左边局部有序)
	 */
	public void insertSort(){
		int out;
		int temp;
		int in;
		for(out=1;out<nsize;out++){
			temp=a[out];
			in=out-1;
			while(in>=0&&a[in]>temp){
				
				a[in+1]=a[in];
				in--;
			}
			a[in+1]=temp;
		}
	}
	/*
	 * 返回该数组的长度
	 */
	public int getSize(){
		return nsize;
	}
	/*
	 *返回数组的中间值
	 */
	public int median(){
		return a[nsize/2];
	}
	/*
	 * 返回最大值
	 */
	public int getMax(){
		return a[nsize-1];
	}
	/*
	 * 删除有序数组中重复的元素(每个数据项最多移动一次！)
	 * 在重复元素的位置上直接赋值下一个不一样的元素，以此类推。
	 * out之前的元素保持位置不变
	 */
	public void noDups(){
		int out,in;
		int max=getMax();
		for(out=1;out<nsize;out++){
			in=out;			
			while(a[in]<=a[out-1]&&in<nsize)
				in++;
			a[out]=a[in];
			//当in读到最大值时就认定该数组已经被读完，可结束
			if(a[in]==max){
				nsize=out+1;
				break;
			}
		}		
	}
}
