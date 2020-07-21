package com.bike.bean;

public class Bike {
	private int bike_id;
    private String bike_name;
    private String bike_description;
    private String bike_category;
    private String bike_company;
    private String bike_Model;
    private String bike_RC_No;
    private String bike_RC_Name;
    private String bike_RC_RegDate;
    private String bike_RC_ExpDate;
    private String bike_RC_CHNO;
    private String bike_RC_EnginNo;
    private String bike_YearMfg;
    private int bike_NoOfGear;
    //private String bike_img;
    private String bike_color;
    private int selfstart;
    private int bike_Engin_CC;
    private int tariff_id;
    private int topup_id;
    private int status;
    private String timestamp;

    public Bike() {
    }
    
    

    public Bike(int bike_id, String bike_name, String bike_description, String bike_category, String bike_company, String bike_Model, String bike_RC_No, String bike_RC_Name, String bike_RC_RegDate, String bike_RC_ExpDate, String bike_RC_CHNO, String bike_RC_EnginNo, String bike_YearMfg, int bike_NoOfGear, String bike_color, int selfstart, int bike_Engin_CC, int tariff_id, int topup_id, int status, String timestamp) {
        this.bike_id = bike_id;
        this.bike_name = bike_name;
        this.bike_description = bike_description;
        this.bike_category = bike_category;
        this.bike_company = bike_company;
        this.bike_Model = bike_Model;
        this.bike_RC_No = bike_RC_No;
        this.bike_RC_Name = bike_RC_Name;
        this.bike_RC_RegDate = bike_RC_RegDate;
        this.bike_RC_ExpDate = bike_RC_ExpDate;
        this.bike_RC_CHNO = bike_RC_CHNO;
        this.bike_RC_EnginNo = bike_RC_EnginNo;
        this.bike_YearMfg = bike_YearMfg;
        this.bike_NoOfGear = bike_NoOfGear;
        //this.bike_img = bike_img;
        this.bike_color = bike_color;
        this.selfstart = selfstart;
        this.bike_Engin_CC = bike_Engin_CC;
        this.tariff_id = tariff_id;
        this.topup_id = topup_id;
        this.status = status;
        this.timestamp = timestamp;
    }



	public int getBike_id() {
		return bike_id;
	}



	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}



	public String getBike_name() {
		return bike_name;
	}



	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}



	public String getBike_description() {
		return bike_description;
	}



	public void setBike_description(String bike_description) {
		this.bike_description = bike_description;
	}



	public String getBike_category() {
		return bike_category;
	}



	public void setBike_category(String bike_category) {
		this.bike_category = bike_category;
	}



	public String getBike_company() {
		return bike_company;
	}



	public void setBike_company(String bike_company) {
		this.bike_company = bike_company;
	}



	public String getBike_Model() {
		return bike_Model;
	}



	public void setBike_Model(String bike_Model) {
		this.bike_Model = bike_Model;
	}



	public String getBike_RC_No() {
		return bike_RC_No;
	}



	public void setBike_RC_No(String bike_RC_No) {
		this.bike_RC_No = bike_RC_No;
	}



	public String getBike_RC_Name() {
		return bike_RC_Name;
	}



	public void setBike_RC_Name(String bike_RC_Name) {
		this.bike_RC_Name = bike_RC_Name;
	}



	public String getBike_RC_RegDate() {
		return bike_RC_RegDate;
	}



	public void setBike_RC_RegDate(String bike_RC_RegDate) {
		this.bike_RC_RegDate = bike_RC_RegDate;
	}



	public String getBike_RC_ExpDate() {
		return bike_RC_ExpDate;
	}



	public void setBike_RC_ExpDate(String bike_RC_ExpDate) {
		this.bike_RC_ExpDate = bike_RC_ExpDate;
	}



	public String getBike_RC_CHNO() {
		return bike_RC_CHNO;
	}



	public void setBike_RC_CHNO(String bike_RC_CHNO) {
		this.bike_RC_CHNO = bike_RC_CHNO;
	}



	public String getBike_RC_EnginNo() {
		return bike_RC_EnginNo;
	}



	public void setBike_RC_EnginNo(String bike_RC_EnginNo) {
		this.bike_RC_EnginNo = bike_RC_EnginNo;
	}



	public String getBike_YearMfg() {
		return bike_YearMfg;
	}



	public void setBike_YearMfg(String bike_YearMfg) {
		this.bike_YearMfg = bike_YearMfg;
	}



	public int getBike_NoOfGear() {
		return bike_NoOfGear;
	}



	public void setBike_NoOfGear(int bike_NoOfGear) {
		this.bike_NoOfGear = bike_NoOfGear;
	}



	public String getBike_color() {
		return bike_color;
	}



	public void setBike_color(String bike_color) {
		this.bike_color = bike_color;
	}



	public int getSelfstart() {
		return selfstart;
	}



	public void setSelfstart(int selfstart) {
		this.selfstart = selfstart;
	}



	public int getBike_Engin_CC() {
		return bike_Engin_CC;
	}



	public void setBike_Engin_CC(int bike_Engin_CC) {
		this.bike_Engin_CC = bike_Engin_CC;
	}



	public int getTariff_id() {
		return tariff_id;
	}



	public void setTariff_id(int tariff_id) {
		this.tariff_id = tariff_id;
	}



	public int getTopup_id() {
		return topup_id;
	}



	public void setTopup_id(int topup_id) {
		this.topup_id = topup_id;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}



	@Override
	public String toString() {
		return "Bike [bike_id=" + bike_id + ", bike_name=" + bike_name + ", bike_description=" + bike_description
				+ ", bike_category=" + bike_category + ", bike_company=" + bike_company + ", bike_Model=" + bike_Model
				+ ", bike_RC_No=" + bike_RC_No + ", bike_RC_Name=" + bike_RC_Name + ", bike_RC_RegDate="
				+ bike_RC_RegDate + ", bike_RC_ExpDate=" + bike_RC_ExpDate + ", bike_RC_CHNO=" + bike_RC_CHNO
				+ ", bike_RC_EnginNo=" + bike_RC_EnginNo + ", bike_YearMfg=" + bike_YearMfg + ", bike_NoOfGear="
				+ bike_NoOfGear + ", bike_color=" + bike_color + ", selfstart=" + selfstart + ", bike_Engin_CC="
				+ bike_Engin_CC + ", tariff_id=" + tariff_id + ", topup_id=" + topup_id + ", status=" + status
				+ ", timestamp=" + timestamp + "]";
	}

   

}
