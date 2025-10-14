public class OneHundredBottlesOfBeer {
   public static void main(String[] args) {
     for (int c = 99; c > 0;  c--) {
       if  (c > 1) {
         System.out.println(c + " Bottles of Beer on the Wall,\n"
	 + c + " Bottles of Beer!\nTake one down, pass it around,\n"+
	 (c - 1) + " Bottles of Beer on the Wall!");
       } else {
         System.out.println(c + " Bottle of Beer on the Wall\n"
	 + c + " Bottle of Beer!\n Take it down, pass it around, \n"
	 +"and now there is no more bottles of beer on the wall!!!");
      }
    }
  }
}
