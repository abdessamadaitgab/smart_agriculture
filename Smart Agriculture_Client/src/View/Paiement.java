
	package View;

	import java.awt.Container;
	import java.awt.Frame;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import javax.swing.*;

	public class Paiement  extends JFrame{
		Container container = getContentPane();
	    JLabel type= new JLabel("TYPE DE CARTE");
	    JLabel num= new JLabel("NUMERO DE LA CARTE");
	    JLabel code= new JLabel("CODE DE SECURITE");
	    JLabel nom = new JLabel("NOM DU PROPRIETAIRE");
	    JLabel date = new JLabel("DATE D'EXPIRATION");
	    
	    String types[]={"VISA","MASTERCARD"};        
	    JComboBox tcb=new JComboBox(types); 
	    DateFormat format = new SimpleDateFormat("MM/YYYY");
	    JFormattedTextField tdate= new JFormattedTextField(format);
	    JTextField tnum=new JTextField();
	    JTextField tcode=new JTextField();
	    JTextField tnom=new JTextField();
	    JButton loginButton = new JButton("PAYER");

	    public Paiement() {
	   	 setTitle("Paiement Form");
		      setVisible(true);
		      setBounds(100, 100, 370, 600);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setResizable(true);
	       setLayoutManager();
	       setLocationAndSize();
	       addComponentsToContainer();
	     //  addActionEvent();
	       this.pack();
	       JFrame.setDefaultLookAndFeelDecorated(true);
	       this.setExtendedState(Frame.MAXIMIZED_BOTH);

	   }

	   public void setLayoutManager() {
	       container.setLayout(null);
	   }

	   public void setLocationAndSize() {
	       type.setBounds(500, 150, 150, 30);
	       num.setBounds(500, 220, 150, 30);
	       code.setBounds(500, 290, 150, 30);
	       nom.setBounds(500, 360, 150, 30);
	       date.setBounds(500, 430, 150, 30);
	       tdate.setValue(new Date());;
	       
	       tcb.setBounds(700, 150, 150, 30);
	       tnum.setBounds(700, 220, 150, 30);
	       tcode.setBounds(700, 290, 150, 30);
	       tnom.setBounds(700, 360, 150, 30);
	       tdate.setBounds(700, 430, 150, 30);
	       
	       
	       loginButton.setBounds(600, 500, 100, 30);


	   }

	   public void addComponentsToContainer() {
	       container.add(type);
	       container.add(num);
	       container.add(code);
	       container.add(nom);
	       container.add(date);
	       container.add(tcb);
	       container.add(tnum);
	       container.add(tcode);
	       container.add(tnom);
	       container.add(tdate);
	       
	       container.add(loginButton);
	       
	   }

		public static void main(String[] args) {
			Paiement p=new Paiement ();

		}

	    

	}

