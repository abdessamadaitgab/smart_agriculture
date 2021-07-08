package Model;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;


public class CapteurTableModel extends AbstractTableModel {
	String[] columns = {"id","Nom","Prenom","Date","Adresse","Ville","Designation","type"};
	LinkedList<TerCom> List ;
	
	public CapteurTableModel(LinkedList<TerCom> list) {
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
	         temp = new Integer(List.get(row).id);
	      }
	      else if (col == 1) {
	         temp = List.get(row).Nom;
	      }
	      else if (col == 2) {
	         temp = List.get(row).Prenom;
	      }
	      else if (col == 3) {
		         temp = List.get(row).date;
		      }
	      else if (col == 4) {
		         temp = List.get(row).adresse;
		      }
	      else if (col == 5) {
		         temp = List.get(row).ville;
		      }
	      else if (col == 6) {
		         temp = List.get(row).designation;
		      }
	      else if (col == 7) {
		         temp = List.get(row).type;
		      }
	
	      
	      
	      return temp;
	   	}
	
	  public String getColumnName(int col) {
	      return columns[col];
	   }

}