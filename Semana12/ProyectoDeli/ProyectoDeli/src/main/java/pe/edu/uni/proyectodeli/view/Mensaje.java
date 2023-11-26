/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyectodeli.view;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Mensaje {

	private Mensaje() {
	}

	public static void info(Component padre, String mensaje) {
		JOptionPane.showMessageDialog(padre, mensaje, "SISTEMA ACADEMICO - INFORMACIÓN",
				  JOptionPane.INFORMATION_MESSAGE);
	}

	public static void error(Component padre, String mensaje) {
		JOptionPane.showMessageDialog(padre, mensaje, "SISTEMA ACADEMICO - ERROR",
				  JOptionPane.ERROR_MESSAGE);
	}

	public static boolean confirm(Component padre, String mensaje) {
		int respuesta = JOptionPane.showConfirmDialog(padre, mensaje, "SISTEMA ACADEMICO - CONFIRMAR",
				  JOptionPane.YES_NO_OPTION);
		return (respuesta == JOptionPane.YES_OPTION);
	}
}
