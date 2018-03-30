package com.teacher.oops.abstract_class.abstract_demo_02;

public class AppMain {

    public static void main(String[] args) {

        // Khai báo giao diện GUI
        VIEWS objView = null;

        // 1. View với TextBox
        objView = new ControlGUI();
        System.out.println("Info: " + objView.PrintInfo());

        // 2. View với Button
        objView = new ButtonGui();
        System.out.println("Info: " + objView.PrintInfo());  
        
        //3. View với ListView
        objView = new ListViewGUI();
        System.out.println("Info: " + objView.PrintInfo());       
        
    }
}
