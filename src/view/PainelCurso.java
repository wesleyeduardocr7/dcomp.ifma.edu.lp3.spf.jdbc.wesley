package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCurso extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void cria() {
				
		this.setVisible(true);
		this.setLayout(null);
				
        JLabel nomeAluno = new JLabel();
        this.add(nomeAluno);       
        nomeAluno.setText("Cadastro de Cursos");
        nomeAluno.setBounds(590, 50, 300, 50);
        Font f0 = new Font("SansSerif", Font.BOLD, 25);
        nomeAluno.setFont(f0);
        nomeAluno.setForeground(Color.black);
        
        JLabel nomeCodigo = new JLabel();
        this.add(nomeCodigo);       
        nomeCodigo.setText("Código:");
        nomeCodigo.setBounds(400, 120, 300, 50);
        Font f1 = new Font("SansSerif", Font.BOLD, 25);
        nomeCodigo.setFont(f1);
        nomeCodigo.setForeground(Color.black);
        
        JLabel nomeNome = new JLabel();
        this.add(nomeNome);       
        nomeNome.setText("Curso:");
        nomeNome.setBounds(400, 180, 300, 50);
        Font f2 = new Font("SansSerif", Font.BOLD, 25);
        nomeNome.setFont(f2);
        nomeNome.setForeground(Color.black);
        
              
        
        JTextField areaNomeCodigo = new JTextField();
        this.add(areaNomeCodigo);       
        areaNomeCodigo.setText("");
        areaNomeCodigo.setBounds(550, 133, 300, 25);
        Font f8 = new Font("SansSerif", Font.BOLD, 25);
        areaNomeCodigo.setFont(f8);
        areaNomeCodigo.setForeground(Color.black);
        

        JTextField areaNomeNome = new JTextField();
        this.add(areaNomeNome);       
        areaNomeNome.setText("");
        areaNomeNome.setBounds(550, 193, 300, 25);
        Font f9= new Font("SansSerif", Font.BOLD, 25);
        areaNomeNome.setFont(f9);
        areaNomeNome.setForeground(Color.black);
        
        
        
        JButton botaoCadastrarAluno = new JButton();
        this.add(botaoCadastrarAluno);       
        botaoCadastrarAluno.setText("Cadastrar");
        botaoCadastrarAluno.setBounds(600, 260, 180, 35);
        Font f7 = new Font("SansSerif", Font.BOLD, 25);
        botaoCadastrarAluno.setFont(f7);
        botaoCadastrarAluno.setForeground(Color.black);
       
		
	}
	
	
}
