package com.bike.bean;

public class BookingDetails {

	private int bookingd_id;
    private String bookingd_name;
    private String bookingd_email;
    private String bookingd_phone;
    private String bookingd_dlno;
    private String bookingd_dob;
    private String bookingd_pickup_type;
    //private String bookingd_terms;
    //private String queryTime;

    public BookingDetails() {
    }
    
    

    public BookingDetails(int bookingd_id, String bookingd_name, String bookingd_email, String bookingd_phone, String bookingd_dlno, String bookingd_dob, String bookingd_pickup_type) {
        this.bookingd_id = bookingd_id;
        this.bookingd_name = bookingd_name;
        this.bookingd_email = bookingd_email;
        this.bookingd_phone = bookingd_phone;
        this.bookingd_dlno = bookingd_dlno;
        this.bookingd_dob = bookingd_dob;
        this.bookingd_pickup_type = bookingd_pickup_type;
    }



	@Override
	public String toString() {
		return "BookingDetails [bookingd_id=" + bookingd_id + ", bookingd_name=" + bookingd_name + ", bookingd_email="
				+ bookingd_email + ", bookingd_phone=" + bookingd_phone + ", bookingd_dlno=" + bookingd_dlno
				+ ", bookingd_dob=" + bookingd_dob + ", bookingd_pickup_type=" + bookingd_pickup_type + "]";
	}



	public int getBookingd_id() {
		return bookingd_id;
	}



	public void setBookingd_id(int bookingd_id) {
		this.bookingd_id = bookingd_id;
	}



	public String getBookingd_name() {
		return bookingd_name;
	}



	public void setBookingd_name(String bookingd_name) {
		this.bookingd_name = bookingd_name;
	}



	public String getBookingd_email() {
		return bookingd_email;
	}



	public void setBookingd_email(String bookingd_email) {
		this.bookingd_email = bookingd_email;
	}



	public String getBookingd_phone() {
		return bookingd_phone;
	}



	public void setBookingd_phone(String bookingd_phone) {
		this.bookingd_phone = bookingd_phone;
	}



	public String getBookingd_dlno() {
		return bookingd_dlno;
	}



	public void setBookingd_dlno(String bookingd_dlno) {
		this.bookingd_dlno = bookingd_dlno;
	}



	public String getBookingd_dob() {
		return bookingd_dob;
	}



	public void setBookingd_dob(String bookingd_dob) {
		this.bookingd_dob = bookingd_dob;
	}



	public String getBookingd_pickup_type() {
		return bookingd_pickup_type;
	}



	public void setBookingd_pickup_type(String bookingd_pickup_type) {
		this.bookingd_pickup_type = bookingd_pickup_type;
	}
}
