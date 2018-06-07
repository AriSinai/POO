//Ventana.java//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame{

		private JLabel calcu, resultado, operacion;
		private JButton botonN1,botonN2,botonN3,botonN4,botonN5,botonN6,botonN7,botonN8,botonN9,botonN0,botonPor,botonMas,botonMenos,botonEntre,botonPunto,botonIgual,botonAC;
		private JPanel respuesta,teclado, operaciones, borrar,panelContenedor, panelTyR; 
		private int tipo=0,contadorPunto=0;
		private double n1,n2;
		private String res;
	

		public Ventana(){
		super("Calculadora");
		iniciarCalculadora();
		setLayout(new GridLayout(1,1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
		
		public void iniciarCalculadora(){
			//Panel que contiene todo
			panelContenedor=new JPanel();
			panelContenedor.setLayout(new FlowLayout());
			//Aqui defino que habrà un panel que contenga el teclado y la casilla de resultado
			panelTyR=new JPanel();
			panelTyR.setLayout(new GridLayout(2,1));

			//Respuesta
			respuesta=new JPanel();
			respuesta.setLayout(new GridLayout(2,0));

			operacion=new JLabel("0");
			resultado=new JLabel("0");

			operacion.setHorizontalAlignment(JLabel.RIGHT);
			operacion.setFont(new java.awt.Font("Arial", 1, 20));
        

			resultado.setHorizontalAlignment(JLabel.RIGHT);
			resultado.setFont(new java.awt.Font("Arial", 1, 20));
            
			respuesta.add(operacion);
			respuesta.add(resultado);
			panelTyR.add(respuesta);

			//Teclado de numeros y operaciones
			teclado= new JPanel();
			teclado.setLayout(new GridLayout(4,4));
			
			botonN0= new JButton("0");
			botonN1= new JButton("1");
			botonN2= new JButton("2");
			botonN3= new JButton("3");
			botonN4= new JButton("4");
			botonN5= new JButton("5");
			botonN6= new JButton("6");
			botonN7= new JButton("7");
			botonN8= new JButton("8");
			botonN9= new JButton("9");

			botonPor= new JButton("×");
			botonMas= new JButton("+");
			botonMenos= new JButton("-");
			botonEntre= new JButton("÷");
			botonPunto= new JButton(".");
			botonIgual= new JButton("=");
			botonAC= new JButton("CLEAR ALL");

			botonN1.addActionListener(new BotonN1Listener());
			botonN2.addActionListener(new BotonN2Listener());
			botonN3.addActionListener(new BotonN3Listener());
			botonN4.addActionListener(new BotonN4Listener());
			botonN5.addActionListener(new BotonN5Listener());
			botonN6.addActionListener(new BotonN6Listener());
			botonN7.addActionListener(new BotonN7Listener());
			botonN8.addActionListener(new BotonN8Listener());
			botonN9.addActionListener(new BotonN9Listener());
			botonN0.addActionListener(new BotonN0Listener());
			botonPunto.addActionListener(new BotonPuntoListener());
			botonMas.addActionListener(new BotonMasListener());
			botonMenos.addActionListener(new BotonMenosListener());
			botonPor.addActionListener(new BotonPorListener());
			botonEntre.addActionListener(new BotonEntreListener());
			botonAC.addActionListener(new BotonACListener());
			botonIgual.addActionListener(new BotonIgualListener());


			teclado.add(botonN1);
			teclado.add(botonN2);
			teclado.add(botonN3);
			

			teclado.add(botonN4);
			teclado.add(botonN5);
			teclado.add(botonN6);
			
			teclado.add(botonN7);
			teclado.add(botonN8);
			teclado.add(botonN9);
			
			teclado.add(botonPunto);
			teclado.add(botonN0);
			
			panelTyR.add(teclado);

			panelContenedor.add(panelTyR);
			
			operaciones= new JPanel();
			operaciones.setLayout(new GridLayout(7,1));

			operaciones.add(botonAC);
			operaciones.add(botonMas);
			operaciones.add(botonMenos);
			operaciones.add(botonPor);
			operaciones.add(botonEntre);
			operaciones.add(botonIgual);

			panelContenedor.add(operaciones);

			add(panelContenedor);
			

		}

		
		public class BotonN1Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("1");
				}else{
					resultado.setText(resultado.getText()+"1");
				}
				
				revalidate();
			}
		}

		public class BotonN2Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("2");
				}else{
					resultado.setText(resultado.getText()+"2");
				}
				revalidate();
			}
		}

		public class BotonN3Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("3");
				}else{
					resultado.setText(resultado.getText()+"3");
				}
				revalidate();
				
			}
		}

		public class BotonN4Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("4");
				}else{
					resultado.setText(resultado.getText()+"4");
				}
				
				revalidate();
				
			}
		}

		public class BotonN5Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("5");
				}else{
					resultado.setText(resultado.getText()+"5");
				}
				revalidate();
				
			}
		}


		public class BotonN6Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("6");
				}else{
					resultado.setText(resultado.getText()+"6");
				}
				revalidate();
				
			}
		}

		public class BotonN7Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("7");
				}else{
					resultado.setText(resultado.getText()+"7");
				}
				revalidate();
				
			}
		}

		public class BotonN8Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("8");
				}else{
					resultado.setText(resultado.getText()+"8");
				}
				revalidate();
				
			}
		}

		public class BotonN9Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("9");
				}else{
					resultado.setText(resultado.getText()+"9");
				}
				revalidate();
				
			}
		}

		public class BotonN0Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (resultado.getText().equals("0")){
					resultado.setText("0");
				}else{
					resultado.setText(resultado.getText()+"0");
				}
				revalidate();
				
			}
		}

		public class BotonPuntoListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				

				if (contadorPunto==0){
					contadorPunto++;
					resultado.setText(resultado.getText()+".");
				}
				
				revalidate();
				
			}
		}

		public class BotonMasListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				n1 = Double.parseDouble(resultado.getText());
				contadorPunto=0;
				operacion.setText(n1+"+");
				resultado.setText("0");
				tipo=1;
				
				revalidate();
				
			}
		}
		public class BotonMenosListener implements ActionListener{
			public void actionPerformed(ActionEvent e){

				n1 = Double.parseDouble(resultado.getText());
				contadorPunto=0;
				operacion.setText(n1+"-");
				resultado.setText("0");
				tipo=2;


				revalidate();
				
			}
		}
		public class BotonPorListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
			
				n1 = Double.parseDouble(resultado.getText());
				contadorPunto=0;
				operacion.setText(n1+"×");
				resultado.setText("0");
				revalidate();
				tipo=3;
				
			}
		}
		public class BotonEntreListener implements ActionListener{
			public void actionPerformed(ActionEvent e){

				n1 = Double.parseDouble(resultado.getText());
				contadorPunto=0;
				operacion.setText(n1+"÷");
				resultado.setText("0");
				tipo=4;

				
				revalidate();
				
			}
		}
		
		public class BotonACListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				operacion.setText("0");
				resultado.setText("0");
				revalidate();
				
								
			}
		}
		public class BotonIgualListener implements ActionListener{
			public void actionPerformed(ActionEvent e){

				


				if (tipo==0){
					n1 = Double.parseDouble(resultado.getText());
					operacion.setText(n1+"=");
					res = String.valueOf(n1);
					resultado.setText(res);
				
					//System.out.println(res);
					contadorPunto=1;
				


				}
				if(tipo==1){ //suma
					n2 = Double.parseDouble(resultado.getText());
					resultado.setText("0");

					operacion.setText(n1+"+"+n2+"=");
					res = String.valueOf(Operacion.suma(n1,n2));
				
					//System.out.println(res);
					contadorPunto=1;
					
					resultado.setText(res);

				}
				if(tipo==2){ //resta
					n2 = Double.parseDouble(resultado.getText());
					resultado.setText("0");

					operacion.setText(n1+"-"+n2+"=");
					res = String.valueOf(Operacion.resta(n1,n2));
					contadorPunto=1;

					//System.out.println(res);
					
					resultado.setText(res);

				}
				if(tipo==3){  //multi
					n2 = Double.parseDouble(resultado.getText());
					resultado.setText("0");

					operacion.setText(n1+"×"+n2+"=");
					res = String.valueOf(Operacion.multi(n1,n2));
					contadorPunto=1;

				
					//System.out.println(res);
					
					resultado.setText(res);

				}
				if(tipo==4){  //division
					n2 = Double.parseDouble(resultado.getText());
					resultado.setText("0");

					operacion.setText(n1+"÷"+n2+"=");
					res = String.valueOf(Operacion.division(n1,n2));
					contadorPunto=1;

				
					//System.out.println(res);
					
					resultado.setText(res);

				}
				
				revalidate();
		
				
			}
		}


}
		
	

	