public int maxProfit(int[] prices) {
		 if (prices.length == 0) {
			 return 0 ;
		 }		
		 int max = 0 ;
		 int curmin = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if (prices[i] > curmin) {
	    		 max = Math.max(max, prices[i] - curmin) ;
	    	 } else{
	    		curmin = prices[i];  
	    	 }
	     }	     
	    return  max ;
	 }