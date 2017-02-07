package com.example.spring;

public class TriangleContainer {

	private Triangle4 triangle4;

	public Triangle4 getTriangle4() {
		return triangle4;
	}

	public void setTriangle4(Triangle4 triangle4) {
		this.triangle4 = triangle4;
	}

	@Override
	public String toString() {
		return "TriangleContainer [triangle4=" + triangle4 + "]";
	}
}
