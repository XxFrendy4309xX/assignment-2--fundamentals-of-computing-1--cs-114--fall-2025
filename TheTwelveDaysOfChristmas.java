public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    // the 12 days of christmas:
	  
    String intro = " day of Christmas my true love sent to me, ";
    String lyric = "On the";
	  
    String verse1 = " First";
    String verse2 = " Second";
    String verse3 = " Third";
    String verse4 = " Fourth";
    String verse5 = " Fifth";
    String verse6 = " Sixth";
    String verse7 = " Seventh";
    String verse8 = " Eigth";
    String verse9 = " Ninth";
    String verse10 = " Tenth";
    String verse11 = " Eleventh";
    String verse12 = " Twelveth";
	  
	  
    for (int verseIntro = 1; verseIntro <= 12; verseIntro++) {
      String introString = "error in printing";
      switch(verseIntro) {
        case 1: introString = verse1;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 2: introString = verse2;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 3: introString = verse3;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 4: introString = verse4;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 5: introString = verse5;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 6: introString = verse6;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 7: introString = verse7;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 8: introString = verse8;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 9: introString = verse9;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 10: introString = verse10;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 11: introString = verse11;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
        case 12: introString = verse12;
        System.out.println(lyric + introString + intro);
        verses(verseIntro);
        break;
      }
    }	  
  }
	  
  public static void verses(int verse) {
    String day1 = " a Partridge in a Pear Tree\n";
    String day2 = " Two Turtle Doves\n";
    String day3 = " Three French Hens\n";
    String day4 = " Four Colley Birds\n";
    String day5 = " Five Gold Rings\n";
    String day6 = " Six Geese a Laying\n";
    String day7 = " Seven Swans a Swimming\n";
    String day8 = " Eight Maids a Milking\n";
    String day9 = " Nine Drummers Drumming\n";
    String day10 = " Ten Pipers Piping\n";
    String day11 = " Eleven Ladies Dancing\n";
    String day12 = " Twelve Lords a Leaping\n";
    String verseString = "error in printing";
    switch (verse) {
      case 1: verseString = day1;
      break;
      case 2: verseString = (day2 + " and" + day1);
      break;
      case 3: verseString = (day3 + day2 + " and" + day1);
      break;
      case 4: verseString = (day4 + day3 + day2 +  " and" + day1);
      break; 
      case 5: verseString = (day5 + day4 + day3 + day2 + " and" +
      day1);
      break;
      case 6: verseString = (day6 + day5 + day4 + day3 + day2 +
      " and" + day1);
      break;
      case 7: verseString = (day7 + day6 + day5 + day4 + day3 +
      day2 + " and" + day1);
      break;
      case 8: verseString = (day8 + day7 + day6 + day5 + day4 + 
      day3 + day2 + " and" + day1);
      break;
      case 9: verseString = (day9 + day8 + day7 + day6 + day5 +
      day4 + day3 + day2 + " and" + day1);
      break;
      case 10: verseString = (day10 + day9 + day8 + day7 +
      day6 + day5 + day4 + day3 + day2 + " and" + day1);
      break;
      case 11: verseString = (day11 + day10 + day9 + day8 +
      day7 + day6 + day5 + day4 + day3 + day2 + " and" + day1);
      break;
      case 12: verseString = (day12 + day11 + day10 + day9 +
      day8 + day7 + day6 + day5 + day4 + day3 + day2 + " and" +
      day1);
      break;
    }
    System.out.println(verseString);
  }	 
}
  

