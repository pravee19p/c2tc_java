package com.tns.commission;

public class Commissioncalc
{
	
	public void calccommission(Commission c)
	{
	 
		if(c.getSales_amount()>=100000) {
			
			c.setCommission(10);
			
		}
		else if(c.getSales_amount()>=50000 && c.getSales_amount()<100000 )
		{
			c.setCommission(5);
			
		}
		else if( c.getSales_amount()>=30000 && c.getSales_amount()<50000)
		{
			c.setCommission(3);
		}
		else
		{
			c.setCommission(0);
		}

    }
}
