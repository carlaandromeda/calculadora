package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setBackground(new Color(255, 128, 255));
		frmCalculadora.getContentPane().setBackground(new Color(128, 128, 192));
		frmCalculadora.getContentPane().setForeground(new Color(128, 128, 255));
		frmCalculadora.setForeground(new Color(128, 128, 255));
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setBounds(100, 100, 391, 510);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setBackground(new Color(0, 128, 192));
		txtField.setForeground(new Color(128, 128, 255));
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Vivaldi", Font.BOLD, 25));
		txtField.setBounds(10, 11, 355, 51);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setBackground(new Color(255, 128, 192));
		btn7.setForeground(new Color(128, 128, 255));
		btn7.setFont(new Font("Arial", Font.BOLD, 15));
		btn7.setBounds(10, 228, 58, 51);
		frmCalculadora.getContentPane().add(btn7);
		String IngressarNumero = txtField.getText()+btn7.getText();
		txtField.setText(IngressarNumero);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setBackground(new Color(255, 128, 192));
		btn4.setForeground(new Color(128, 128, 255));
		btn4.setFont(new Font("Arial", Font.BOLD, 15));
		btn4.setBounds(10, 290, 58, 51);
		frmCalculadora.getContentPane().add(btn4);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
				
			}
		});
		btn1.setBackground(new Color(255, 128, 192));
		btn1.setForeground(new Color(128, 128, 255));
		btn1.setFont(new Font("Arial", Font.BOLD, 15));
		btn1.setBounds(10, 352, 58, 51);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setBackground(new Color(255, 128, 192));
		btn0.setForeground(new Color(128, 128, 255));
		btn0.setFont(new Font("Arial", Font.BOLD, 15));
		btn0.setBounds(10, 414, 58, 51);
		frmCalculadora.getContentPane().add(btn0);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setBackground(new Color(255, 128, 192));
		btn8.setForeground(new Color(128, 128, 255));
		btn8.setFont(new Font("Arial", Font.BOLD, 15));
		btn8.setBounds(108, 228, 58, 51);
		frmCalculadora.getContentPane().add(btn8);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);	
				
			}
		});
		btn5.setBackground(new Color(255, 128, 192));
		btn5.setForeground(new Color(128, 128, 255));
		btn5.setFont(new Font("Arial", Font.BOLD, 15));
		btn5.setBounds(108, 290, 58, 51);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setBackground(new Color(255, 128, 192));
		btn2.setForeground(new Color(128, 128, 255));
		btn2.setFont(new Font("Arial", Font.BOLD, 15));
		btn2.setBounds(108, 352, 58, 51);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnponto.setBackground(new Color(255, 128, 192));
		btnponto.setForeground(new Color(128, 0, 255));
		btnponto.setFont(new Font("Arial", Font.BOLD, 15));
		btnponto.setBounds(108, 414, 58, 51);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setBackground(new Color(255, 128, 192));
		btn9.setForeground(new Color(128, 128, 255));
		btn9.setFont(new Font("Arial", Font.BOLD, 15));
		btn9.setBounds(205, 228, 58, 51);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setBackground(new Color(255, 128, 192));
		btn6.setForeground(new Color(128, 128, 255));
		btn6.setFont(new Font("Arial", Font.BOLD, 15));
		btn6.setBounds(205, 290, 58, 51);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setBackground(new Color(255, 128, 192));
		btn3.setForeground(new Color(128, 128, 255));
		btn3.setFont(new Font("Arial", Font.BOLD, 15));
		btn3.setBounds(205, 352, 58, 51);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String selecionar;
			numero2 = Double.parseDouble(txtField.getText());
			if(operacao.equals("+")) {
			resultado = numero1+numero2;
			selecionar = String.format("%.0f", resultado);
			txtField.setText(selecionar);
			}else if(operacao.equals("-")) {
			resultado = numero1-numero2;
			selecionar = String.format("%.0f", resultado);
			txtField.setText(selecionar);
			}else if(operacao.equals("*")) {
			resultado = numero1*numero2;
			selecionar = String.format("%.0f", resultado);
			txtField.setText(selecionar);
			}else if(operacao.equals("/")) {
			selecionar = String.format("%.0f", resultado);
			txtField.setText(selecionar);
			}
			}
		});
		btnigual.setBackground(new Color(255, 128, 192));
		btnigual.setForeground(new Color(128, 0, 255));
		btnigual.setFont(new Font("Arial", Font.BOLD, 15));
		btnigual.setBounds(205, 414, 58, 51);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");;
			}
		});
		btnc.setBackground(new Color(255, 128, 192));
		btnc.setForeground(new Color(128, 0, 255));
		btnc.setFont(new Font("Arial", Font.BOLD, 15));
		btnc.setBounds(307, 165, 58, 51);
		frmCalculadora.getContentPane().add(btnc);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
				
			}
		});
		btnsoma.setBackground(new Color(255, 128, 192));
		btnsoma.setForeground(new Color(128, 0, 255));
		btnsoma.setFont(new Font("Arial", Font.BOLD, 15));
		btnsoma.setBounds(307, 228, 58, 51);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
				
			}
		});
		btnsub.setBackground(new Color(255, 128, 192));
		btnsub.setForeground(new Color(128, 0, 255));
		btnsub.setFont(new Font("Arial", Font.BOLD, 15));
		btnsub.setBounds(307, 290, 58, 51);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("X");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
				
			}
		});
		btnmult.setBackground(new Color(255, 128, 192));
		btnmult.setForeground(new Color(128, 0, 255));
		btnmult.setFont(new Font("Arial", Font.BOLD, 15));
		btnmult.setBounds(307, 352, 58, 51);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btndiv.getText();
				txtField.setText(IngressarNumero);
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setBackground(new Color(255, 128, 192));
		btndiv.setForeground(new Color(128, 0, 255));
		btndiv.setFont(new Font("Arial", Font.BOLD, 15));
		btndiv.setBounds(307, 414, 58, 51);
		frmCalculadora.getContentPane().add(btndiv);
	}


}