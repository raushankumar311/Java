public class NumberComplement {
   public static void main(String[] args) {
      int num = 5;
      NumberComplement obj = new NumberComplement();
      System.out.println("Complement = " + obj.findComplement(num));
   }

   public int findComplement(int num) {
      if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        int mask = (1 << bitLength) - 1;     
        return num ^ mask;
   }
}
