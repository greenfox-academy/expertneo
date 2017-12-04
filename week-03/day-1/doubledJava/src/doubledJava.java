import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class doubledJava {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    String path = "duplicated-chars.txt";

    loadingTheFile(path);

    /*QC start
    System.out.println("QC value of: loadingTheFile(path)");
    QC end*/


    List<String> qcCheck = loadingTheFile(path);
    System.out.println(qcCheck);
    doubleEliminator(qcCheck);
    String veryFinalString = doubleEliminator(qcCheck);
    System.out.println(veryFinalString);

  }

  private static String doubleEliminator(List<String> input1) {
    String listOriginal = String.join(",", input1);
//    System.out.println("String after merging it");
//    System.out.println(listOriginal);
    String[] listFinal = new String[(listOriginal.length())];
    String[] listOriginalSplit = listOriginal.split("");
//    System.out.println("String after splitting it");
//    System.out.println(Arrays.toString(listOriginalSplit));
//    System.out.println(listFinal[10]);
//    System.out.println(listOriginalSplit[10]);
    int counter = 0;
    for (int i = 0; i < listOriginalSplit.length; i += 2) {
      listFinal[counter] = listOriginalSplit[i];
      counter++;
    }
    String veryFinalList = String.join("", listFinal);
    return veryFinalList;
  }

  private static List<String> loadingTheFile(String path) {
    List<String> text = new ArrayList<>();
    try {
      Path filePath = Paths.get(path);
      text = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Failed to open file!");
    }
    return text;
  }
}
