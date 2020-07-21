package com.bike.bean;

public class Contact {

	private int contact_id;
    private String contact_name;
    private String contact_email;
    private String contact_phone;
    private String contact_message;
    //private int contact_isread;
    private String contact_time;

    public Contact() {
    }
    
    

    public Contact(int contact_id, String contact_name, String contact_email, String contact_phone, String contact_message, String contact_time) {
        this.contact_id = contact_id;
        this.contact_name = contact_name;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.contact_message = contact_message;
        this.contact_time = contact_time;
    }



	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", contact_name=" + contact_name + ", contact_email="
				+ contact_email + ", contact_phone=" + contact_phone + ", contact_message=" + contact_message
				+ ", contact_time=" + contact_time + "]";
	}



	public int getContact_id() {
		return contact_id;
	}



	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}



	public String getContact_name() {
		return contact_name;
	}



	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}



	public String getContact_email() {
		return contact_email;
	}



	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}



	public String getContact_phone() {
		return contact_phone;
	}



	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}



	public String getContact_message() {
		return contact_message;
	}



	public void setContact_message(String contact_message) {
		this.contact_message = contact_message;
	}



	public String getContact_time() {
		return contact_time;
	}



	public void setContact_time(String contact_time) {
		this.contact_time = contact_time;
	}
}

