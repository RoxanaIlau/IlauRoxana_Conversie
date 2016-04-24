package client;

import javax.swing.SwingUtilities;

import view.GUI;

public class Principala {

	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				
				GUI gui = new GUI();
				
			}
			
		});
		
	}

}
