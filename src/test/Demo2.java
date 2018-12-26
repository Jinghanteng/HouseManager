package test;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regx="^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\\\d{8}$\r\n";
		
		String pString="17638930709";
		
		if (pString.matches(regx)) {
			System.out.println("合法。。。。");
		}else {
			System.out.println("不合法。。。。");
		}
	}

}
