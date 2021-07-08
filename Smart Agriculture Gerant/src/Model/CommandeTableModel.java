package Model;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

public class CommandeTableModel extends AbstractTableModel{
	public String[] columns = {"id commande","id client","Date de commande"};
	LinkedList<Commande> List ;
	
	public CommandeTableModel(LinkedList<Commande> list) {
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
	         temp = List.get(row).getId_Commande();
	      }
	      else if (col == 1) {
	         temp = List.get(row).getId_Client();
	      }
	      else if (col == 2) {
		         temp = List.get(row).d ;
	      }
	
	      
	      
	      return temp;
	   	}
	
	  public String getColumnName(int col) {
	      return columns[col];
	   }
}
