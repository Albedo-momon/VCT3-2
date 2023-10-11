package com.test.teststring;

public class Test {
	
	private void method1(Object obj) {
		System.out.println("Object");
	}
	
	private void method1(String str) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "";
		// inefficient concatnation
//		for(int i=0;i<=1000;i++) {
//			result +="Value"+i;
//			System.out.println(result);
//		}

		// efficient concatnation
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0;i<=1000;i++) {
//			sb.append("Value").append(i);
//		}
//		
//		System.out.println(sb);

//		String name = "VCT";
//		System.out.println(name.hashCode());
//		name = "VCT";// it didn't created object --- useless
//		System.out.println(name.hashCode());

//		System.out.println(name.equals(name2));
//		System.out.println(name==name2);

//		System.out.println(name.hashCode()==name2.hashCode());

		Test obj = new Test();
		obj.method1(null);

	}
	
	



	

}
