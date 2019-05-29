package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PainelGrade extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void cria() {
		
		
		this.setVisible(true);
		this.setLayout(null);
		
    	
        JLabel nomeAluno = new JLabel();
        this.add(nomeAluno);       
        nomeAluno.setText("Grade Currícular");
        nomeAluno.setBounds(590, 50, 300, 50);
        Font f0 = new Font("SansSerif", Font.BOLD, 25);
        nomeAluno.setFont(f0);
        nomeAluno.setForeground(Color.black);
        
        JLabel nomeCodigo = new JLabel();
        this.add(nomeCodigo);       
        nomeCodigo.setText("Ano:");
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
        
        
        JLabel nomeDisc = new JLabel();
        this.add(nomeDisc);       
        nomeDisc.setText("Disciplina:");
        nomeDisc.setBounds(400, 240, 300, 50);
        Font f3 = new Font("SansSerif", Font.BOLD, 25);
        nomeDisc.setFont(f3);
        nomeDisc.setForeground(Color.black);
              
        
        JTextField areaNomeCodigo = new JTextField();
        this.add(areaNomeCodigo);       
        areaNomeCodigo.setText("");
        areaNomeCodigo.setBounds(550, 133, 300, 25);
        Font f8 = new Font("SansSerif", Font.BOLD, 25);
        areaNomeCodigo.setFont(f8);
        areaNomeCodigo.setForeground(Color.black);
        
        
        JComboBox box = new JComboBox();
        
        box.addItem("Selecione");		
		box.setMaximumRowCount(4);		
		this.add(box);		
		box.setBounds(550,193,300,25);
		
		JComboBox box2 = new JComboBox();
				
        box2.addItem("Selecione");		
		box2.setMaximumRowCount(4);		
		this.add(box2);		
		box2.setBounds(550,253,300,25);
	               
        JButton botaoCadastrarAluno = new JButton();
        this.add(botaoCadastrarAluno);       
        botaoCadastrarAluno.setText("Pesquisar");
        botaoCadastrarAluno.setBounds(600, 620, 180, 35);
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
        
        jTable1.setBounds(550,340,300,240);
        
        
        JLabel nomeCurso = new JLabel();
        this.add(nomeCurso);       
        nomeCurso.setText("Disciplina");
        nomeCurso.setBounds(590, 300, 200, 50);
        Font f4 = new Font("SansSerif", Font.BOLD, 15);
        nomeCurso.setFont(f4);
        nomeCurso.setForeground(Color.black);
        
        JLabel nomeCh = new JLabel();
        this.add(nomeCh);       
        nomeCh.setText("Carga Hora");
        nomeCh.setBounds(722, 300, 200, 50);
        Font f5 = new Font("SansSerif", Font.BOLD, 15);
        nomeCh.setFont(f5);
        nomeCh.setForeground(Color.black);
		
	}

}
