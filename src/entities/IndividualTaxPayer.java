package entities;

public class IndividualTaxPayer extends TaxPayer {
	private Double healthExpenditures;
	
	public IndividualTaxPayer() {
		
	}
	
	public IndividualTaxPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0;
		if(anualIncome > 20000.0) {
			sum += anualIncome * 0.25;
		}
		else {
			sum += anualIncome * 0.20;
		}
		if(healthExpenditures > 0) {
			sum -= healthExpenditures * 0.5;
		}
		return sum;
	}

}
