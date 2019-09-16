package atividade;

public class Main {

	public static void main(String[] args) {
			Conta c1 = new Conta();
			c1.titular = "Gustavo";
			c1.numero = 521;
			c1.agencia = "0879-5";
			c1.saldo = 40.0;
			Data data = new Data();
			data.dia = 05;
			data.mes = 04;
			data.ano = 2019;
			c1.dataDeAbertura = data; 

			
			
			
			c1.saca(25.0);
			System.out.println("Saldo Após Saque: " + c1.saldo);

			c1.deposita(50.0);
			System.out.println("Saldo Atual: " + c1.saldo);

			System.out.println("Rendimento Mensal: " + c1.calculaRendimento());

			System.out.println(c1.recuperaDadosParaImpressao());

			
		}
	}

	
/* exercicio 4

 * Conta c2 = new Conta(); 
 * c2.titular = "Ricardo"; 
 * c2.numero = 652; 
 * c2.agencia = "471"; 
 * c2.saldo = 222.0; 
 * c2.dataDeAbertura = "20/01/2019";
 */

/*
 * if (c1 == c2) { 
 * System.out.println("Contas Iguais"); 
 * } else {
 * System.out.println("Contas Diferentes"); }
 */

	

