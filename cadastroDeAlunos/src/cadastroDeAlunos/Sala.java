package cadastroDeAlunos;

import java.util.ArrayList;

public class Sala {
	
	ArrayList<Aluno>ListadeAluno;
	
	public Sala() {
		
		this.ListadeAluno = new ArrayList<>();
		
		
		}
	

	void insereAluno(Aluno novoAluno) {
		
		novoAluno.calcularNotas();
		
		ListadeAluno.add(novoAluno);
		
	}
	
	void listarAluno() {
		
		System.out.println("lista de aluno");
		
		for(Aluno alunoNaLista:ListadeAluno) {
			
			alunoNaLista.listar();
			
			
		}
			
			
		
	}
	
	void listarSituacoes(){
		
		System.out.println("situações");
		
		for(Aluno alunoNaLista:ListadeAluno) {
		
			alunoNaLista.mostraSitacoes();
		}
	}

}
