package recursion;

public class ispowerOfThree {

	static boolean PowerOfThree(int num) {
		if(num==1) {
			return true;
		}
		if(num<3) {
			return false;
		}
		if(num%3==0) {
			return PowerOfThree(num/3);
		}
		return false;
	}
	static void printResult(boolean res){
		   if(res==true){
		   System.out.println("YES,POWER OF 3!!!!");
		   }
		    else
		      System.out.println("NOT POWER OF 3");
		  }
		  public static void main(String[] args){
		    boolean result1=PowerOfThree(81);
		     boolean result2=PowerOfThree(64);
		    printResult(result1);
		    printResult(result2);
		}

}
