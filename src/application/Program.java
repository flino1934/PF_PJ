package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		List <Pessoa> pessoa = new ArrayList<>();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Numero de pessoas"));

		for (int i = 1; i <=n; i++) {
			
			String[] select = {"Pessoa Fisica","Pessoa Juridica"};
			String type = (String) JOptionPane.showInputDialog(null, "Selecione... ","Tipo de pessoa ", JOptionPane.QUESTION_MESSAGE, null, select,select[0]);
			
			if (type.equals("Pessoa Fisica")) {
				
				String name = JOptionPane.showInputDialog("Digite o nome: ");
				double  annualIncome = Double.parseDouble(JOptionPane.showInputDialog("Renda anual: "));
				double healthSpending = Double.parseDouble(JOptionPane.showInputDialog("Gastos com saude anual: "));
				
				Pessoa pf = new PessoaFisica(name, annualIncome, healthSpending);
				pessoa.add(pf);
				
			}
			
			if (type.equals("Pessoa Juridica")) {
				
				String name = JOptionPane.showInputDialog("Digite o nome: ");
				double  annualIncome = Double.parseDouble(JOptionPane.showInputDialog("Renda anual: "));
				int nEmployee = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de funcionarios"));
				
				Pessoa pj = new PessoaJuridica(name, annualIncome, nEmployee);
				pessoa.add(pj);
				
			}
			
		}
		System.out.println("Date");
		for (Pessoa pessoa2 : pessoa) {
			
			System.out.println(pessoa2);
			System.out.println("---------------");
			System.out.println();
			
		}
		
	}

}
