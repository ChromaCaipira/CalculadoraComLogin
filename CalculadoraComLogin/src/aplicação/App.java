package aplicação;

import modelagem.Usuario;

import java.util.Scanner; //Biblioteca do Scanner

public class App {

	public static void main(String[] args) {
		//Função SCAN do java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		//REGISTRO
		System.out.println("Informe seu nome completo: ");
		String nom = scan.next(); //Escaneia a primeira palavra/primeiro nome
		nom += scan.nextLine(); //Escaneia o resto da linha/nome
		
		System.out.println("Informe seu login de acesso (sem espaços): ");
		String log = scan.next();
		
		System.out.println("Informe sua senha de acesso (sem espaços): ");
		String sen = scan.next();
		
		Usuario user = new Usuario(nom, log, sen);
		Calculadora calc = new Calculadora(user);
		
		//LOGIN
		System.out.println("Login: ");
		String loglogin = scan.next();
		
		System.out.println("Senha: ");
		String senlogin = scan.next();
		
		if(log.intern() == loglogin.intern() && sen.intern() == senlogin.intern()) {
			System.out.println("Bem Vindo, " + nom);
			
			while(true) {
				System.out.println("Selecione uma das opções: \n" + "(1- soma, 2- subtração, 3- multiplicação, "
						+ "4- divisão, 5- função(ax+b), 6- potenciação, 7- sair): ");
				int escolha = scan.nextInt();
				
				if(escolha == 1) { //SOMA
					System.out.println("Digite um número: ");
					double a = scan.nextDouble();
					System.out.println("Digite outro número: ");
					double b = scan.nextDouble();
					
					System.out.println(calc.soma(a,b));
				} else {
					
					if(escolha == 2) { //SUBTRAÇÃO
						System.out.println("Digite um número: ");
						double a = scan.nextDouble();
						System.out.println("Digite outro número: ");
						double b = scan.nextDouble();
						
						System.out.println(calc.sub(a,b));
					} else {
						
						if(escolha == 3) { //MULTIPLICAÇÃO
							System.out.println("Digite um número: ");
							double a = scan.nextDouble();
							System.out.println("Digite outro número: ");
							double b = scan.nextDouble();
							
							System.out.println(calc.mult(a,b));
						} else {
							
							if(escolha == 4) { //DIVISÃO
								System.out.println("Digite um número: ");
								double a = scan.nextDouble();
								System.out.println("Digite outro número: ");
								double b = scan.nextDouble();
								
								System.out.println(calc.div(a,b));
							} else {
								
								if(escolha == 5) { //FUNÇÃO
									System.out.println("Digite um número: ");
									double a = scan.nextDouble();
									System.out.println("Digite outro número: ");
									double b = scan.nextDouble();
									
									System.out.println(calc.fun(a,b));
								} else {
									
									if(escolha == 6) { //POTENCIAÇÃO
										System.out.println("Digite um número: ");
										double a = scan.nextDouble();
										System.out.println("Digite sua potenciação: ");
										double p = scan.nextDouble();
										
										System.out.println(calc.pot(a,p));
									} else {
										
										if(escolha == 7) { //SAÍDA
											System.out.println("Obrigado por usar nossa calculadora. Volte sempre!");
											break;
										} else {
											System.out.println("ERRO! Digite uma opção válida!\n");
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("ACESSO NEGADO: Usuário não tem acesso!");
		}
	}
}
