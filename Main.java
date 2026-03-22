package primeiraAplicacaoJavaAlura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Q1
        /*
        System.out.println("Digite um número: ");

        float num=teclado.nextFloat();
            System.out.println("Digite um numero sem vírgula");
        if(num%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }


        //Q2
        System.out.println("Digite o 1 numero: ");
        int num1=teclado.nextInt();
        System.out.println("Digite o 2 numero: ");
        int num2=teclado.nextInt();
        if(num1==num2){
            System.out.println("Iguais");
        }
        else{
            System.out.println("Diferentes");
            if(num1>num2){
                System.out.println("O primeiro é maior");
            }
            else
                System.out.println("O segundo é maior");
        }


        //Q3
        int escolha;

        System.out.println("""
                Escolha a sua opcao:
                1 - Calcular area quadrado
                2 - calcular area circulo
                """);
        escolha = teclado.nextInt();
        if (escolha==1){
            System.out.println("Digite o lado do quadrado: ");
            double lado = teclado.nextDouble();
            double area = lado*lado;
            System.out.printf("A área é %.2f",area);
        }
        else if (escolha==2) {
            System.out.println("Digite o raio: ");
            double raio = teclado.nextDouble();
            double area = PI*(raio*raio);
            System.out.printf("A area do circulo é: %.2f",area);
        }


        //Q4
        int numero;
        System.out.print("Digite o numero: ");
        numero = teclado.nextInt();
        for (int i=0;i<11;i++){
            System.out.printf("%d" + " X %d = " + "%d \n",numero,i,numero*i);

        }


        //Q6

        while(numero>0){
            numero--;
            System.out.println("%d * ");
            fatorial = numero*fatorial;
        }
        System.out.println(" é = %d",fatorial);


        //Q6
        int numero;
        int fatorial=1;
        int soma=0;
        System.out.print("Digite o numero: ");
        numero = teclado.nextInt();
        for(int z =numero;z>=0;z--) {
            fatorial = 1;
            for (int i = z; i > 0; i--) {
                fatorial = fatorial * i;
            }
            System.out.println(fatorial);
            soma=soma+fatorial;
        }
        System.out.println(soma);


        //Switch Case
        int i = 1;
        String nomeDia;
        switch (i) {
            case 1:
                System.out.println("a");
                return;
            case 2 :
                System.out.println("b");
                break;
            case 3 :
                System.out.println("c");
                break;
            default:
                System.out.println("d");
        }


        //Q11
        int numMaquina = new Random().nextInt(100);
        for(int i=1; i<6;i++){
            System.out.println("Número: ");
            int numHumano= teclado.nextInt();
            if (numHumano==numMaquina){
                System.out.printf("Voce acertou ! Numero da maquina: %d e o seu %d",numMaquina,numHumano);
                break;
            }
            else if (numHumano<numMaquina){
                System.out.println("Aumenta o numero");
            }
            else if (numHumano>numMaquina){
                System.out.println("Abaixe o numero");
            }

        }
        System.out.println("PERDEU!!!!!");
        */
        //DESAFIO
        System.out.print("""
                *******************************************************
                Dados iniciais do cliente:
                
                Nome:            Jacqueline Oliveira
                Tipo conta:      Corrente
                Saldo inicial:   R$2500,00
                *******************************************************
                """);
        double saldo = 2500,recebe=0,transfere=0;
        int operacao=0;
        while (operacao != 4){
            if (operacao<1 || operacao>4){
                System.out.println("Entrada inválida! \n");
            }
            System.out.println("""
                    Operacoes
                    
                    1- Consultar saldos 
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    """);
            operacao= teclado.nextInt();
            switch (operacao){
                case 1:
                    System.out.printf("Seu saldo é: R$%.2f\n",saldo);

                    break;
                case 2:
                    System.out.print("Digite o valor que será recebido: ");
                    recebe=teclado.nextDouble();
                    saldo += recebe;
                    System.out.printf("\nSaldo atualizado: R$%.2f\n",saldo);

                    break;
                case 3:
                    System.out.print("\nDigite o valor que será transferido: ");
                    transfere=teclado.nextDouble();
                    if (transfere>saldo){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    saldo -= transfere;
                    System.out.printf("\nSaldo atualizado: R$%.2f\n",saldo);

                    break;
                case 4:
                    break;
            }

        }



    }

}
