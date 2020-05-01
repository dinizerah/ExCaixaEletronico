package caixaeletronico;

import java.util.Scanner;
        
public class Caixaeletronico {

    public static void main(String[] args) {
        long cpf = 12345678900l; long cpfdigitado = 0l;
        int senha = 1234; int senhadigitada = 0;
        int repetirsenha = 0;
        int saldo = 1000;
        int soma = 0;
        int saque = 0;
        int operacao = 0;
        int telainicial = 0;
        
        
        Scanner ler = new Scanner(System.in);
        
        do{
          
        System.out.println("Digite seu cpf: ");
        cpfdigitado = ler.nextLong();
        
        if(cpfdigitado == cpf){
            System.out.println("Acesso permitido.");
             }
            
        else {
            System.out.println("Acesso não permitido");
            System.exit(0);
            }
        
        do{
            
        System.out.println("Digite sua senha: ");
        senhadigitada = ler.nextInt();
        
        if(senhadigitada == senha){
            System.out.println("Direcionando para o menu...");
            break;
        }
        
        else if (senhadigitada != senha){
            System.out.println("Senha incorreta.");
            repetirsenha++;
            if(repetirsenha == 2){
                System.out.println("Conta bloqueada.");
                System.exit(0);
            }
        }
      } while(repetirsenha < 2);
        
        System.out.println("Saldo inicial: R$1000,00");
        
        do{
        
        System.out.println("==========================");
        System.out.println("1 - Saldo");
        System.out.println("==========================");
        System.out.println("2 - Depósito");
        System.out.println("==========================");
        System.out.println("3 - Saque");
        System.out.println("==========================");
        System.out.println("0 - SAIR");
        System.out.println("==========================");
        
        do{
            
        System.out.println("Escolha uma operação: ");
        operacao = ler.nextInt();
       
        switch(operacao){
            case 1:
                System.out.println("O Saldo atual é de: " + saldo);
                break;
            
            case 2:
                System.out.println("Digite o valor do depósito: ");
                soma = ler.nextInt();
                saldo = soma + saldo;
                System.out.println("O saldo é de: " + saldo);
                break;
            
            case 3:
                System.out.println("Digite o valor do saque: ");
                saque = ler.nextInt();
                saldo = saldo - saque;
                System.out.println("O saldo é de: " + saldo);
                break;
                
            case 0:
                break;
                
            default:
        
                break;
                
        }
         }while(operacao != 1 && operacao != 2 && operacao != 3 && operacao != 0);
       
        
        }while(operacao != 0);
        
       
        
        }while(telainicial < 1);
    }
}