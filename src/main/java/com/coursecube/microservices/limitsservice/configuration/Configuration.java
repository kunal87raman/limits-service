package com.coursecube.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int mimimum;
	private int maximum;
	
	public int getMimimum() {
		return mimimum;
	}
	public void setMimimum(int mimimum) {
		this.mimimum = mimimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
