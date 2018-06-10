package com.damngocanh.customers.ui;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;

public class Timer extends Thread{
private boolean isRunning;
private JLabel timeLable;
private SimpleDateFormat timeFormat;
public Timer(JLabel timeLable) {
	initalizeVariable(timeLable);
	
}
private void initalizeVariable(JLabel timeLabel) {
	this.timeLable = timeLabel;
	this.timeFormat = new SimpleDateFormat("hh:mm:ss");
	this.isRunning = true;
	
		
	
}
@Override
	public void run() {
		while(isRunning) {
		Calendar calendar = Calendar.getInstance();
		Date currentTime = calendar.getTime();
		timeLable.setText(timeFormat.format(currentTime));
	
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
public void setRunning(boolean isRunning) {
this.isRunning = isRunning;
	
	
	
}}