package zhouxin;

import java.util.Arrays;
import java.util.Scanner;

public class homework0408 {
	 public static void main(String[] args) {
	 int[] a= {1,5,36,55,121,156,189,200};
	 System.out.println(Arrays.toString(a));
	System.out.println("�������ѯ������:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("�û��������Ϣ�ǣ�"+str);
			sc.close();//�ͷ���Դ
		int key =Integer.parseInt(str) ;
		int l=0;
		int h=a.length-1;
		int m;
		while(l<=h){
			m=(l+h)>>1;
			if(key==a[m]) {
			System.out.println(key+"������"+Arrays.toString(a)+"�е��±�Ϊ:"+m);
				break;
			}else if (key>a[m]) {
				l=m+1;
			}else if (key<a[m]) {
				h=m-1;
			}
		}
	}
}
