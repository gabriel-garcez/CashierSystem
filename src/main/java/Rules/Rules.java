package Rules;

public class Rules {
	
	private FreeRule freeRule; 
	private ReducedPriceRule reducedPriceRule;
	private FractionPriceRule fractionPriceRule;
	public FreeRule getFreeRule() {
		return freeRule;
	}
	public void setFreeRule(FreeRule freeRule) {
		this.freeRule = freeRule;
	}
	public ReducedPriceRule getReducedPriceRule() {
		return reducedPriceRule;
	}
	public void setReducedPriceRule(ReducedPriceRule reducedPriceRule) {
		this.reducedPriceRule = reducedPriceRule;
	}
	public FractionPriceRule getFractionPriceRule() {
		return fractionPriceRule;
	}
	public void setFractionPriceRule(FractionPriceRule fractionPriceRule) {
		this.fractionPriceRule = fractionPriceRule;
	}



}
