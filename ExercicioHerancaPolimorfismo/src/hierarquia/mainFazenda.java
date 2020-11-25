package hierarquia;

public class mainFazenda {
	public static void main(String[] args) {
		
		cavalo cavalo = new cavalo("Mago", 9, "Ihihihihihi", "corre");
		cachorro cachorro = new cachorro("Moana", 4, "au au au","corre");
		preguica preguica = new preguica("Luan", 7, "rusgri rusgri", "sobe em árvores");
		
		System.out.println(cavalo.Animal());
		System.out.println(cachorro.Animal());
		System.out.println(preguica.Animal());
	}
}