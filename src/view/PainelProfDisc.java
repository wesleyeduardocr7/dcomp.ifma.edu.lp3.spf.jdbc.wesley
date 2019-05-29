package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelProfDisc extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void cria() {
		
		
		this.setVisible(true);
		this.setLayout(null);
		
    	
        JLabel nomeAluno = new JLabel();
        this.add(nomeAluno);       
        nomeAluno.setText("Professor / Disciplina");
        nomeAluno.setBounds(570, 50, 300, 50);
        Font f0 = new Font("SansSerif", Font.BOLD, 25);
        nomeAluno.setFont(f0);
        nomeAluno.setForeground(Color.black);
        
        JLabel nomeCodigo = new JLabel();
        this.add(nomeCodigo);       
        nomeCodigo.setText("Professor:");
        nomeCodigo.setBounds(400, 120, 300, 50);
        Font f1 = new Font("SansSerif", Font.BOLD, 25);
        nomeCodigo.setFont(f1);
        nomeCodigo.setForeground(Color.black);
        
        JLabel nomeNome = new JLabel();
        this.add(nomeNome);       
        nomeNome.setText("Disciplina:");
        nomeNome.setBounds(400, 180, 300, 50);
        Font f2 = new Font("SansSerif", Font.BOLD, 25);
        nomeNome.setFont(f2);
        nomeNome.setForeground(Color.black);
        
              
        JComboBox box2 = new JComboBox();        
        box2.addItem("Selecione");		
		box2.setMaximumRowCount(4);		
		this.add(box2);		
		box2.setBounds(550, 133, 300, 25);
                
        
        JComboBox box = new JComboBox();        
        box.addItem("Selecione");		
		box.setMaximumRowCount(4);		
		this.add(box);		
		box.setBounds(550,193,300,25);
		
			               
        JButton botaoCadastrarAluno = new JButton();
        this.add(botaoCadastrarAluno);       
        botaoCadastrarAluno.setText("Pesquisar");
        botaoCadastrarAluno.setBounds(610, 570, 180, 35);
        Font f7 = new Font("SansSerif", Font.BOLD, 25);
        botaoCadastrarAluno.setFont(f7);
        botaoCadastrarAluno.setForeground(Color.black);
       
              
         JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
         JTable jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
               
               
            },
            new String [] {
                "Title 1", "Title 2",
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        
        
        this.add(jTable1);
        this.add(jScrollPane1);
        
        jTable1.setBounds(550,290,300,240);
        
        
        JLabel nomeCurso = new JLabel();
        this.add(nomeCurso);       
        nomeCurso.setText("Professor");
        nomeCurso.setBounds(590, 250, 200, 50);
        Font f4 = new Font("SansSerif", Font.BOLD, 15);
        nomeCurso.setFont(f4);
        nomeCurso.setForeground(Color.black);
        
        JLabel nomeCh = new JLabel();
        this.add(nomeCh);       
        nomeCh.setText("Disciplina");
        nomeCh.setBounds(735, 250, 200, 50);
        Font f5 = new Font("SansSerif", Font.BOLD, 15);
        nomeCh.setFont(f5);
        nomeCh.setForeground(Color.black);
    	
		
		
	}

}
