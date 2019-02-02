class Main
{
  public static void main(String[] args) 
  {
    System.out.println("HashSetQP test");
    HashSetQP linear = new HashSetQP();
    //HashSetQP quadratic = new HashSetQP();
   // System.out.println
   System.out.println(linear.add("hello"));
   System.out.println(linear.add("hello"));
   System.out.println("Contains: " + linear.contains("hello"));
   System.out.println("Will print if removed success: " + linear.remove("hello"));
   System.out.println(linear.add("hello"));
   System.out.println("Will print if removed success: " + linear.remove("hello"));
  }
}
