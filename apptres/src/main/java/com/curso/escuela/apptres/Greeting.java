package com.curso.escuela.apptres;

public class Greeting {
	private float n1,n2,n3,n4,n5,n6,n7,n8;
    private float rtaS;
    private float rtaR;
    private float rtaM;
    private float rtaD;
   
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float getN4() {
		return n4;
	}
	public void setN4(float n4) {
		this.n4 = n4;
	}
	public float getN5() {
		return n5;
	}
	public void setN5(float n5) {
		this.n5 = n5;
	}
	public float getN6() {
		return n6;
	}
	public void setN6(float n6) {
		this.n6 = n6;
	}
	public float getN7() {
		return n7;
	}
	public void setN7(float n7) {
		this.n7 = n7;
	}
	public float getN8() {
		return n8;
	}
	public void setN8(float n8) {
		this.n8 = n8;
	}
	public float getRtaS() {
		return rtaS;
	}
	public void setRtaS(float rtaS) {
		this.rtaS = rtaS;
	}
	public float getRtaR() {
		return rtaR;
	}
	public void setRtaR(float rtaR) {
		this.rtaR = rtaR;
	}
	public float getRtaM() {
		return rtaM;
	}
	public void setRtaM(float rtaM) {
		this.rtaM = rtaM;
	}
	public float getRtaD() {
		return rtaD;
	}
	public void setRtaD(float rtaD) {
		this.rtaD = rtaD;
	}
	
	public void suma(float n1, float n2) {
		this.rtaS = n1+n2;
	}
	public void resta(float n3, float n4) {
		this.rtaR = n3-n4;
	}
	public void multiplicacion(float n5, float n6) {
		this.rtaM = n5*n6;
	}
	public void division(float n7, float n8) {
		this.rtaD = n7/n8;
	}

}