package com.example.handlingformsubmission.model;

import java.sql.Time;

public class Flight {
	private Time desde;
	private Time hasta;
	private String flightId;
	private int segmentNumber;
	private String origAirport;
	private Time departTime;
	private String destAirport;
	private Time arriveTime;
	private String meal;
	private double flyingTime;
	private int miles;
	private String aircraft;
	
	public Time getDesde() {
		return desde;
	}
	public void setDesde(Time desde) {
		this.desde = desde;
	}
	public Time getHasta() {
		return hasta;
	}
	public void setHasta(Time hasta) {
		this.hasta = hasta;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public int getSegmentNumber() {
		return segmentNumber;
	}
	public void setSegmentNumber(int segmentNumber) {
		this.segmentNumber = segmentNumber;
	}
	public String getOrigAirport() {
		return origAirport;
	}
	public void setOrigAirport(String origAirport) {
		this.origAirport = origAirport;
	}
	public Time getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Time departTime) {
		this.departTime = departTime;
	}
	public String getDestAirport() {
		return destAirport;
	}
	public void setDestAirport(String destAirport) {
		this.destAirport = destAirport;
	}
	public Time getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Time arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public double getFlyingTime() {
		return flyingTime;
	}
	public void setFlyingTime(double flyingTime) {
		this.flyingTime = flyingTime;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
}
