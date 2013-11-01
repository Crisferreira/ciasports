package br.senai.sc.controledeestoque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Login extends JFrame {
	private JTextField textField;

//comando para colocarbolinha na senha 	->Password
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		getContentPane().setBackground(new Color(0, 204, 153));
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(184, 30, 215, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLongin = new JLabel("LONGIN");
		lblLongin.setBounds(118, 33, 46, 14);
		getContentPane().add(lblLongin);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(118, 68, 46, 14);
		getContentPane().add(lblSenha);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(184, 65, 164, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ativar botao.
				textField.setText("");
				//MSG d Erro.
          JOptionPane.showMessageDialog(null,"Senha Invalida");				
				
			}
		});
		btnEntrar.setBounds(232, 149, 91, 23);
		getContentPane().add(btnEntrar);
	}
}
