public class LatihanOperator{
  public static void main(String[] args){
    int number = 6;

    System.out.println("Is " + number + " divisible by 2 and 3? " +
      ((number % 2 == 0) && (number % 3 == 0)));
  
    System.out.println("Is " + number + " divisible by 2 or 3? " +
      ((number % 2 == 0) || (number % 3 == 0)));

    System.out.println("Is " + number + 
      " divisible by 2 or 3, but not both? " +
      ((number % 2 == 0) ^ (number % 3 == 0))); 
  }

}