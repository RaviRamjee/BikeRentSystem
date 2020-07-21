package com.bike.bean;

public class User {
   private int id;
   private String name;
   private String emailid;
   private String password;
   private String mobile_no;
   //private String profile_pic;

   public User() {
   }

   public User(int id, String name, String emailid, String password, String mobile_no) {
       this.id = id;
       this.name = name;
       this.emailid = emailid;
       this.password = password;
       this.mobile_no = mobile_no;
   }

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + ", mobile_no="
			+ mobile_no + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getMobile_no() {
	return mobile_no;
}

public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}

  

}
