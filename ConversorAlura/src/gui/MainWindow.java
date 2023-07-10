package gui;

import clases.Tools;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
public class MainWindow extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	private JTextField txtAmount;
	private JButton btnConvert,btnConvertExchange, btnConvertTemp, btnConvertLong,btnConvertToTemp,btnConvertToLong,btnBack;
	private JComboBox<String> cbOptions;
	private JLabel lblMainTitle;
	private JLabel backgroundLabel;

	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Alura Conversor");
		setResizable(false);
		setBounds(0, 0, 620, 393);
		setLocationRelativeTo(null);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(192, 192, 192));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		menu();
		
	}
	private void menu() {
		ImageIcon imageIcon = new ImageIcon("img/mainBg.jpg");
        backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		
		
		lblMainTitle = new JLabel("SELECCIONE EL TIPO DE CONVERSION");
		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblMainTitle.setForeground(Color.WHITE);
		lblMainTitle.setBounds(0, 11, 604, 35);
		panelPrincipal.add(lblMainTitle);
		
		btnConvertExchange = new JButton("CONVERTIR DIVISA");
		btnConvertExchange.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnConvertExchange.addActionListener(this);
		btnConvertExchange.setBounds(171, 93, 241, 35);
		panelPrincipal.add(btnConvertExchange);

		btnConvertTemp = new JButton("CONVERTIR TEMPERATURAS");
		btnConvertTemp.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnConvertTemp.addActionListener(this);
		btnConvertTemp.setBounds(171, 233, 241, 35);
		panelPrincipal.add(btnConvertTemp);

		btnConvertLong = new JButton("CONVERTIR LONGITUDES");
		btnConvertLong.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnConvertLong.addActionListener(this);
		btnConvertLong.setBounds(171, 169, 241, 35);
		panelPrincipal.add(btnConvertLong);
		
		panelPrincipal.add(backgroundLabel);
	}
	private void initComponentsExchange(){
		
		lblMainTitle.setText("CONVERSOR DE DIVISAS ALURA");	
		
		ImageIcon imageIcon = new ImageIcon("img/currencyBG.jpg");
        backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		
		
		txtAmount = new JTextField();
		txtAmount.setBounds(256, 149, 303, 28);
		panelPrincipal.add(txtAmount);
		txtAmount.setColumns(10);
		
		
		
        String[] opciones = {
	            "Convertir de pesos(ARS) a Dólar",
	            "Convertir de pesos(ARS) a Euros",
	            "Convertir de pesos(ARS) a Libras Esterlinas",
	            "Convertir de pesos(ARS) a Yen Japonés",
	            "Convertir de pesos(ARS) a Won sul-coreano",
	            "Convertir de Dólar a pesos(ARS)",
	            "Convertir de Euros a pesos(ARS)",
	            "Convertir de Libras Esterlinas a pesos(ARS)",
	            "Convertir de Yen Japonés a pesos(ARS)",
	            "Convertir de Won sul-coreano a pesos(ARS)"
	        };
        
        cbOptions = new JComboBox<String>(opciones);
        cbOptions.setFont(new Font("SansSerif", Font.PLAIN, 11));
        cbOptions.setBounds(253, 86, 306, 26);
		panelPrincipal.add(cbOptions);
		
		JLabel lblExchangeType = new JLabel("Seleccione el tipo de cambio");
		lblExchangeType.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblExchangeType.setHorizontalAlignment(SwingConstants.CENTER);
		lblExchangeType.setForeground(Color.WHITE);
		lblExchangeType.setBounds(10, 84, 233, 27);
		panelPrincipal.add(lblExchangeType);
		
		JLabel lblInsertValue = new JLabel("Ingrese el monto a convertir");
		lblInsertValue.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblInsertValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertValue.setForeground(Color.WHITE);
		lblInsertValue.setBounds(0, 146, 246, 28);
		panelPrincipal.add(lblInsertValue);
		
		btnConvert = new JButton("CONVERTIR DIVISA");
		btnConvert.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnConvert.addActionListener(this);
		btnConvert.setBounds(311, 204, 143, 35);
		panelPrincipal.add(btnConvert);
		
		btnBack = new JButton("Volver");
		btnBack.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnBack.addActionListener(this);
		btnBack.setBounds(40, 300, 143, 35);
		panelPrincipal.add(btnBack,BorderLayout.SOUTH);
		
		panelPrincipal.add(backgroundLabel);
		
		
	}
private void initComponentsLong(){
		
		lblMainTitle.setText("CONVERSOR DE LONGITUDES ALURA");		
		
		ImageIcon imageIcon = new ImageIcon("img/longBG.jpg");
        backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		
		
		txtAmount = new JTextField();
		txtAmount.setBounds(256, 149, 303, 28);
		panelPrincipal.add(txtAmount);
		txtAmount.setColumns(10);
		
		
		
        String[] opciones = {
	            "Convertir de kms a millas",
	            "Convertir millas a kms"
	        };
        
        cbOptions = new JComboBox<String>(opciones);
        cbOptions.setFont(new Font("SansSerif", Font.PLAIN, 11));
        cbOptions.setBounds(253, 86, 306, 26);
		panelPrincipal.add(cbOptions);
		
		JLabel lblExchangeType = new JLabel("Seleccione la medida");
		lblExchangeType.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblExchangeType.setHorizontalAlignment(SwingConstants.CENTER);
		lblExchangeType.setForeground(Color.WHITE);
		lblExchangeType.setBounds(10, 84, 233, 27);
		panelPrincipal.add(lblExchangeType);
		
		JLabel lblInsertValue = new JLabel("Ingrese el numero a convertir");
		lblInsertValue.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblInsertValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertValue.setForeground(Color.WHITE);
		lblInsertValue.setBounds(0, 146, 246, 28);
		panelPrincipal.add(lblInsertValue);
		
		btnConvertToLong = new JButton("CONVERTIR DISTANCIA");
		btnConvertToLong.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnConvertToLong.addActionListener(this);
		btnConvertToLong.setBounds(311, 204, 143, 35);
		panelPrincipal.add(btnConvertToLong);
		
		btnBack = new JButton("Volver");
		btnBack.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnBack.addActionListener(this);
		btnBack.setBounds(40, 300, 143, 35);
		panelPrincipal.add(btnBack,BorderLayout.SOUTH);
		
		panelPrincipal.add(backgroundLabel);
		
		
	}
	
	
	private void initComponentsTemp(){
		
		lblMainTitle.setText("CONVERSOR DE TEMPERATURAS ALURA");
		
		ImageIcon imageIcon = new ImageIcon("img/tempBG.jpeg");
        backgroundLabel = new JLabel(imageIcon);
        backgroundLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		
		
		txtAmount = new JTextField();
		txtAmount.setBounds(256, 149, 303, 28);
		panelPrincipal.add(txtAmount);
		txtAmount.setColumns(10);
		
		
		
        String[] opciones = {
	            "Convertir de grados Celcius a Farenheit",
	            "Convertir de grados Celcius a Kelvin",
	            "Convertir de grados Farenheit a Celcius",
	            "Convertir de grados Kelvin a Celcius"
	        };
        
        cbOptions = new JComboBox<String>(opciones);
        cbOptions.setFont(new Font("SansSerif", Font.PLAIN, 11));
        cbOptions.setBounds(253, 86, 306, 26);
		panelPrincipal.add(cbOptions);
		
		JLabel lblTempType = new JLabel("Seleccione la medida");
		lblTempType.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblTempType.setHorizontalAlignment(SwingConstants.CENTER);
		lblTempType.setForeground(Color.WHITE);
		lblTempType.setBounds(10, 84, 233, 27);
		panelPrincipal.add(lblTempType);
		
		JLabel lblInsertValue = new JLabel("Ingrese los grados a convertir");
		lblInsertValue.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblInsertValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertValue.setForeground(Color.WHITE);
		lblInsertValue.setBounds(0, 146, 246, 28);
		panelPrincipal.add(lblInsertValue);
		
		btnConvertToTemp = new JButton("CONVERTIR TEMPERATURA");
		btnConvertToTemp.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnConvertToTemp.addActionListener(this);
		btnConvertToTemp.setBounds(311, 204, 143, 35);
		panelPrincipal.add(btnConvertToTemp);
		
		btnBack = new JButton("Volver");
		btnBack.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnBack.addActionListener(this);
		btnBack.setBounds(40, 300, 143, 35);
		panelPrincipal.add(btnBack,BorderLayout.SOUTH);
		
		panelPrincipal.add(backgroundLabel);
		
		
	}
	
	private void removeMain() {
		
		panelPrincipal.remove(btnConvertExchange);
		panelPrincipal.remove(btnConvertTemp);
		panelPrincipal.remove(btnConvertLong);
		panelPrincipal.remove(backgroundLabel);
	};
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Tools helper = new Tools();
		String message="";
		double result=0;
		
		if(e.getSource()==btnConvertExchange) {
			removeMain();
			revalidate();
	        repaint();
	        initComponentsExchange();
	        
		}
		else if(e.getSource()==btnConvertTemp) {
			removeMain();
			revalidate();
	        repaint();
	        initComponentsTemp();
	        
		}
		else if(e.getSource()==btnConvertLong) {
			removeMain();
			revalidate();
	        repaint();
	        initComponentsLong();
		}
		
		else if(e.getSource()==btnConvert) {

			if(helper.isOperable(txtAmount.getText())) {
				//result=helper.convertCurrency(txtAmount.getText(),(String)cbExchange.getSelectedItem());
				int choice = JOptionPane.showConfirmDialog(null, "Desea continuar?");
				if (choice == JOptionPane.YES_OPTION) {
					switch((String)cbOptions.getSelectedItem()) {
					case "Convertir de pesos(ARS) a Dólar":
						result=helper.convertCurrency(txtAmount.getText(),1);
						message="Los pesos equivalen a us$ " + result+ " Dolares";
			            break;
			        case "Convertir de pesos(ARS) a Euros":
			        	result=helper.convertCurrency(txtAmount.getText(),2);
			        	message="Los pesos equivalen a € " + result + " Euros";
			            break;
			        case "Convertir de pesos(ARS) a Libras Esterlinas":
			        	result=helper.convertCurrency(txtAmount.getText(),3);
			        	message="Los pesos equivalen a £ " + result+ " Libras";
			            break;
			        case "Convertir de pesos(ARS) a Yen Japonés":
			        	result=helper.convertCurrency(txtAmount.getText(),4);
			        	message="Los pesos equivalen a ¥ " + result+" Yen Japones";
			            break;
			        case "Convertir de pesos(ARS) a Won sul-coreano":
			        	result=helper.convertCurrency(txtAmount.getText(),5);
			        	message="Los pesos equivalen a ₩ " + result + " Won";
			            break;
			        case "Convertir de Dólar a pesos(ARS)":
			        	result=helper.convertCurrency(txtAmount.getText(),6);
			        	message="Los dolares equivalen a $ " + result + " pesos";
			            break;
			        case "Convertir de Euros a pesos(ARS)":
			        	result=helper.convertCurrency(txtAmount.getText(),7);
			        	message="Los Euros equivalen a $ " + result + " pesos";
			            break;
			        case "Convertir de Libras Esterlinas a pesos(ARS)":
			        	result=helper.convertCurrency(txtAmount.getText(),8);
			        	message="Las Libras equivalen a $ " + result + "pesos";
			            break;
			        case "Convertir de Yen Japonés a pesos(ARS)":
			        	result=helper.convertCurrency(txtAmount.getText(),9);
			        	message="Los Yenes equivalen a $ " + result + " pesos";
			            break;
			        case "Convertir de Won sul-coreano a pesos(ARS)":
			        	result=helper.convertCurrency(txtAmount.getText(),10);
			        	message="Los Won equivalen a $ " + result + " pesos";
			            break;
	
					}			
					JOptionPane.showMessageDialog(null, message );
				}else if(choice == JOptionPane.NO_OPTION){
					JOptionPane.showMessageDialog(null, "Intente nuevamente o Volver para regresar");
					txtAmount.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					txtAmount.setText("");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde o no se puede convertir");
				txtAmount.setText("");
			}
			
			
		}else if(e.getSource()==btnConvertToLong) {
			
			if(helper.isOperable(txtAmount.getText())) {
				
				int choice = JOptionPane.showConfirmDialog(null, "Desea continuar?");
				if (choice == JOptionPane.YES_OPTION) {
					switch((String)cbOptions.getSelectedItem()) {
					case "Convertir de kms a millas":
						result=helper.convertLong(txtAmount.getText(),1);
						message="Los kms"+ txtAmount.getText()+" equivalen a "+ result + " millas";
						break;
					case "Convertir millas a kms":
						result=helper.convertLong(txtAmount.getText(),2);
						message="Las millas"+ txtAmount.getText()+" equivalen a "+ result + " kms";
						break;
					}
					JOptionPane.showMessageDialog(null, message );
				}
				else if(choice == JOptionPane.NO_OPTION){
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					txtAmount.setText("");
				}else {
					panelPrincipal.removeAll();
					revalidate();
			        repaint();
			        menu();
				}
			}else {
				JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde o no se puede convertir");
			}
			
		
		}else if(e.getSource()==btnConvertToTemp) {
			
			if(helper.isOperable(txtAmount.getText())) {
				
				int choice = JOptionPane.showConfirmDialog(null, "Desea continuar?");
				
				if (choice == JOptionPane.YES_OPTION) {
					switch((String)cbOptions.getSelectedItem()) {
					case "Convertir de grados Celcius a Farenheit":
						result=helper.convertTemp(txtAmount.getText(),1);
						message="Los grados equivalen a "+ result+" grados Farenheit";
						break;
					case "Convertir de grados Celcius a Kelvin":
						result=helper.convertTemp(txtAmount.getText(),2);
						message="Los grados equivalen a "+ result+" grados Kelvin";
						break;
					case "Convertir de grados Farenheit a Celcius":
						result=helper.convertTemp(txtAmount.getText(),3);
						message="Los grados equivalen a "+ result+" grados Celcius";
						break;
					case "Convertir de grados Kelvin a Celcius":
						result=helper.convertTemp(txtAmount.getText(),4);
						message="Los grados equivalen a "+ result+" grados Celcius";
						break;
					}
					JOptionPane.showMessageDialog(null, message );
				}
				else if(choice == JOptionPane.NO_OPTION){
					JOptionPane.showMessageDialog(null, "Intente nuevamente o Volver para regresar");
					txtAmount.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					txtAmount.setText("");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde o no se puede convertir");
				txtAmount.setText("");
			}
			
		
		}else if(e.getSource()==btnBack) {
			panelPrincipal.removeAll();
			revalidate();
	        repaint();
	        menu();
			
		}
	}
}
