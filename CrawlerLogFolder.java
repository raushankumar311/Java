public class CrawlerLogFolder {

   public int minOperations(String[] logs) {
      int count = 0;
      for (int i = 0; i < logs.length; i++) {
         if (logs[i].equals("../")) {
            count--;
            if (count < 0)
               count = 0;
         } else if (logs[i].equals("./"))
            continue;
         else
            count++;
      }
      return count > 0 ? count : 0;
   }

   public static void main(String[] args) {
      String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
      CrawlerLogFolder obj = new CrawlerLogFolder();
      System.out.println(obj.minOperations(logs));
   }
}