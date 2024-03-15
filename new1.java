import java.util.*;

class Reverse
{
    public static void main(String[] args)
    {
        String reverse = "";
        for(int i = args.length - 1; i >= 0; i--)
        {
            System.out.print(args[i] + " ");
            String temp = args[i];
            String reverse1 = "";
            for(int j = temp.length() - 1; j >= 0; j--)
            {
                reverse1 += temp.charAt(j);
            }
            reverse += reverse1 + " ";
        }
        System.out.println();
        System.out.println("Reverse : " + reverse);
    }
}


