package Model;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

public class ClientTableModel extends AbstractTableModel {

	String[] columns = {"nom","prenom","age","login","password"};
	LinkedList<Client> List ;
	
	public ClientTableModel(LinkedList<Client> list) {
		List=list;
	}
	
	public int getRowCount() {
		return List.size();
	}


	public int getColumnCount() {
		
		return columns.length;
		
	}


	public Object getValueAt(int row, int col) {

		Object temp = null;
	      if (col == 0) {
	         temp = List.get(row).getNom();
	      }
	      else if (col == 1) {
	         temp = List.get(row).getPrenom();
	      }
	      else if (col == 2) {
	         temp = new Double(List.get(row).getAge());
	      }
	      else if (col == 3) {
	    	  temp = List.get(row).getLogin();
	      }
	      else if (col == 4) {
	    	  temp = List.get(row).getMdp();
	      }
	      
	      
	      return temp;
	   	}
	
	  public String getColumnName(int col) {
	      return columns[col];
	   }

}
