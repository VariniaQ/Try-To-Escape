package com.enums;

import com.utilities.Resources;

public enum Characters {
	PJ(Resources.PJ, 7,8);
	
	private String resource;
	private int nFrames,nRows;
	
	private Characters(String resource, int nFrames, int nRows) {
		this.resource = resource;
		this.nFrames = nFrames;
		this.nRows = nRows;
	}
	
	public String getResource() {
		return resource;
	}
	
	public int getNFrames() {
		return nFrames;
	}
	
	public int getNRows() {
		return nRows;
	}
}
