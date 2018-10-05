package core;

public class Card implements Comparable<Card>
{ 
		private Suit suit;
		private Rank rank;
		
		public Card(Rank rank, Suit suit){
			this.suit = suit;
			this.rank = rank;
		}
		
		public Suit getSuit() {
			return suit;
		}

		public void setSuit(Suit suit) {
			this.suit = suit;
		}

		public Rank getRank() {
			return rank;
		}

		public void setRank(Rank rank) {
			this.rank = rank;
		}
		
		public String toString(){
			return suit + " " + rank;
		}

		public int Equals(Card c) 
		{
		     if (this.rank == (c.rank))
		            return 0;
		     else if ((this.rank) > (c.rank))
		            return 1;
		     else
		           return -1;
		}
		
		public boolean isSuit(int suit){
			if(suit >= 1 && suit <= 4)
				return true;
			return false;
		}
		
		public boolean isRank(int rank){
			if(rank >= 1 && rank <= 13)
				return true;
			return false;
		}

		public int compareTo(Card c) {
			// TODO Auto-generated method stub
			return 0;
		}


	}
