package gui_main;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.*;

public class MainWindow extends JFrame {
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JJOO.Paris2024");
		setSize(640,480);
		setLocationRelativeTo(null);
		
		String[] lista= {"Juan Salcedo","Borja Hernandez","Ibai Barrios","Luken Menendez","Guillermo Cordero"};
		JList<String> jList = new JList<String>(lista);
		JScrollPane jScrollPane = new JScrollPane(jList);
		add(jScrollPane,BorderLayout.WEST);
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.addTab("Datos", new JPanel());
		jTabbedPane.addTab("Medallas", new JPanel());
		add(jTabbedPane,BorderLayout.CENTER);
		
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		
		JMenu menufichero = new JMenu("Fichero");
		barra.add(menufichero);
        menufichero.setMnemonic(KeyEvent.VK_F);

		JMenuItem OpcionNuevoAtleta = new JMenuItem("Nuevo Atleta");
        menufichero.add(OpcionNuevoAtleta);
        OpcionNuevoAtleta.setMnemonic(KeyEvent.VK_N);
		
        menufichero.addSeparator();
        
		JMenuItem OpcionImportar = new JMenuItem("Importar");
        menufichero.add(OpcionImportar);
        OpcionImportar.setMnemonic(KeyEvent.VK_I);
        
        JMenuItem OpcionExportar = new JMenuItem("Exportar");
        menufichero.add(OpcionExportar);
        OpcionExportar.setMnemonic(KeyEvent.VK_E);
		
        

		
		setVisible(true);
		
	}
}
