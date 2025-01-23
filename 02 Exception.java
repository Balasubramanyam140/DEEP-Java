1) If Array_out_of_Bound_Index using Exception case
2)  ArrayException
    ArithmeticException
    NullPointerEception
3)   NumberFormatException Attempting to parse a non-numeric string to an integer 
4) Using throw
5) Using throws
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
3)   NumberFormatException Attempting to parse a non-numeric string to an integer 


                 class NumberFormatExceptionExample {  
                public static void main(String[] args) {  
                    String str = "abc"; // Initializing a String with non-numeric characters  
                    try {  
                        int num = Integer.parseInt(str); // Attempting to parse a non-numeric string to an integer  
                        System.out.println("Parsed number: " + num);  
                    } catch (NumberFormatException e) {  
                        System.out.println("Error: Unable to parse the string as an integer.");  
                        // Additional error handling code can be added here  
                    }  
                }  
            }  
OUTPUT:
        Error: Unable to parse the string as an integer.
--------------------------------------------------------------------------------------------------------
4) Using Throw

            class InvalidAgeException extends Exception {
                public InvalidAgeException(String message) {
                    super(message);
                }
            }
            
            class Solution {
                
                static void checkAge(int age) {
                    try {
                        if (age < 18) {
                            throw new InvalidAgeException("Age must be 18 or older to proceed.");
                        } else {
                            System.out.println("Age is Valid.");
                        }
                    } catch (InvalidAgeException e) {
                        System.out.println(e.getMessage());  // Handling the exception inside the method
                    }
                }
            
                public static void main(String[] args) {
                    checkAge(16);  // No need for a try-catch in the main method
                }
            }

OUTPUT :
        Age must be 18 or older to proceed.
--------------------------------------------------------------------------------------------------------
5) Uing throws

         class InvalidException extends Exception{
                public InvalidException(String message){
                    super(message);
                }
            }
            
            class Main{
                static void checkAge(int age) throws InvalidException{
                    if(age < 18){
                        throw new InvalidException("Age must be 18 or older to proceed.");
                    }
                    else{
                        System.out.println("Age is Valid.");
                    }
                }
                public static void main(String[] args){
                    try{
                        checkAge(16);
                    }catch(InvalidException e){
                        System.out.println("Caught Exception :"+e);
                    }
                }
        }
OUTPUT :
            Caught Exception :InvalidException: Age must be 18 or older to proceed.
--------------------------------------------------------------------------------------------------------    

