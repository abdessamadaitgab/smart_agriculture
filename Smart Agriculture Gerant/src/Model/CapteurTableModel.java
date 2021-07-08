package Model;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

public class CapteurTableModel extends AbstractTableModel {
	String[] columns = {"Designation","type","prix"};
	LinkedList<Capteur> List ;
	
	public CapteurTableModel(LinkedList<Capteur> list) {
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
	         temp = List.get(row).getDesignation();
	      }
	      else if (col == 1) {
	         temp = List.get(row).getType();
	      }
	      else if (col == 2) {
	         temp = new Double(List.get(row).getPrix());
	      }
	
	      
	      
	      return temp;
	   	}
	
	  public String getColumnName(int col) {
	      return columns[col];
	   }

}
