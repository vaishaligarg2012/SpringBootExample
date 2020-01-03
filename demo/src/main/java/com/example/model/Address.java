package com.example.model;

import javax.persistence.Entity;


@Entity
public class Address {
       private int pincode;
       private String streatName;
       private String state;
       
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getStreatName() {
			return streatName;
		}
		public void setStreatName(String streatName) {
			this.streatName = streatName;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
       
       
}
