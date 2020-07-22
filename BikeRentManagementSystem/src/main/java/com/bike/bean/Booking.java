package com.bike.bean;

public class Booking {

	    private int booking_id;
	    private int booking_details_id;
	    private String booking_pickup_date;
	    //private String booking_pickup_time;
	    private String booking_drop_date;
	    //private String booking_drop_time;
	    private int booking_bike_id;
	    private String booking_status;
	    private String bookingTime;
	    private String topupselected;

	    public Booking() {
	    }

	    public Booking(int booking_id, int booking_details_id, String booking_pickup_date, String booking_drop_date, int booking_bike_id, String booking_status, String bookingTime, String topupselected) {
	        this.booking_id = booking_id;
	        this.booking_details_id = booking_details_id;
	        this.booking_pickup_date = booking_pickup_date;
	        this.booking_drop_date = booking_drop_date;
	        this.booking_bike_id = booking_bike_id;
	        this.booking_status = booking_status;
	        this.bookingTime = bookingTime;
	        this.topupselected = topupselected;
	    }

		@Override
		public String toString() {
			return "Booking [booking_id=" + booking_id + ", booking_details_id=" + booking_details_id
					+ ", booking_pickup_date=" + booking_pickup_date + ", booking_drop_date=" + booking_drop_date
					+ ", booking_bike_id=" + booking_bike_id + ", booking_status=" + booking_status + ", bookingTime="
					+ bookingTime + ", topupselected=" + topupselected + "]";
		}

		public int getBooking_id() {
			return booking_id;
		}

		public void setBooking_id(int booking_id) {
			this.booking_id = booking_id;
		}

		public int getBooking_details_id() {
			return booking_details_id;
		}

		public void setBooking_details_id(int booking_details_id) {
			this.booking_details_id = booking_details_id;
		}

		public String getBooking_pickup_date() {
			return booking_pickup_date;
		}

		public void setBooking_pickup_date(String booking_pickup_date) {
			this.booking_pickup_date = booking_pickup_date;
		}

		public String getBooking_drop_date() {
			return booking_drop_date;
		}

		public void setBooking_drop_date(String booking_drop_date) {
			this.booking_drop_date = booking_drop_date;
		}

		public int getBooking_bike_id() {
			return booking_bike_id;
		}

		public void setBooking_bike_id(int booking_bike_id) {
			this.booking_bike_id = booking_bike_id;
		}

		public String getBooking_status() {
			return booking_status;
		}

		public void setBooking_status(String booking_status) {
			this.booking_status = booking_status;
		}

		public String getBookingTime() {
			return bookingTime;
		}

		public void setBookingTime(String bookingTime) {
			this.bookingTime = bookingTime;
		}

		public String getTopupselected() {
			return topupselected;
		}

		public void setTopupselected(String topupselected) {
			this.topupselected = topupselected;
		}

	    
}
