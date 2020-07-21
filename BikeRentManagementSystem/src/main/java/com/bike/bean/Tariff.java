package com.bike.bean;

public class Tariff {

	    private int tariff_id;
	    private String tariff_name;
	    private String tariff_Details;
	    private int tariff_status;
	    private String tariff_CreateTime;

	    public Tariff() {
	    }
	    
	    

	    public Tariff(int tariff_id, String tariff_name, String tariff_Details, int tariff_status, String tariff_CreateTime) {
	        this.tariff_id = tariff_id;
	        this.tariff_name = tariff_name;
	        this.tariff_Details = tariff_Details;
	        this.tariff_status = tariff_status;
	        this.tariff_CreateTime = tariff_CreateTime;
	    }



		@Override
		public String toString() {
			return "Tariff [tariff_id=" + tariff_id + ", tariff_name=" + tariff_name + ", tariff_Details="
					+ tariff_Details + ", tariff_status=" + tariff_status + ", tariff_CreateTime=" + tariff_CreateTime
					+ "]";
		}



		public int getTariff_id() {
			return tariff_id;
		}



		public void setTariff_id(int tariff_id) {
			this.tariff_id = tariff_id;
		}



		public String getTariff_name() {
			return tariff_name;
		}



		public void setTariff_name(String tariff_name) {
			this.tariff_name = tariff_name;
		}



		public String getTariff_Details() {
			return tariff_Details;
		}



		public void setTariff_Details(String tariff_Details) {
			this.tariff_Details = tariff_Details;
		}



		public int getTariff_status() {
			return tariff_status;
		}



		public void setTariff_status(int tariff_status) {
			this.tariff_status = tariff_status;
		}



		public String getTariff_CreateTime() {
			return tariff_CreateTime;
		}



		public void setTariff_CreateTime(String tariff_CreateTime) {
			this.tariff_CreateTime = tariff_CreateTime;
		}

}
