package com.tns.override;

public class Rbi extends Sbi {
    @Override
	public String toString() {
		return "Rbi [getRateofInterest()=" + getRateofInterest() + "]";
	}

	public float getRateofInterest()
    {
    	return 8.7f;
    }
}
