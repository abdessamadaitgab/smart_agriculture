package View;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.*;

import Model.Capteur;


public class accueil extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel p=new JPanel();
	JPanel haut=new JPanel();
	JPanel moy=new JPanel();
    JButton b;
    JLabel lbl;
    JButton accueil,espace,connecter,creer;
    LinkedList<Capteur> l;

	public accueil() throws SQLException {
		accueil=new JButton("accueil");accueil.addActionListener(this);
		espace =new JButton("mon espace");espace.addActionListener(this);
		connecter=new JButton("se connecter");connecter.addActionListener(this);
		creer=new JButton("creer un compte");creer.addActionListener(this);
		haut.setLayout(new FlowLayout());
		haut.add(accueil);haut.add(espace);haut.add(connecter);haut.add(creer);
		
		
		moy.setLayout(new GridLayout(0,3));
		// l= cc.GetAllCapteurs();
		Dimension maxSize = new Dimension(400, 300);

		for(int i=0;i<l.size();i++) {
			// double prix=l.get(i).getPrix();
			 //String pr= Double.toString(prix);
			 
			// b=new JButton(l.get(i).getDesignation()+" "+l.get(i).getType()+" "+pr+"DHS",new ImageIcon(l.get(i).getImage()));
			 b.setFont(new Font("Arial", Font.BOLD, 15));
			 b.setHorizontalTextPosition(SwingConstants.CENTER);
			 b.setVerticalTextPosition(SwingConstants.BOTTOM);
			// b.setMaximumSize(maxSize);
			 b.setPreferredSize(maxSize);
			 b.addActionListener(this);
             moy.add(b,l);
             
		}
		
		
		
		 setTitle("Login Form");
	      setVisible(true);
	      setBounds(100, 100, 370, 600);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setResizable(true);
	      this.pack();
	       JFrame.setDefaultLookAndFeelDecorated(true);
	       this.setExtendedState(Frame.MAXIMIZED_BOTH);
	       setLayout(new BorderLayout());
	       add(haut,BorderLayout.PAGE_START);
	       p.add(moy);
	       add(p,BorderLayout.CENTER);

		
		
	}
	/*public void actionPerformed(ActionEvent ev) {
		try {
			cc.CRUD_Capteur("root", "Aitgab@1998");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			l= cc.GetAllCapteurs();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<l.size();i++) {
		 double prix=l.get(i).getPrix();
		 String pr= Double.toString(prix);	
			System.out.print("");


		if(ev.getActionCommand().equals(l.get(i).getDesignation()+" "+l.get(i).getType()+" "+pr+"DHS")) {
			System.out.print("ok");
		}
        if (ev.getSource() == accueil) {
        	try {
				new accueil();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        if (ev.getSource() == creer) {
        	this.setVisible(false);
        	new InscriptionFrame();
        }
        if (ev.getSource() == connecter) {
        	new LoginFrame();
        }
        if (ev.getSource() == espace) {
        	 try {
				new modifierInfos(2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        


	}
	}*/

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        accueil ac=new accueil();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
