	package Model;

	import java.util.LinkedList;

	import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TerrainTableModel extends AbstractTableModel {

		String[] columns = {"id terrain","surface","adresse","ville"};
		LinkedList<Terrain> List ;
		
		public TerrainTableModel(LinkedList<Terrain> list) {
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
		         temp = List.get(row).id_Terrain;
		      }
		      else if (col == 1) {
		         temp = new Double(List.get(row).Superficie);
		         temp = List.get(row).Superficie;
		      }
		      else if (col == 2) {
			         temp = List.get(row).Adresse;
		      }
		      else if (col == 3) {
		    	  temp = List.get(row).Ville;
		      }
		
		      
		      
		      return temp;
		   	}
		
		  public String getColumnName(int col) {
		      return columns[col];
		   }

	

}
