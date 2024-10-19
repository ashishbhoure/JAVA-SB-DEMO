package com.demo.request;

import lombok.Data;

@Data
public class Passanger {

	private String doj;
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String trainNum;
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passanger [doj=" + doj + ", fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}
	
	
}
