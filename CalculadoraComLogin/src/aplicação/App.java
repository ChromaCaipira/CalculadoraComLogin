package aplica��o;

import modelagem.Usuario;

import java.util.Scanner; //Biblioteca do Scanner

public class App {

	public static void main(String[] args) {
		//Fun��o SCAN do java.util.Scanner
		Scanner scan = new Scanner(System.in);
		
		//REGISTRO
		System.out.println("Informe seu nome completo: ");
		String nom = scan.next(); //Escaneia a primeira palavra/primeiro nome
		nom += scan.nextLine(); //Escaneia o resto da linha/nome
		
		System.out.println("Informe seu login de acesso (sem espa�os): ");
		String log = scan.next();
		
		System.out.println("Informe sua senha de acesso (sem espa�os): ");
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
				System.out.println("Selecione uma das op��es: \n" + "(1- soma, 2- subtra��o, 3- multiplica��o, "
						+ "4- divis�o, 5- fun��o(ax+b), 6- potencia��o, 7- sair): ");
				int escolha = scan.nextInt();
				
				if(escolha == 1) { //SOMA
					System.out.println("Digite um n�mero: ");
					double a = scan.nextDouble();
					System.out.println("Digite outro n�mero: ");
					double b = scan.nextDouble();
					
					System.out.println(calc.soma(a,b));
				} else {
					
					if(escolha == 2) { //SUBTRA��O
						System.out.println("Digite um n�mero: ");
						double a = scan.nextDouble();
						System.out.println("Digite outro n�mero: ");
						double b = scan.nextDouble();
						
						System.out.println(calc.sub(a,b));
					} else {
						
						if(escolha == 3) { //MULTIPLICA��O
							System.out.println("Digite um n�mero: ");
							double a = scan.nextDouble();
							System.out.println("Digite outro n�mero: ");
							double b = scan.nextDouble();
							
							System.out.println(calc.mult(a,b));
						} else {
							
							if(escolha == 4) { //DIVIS�O
								System.out.println("Digite um n�mero: ");
								double a = scan.nextDouble();
								System.out.println("Digite outro n�mero: ");
								double b = scan.nextDouble();
								
								System.out.println(calc.div(a,b));
							} else {
								
								if(escolha == 5) { //FUN��O
									System.out.println("Digite um n�mero: ");
									double a = scan.nextDouble();
									System.out.println("Digite outro n�mero: ");
									double b = scan.nextDouble();
									
									System.out.println(calc.fun(a,b));
								} else {
									
									if(escolha == 6) { //POTENCIA��O
										System.out.println("Digite um n�mero: ");
										double a = scan.nextDouble();
										System.out.println("Digite sua potencia��o: ");
										double p = scan.nextDouble();
										
										System.out.println(calc.pot(a,p));
									} else {
										
										if(escolha == 7) { //SA�DA
											System.out.println("Obrigado por usar nossa calculadora. Volte sempre!");
											break;
										} else {
											System.out.println("ERRO! Digite uma op��o v�lida!\n");
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("ACESSO NEGADO: Usu�rio n�o tem acesso!");
		}
	}
}
