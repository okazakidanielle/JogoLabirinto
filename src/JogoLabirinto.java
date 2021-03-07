import java.util.Scanner;
/*Autor: Danielle Okazaki
 * NOME DO JOGO: Labirinto Psicológico
 * Atividade realizada no módulo lógica de programação de imersão Java Expert*/


//O jogodar está preso num Labirinto mental, quando derrepente voce se encontra encurralado num calabouço psicológico.


public class JogoLabirinto {

	public static void main(String[] args) {
		System.out.println("Bem vindo JOGADOR, você acaba de entrar nas entranhas do emaranhado das consequências do seu cerebro !");
		
		System.out.println("Aqui nesse Labirinto, você deve tomar muito cuidado com as escolhas que fizer,\npois dependendo de cada caminho a ser tomado, você receberá uma consequência !");
		
				
		System.out.println("Vamos começar...Primeiro me diz qual o seu nome ?");
		
		String nome;
		Scanner leitor = new Scanner(System.in);
		
		nome = leitor.next();
		
		System.out.println("Olá " + nome + " vamos jogar?");
			
// De acordo com a resposta escolhida pelo jogador terá uma resposta diferente;
		
// Essa resposta levara a uma situação
	     
	     int menu = 0; 
	     boolean repetirMenu = true;
	     int quantidadeEsforco = 0;
	     
	     while (repetirMenu) {
	    	 
	    	System.out.println	("Digite a opção desejada:");
	    	System.out.println ("1 - Desejo ficar rico, sem trabalhar !");
	 	    System.out.println ("2 - Sempre permanecer jovem e nunca envelhecer !"); 
	 	    System.out.println	("3 - Saber o que todo mundo acha ao seu respeito !");
	 	    System.out.println	("4 - Ter algum superpoder !");
	 	    System.out.println	("5 - Ser a pessoa mais inteligente do mundo !");
	 	    
	 	    menu = leitor.nextInt();
	 	    
	 	    
	 		switch (menu) {
	 		case 1 :
	 			repetirMenu = false;
	 			System.out.println("Você escolheu a opção 1.");
	 			System.out.println("De acordo com  a minha análise, voce escolheu um opção não muito apropriada.\n Sendo assim tenho a seguinte resposta para você : Todo esforço tem a sua recompensa !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto você acha que empenha em trabalho na sua vida ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Você ainda precida trabalhar muito !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Você está no caminho, continue !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Já pode parar de trabalhar, ficou rico !");
	 			}
	 			
	 			  
	 			break;
	 			
	 		case 2 :
	 			repetirMenu = false;
	 			System.out.println("Você escolheu a opção 2.");
	 			System.out.println("De acordo com  a minha análise, voce escolheu um opção muito sábia.\n Sendo assim tenho a seguinte resposta para você : Envelhecer é um processo natural \na qual perdemos medo da vida!");
	 			
	 			System.out.println("Atualmente de 0 a 100, como você acha que está envelhecendo ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Você ainda precisa se cuida mais !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Você está no caminho da beleza eterna!");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Você já está imortal, parabéns!");
	 			}
	 			
	 			
	 			break;
	 			
	 		case 3 :
	 			repetirMenu = false;
	 			System.out.println("Você escolheu a opção 3.");
System.out.println("De acordo com  a minha análise, voce escolheu um opção bem interessante.\n Sendo assim tenho a seguinte resposta para você : Viva sua vida intensamente e \nseja sua própria inspiração !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto você empenha em cuidar da sua vida ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Você precida parar de cuidar da vida dos outros !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Você não se importa muito com o que os outros pensam a seu respeito !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Parabéns, você já é autossuficiente");
	 			}
	 			
	 			break;
	 			
	 		case 4 :
	 			repetirMenu = false;
	 			System.out.println("Você escolheu a opção 4.");
System.out.println("De acordo com  a minha análise, voce escolheu um opção muito imaginativa.\nSendo assim tenho a seguinte resposta para você : Seu superpoder é ser você mesmo !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto você acha que tem de superpoder ?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Você precisa encontrar seus verdadeiros superpoderes");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Você está no caminho, e já tem algum superpoder !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Você já tem muitos superpoderes, ajude o ser humano !");
	 			}
	 			
	 			break;
	 			
	 		case 5 :
	 			repetirMenu = false;
	 			System.out.println("Você escolheu a opção 5.");
System.out.println("De acordo com  a minha análise, voce escolheu um opção muito imaginativa.\nSendo assim tenho a seguinte resposta para você : A fantasia e a criatividade são chaves da imaginação !");
	 			
	 			System.out.println("Atualmente de 0 a 100, quanto você acha que é inteligente?");
	 			quantidadeEsforco = leitor.nextInt();
	 			if (quantidadeEsforco >=0 && quantidadeEsforco <= 30) {
	 				System.out.println("Você precisa estudar mais !");
	 			}
	 			if (quantidadeEsforco >=31 && quantidadeEsforco <=60){
	 				System.out.println("Você esta no caminho, já tem algum nível de sabedoria !");	
	 			}
	 			if (quantidadeEsforco >=61 && quantidadeEsforco <=100) {
	 				System.out.println("Você é um verdadeiro professor da sabedoria, parabéns !");
	 			}
	 			
	 			
	 			break;
	 			
	 		default : 
	 			
	 			System.out.println("Você escolheu um opção inválida, volte e analise seu cérebro !");
	 			break;
	 	    }
	     }
	     
	     System.out.println(nome + " obrigado por jogar !");
	     System.out.println("Espero que você tenha aprendido mais sobre os Labirintos da vida.\nFaça esolhas sábia e sempre ajude o próximo nas suas caminhadas !");
		 leitor.close();

	}

}
