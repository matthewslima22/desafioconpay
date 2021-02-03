package com.desafioconpay.conpay;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConpayApplication.class, args);
		
		
		 Scanner sc = new Scanner (System.in);
		
		int opp;
		do {		
			System.out.println("1.Registrar Nova conta");
			System.out.println("2.Fazer recarga de celular");
			System.out.println("3.Tranferencia bancaria");
			System.out.println("4.Login");
			System.out.println("5.Sair");
			opp = sc.nextInt();
			
			if(opp==1){
				System.out.println("Digite seu nome:");
				sc.nextLine();
				sc.nextLine();
				System.out.println("Digite seu Endereço:");
				sc.nextLine();
				System.out.println("Digite seu cpf:");
				sc.nextInt();
				System.out.println("Digite sua senha(somente numeros):");
				sc.nextInt();
				System.out.println("Conta criada com sucesso ");
				System.out.println("");

				
			}
			if(opp==2) {
				System.out.println("1.Digite o numero do celular que deseja efetuar a recarga");
				sc.nextInt();
				System.out.println("");
				System.out.println("1.Recarga 10 reais");
				System.out.println("2.Recarga 15 reais");
				System.out.println("3.Recarga 25 reais");
				System.out.println("4.Recarga 30 reais");
				System.out.println("5.Outro valor reais");
				sc.nextInt();
				sc.nextLine();
				if(opp==1) {
					System.out.println("Recarga efetuada com sucesso");
				}

				if(opp==2) {
					System.out.println("Recarga efetuada com sucesso");
				}
				if(opp==3) {
					System.out.println("Recarga efetuada com sucesso");
				}
				if(opp==4) {
					System.out.println("Recarga efetuada com sucesso");
				}
				if(opp==5) {
					System.out.println("Digite o valor desejado");
					sc.nextInt();
						System.out.println("Recarga efetuada com sucesso");
					}
				System.out.println("");

				}
				
				
			if(opp==3) {
				System.out.println("Digite o cpf para transferir:");
				sc.nextInt();
				System.out.println("Digite o valor a ser transferido:");
				sc.nextDouble();
				System.out.println("Tranferencia efetuada com sucesso");
				System.out.println("");


			}
			
			if(opp==4) {
				System.out.println("Digite o cpf:");
				sc.nextInt();
				System.out.println("Digite a senha:");
				sc.nextInt();
				System.out.println("Login efetuado com sucesso");
				System.out.println("");

				

			}
			
		}while(opp!=5);
		sc.close();
	}
	
	

}
