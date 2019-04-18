package model;
import list_Linny.LinnyList;

public class Customer {

	private String name;
	private String id;
	private double budget;
	
	private LinnyList<Actions> walletActions;
	private LinnyList<Market> walletMarket;
	
	public Customer(String name, String id, double budget) {
		
		this.name = name;
		this.id = id;
		this.budget = budget;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LinnyList<Actions> getWalletActions() {
		return walletActions;
	}

	public void setWalletActions(LinnyList<Actions> walletActions) {
		this.walletActions = walletActions;
	}

	public LinnyList<Market> getWalletMarket() {
		return walletMarket;
	}

	public void setWalletMarket(LinnyList<Market> walletMarket) {
		this.walletMarket = walletMarket;
	}
	
	
	
}
