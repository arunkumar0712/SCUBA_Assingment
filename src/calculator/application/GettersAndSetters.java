package calculator.application;

public class GettersAndSetters extends calculatorOperations  {
	
	calculatorOperations objSum = new calculatorOperations();    				// Creating objects for class calculatorOperations
	calculatorOperations objDiff=new calculatorOperations();					//     				|
	calculatorOperations objMul=new calculatorOperations();						//					|
	calculatorOperations objDiv=new calculatorOperations();						//					V
	
	
	public calculatorOperations getObjSum() {
		return objSum;
	}
	public void setObjSum(calculatorOperations objSum) {
		this.objSum = objSum;
	}
	
	public calculatorOperations getObjDiff() {
		return objDiff;
	}
	public void setObjDiff(calculatorOperations objDiff) {
		this.objDiff = objDiff;
	}
	public calculatorOperations getObjMul() {
		return objMul;
	}
	public void setObjMul(calculatorOperations objMul) {
		this.objMul = objMul;
	}
	public calculatorOperations getObjDiv() {
		return objDiv;
	}
	public void setObjDiv(calculatorOperations objDiv) {
		this.objDiv = objDiv;
	}
}
