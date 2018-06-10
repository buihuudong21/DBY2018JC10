package com.damngocanh.customers.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.damngocanh.constant.utils.StringConstant;

public class StatusPanel extends JPanel {
private JLabel statusLable;

private JLabel timeLable;
private Timer timer;


public StatusPanel() {
	initalizeVariable();
	constructLayout();
	startTimer();
	
}
private void startTimer() {
	this.timer.start();
	
	
	
}

private void stopTimer() {
	this.timer.setRunning(false);
	
}
private void constructLayout() {
	this.setLayout(new FlowLayout(FlowLayout.CENTER));
	this.add(statusLable);
	this.add(timeLable);
	
}
private void initalizeVariable() {
	this.statusLable = new JLabel();
	this.statusLable.setText(StringConstant.STATUS_PANEL_TEXT);
	
	this.timeLable = new JLabel();
	this.timer = new Timer(timeLable);
	
}
}
