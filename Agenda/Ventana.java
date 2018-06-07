import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{

	private JPanel panelForma, panelAgenda;
	private JLabel lNombre,lDireccion,lTelefono,lPos,lAgenda;
	private JButton bSave,bSaveFile,bLoad;
	private JFileChooser fileChooser;
	private JTextField tNombre,tDireccion,tTelefono,tPos;
	private Agenda agenda;


	public Ventana(){
		agenda= new Agenda();
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Agenda");
		initComponents();
		setVisible(true);
	}

	public void initComponents(){
		setLayout(new GridLayout(1,2));
		panelForma= new JPanel();
		panelForma.setLayout(new GridLayout(11,1));
		lNombre= new JLabel("Nombre:");
		tNombre= new JTextField();
		lDireccion= new JLabel("Dirección");
		tDireccion= new JTextField();
		lTelefono= new JLabel("Teléfono");
		tTelefono= new JTextField();
		lPos= new JLabel("Posición");
		tPos= new JTextField();
		bSave= new JButton("Guardar");
		bSave.addActionListener(new BotonListener());
		panelForma.add(lNombre);
		panelForma.add(tNombre);
		panelForma.add(lDireccion);
		panelForma.add(tDireccion);
		panelForma.add(lTelefono);
		panelForma.add(tTelefono);
		panelForma.add(lPos);
		panelForma.add(tPos);
		panelForma.add(bSave);
		bSaveFile= new JButton("Guardar archivo");
		bSaveFile.addActionListener(new BotonSaveFileListener());
		panelForma.add(bSaveFile);
		bLoad= new JButton("Cargar archivo");
		bLoad.addActionListener(new BotonLoadListener());
		panelForma.add(bLoad);

		panelAgenda= new JPanel();
		lAgenda= new JLabel();
		panelAgenda.add(lAgenda);
		add(panelForma);
		add(panelAgenda);
		imprimeAgenda();
	}

	public class BotonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String nombre= tNombre.getText();
			String direccion= tDireccion.getText();
			String telefono= tTelefono.getText();
			Contacto c= new Contacto(nombre,direccion,telefono);
			int pos= Integer.parseInt(tPos.getText());
			agenda.addContacto(c,pos);
			imprimeAgenda();
		}
	}

	public class BotonSaveFileListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				JOptionPane pane= new JOptionPane();
				String fileName=pane.showInputDialog("¿Cuál es el nombre del archivo?");
				FileOutputStream fout = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				oos.writeObject(agenda);
				oos.close();				
			}catch(FileNotFoundException ex){
				ex.printStackTrace();
			}catch(IOException ex){
				ex.printStackTrace();
			}


		}
	}

	public class BotonLoadListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			fileChooser= new JFileChooser();
			fileChooser.showOpenDialog(null);
			try{
				File selectedFile = fileChooser.getSelectedFile();
				FileInputStream fin = new FileInputStream(selectedFile);
				ObjectInputStream ois = new ObjectInputStream(fin);
				agenda= (Agenda)ois.readObject();
				imprimeAgenda();
			}catch(FileNotFoundException ex){
				System.out.println("Aun no hay archivo");
			}catch(IOException ex){
				ex.printStackTrace();
			}catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}			
		}
	}

	public void imprimeAgenda(){
		String agendaString="<html>";
		for(int i=0;i<agenda.getContactos().length;i++){
			try{
				agendaString= agendaString+i+".- "+
				agenda.getContactos()[i].getNombre()+" "
				+agenda.getContactos()[i].getTelefono()+"<br/>";
			}catch(NullPointerException e){
				agendaString=agendaString+i+".- Vacío <br/>";
			}
		}
		agendaString=agendaString+"</html>";
		lAgenda.setText(agendaString);
	}



}















