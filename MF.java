// import java.io.File;
// import java.io.IOException;

// public class MF {
//     public static void main(String[] args) {


   //    Creating a file

//         File obj = new File("example.txt");

//         try {
//             // Attempt to create the new file
//             if (obj.createNewFile()) {
//                 System.out.println("File created: " + obj.getName());
//             } else {
//                 System.out.println("File already exists.");
//             }
//       //   } catch (IOException e) {
//       //       // Handle the exception if the file cannot be created
//       //       System.out.println("An error occurred.");
//       //       e.printStackTrace();
//       //   }

        

// Deleting the file

//       //   if (obj.delete()) {
//       //       System.out.println("File deleted successfully");
//       //    } else {
//       //       System.out.println("Failed to delete the file");
//       //    }
//          } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//          }
//     }
// }



//   Reading the content of the file

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class MF {
//     public static void main(String[] args) {
//         String fileName = "example.txt"; // Replace with the path to your file
//         try (Scanner scanner = new Scanner(new File(fileName))) {
//             while (scanner.hasNextLine()) {
//                 String line = scanner.nextLine();
//                 System.out.println(line);
//             }
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }



import java.io.*;
import java.util.*;

public class MF {
    public static void main(String[] args) {
      //   String inputFileName = "input.txt";
      //   String outputFileName = "output.txt";
        
      //   List<String> names = new ArrayList<>();
        
      //   // Read names from input file
      //   try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
      //       String line;
      //       while ((line = br.readLine()) != null) {
      //           names.add(line);
      //       }
      //   } catch (IOException e) {
      //       System.err.println("Error reading from file: " + e.getMessage());
      //   }
        
      //   Collections.sort(names);
        
      //   // Write sorted names to output file
      //   try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
      //       for (String name : names) {
      //           bw.write(name);
      //           bw.newLine();
      //       }
      //   } catch (IOException e) {
      //       System.err.println("Error writing to file: " + e.getMessage());
      //   }
        
      //   System.out.println("Names sorted and written to " + outputFileName);


   //    try (InputStream is = new FileInputStream("example.txt")) {
   //       int data;
   //       while ((data = is.read()) != -1) {
   //           System.out.print((char) data);
   //       }
   //   } catch (IOException e) {
   //       e.printStackTrace();
   //   }
     

      try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
            System.out.println(line);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
