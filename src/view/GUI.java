package view;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

@SuppressWarnings("serial")

public class GUI extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JPanel painelLogin = new JPanel();
	PainelAcoes painelAcoes = new PainelAcoes();
	PainelAlunos painelAluno = new PainelAlunos();
	PainelCurso painelCurso = new PainelCurso();
	PainelDisciplina painelDisciplina = new PainelDisciplina();
	PainelProfessor painelProfessor = new PainelProfessor();
	PainelGrade painelGrade = new PainelGrade();
	PainelProfDisc painelProfDisc = new PainelProfDisc();
	PaineMatriculaAluno paineMatriculaAluno = new PaineMatriculaAluno();	
	JTextField jTextField01;
	JPasswordField jPasswordField01 ;	
	JButton botaoLogin ;
	JMenu menuArquivo = new JMenu("Arquivo");	
	JMenu menuTabela = new JMenu("Tabela");
	JMenu menuSPF = new JMenu("SPF");
	JMenu menuAjuda = new JMenu("Ajuda");
	JMenuBar menuBar = new JMenuBar();	
	int totalTentativasLogin = 3;
	int loginErrados = 0;
	
    public GUI() {
    	
        super("Wesley Eduardo - SISTEMAS DE INFORMAÇÃO ESCOLAR");
      
        this.add(panel, "Center");
        this.add(painelLogin, "Center");
        this.add(painelAcoes, "Center");
        this.add(painelAluno, "Center");
        this.add(painelCurso, "Center");
        this.add(painelDisciplina, "Center");
        this.add(painelProfessor, "Center");
        this.add(painelGrade, "Center");
        this.add(painelProfDisc, "Center");
        this.add(paineMatriculaAluno, "Center");
      
        ActionListener listener = new AcaoMenu(panel);
       
        
        menuArquivo.setMnemonic('F');
        menuArquivo.setIcon(new ImageIcon("src/imagens/arquivo.png"));
        menuArquivo.add(menuItem("Sair", listener, "Sair", 'N', KeyEvent.VK_X,"src/imagens/sair.png"));
        
        menuTabela.setMnemonic('F');
        menuTabela.setIcon(new ImageIcon("src/imagens/tabela.png"));
        menuTabela.add(menuItem("Aluno", listener, "Aluno", 'L', KeyEvent.VK_A,"src/imagens/aluno.png"));
        menuTabela.setMnemonic('F');
        menuTabela.add(menuItem("Curso", listener, "Curso", 'C', KeyEvent.VK_C,"src/imagens/curso.png"));
        menuTabela.setMnemonic('F');
        menuTabela.add(menuItem("Disciplina", listener, "Disciplina", 'C', KeyEvent.VK_D,"src/imagens/disciplina.png"));
        menuTabela.setMnemonic('F');
        menuTabela.add(menuItem("Professor", listener, "Professor", 'C', KeyEvent.VK_P,"src/imagens/prof2.png"));
        
        
        menuSPF.setMnemonic('F');
        menuSPF.setIcon(new ImageIcon("src/imagens/spf.png"));
        menuSPF.add(menuItem("Grade", listener, "Grade", 'R', KeyEvent.VK_G,"src/imagens/grade.jpg"));
        menuSPF.setMnemonic('F');
        menuSPF.add(menuItem("Prof/Disc", listener, "Prof/Disc", 'R', KeyEvent.VK_Q,"src/imagens/prof.png"));
        menuSPF.setMnemonic('F');
        menuSPF.add(menuItem("Mat/Aluno", listener, "Mat/Aluno", 'R', KeyEvent.VK_W,"src/imagens/matricula.png"));
        
               
        menuAjuda.setMnemonic('E');
        menuAjuda.setIcon(new ImageIcon("src/imagens/ajuda.png"));
        menuAjuda.add(menuItem("Sobre", listener, "Sobre", '0', KeyEvent.VK_H,"src/imagens/sobre.png"));
       
       
        menuBar.add(menuArquivo);
        menuBar.add(menuTabela);
        menuBar.add(menuSPF);
        menuBar.add(menuAjuda);
        this.setJMenuBar(menuBar);
        this.setSize(500, 400);
        this.setVisible(true);
        this.setResizable(true);       
        this.setLocationRelativeTo(null);
      
    }

   
    
    public void painelLogin(){	  
    	
  	  
		escondeMenu();
		escondePaineis();

		painelLogin.setVisible(true);
		painelLogin.setLayout(null);
		this.add(painelLogin);
		
		JLabel label01 = new JLabel();
		painelLogin.add(label01);		
		label01.setIcon(new ImageIcon("src/imagens/login0x.png"));
		label01.setBounds(120,30,250,80); 
		Font f0 = new Font("SansSerif", Font.BOLD, 25);
		label01.setFont(f0);
		label01.setForeground(Color.black);

		JLabel label02 = new JLabel();
		painelLogin.add(label02);		
		label02.setText("User: ");
		label02.setIcon(new ImageIcon("src/imagens/imagens/user.png"));
		label02.setBounds(120,60,200,200);
		Font f1 = new Font("SansSerif", Font.BOLD, 20);
		label02.setFont(f1);
		label02.setForeground(Color.black);
		
		jTextField01 = new JTextField();
		painelLogin.add(jTextField01);
		

		
		jTextField01.setText("");
		jTextField01.setBounds(210,150,160,25); 
		Font f2 = new Font("SansSerif", Font.BOLD, 20);
		jTextField01.setFont(f2);
		jTextField01.setForeground(Color.black);
		

		jPasswordField01 = new JPasswordField();
		painelLogin.add(jPasswordField01);		
		jPasswordField01.setText("");
		jPasswordField01.setBounds(210,217,160,25); 
		Font f4 = new Font("SansSerif", Font.BOLD, 20);
		jPasswordField01.setFont(f4);
		jPasswordField01.setForeground(Color.black);

		JLabel label03 = new JLabel();
		painelLogin.add(label03);		
		label03.setText("Pass: ");
		label03.setIcon(new ImageIcon("src/imagens/senha.png"));
		label03.setBounds(120,130,200,200); 
		Font f3 = new Font("SansSerif", Font.BOLD, 20);
		label03.setFont(f3);
		label03.setForeground(Color.black);
			


		botaoLogin = new JButton();
		botaoLogin.setIcon(new ImageIcon("src/imagens/login1.png"));
		painelLogin.add(botaoLogin);
		botaoLogin.setText("Acessar");
		botaoLogin.setBounds(120,290,250,37);
		Font f5 = new Font("SansSerif", Font.BOLD, 20);
		botaoLogin.setFont(f5);
		botaoLogin.setForeground(Color.black);


		botaoLogin.addActionListener(this);

		jTextField01.requestFocus();

     }
        
    
    public void chamarPainelAcoes(){	
    	
    	
		escondePaineis();	
		mostraMenu();
		this.add(painelAcoes);
		mostraMenuBar(painelAcoes);
		painelAcoes.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
            	  		
       }
    
    
    public void painelAlunos() {
    	
    	escondePaineis();	
		mostraMenu();
		mostraMenuBar(painelAluno);
		this.add(painelAluno);
		mostraMenuBar(painelAluno);
		painelAluno.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    	
    }
    
    
	public void painelCursos() {
	    	
		escondePaineis();	
		mostraMenu();
		mostraMenuBar(painelCurso);
		this.add(painelCurso);
		mostraMenuBar(painelCurso);
		painelCurso.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        
	    	
    }


	public void painelDisciplina() {
		
		escondePaineis();	
		mostraMenu();
		mostraMenuBar(painelDisciplina);
		this.add(painelDisciplina);
		mostraMenuBar(painelDisciplina);
		painelDisciplina.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	 	
	}




	public void painelProfessor() {
	    	
		escondePaineis();	
		mostraMenu();
		mostraMenuBar(painelProfessor);
		this.add(painelProfessor);
		mostraMenuBar(painelProfessor);
		painelProfessor.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	           
    	
    }



	public void painelGrade() {
    	
		
		escondePaineis();	
		mostraMenu();
		mostraMenuBar(painelGrade);
		this.add(painelGrade);
		mostraMenuBar(painelGrade);
		painelGrade.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
           
    	
    }




	public void painelProfDisc() {
		

		escondePaineis();	
		mostraMenu();
		mostraMenuBar(painelProfDisc);
		this.add(painelProfDisc);
		mostraMenuBar(painelProfDisc);
		painelProfDisc.cria();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    	
		
    }


public void painelMatAluno() {   	
					
		
		escondePaineis();		
		this.add(paineMatriculaAluno);
		mostraMenuBar(paineMatriculaAluno);
		paineMatriculaAluno.criaPainelMatAluno();
  
   }
     
public static JMenuItem menuItem(String label, ActionListener listener, String command, int mnemonic, int acceleratorKey, String url) {
    JMenuItem item = new JMenuItem(label);
    item.addActionListener(listener);
    item.setActionCommand(command);
    item.setIcon(new ImageIcon(url));
    if (mnemonic != 0) {
        item.setMnemonic((char) mnemonic);
    }
    if (acceleratorKey != 0) {
        item.setAccelerator(KeyStroke.getKeyStroke(acceleratorKey, java.awt.Event.CTRL_MASK));
    }
    return item;
}


public void escondeMenu() {
	menuBar.setVisible(false);    	
}

public void mostraMenu() {    
	menuBar.setVisible(true);  	
}


public void mostraMenuBar(JPanel panel) {
	
   JMenuBar menuBar = new JMenuBar();
   menuBar.setBounds(10, 11, 330, 21);
   panel.add(menuBar);

   JMenuItem menuItemNovo = new JMenuItem("Novo");
   menuItemNovo.setIcon(new ImageIcon("src/imagens/novo.png"));
   menuBar.add(menuItemNovo);

   JMenuItem menuItemAbrir = new JMenuItem("Abrir");
   menuItemAbrir.setIcon(new ImageIcon("src/imagens/abrir.png"));
   menuBar.add(menuItemAbrir);

   JMenuItem menuItemSalvar = new JMenuItem("Salvar");
   menuItemSalvar.setIcon(new ImageIcon("src/imagens/salvar.png"));
   menuBar.add(menuItemSalvar);

   JMenuItem menuItemDeletar = new JMenuItem("Deletar");
   menuItemDeletar.setIcon(new ImageIcon("src/imagens/deletar.png"));
   menuBar.add(menuItemDeletar);
	
}

public void escondePaineis() {
  
  panel.setVisible(false);
  painelLogin.setVisible(false);
  painelAcoes.setVisible(false);
  painelAluno.setVisible(false);
  painelCurso.setVisible(false);
  painelDisciplina.setVisible(false);
  painelProfessor.setVisible(false);
  painelGrade.setVisible(false);
  painelProfDisc.setVisible(false);
  paineMatriculaAluno.setVisible(false);
  
}


	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {		
				
		
		 if(loginErrados > 2) {
				
				JOptionPane.showMessageDialog(null, "Falha de Autenticação - Aplicaçãoo será FECHADA");
				System.exit(0);
				
			}
		
		if(jTextField01.getText().equals("")) {			
			
			JOptionPane.showMessageDialog(null, "Campo Usu�rio Vazio! ");
			jTextField01.requestFocus();			
			
		}else if(jPasswordField01.getText().equals("")) {			
			
			JOptionPane.showMessageDialog(null, "Campo Senha Vazio! ");
			jPasswordField01.requestFocus();			
			
		}else if(!jTextField01.getText().equals("admin")) {			
									
			JOptionPane.showMessageDialog(null, "Usu�rio Incorreto ! ");
			jTextField01.requestFocus();	
			jTextField01.setText("");
			loginErrados++;
			JOptionPane.showMessageDialog(null, "Quantidade de Tentativas Restantes: " + (totalTentativasLogin - loginErrados));
			
		}else if(!jPasswordField01.getText().equals("admin")) {			
			
			JOptionPane.showMessageDialog(null, "Senha Incorreta ! ");
			jPasswordField01.requestFocus();	
			jPasswordField01.setText("");
			loginErrados++;
			
			JOptionPane.showMessageDialog(null, "Quantidade de Tentativas Restantes: " + (totalTentativasLogin - loginErrados));
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso ! ");
			jTextField01.setText("");
			jPasswordField01.setText("");
			
			
			chamarPainelAcoes();
					
			
		}
		
		
		
	}
	
	
	
	private class AcaoMenu implements ActionListener {

	    Component parent;

	   public AcaoMenu(JPanel panel) {
	        this.parent = parent;
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JMenuItem item = (JMenuItem) e.getSource();
	        String cmd = item.getActionCommand();
	        
	       if(cmd.equals("Sair")) {
	    	  fecharAplicacao();
	    	  
	       }else if(cmd.equals("Aluno")) {
	    	   
	    	   
	    	   	painelAlunos();
	    	   
	       }else if(cmd.equals("Curso")) {
	    	   
	    	   	painelCursos();
	    	   
	       }else if(cmd.equals("Disciplina")) {
	    	   
	    	   	painelDisciplina();
	    	   
	       }else if(cmd.equals("Professor")) {
	    	   
	    	 	    	   
	    	   	painelProfessor();
	    	   
	       }else if(cmd.equals("Grade")) {
	    	   
	    	
	    	   painelGrade();
	    	   	
	    	   
	       }else if(cmd.equals("Prof/Disc")) {
	    	   
	    	
	    	   painelProfDisc();
	    	   	
	    	   
	       }else if(cmd.equals("Mat/Aluno")) {
	    	   
	    	
	    	   painelMatAluno();
	    	   	
	    	   
	       }else {
	    	   
	    	   JOptionPane.showMessageDialog(null,"Nome Da Aplicação - LPIII - Wesley Eduardo\nVersão 1.0\nAno: 2019");
	       }       
	     
	    }

	       
	    public void fecharAplicacao() {
	    	
	   	 switch (JOptionPane.showConfirmDialog(null, "Deseja SAIR?")) {
	   	    case 0:
	   	       System.exit(0);
	   	        break;
	   	    case 1:    	        
	   	        break;
	   	    case 2:    	       
	   	        break;    	        
	   	    }
	   	
	   }

	    
	}

	
	 public static void main(String[] args) {        
		    
	    	
	        Splash splash  = new Splash(1500);
	        splash.showSplashAndExit();  	        

	    	 @SuppressWarnings("unused")
			GUI gui = new GUI();
	    	 
	    	 gui.painelLogin();
	        
	    }    
	    
        

}
