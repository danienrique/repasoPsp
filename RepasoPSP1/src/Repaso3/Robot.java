package Repaso3;

public class Robot extends Thread {
	String pieza1  = "Cabeza ",pieza2 = "Cuerpo ",pieza3 = "Piernas", nombreRobot;
	Robot(String nombre){
		this.nombreRobot = nombre;
	}
	public void run(){
		System.out.println(this.nombreRobot + " acaba de ensablar su " + pieza1);
		try {
			Thread.sleep((int)(Math.random()*10000) + 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.nombreRobot + " acaba de ensablar su " + pieza2);
		try {
			Thread.sleep((int)(Math.random()*10000) + 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.nombreRobot + " acaba de ensablar sus " + pieza3);
	}
}
