package PackOCP12AdvancedJavaClassDesign.Bussines;

import java.util.ArrayList;

public class Aplicacao {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void listarFuncionarios(ArrayList<Funcionario> f) {
		System.out.println("Lista de Funcionários:");
		for (Funcionario c_f : f) {
			System.out.println(c_f.toString());
		}
	}

	public static void listarGerentes(ArrayList<Funcionario> f) {
		System.out.println("Lista de Gerentes:");
		for (Funcionario c_f : f) {
			if (c_f instanceof Gerente) {
				System.out.println(c_f.toString());
			}
		}
	}

	public static void listarAuxiliarAdministrativo(ArrayList<Funcionario> f) {
		System.out.println("Lista de Auxiliares Administrativos:");
		for (Funcionario c_f : f) {
			if (c_f instanceof AuxiliarAdministrativo) {
				System.out.println(c_f.toString());
			}
		}
	}

	public static void imprimirTodosNomesSetor(ArrayList<Funcionario> f) {
		System.out.println("Funcionários do Setor:");
		for (Funcionario c_f : f) {
			if (c_f instanceof Gerente) {
				Gerente g = (Gerente)c_f;
				System.out.println(g.getSetor() + " | " + g.toString());
			} else if (c_f instanceof Diretor) {
				Diretor d = (Diretor)c_f;
				System.out.println(d.getSetor() + " | " + d.toString());
			}
			System.out.println(c_f.toString());
		}
	}
}
