
	public class Sentence {
		private String phrase;
		   /**
		      Construct a Sentence object.
		      @param aPhrase the sentence
		*/
		   public Sentence(String aPhrase){
		      phrase = aPhrase;
		}
		   /**
		      Finds a string of text in a sentence.
		      @param text the string to find.
		      @return the position where the text is found
		*/
		   public int indexOf(String text){
			   if (text.length() > this.phrase.length()) {
			        return -1;
			    }
			    return indexOf(text, 0);
		   }
		     
		/**
		      Helper method to find the index of a string.
		      @param text the string to find
		      @param index the starting index to search
		      @return the position where the text is found
		   */
		   private int indexOf(String text, int index){
			   if ((this.phrase.length() - text.length()) < index) {
			        return -1;
			    }
			    if (this.phrase.substring(index, index + text.length()).equals(text)) {
			        return index;
			    } else {
			    return indexOf(text, index + 1);
			    }
		}
		   public static void main(String[] args) {
				// TODO Auto-generated method stub
				Sentence s = new Sentence ("Mississipi");
				int n = s.indexOf("sip"); // Returns 6
				System.out.println(n);
			}

		   
	}
	

