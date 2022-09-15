package com.springcore.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d1")
public class Demo {
	@Value("#{10+20}")
	private int x;
	@Value("#{30+40}")
	private int y;
	@Value("#{T(java.lang.Math).PI}")
	private double p;
	@Value("#{T(com.springcore.expressionlang.Demo).yo()}")
	private double q;
//	Creating new object using spel
	@Value("#{new String('SOMU SAXENA')}")
	private String name;
	@Value("#{new Boolean(true)}")
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getQ() {
		return q;
	}
	public void setQ(double q) {
		this.q = q;
	}
	public int getX() {
		return x;
	}
	public double getPi() {
		return p;
	}
	public void setPi(double pi) {
		this.p = pi;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static int yo()
	{
		return 20;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", p=" + p + ", q=" + q + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
}
