package com.nandu.props;

import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {

	private static ApplicationProperties instance;	
	private Properties props;
	private Properties propMapper;
	
	public static String UI = "UI";
	
	private ApplicationProperties(){
		props = new Properties();
		propMapper = new Properties();
		try {
			props.load(getClass().getResourceAsStream("props"));
			propMapper.load(getClass().getResourceAsStream("propMapper"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ApplicationProperties getInstance(){
		if(instance==null){
			synchronized(ApplicationProperties.class){
				if(instance==null){
					instance = new ApplicationProperties();
				}
			}
		}
		return instance;
	}
	
	public String getProperty(String key){
		return props.getProperty(key);
	}

	public String getLink(String key) {
		if(propMapper.containsKey(key))
			return propMapper.getProperty(key);
		return null;
	}
	
}
