package com.curso.escuela.DummyBase;

public class IngresosServices {
	private float sueldo;
	private float monto;
	private float montoIva;
	private float ingresosBrutos;
	private float pIngresosBrutos;
	
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public float getpIngresosBrutos() {
		return pIngresosBrutos;
	}
	public void setpIngresosBrutos(float pIngresosBrutos) {
		this.pIngresosBrutos = pIngresosBrutos;
	}
	public float getMontoIva() {
		return montoIva;
	}
	public void setMontoIva(float montoIva) {
		this.montoIva = montoIva;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public float getIngresosBrutos() {
		return ingresosBrutos;
	}
	public void setIngresosBrutos(float ingresosBrutos) {
		this.ingresosBrutos = ingresosBrutos;
	}
	
	public void calculoIva(float monto) {
		this.montoIva = monto + ((float) (monto*0.21));
	}
	
	public void calculoIngresosBrutos(float sueldo) {
		if(sueldo < 20000) this.ingresosBrutos = sueldo;
		if(sueldo >= 20000 && sueldo < 30000) {
			pIngresosBrutos = (float)(sueldo*0.2);
			this.ingresosBrutos = sueldo - pIngresosBrutos;
		}
		if(sueldo >= 30000 && sueldo < 40000) {
			pIngresosBrutos = (float)(sueldo*0.3);
			this.ingresosBrutos = sueldo - pIngresosBrutos;
		}
		if(sueldo >= 40000) {
			pIngresosBrutos = (float)(sueldo*0.4);
			this.ingresosBrutos = sueldo - pIngresosBrutos;
		}
	}
}
