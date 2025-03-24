package com.pavan.beans;

import java.util.Properties;

public class PropertiesInjection {
	private Properties properties;

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString() {
		return "PropertiesInjection [properties=" + properties + "]";
	}

	
	
}
