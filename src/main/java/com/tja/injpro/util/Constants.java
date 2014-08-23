package com.tja.injpro.util;

import java.util.Properties;

public class Constants implements ConstantConfigurer {
	
	public static String JPA_VERSION = "jpa_default_version_1.0";

	public static String JPA_NAME = "jpa default name";

	public static String JPA_DESC = "jpa default description";

	public static String DB_USER = "root_default";

	public static String DB_PASSWORD = "root_pwd";


	public void loadProperties(Properties properties) {
		if (properties == null) {
			return;
		}
		String jpaVersion = properties.getProperty("jpa.version");
		if (jpaVersion != null) {
			JPA_VERSION = jpaVersion;
		}
		String jpaDesc = properties.getProperty("jpa.desc");
		if (jpaDesc != null) {
			JPA_DESC = jpaDesc;
		}
		String jpaName = properties
				.getProperty("jpa.name");
		if (jpaName != null) {
			JPA_NAME = jpaName;
		}
		String dbUser = properties.getProperty("jdbc.user");
		if (dbUser != null) {
			DB_USER = dbUser;
		}
		String dbPassword = properties.getProperty("jdbc.password");
		if (dbPassword != null) {
			DB_PASSWORD = dbPassword;
		}
		
	}
		
}
