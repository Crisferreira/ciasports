package br.senai.sc.controledeestoque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MDI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDI frame = new MDI();
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
	public MDI() {
		setTitle("MDI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu cpCadastro = new JMenu("Cadastro");
		menuBar.add(cpCadastro);
		
		JMenuItem cpCliente = new JMenuItem("Cliente");
		cpCadastro.add(cpCliente);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		cpCadastro.add(mntmFornecedor);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		cpCadastro.add(mntmProduto);
		
		JMenu cpMovimentao = new JMenu("Movimenta\u00E7\u00E3o");
		menuBar.add(cpMovimentao);
		
		JMenuItem cpPedidoDaCompra = new JMenuItem("Pedido da Compra");
		cpMovimentao.add(cpPedidoDaCompra);
		
		JMenuItem mntmPedidoDeVenda = new JMenuItem("Pedido de Venda");
		cpMovimentao.add(mntmPedidoDeVenda);
		
		JMenu cpEstoque = new JMenu("Estoque");
		menuBar.add(cpEstoque);
		
		JMenuItem cpConsulta = new JMenuItem("Consulta");
		cpEstoque.add(cpConsulta);
		
		JMenuItem mntmRelatorio = new JMenuItem("Relatorio");
		cpEstoque.add(mntmRelatorio);
		
		JMenu cpUltilitarios = new JMenu("Ultilitario");
		menuBar.add(cpUltilitarios);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		cpUltilitarios.add(mntmUsuario);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar Senha");
		cpUltilitarios.add(mntmAlterarSenha);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ativar botao
				  JOptionPane.showMessageDialog(null,"REALMENTE DESEJA SAIR");				
					
			}
		});
		menuBar.add(btnSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}
