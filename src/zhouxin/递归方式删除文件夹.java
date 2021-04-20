package zhouxin;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Scanner;

	public class 递归方式删除文件夹 {

		public static void main(String[] args) {
			File file = new File("d:/test1");
			file.mkdir();

			递归方式删除文件夹 a2 = new 递归方式删除文件夹();

			// 电脑d盘中的abc.txt 文档
			String filePath = "D:/test1/a.txt";
			// 要写入的内容
			String content = "今天天气很好1";
			a2.writeFile(filePath, content);

			String filePath1 = "D:/test1/b.txt";
			String content1 = "今天天气很好2";
			a2.writeFile(filePath1, content1);

			String filePath2 = "D:/test1/c.txt";
			String content2 = "今天天气很好3";
			a2.writeFile(filePath2, content2);

			String filePath3 = "D:/test1/d.txt";
			String content3 = "今天天气很好4";
			a2.writeFile(filePath3, content3);

				
			
			Scanner sc=new Scanner(System.in);
			System.out.println("已在d:/test1中创建文件夹及子文件，是否删除file");
			System.out.println("1.删除     0.不删除");
			String name=sc.nextLine();
			int name1=Integer.parseInt(name);
		
			if(name1==1) {
					// 删除文件
			System.out.println(delete1(file));
			System.out.println("删除成功");
		}
			sc.close();//释放资源
		}
		/**
		 * 根据文件路径创建输出流
		 * 
		 * @param filePath ： 文件的路径
		 * @param content  : 需要写入的内容
		 */
		public void writeFile(String filePath, String content) {
			FileOutputStream fos = null;
			try {
				// 1、根据文件路径创建输出流
				fos = new FileOutputStream(filePath);

				// 2、把string转换为byte数组；
				byte[] array = content.getBytes();
				// 3、把byte数组输出；
				fos.write(array);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fos != null) {
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		public static boolean delete1(File file) {
			/*
			 * 判断一下file对象是否是存在和是否是一个目录。
			 */
			if (file.exists() && file.isDirectory()) {
				// 转为String数组存储
				String[] str = file.list();
				// 遍历
				for (String f : str) {
					// 利用File(File parent, String child)方法找到目录下的子文件
					File subFile = new File(file, f);
					// 然后递归
					delete1(subFile);
				}
			}
			return file.delete();
		}

	}


