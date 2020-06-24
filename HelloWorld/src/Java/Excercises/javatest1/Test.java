public class Test{

	public static String stringConcat(String[] givenStr){
		String tempStr="";
		for (int i=0;i<givenStr.length;i++)
		{
			System.out.println(givenStr[i]);
			tempStr=tempStr+givenStr[i];
		}
		return tempStr;
	}

	public static void main(String args[]){
		String[] localStr = new String[3];
		localStr[0] = "Hello" ;
		localStr[1] = "There"  ;
		localStr[2] = "Bye" ;
		System.out.println("Result" + stringConcat(localStr));
		
	}

}