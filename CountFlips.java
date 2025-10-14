public class CountFlips {
  public static void main(String[] args) {
    Class Coin = newCoin();
    headCount = 0;
    tailCount = 0;
    for(int i=1; i<100; i++){
      System.out.println("Count is: " + i);
      Coin.flip()
      if (Coin.isHeads()) {
        headCount += 1;
      } else {
        tailCount += 1;
      }
    System.out.println("Flipped Heads: " + headCount);
    System.out.println("Flipped Tails: " + tailCount);
    }
  }
}
