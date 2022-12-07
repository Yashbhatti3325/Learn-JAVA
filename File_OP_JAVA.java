//READ

//public class All_in_one {
//	public static void main(String[]args)throws Exception
//	{
//		try
//		{
//			FileInputStream fin = new FileInputStream("try.txt");
//			int i;
//			while((i=fin.read())!=-1)
//			{
//				System.out.print((char)i);
//			}
//			System.out.println("\n");
//			fin.close();
//			System.out.println("Reading Compleate!");
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//}

//*********************************************************************************************
//WRITE

//public class All_in_one {
//	public static void main(String[]args)throws Exception
//	{
//		try
//		{
//			FileOutputStream fout =  new FileOutputStream("try.txt");
//			String s = "india is great";
//			byte b [] = s.getBytes();
//			fout.write(b);
//			fout.close();
//			System.out.println("Writing Complete!");
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//}


//*********************************************************************************************
//READ AND WRITE BOTH

// public class All_in_one {
// 	public static void main(String[]args)throws Exception
// 	{
// 		FileInputStream fin = new FileInputStream("try2.txt");
// 		FileInputStream fin2 = new FileInputStream("try.txt");
// 		FileOutputStream fout = new FileOutputStream("try.txt");
// 		FileOutputStream fout2 = new FileOutputStream("try2.txt");
// 		int i;
// //		System.out.println("try : \n") ;
// //		while((i=fin2.read())!=-1)
// //		{
// //			System.out.print((char)i);
// //		}
// //		
// //		System.out.println(" try2 : \n") ;
// //		//try2.txt file
// //		while((i=fin.read())!=-1)
// //		{
// //			System.out.print((char)i);
// //		}
// //		System.out.println("this is test ") ;
		
// 		//Writing
// 		try
// 		{
// 		String v = "heyy brother";
// 		byte b [] = v.getBytes();
// 		fout.write(b);
// 		fout.close();
// 		System.out.println(" success !!! \n");
// 		}
// 		catch(Exception z)
// 		{
// 			System.out.println(z);
// 		}
		
// 		//Reading
// 		System.out.println(" try2 : \n") ;
// 		while((i=fin2.read())!=-1)
// 		{
// 			System.out.print((char)i);
// 		}		
		
		
// 		while((i = fin2.read())!=-1)
// 			{
// 				fout2.write((byte)i);
// 			}
		
// //		try.txt file 
// //		System.out.println(" try : \n") ;
// 		//try2.txt file
// //		while((i=fin.read())!=-1)
// //		{
// //			System.out.print((char)i);
// //		}
// 		fin2.close();
// 		fin.close();
// 	}
// }


//*********************************************************************************************
//COPY

//
//public class All_in_one {
//	public static void main(String[]args)throws Exception
//	{
//		FileInputStream fin = new FileInputStream("try.txt");
//		FileOutputStream fout = new FileOutputStream("try2.txt");
//		int i = 0;
//		while((i = fin.read())!=-1)
//		{
//			fout.write((byte)i);
//		}
//		fin.close();
//		System.out.println("Copying Complete!");
//	}
//}

//class A
//{
//	int i = 10;
//	void dis()
//	{
//		System.out.println("this is class A ");
//	}
//}
//public class All_in_one extends A {
//	void show()
//	{
//		super.dis();
//		System.out.println("this is class B ");
//		System.out.println("this is value from class A : "  + super.i);
//	}
//		public static void main(String[]args)
//		{
//			All_in_one n = new All_in_one();
//			n.show();
//		}
//	}
