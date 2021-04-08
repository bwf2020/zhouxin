package zhouxin;

import java.util.Arrays;
import java.util.Scanner;

public class homework0408 {
	 public static void main(String[] args) {
	 int[] a= {1,5,36,55,121,156,189,200};
	 System.out.println(Arrays.toString(a));
	System.out.println("请输入查询的数据:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("用户输入的信息是："+str);
			sc.close();//释放资源
		int key =Integer.parseInt(str) ;
		int l=0;
		int h=a.length-1;
		int m;
		while(l<=h){
			m=(l+h)>>1;
			if(key==a[m]) {
			System.out.println(key+"在数组"+Arrays.toString(a)+"中的下标为:"+m);
				break;
			}else if (key>a[m]) {
				l=m+1;
			}else if (key<a[m]) {
				h=m-1;
			}
		}
	}
}
