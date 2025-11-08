package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

// TODO: Implemente la clase
public class Segment {
	private double length;
	private double angle;
	private List<Segment>children;
	
	//crea un segmento de longitud length, angulo angle y tiene una lista de segmentos que tiene por debajo "hijos" 
	//en recursividad
	
	public Segment(double length, double angle) {
		this.length=length;
		this.angle=angle;
		this.children=new ArrayList<Segment>();
	}
	//devuelve longitud
	public double getLength() {
		return length;
	}
   //devuelve angulo
	public double getAngle() {
		return angle;
	}
	// pone el angulo
	public void setAngle(double angle) {
		this.angle=angle;
	}
	// devuelve una lista de los hijos del objeto al que se refiere
	public List<Segment> getChildren(){
		return children;
	}
	 //añade hijos a la lista de segmentos del hijo
	public void addChild(Segment child) {
		if(!children.contains(child)) {
			children.add(child);
		}
		
	}
}
