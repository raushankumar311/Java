public class NumberComplement {
   public static void main(String[] args) {
      int num = 10;
      NumberComplement obj = new NumberComplement();
      System.out.println("Complement = " + obj.findComplement(num));
   }

   public int findComplement(int num) {
      String binary = binary(num);
      StringBuilder complement = new StringBuilder();
      for (int i = 0; i < binary.length(); i++) {
         complement.append((binary.charAt(i) - '0') ^ 1);
      }

      int ans = 0, j = 0;
      for (int i = complement.length() - 1; i >= 0; i--) {
         ans += (complement.charAt(i) - '0') * Math.pow(2, j);
         j++;
      }
      return ans;
   }

   public String binary(int num) {
      StringBuilder bin = new StringBuilder();
      while (num > 0) {
         bin.append(num % 2);
         num = num / 2;
      }
      return bin.reverse().toString();
   }
}
