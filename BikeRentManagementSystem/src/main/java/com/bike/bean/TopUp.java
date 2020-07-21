package com.bike.bean;

public class TopUp {
	    private int topup_id;
	    private String topup_name;
	    private double topup_Amount_50km;
	    private double topup_Amount_100km;
	    private double topup_Amount_150km;
	    private double topup_Amount_200km;
	    private double topup_Amount_250km;
	    private double topup_Amount_300km;
	    private int topup_status;
	    private String topup_addtime;

	    public TopUp() {
	    }
	    
	    

	    public TopUp(int topup_id, String topup_name, double topup_Amount_50km, double topup_Amount_100km, double topup_Amount_150km, double topup_Amount_200km, double topup_Amount_250km, double topup_Amount_300km, int topup_status, String topup_addtime) {
	        this.topup_id = topup_id;
	        this.topup_name = topup_name;
	        this.topup_Amount_50km = topup_Amount_50km;
	        this.topup_Amount_100km = topup_Amount_100km;
	        this.topup_Amount_150km = topup_Amount_150km;
	        this.topup_Amount_200km = topup_Amount_200km;
	        this.topup_Amount_250km = topup_Amount_250km;
	        this.topup_Amount_300km = topup_Amount_300km;
	        this.topup_status = topup_status;
	        this.topup_addtime = topup_addtime;
	    }



		@Override
		public String toString() {
			return "TopUp [topup_id=" + topup_id + ", topup_name=" + topup_name + ", topup_Amount_50km="
					+ topup_Amount_50km + ", topup_Amount_100km=" + topup_Amount_100km + ", topup_Amount_150km="
					+ topup_Amount_150km + ", topup_Amount_200km=" + topup_Amount_200km + ", topup_Amount_250km="
					+ topup_Amount_250km + ", topup_Amount_300km=" + topup_Amount_300km + ", topup_status="
					+ topup_status + ", topup_addtime=" + topup_addtime + "]";
		}



		public int getTopup_id() {
			return topup_id;
		}



		public void setTopup_id(int topup_id) {
			this.topup_id = topup_id;
		}



		public String getTopup_name() {
			return topup_name;
		}



		public void setTopup_name(String topup_name) {
			this.topup_name = topup_name;
		}



		public double getTopup_Amount_50km() {
			return topup_Amount_50km;
		}



		public void setTopup_Amount_50km(double topup_Amount_50km) {
			this.topup_Amount_50km = topup_Amount_50km;
		}



		public double getTopup_Amount_100km() {
			return topup_Amount_100km;
		}



		public void setTopup_Amount_100km(double topup_Amount_100km) {
			this.topup_Amount_100km = topup_Amount_100km;
		}



		public double getTopup_Amount_150km() {
			return topup_Amount_150km;
		}



		public void setTopup_Amount_150km(double topup_Amount_150km) {
			this.topup_Amount_150km = topup_Amount_150km;
		}



		public double getTopup_Amount_200km() {
			return topup_Amount_200km;
		}



		public void setTopup_Amount_200km(double topup_Amount_200km) {
			this.topup_Amount_200km = topup_Amount_200km;
		}



		public double getTopup_Amount_250km() {
			return topup_Amount_250km;
		}



		public void setTopup_Amount_250km(double topup_Amount_250km) {
			this.topup_Amount_250km = topup_Amount_250km;
		}



		public double getTopup_Amount_300km() {
			return topup_Amount_300km;
		}



		public void setTopup_Amount_300km(double topup_Amount_300km) {
			this.topup_Amount_300km = topup_Amount_300km;
		}



		public int getTopup_status() {
			return topup_status;
		}



		public void setTopup_status(int topup_status) {
			this.topup_status = topup_status;
		}



		public String getTopup_addtime() {
			return topup_addtime;
		}



		public void setTopup_addtime(String topup_addtime) {
			this.topup_addtime = topup_addtime;
		}

}
