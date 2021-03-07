import java.util.Scanner;
/*Autor: Danielle Okazaki
 * NOME DO JOGO: Labirinto Psicol�gico
 * Atividade realizada no m�dulo l�gica de programa��o de imers�o Java Expert*/


//O jogodar est� preso num Labirinto mental, quando derrepente voce se encontra encurralado num calabou�o psicol�gico.


public class JogoLabirinto {

	public static void main(String[] args) {
		System.out.println("Bem vindo JOGADOR, voc� acaba de entrar nas entranhas do emaranhado das consequ�ncias do seu cerebro !");
		
		System.out.println("Aqui nesse Labirinto, voc� deve tomar muito cuidado com as escolhas que fizer,\npois dependendo de cada caminho a ser tomado, voc� receber� uma consequ�ncia !");
		
				
		System.out.println("Vamos come�ar...Primeiro me diz qual o seu nome ?");
		
		String nome;
		Scanner leitor = new Scanner(System.in);
		
		nome = leitor.next();
		
		System.out.println("Ol� " + nome + " vamos jogar?");
			
// De acordo com a resposta escolhida pelo jogador ter� uma resposta diferente;
		
// Essa resposta levara a uma situa��o
	     
	     int menu = 0; 
	     boolean repetirMenu = true;
	     int quantidadeEsforco = 0;
	     
	     while (repetirMenu) {
	    	 
	    	System.out.println	("Digite a op��o desejada:");
	    	System.out.println ("1 - Desejo ficar rico, sem trabalhar !");
	 	    System.out.println ("2 - Sempre permanecer jovem e nunca envelhecer !"); 
	 	    System.out.println	("3 - Saber o que todo mundo acha ao seu respeito !");
	 	    System.out.println	("4 - Ter algum superpoder !");
	 	    System.out.println	("5 - Ser a pessoa mais inteligente do mundo !");
	 	    
	 	    menu = leitor.nextInt();
	 	    
	 	    
	 		switch (menu) {
	 		case 1 :
	 			repetirMenu = false;
	 			System.out.println("Voc� escolheu a op��o 1.");
	 			System.out.println("De acordo com  a minha an�lise, voce escolheu um op��o n�o muito apropriada.\n Sendo assim tenho a seguinte resposta para voc� : Todo esfor�o tem a sua recompensa !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto voc� acha que empenha em trabalho na sua vida ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Voc� ainda precida trabalhar muito !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Voc� est� no caminho, continue !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("J� pode parar de trabalhar, ficou rico !");
	 			}
	 			
	 			  
	 			break;
	 			
	 		case 2 :
	 			repetirMenu = false;
	 			System.out.println("Voc� escolheu a op��o 2.");
	 			System.out.println("De acordo com  a minha an�lise, voce escolheu um op��o muito s�bia.\n Sendo assim tenho a seguinte resposta para voc� : Envelhecer � um processo natural \na qual perdemos medo da vida!");
	 			
	 			System.out.println("Atualmente de 0 a 100, como voc� acha que est� envelhecendo ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Voc� ainda precisa se cuida mais !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Voc� est� no caminho da beleza eterna!");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Voc� j� est� imortal, parab�ns!");
	 			}
	 			
	 			
	 			break;
	 			
	 		case 3 :
	 			repetirMenu = false;
	 			System.out.println("Voc� escolheu a op��o 3.");
System.out.println("De acordo com  a minha an�lise, voce escolheu um op��o bem interessante.\n Sendo assim tenho a seguinte resposta para voc� : Viva sua vida intensamente e \nseja sua pr�pria inspira��o !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto voc� empenha em cuidar da sua vida ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Voc� precida parar de cuidar da vida dos outros !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Voc� n�o se importa muito com o que os outros pensam a seu respeito !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Parab�ns, voc� j� � autossuficiente");
	 			}
	 			
	 			break;
	 			
	 		case 4 :
	 			repetirMenu = false;
	 			System.out.println("Voc� escolheu a op��o 4.");
System.out.println("De acordo com  a minha an�lise, voce escolheu um op��o muito imaginativa.\nSendo assim tenho a seguinte resposta para voc� : Seu superpoder � ser voc� mesmo !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto voc� acha que tem de superpoder ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Voc� precisa encontrar seus verdadeiros superpoderes");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Voc� est� no caminho, e j� tem algum superpoder !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Voc� j� tem muitos superpoderes, ajude o ser humano !");
	 			}
	 			
	 			break;
	 			
	 		case 5 :
	 			repetirMenu = false;
	 			System.out.println("Voc� escolheu a op��o 5.");
System.out.println("De acordo com  a minha an�lise, voce escolheu um op��o muito imaginativa.\nSendo assim tenho a seguinte resposta para voc� : A fantasia e a criatividade s�o chaves da imagina��o !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto voc� acha que � inteligente?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Voc� precisa estudar mais !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Voc� esta no caminho, j� tem algum n�vel de sabedoria !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Voc� � um verdadeiro professor da sabedoria, parab�ns !");
	 			}
	 			
	 			
	 			break;
	 			
	 		default : 
	 			
	 			System.out.println("Voc� escolheu um op��o inv�lida, volte e analise seu c�rebro !");
	 			break;
	 	    }
	     }
	     
	     System.out.println(nome + " obrigado por jogar !");
	     System.out.println("Espero que voc� tenha aprendido mais sobre os Labirintos da vida.\nFa�a esolhas s�bia e sempre ajude o pr�ximo nas suas caminhadas !");
		 leitor.close();

	}

}
