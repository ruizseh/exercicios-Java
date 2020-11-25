package mercadinho;

import java.util.*;

public class estoqueMain {
		public static void main (String args [])
		{
			List <produto> conjunto =  new ArrayList<produto>();
			produto a = new produto("Arroz" , 10 , 3);
			produto b = new produto("\nFeijão", 5.5 , 2);
			produto c = new produto("\nCafé", 2, 4);
			produto d = new produto("\nAçucar", 1 , 7);
			
		
			
			conjunto.add(a);
			conjunto.add(b);
			conjunto.add(c);
			conjunto.add(d);
			
			
			
			System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
			
			
		}
		
}
