package q617;

import java.util.Scanner;

public class Main {

   public static void Person(String[] n, int[] h) {
      int min = Integer.MAX_VALUE;
      String per = null;
      for (int i = 0; i < h.length; i++) {
         min = h[i] < min ? h[i] : min;
      }
      for (int i = 0; i < h.length; i++) {
         per = min == h[i] ? n[i] : null;
         if (per != null) {
            break;
         }
      }
      System.out.print(per + " " + min);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name[] = new String[5];
      int height[] = new int[5];

      for (int i = 0; i < name.length; i++) {
         name[i] = sc.next();
         height[i] = sc.nextInt();
      }
      sc.close();

      Person(name, height);
   }

}