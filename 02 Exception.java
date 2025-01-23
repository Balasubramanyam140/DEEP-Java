1) If Array_out_of_Bound_Index using Exception case
2)  ArrayException
    ArithmeticException
    NullPointerEception


  -----------------------------------------------------------------------------------------------------
  1) If Array_out_of_Bound_Index using Exception case
  
      public class ArrayIndexOutOfBoundsExample {
          public static void main(String[] args) {
              int[] arr = {1, 2, 3, 4, 5};
      
              try {
                  System.out.println(arr[5]);
              } catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Exception: " + e);
              }
      
              try {
                  System.out.println(arr[-1]);
              } catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Exception: " + e);
              }
          }
      }

OUTPUT :

        Exception: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        Exception: java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5


//When we keep e.getMessage() function
          public class Solution {
            public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5};
        
                try {
                    System.out.println(arr[5]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
        
                try {
                    System.out.println(arr[-1]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
        }

OUTPUT:
          Exception: Index 5 out of bounds for length 5
          Exception: Index -1 out of bounds for length 5

------------------------------------------------------------------------------------------------------
2) ArrayException
  ArithmeticException
  NullPointerEception

            
          public class ExceptionExample {
              public static void main(String[] args) {
                  int[] arr = {1, 2, 3, 4, 5};
          
                  try {
                      System.out.println(arr[5]);  // Accessing an invalid index
                  } catch (ArrayIndexOutOfBoundsException e) {
                      System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
                  }
          
                  try {
                      int result = 10 / 0;  // Division by zero
                  } catch (ArithmeticException e) {
                      System.out.println("Caught ArithmeticException: " + e.getMessage());
                  }
          
                  try {
                      String str = null;
                      System.out.println(str.length());  // Null pointer access
                  } catch (NullPointerException e) {
                      System.out.println("Caught NullPointerException: " + e.getMessage());
                  }
              }
          }

OUTPUT :

          Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
          Caught ArithmeticException: / by zero
          Caught NullPointerException: null
----------------------------------------------------------------------------------------------------
