package model;

import stack_Linny.LinnyStack;

public class StockExchange {
	
	private String name;
	private LinnyStack<Actions> actions;
	private LinnyStack<Market> markets;
	
	public StockExchange(String name) {
		this.name = name; 
		actions = null;
		markets = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinnyStack<Actions> getActions() {
		return actions;
	}

	public void setActions(LinnyStack<Actions> actions) {
		this.actions = actions;
	}

	public LinnyStack<Market> getMarkets() {
		return markets;
	}

	public void setMarkets(LinnyStack<Market> markets) {
		this.markets = markets;
	}
	
	

}
