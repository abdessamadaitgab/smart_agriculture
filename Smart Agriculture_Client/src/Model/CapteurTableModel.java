package Model;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

public class CapteurTableModel extends AbstractTableModel {
	String[] columns = {"id capteur","Designation","type","prix","id terrain"};
	LinkedList<captter> List ;
	
	public CapteurTableModel(LinkedList<captter> list) {
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
	         temp = List.get(row).getId_Capteur();
	      }
	      if (col == 1) {
	         temp = List.get(row).getDesignation();
	      }
	      else if (col == 2) {
	         temp = List.get(row).getType();
	      }
	      else if (col == 3) {
	         temp = new Double(List.get(row).getPrix());
	      }
	      else if (col == 4) {
		         temp = List.get(row).getIdter();
		      }
	
	      
	      
	      return temp;
	   	}
	
	  public String getColumnName(int col) {
	      return columns[col];
	   }

}
