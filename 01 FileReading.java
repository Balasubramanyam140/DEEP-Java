1) Reading a File using ( File Object ) if File not found sending to catch if file present it prints inside it

----------------------------------------------------------------------------------------------------
1) Reading a File using ( File Object ) if File not found sending to catch if file present it prints inside it
                      
                    package day2;
                    
                    import java.io.File;
                    import java.io.FileNotFoundException;
                    import java.util.Scanner;
                    
                    public class ReadFile {
                    
                        public static void main(String[] args) {
                            // Specify a non-existent file path to force an exception
                        	//Stored File path in a normal string
                            String filePath = "/Users/bonubalasubramanyam/Desktop/WIpro JAVA/Assignment1/src/day2/numbers.txt";
                    
                            try {
                                // Create a File object with an invalid path
                                File file = new File(filePath);
                    
                                // Try to open the file using Scanner (this will throw FileNotFoundException)
                                //Here itself it will check file if not there it will get an error 
                                //Which taken my catch
                                Scanner sc = new Scanner(file);
                    
                                System.out.println("File contents:");
                                //sc.hasNextLine() checks wheather it has another line present or not
                                while (sc.hasNextLine()) {
                                    System.out.println(sc.nextLine());
                                }
                    
                                sc.close();
                            } catch (FileNotFoundException e) {
                                // This block will execute because the file does not exist
                            	//e.getMessage() helps to show what type of error
                                System.out.println("File not found: " + e.getMessage());
                            }
                        }
                    }
                    
OUTPUT : 
   //When given Correct Address
  10
  20
  30
  
  //When given Wrong address or file not present
      File not found: /Usrs/bonubalasubramanyam/Desktop/WIpro JAVA/Assignment1/src/day2/numbers.txt (No such file or directory)

----------------------------------------------------------------------------------------------------
