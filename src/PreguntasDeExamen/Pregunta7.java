package PreguntasDeExamen;

import java.awt.Button;
import java.awt.Frame;

public class Pregunta7 extends Frame {
	
	public Pregunta7() {
		add(new Button("Botton 1"));
		add(new Button("Button 2"));
		add(new Button("Button 3"));
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pregunta7();
	}

}
