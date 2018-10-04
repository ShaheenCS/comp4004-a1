package core;

public class Card implements Comparable<Card>
{
	  
		public int suit;
		public int rank;
		
		public Card(int suit, int rank){
			this.suit = suit;
			this.rank = rank;
		}
		
		public int getSuit() {
			return suit;
		}

		public void setSuit(int suit) {
			this.suit = suit;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public int Equals(Card o) 
		{
		     if (this.rank == (o.rank))
		            return 0;
		     else if ((this.rank) > (o.rank))
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

		public int compareTo(Card o) {
			// TODO Auto-generated method stub
			return 0;
		}


	}
