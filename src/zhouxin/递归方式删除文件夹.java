package zhouxin;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Scanner;

	public class �ݹ鷽ʽɾ���ļ��� {

		public static void main(String[] args) {
			File file = new File("d:/test1");
			file.mkdir();

			�ݹ鷽ʽɾ���ļ��� a2 = new �ݹ鷽ʽɾ���ļ���();

			// ����d���е�abc.txt �ĵ�
			String filePath = "D:/test1/a.txt";
			// Ҫд�������
			String content = "���������ܺ�1";
			a2.writeFile(filePath, content);

			String filePath1 = "D:/test1/b.txt";
			String content1 = "���������ܺ�2";
			a2.writeFile(filePath1, content1);

			String filePath2 = "D:/test1/c.txt";
			String content2 = "���������ܺ�3";
			a2.writeFile(filePath2, content2);

			String filePath3 = "D:/test1/d.txt";
			String content3 = "���������ܺ�4";
			a2.writeFile(filePath3, content3);

				
			
			Scanner sc=new Scanner(System.in);
			System.out.println("����d:/test1�д����ļ��м����ļ����Ƿ�ɾ��file");
			System.out.println("1.ɾ��     0.��ɾ��");
			String name=sc.nextLine();
			int name1=Integer.parseInt(name);
		
			if(name1==1) {
					// ɾ���ļ�
			System.out.println(delete1(file));
			System.out.println("ɾ���ɹ�");
		}
			sc.close();//�ͷ���Դ
		}
		/**
		 * �����ļ�·�����������
		 * 
		 * @param filePath �� �ļ���·��
		 * @param content  : ��Ҫд�������
		 */
		public void writeFile(String filePath, String content) {
			FileOutputStream fos = null;
			try {
				// 1�������ļ�·�����������
				fos = new FileOutputStream(filePath);

				// 2����stringת��Ϊbyte���飻
				byte[] array = content.getBytes();
				// 3����byte���������
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
			 * �ж�һ��file�����Ƿ��Ǵ��ں��Ƿ���һ��Ŀ¼��
			 */
			if (file.exists() && file.isDirectory()) {
				// תΪString����洢
				String[] str = file.list();
				// ����
				for (String f : str) {
					// ����File(File parent, String child)�����ҵ�Ŀ¼�µ����ļ�
					File subFile = new File(file, f);
					// Ȼ��ݹ�
					delete1(subFile);
				}
			}
			return file.delete();
		}

	}


