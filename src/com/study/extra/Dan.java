package com.study.extra;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame fra = new Frame("ButtonApp");
		fra.setSize(300, 200);
		fra.setLayout(null);
		Button bt = new Button("Click");
		bt.setSize(100, 50);
		bt.setLocation(75, 60);
		fra.add(bt);
		fra.setVisible(true);
		fra.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
