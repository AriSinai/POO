import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame{

	private JLabel label1,label2,label3,label4;
	private JButton  buton1,buton2;
	private JPanel panel1,panel2,panel3,panel4;

	public Ventana(){

		super ("Mi primera ventana");
		initComponents();
		setLayout(new GridLayout (2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}

	public void initComponents(){
		panel1=new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		label1=new JLabel ("HELLO WORLD");
		panel1.add(label1);
		buton1=new JButton ("Push Me");
		panel1.add(buton1);
		label2=new JLabel ("HELLO WORLD");
		panel1.add(label1);
		add(panel1);

		panel2=new JPanel();
		panel2.setLayout(new FlowLayout());
		label3=new JLabel ("Hello World 3!!!");
		label4=new JLabel ("Hello World 4!!!");
		buton2=new JButton ("Push Me");

		panel2.add(label3);
		panel2.add(label4);
		panel2.add(buton2);

		add(panel2);

		panel3=new JPanel();
		add(panel3);

		panel4=new JPanel();
		add(panel4);

	}
}