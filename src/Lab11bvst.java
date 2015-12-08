// Lab11bvst.java
// This is the Student starting version for the <Deck> class lab 11b assignment. 


public class Lab11bvst{
	
   public static void main(String[] args)
   {
      Deck deck = new Deck();
      System.out.println(deck);
   }
}

class Card{
	
	private String suit;
	private String rank;
	private String value;
	
	public Card(String s, String r, String v){
		
		suit = s;
		rank = r;
		value = v;
		
	}
	
	public String toString()
   	{
      	return "[" + suit + ", " + rank + ", " + value + "]";
   	}
}


class Deck {
	
   private static int size;
   private static int sizeRank;
   private static int sizeSuit;

   private static Card[] cards = new Card[size];
   private static String[] rank = new String[sizeRank];
   private static String[] suit = new String[sizeSuit];
   private static String[] value = new String[sizeSuit];
    

   public Deck() 
   {
      size = 52;
      sizeRank = 4;
      sizeSuit = 13;
      
      String rank[] = {"Spade","Heart","Diamond","Club"};
      String suit[] = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
      String value[] = {"13","10","10","10","10","9","8","7","6","5","4","3","2"};
      
   }    
   
   public void add(String[] suit, String[] rank, String[] value)
  	{
     		Card temp = new Card(suit[], rank[], value[]);
     		cards[size] = temp;
     		size++;
  	}
   
   public void getSuit(String suit){
	   int temp = 0;
	   suit = suit[temp];
	   temp++;
	   
	   return suit;
   }
   
 }
