
public class Projeto01 {
/*Era uma vez a hist�ria de quatro homens: 
 * Jo�o, Jos�, Jacinto e Joel. 
 * Os quatro eram construtores de barcos e em quatro dias conseguiam construir quatro embarca��es. 
 * Quanto tempo demoraria um dos quatro homens para construir um �nico barco?*/
	
	public static int pessoas = 4, dias = 4, resposta;

	
	public static void main(String[] args) {
		descobrirResposta();
	}
	
	public static void descobrirResposta() {
		
		resposta = pessoas/dias;
		
		System.out.println("esse � o numero de dias que um deles ir� demorar" + resposta);
	}
}
