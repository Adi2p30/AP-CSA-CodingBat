public static void mystery (int x) {
 System.out.print(x % 10);
 if ((x / 10) != 0) {
 mystery(x / 10);
 }
}