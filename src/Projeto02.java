
public class Projeto02 {
/*Seguindo essa linha de racioc�nio, quais afirma��es s�o verdadeiras e quais s�o falsas?

Todo X � Y; Todo Y � Z; Todo W � Y

I. Todo W � X.

II. Todo Z � W.

III. Todo X � Z.*/
	
	public static String x = "x";
	public static String y = "y";
	public static String z = "z";
	public static String w ="w";
	
	public static void respostaDoX() {
		//Todo X � Y
		x = y;
		//Todo Y � Z
		y = z;
		//Todo W � Y
		w = y;
		
		if(w == x) {
			System.out.println("Todo W � X.");
		}else if(z == w) {
			System.out.println("Todo Z � W.");
		}else {
			System.out.println("Todo X � Z.");
		}
		
		
		
		
	}
}
