package gui_main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame {
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JJOO.Paris2024");
		setSize(640,480);
		setLocationRelativeTo(null);
		
		String[] lista= {"Juan Salcedo","David Cordero","Ibai Barrios","Luken Menendez","Guillermo Cordero"};
		JList<String> jList = new JList<String>(lista);
		JScrollPane jScrollPane = new JScrollPane(jList);
		add(jScrollPane,BorderLayout.WEST);
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.addTab("Datos", new JPanel());
		jTabbedPane.addTab("Medallas", new JPanel());
		add(jTabbedPane,BorderLayout.CENTER);
		
		
		JMenuBar menubar = new JMenuBar();
		

		
		setVisible(true);
		
	}
}
