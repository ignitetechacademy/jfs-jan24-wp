package com.ignite.explore.java.methods;

import java.time.LocalDateTime;

public class TimeInfo {
	
	String getTime() {
		return LocalDateTime.now().toString();
	}

}
