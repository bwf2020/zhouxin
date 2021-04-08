package zhouxin;
public class homework0408a {
	public static void main(String[] args) {
		System.out.print("*****商品信息*****\n");
		System.out.print("手套单价：5.8元，数量3件\n");
		System.out.print("袜子单价：8.9元，数量：5件\n");
		System.out.print("折扣：8折，  支付100元\n\n");
		System.out.print("最后得到找零:");
		System.out.println(100-(5.8*3+8.9*5)*0.8);
	}
	}
