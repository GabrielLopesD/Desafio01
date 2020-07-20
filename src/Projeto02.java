
public class Projeto02 {
/*Seguindo essa linha de raciocínio, quais afirmações são verdadeiras e quais são falsas?

Todo X é Y; Todo Y é Z; Todo W é Y

I. Todo W é X.

II. Todo Z é W.

III. Todo X é Z.*/
	
	public static String x = "x";
	public static String y = "y";
	public static String z = "z";
	public static String w ="w";
	
	public static void respostaDoX() {
		//Todo X é Y
		x = y;
		//Todo Y é Z
		y = z;
		//Todo W é Y
		w = y;
		
		if(w == x) {
			System.out.println("Todo W é X.");
		}else if(z == w) {
			System.out.println("Todo Z é W.");
		}else {
			System.out.println("Todo X é Z.");
		}
		
		
		
		
	}
}
