package cadastroDeAlunos;


import java.util.Scanner;


public class Main {
	
public static void main (String[] args) {
	
	
	
	int opc, qtNotas ;
	float notas = 0;
	Aluno novoAluno = new Aluno();
	String nome, cpf;
	Sala novaSala = new Sala();
	Scanner teclado = new Scanner(System.in);
	
	do {
		
		System.out.println("/n--------------------");
		System.out.println("                Menu");
		System.out.println("escolha uma opção: ");
		System.out.println("1 - inserir aluno");
		System.out.println("2 - listar aluno");
		System.out.println("3 - situações");
		System.out.println("0 - sair ");
		
		
		opc = teclado.nextInt();
		teclado.nextLine();
		
		
		switch(opc) {
		case 1:
			
			System.out.println("insira o nome:");
			
			nome = teclado.nextLine();
			
			System.out.println("insira o cpf:");
			
			cpf = teclado.nextLine();
			
			novoAluno = new Aluno(nome,cpf);
			
			System.out.println("Digite a qauntidade de notas");
			qtNotas = teclado.nextInt();
			
			for(int i = 0; i < qtNotas; i++) {
				
				System.out.println(" nota " + (i + 1));
				notas = teclado.nextFloat();
				
				novoAluno.insereNotas(notas);
				
			}
			
			novaSala.insereAluno(novoAluno);
			 break;
			 
		case 2:
			
			novaSala.listarAluno();
			
			 break;
		case 3:
			
			novaSala.listarSituacoes();
			 break;
			 
		case 0 :
			System.out.println("Saindo...");
			break;
			 
			 default:
				 
				 System.out.println("opção invalida");
			 
		
		}
		
	}while(opc !=0);
	
	
	
     }
	
	


}
