class Solution {
    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n<4){
            return false;
        }
        if(n%4==0){
            return isPowerOfFour( n/4);
        }
        return false;
    }
  static void printResult(boolean res){
   if(res==true){
   System.out.println("YES,POWER OF 4!");
   }
    else
      System.out.println("NOT POWER OF FOUR");
  }
  public static void main(String[] args){
    boolean result1=isPowerOfFour(28);
     boolean result2=isPowerOfFour(64);
    printResult(result1);
    printResult(result2);
}
