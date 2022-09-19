package entities;

public class CompanyTaxPayer extends TaxPayer{
	private Integer employeeNumber;
	
	public CompanyTaxPayer() {	
	}
	
	public CompanyTaxPayer(String name, Double anualIncome, Integer employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double tax() {
		if(employeeNumber > 10) {
			return anualIncome * 0.14;
		}
		else {
			return anualIncome * 0.16;
		}
	}

}
