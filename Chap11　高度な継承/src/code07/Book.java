package code07;

public class Book  extends TangibleAsset{
		String isbn;
		
		public Book (String name,int price,String color,String isbn) {
			super(name,price,color);
			this.isbn=isbn;
		}
		
		public String getisbn(){return this.isbn;}

	}



