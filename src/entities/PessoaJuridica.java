package entities;

public class PessoaJuridica extends Pessoa {

	private Integer nEmployee;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String name, Double annualIncome, Integer nEmployee) {
		super(name, annualIncome);
		this.nEmployee = nEmployee;
	}

	public Integer getnEmployee() {
		return nEmployee;
	}

	public void setnEmployee(Integer nEmployee) {
		this.nEmployee = nEmployee;
	}

	@Override
	public Double tax() {

		if (nEmployee > 10) {

			return getAnnualIncome()*0.14;

		} else {
			return getAnnualIncome() * 0.16;
		}

	}

	@Override
	public String toString() {

		return "Name: " + getName() + " Annual Income: " + getAnnualIncome() 
		+ "\nTax: " + tax();

	}

}
