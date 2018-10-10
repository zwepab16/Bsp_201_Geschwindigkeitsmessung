
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



public class VelocityTableModel extends AbstractTableModel{
private ArrayList<Measurement> list=new ArrayList();
private static final String[] spalten={"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};

public String getColumnName(int c){
    return spalten[c];
}   

@Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
       return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Measurement m=list.get(i);
        return m;
    }
    public void add(Measurement m){
        list.add(m);
        fireTableRowsInserted(0, 0);
    }
    public void löschen(int[] zeile){
       int count=0;
        for (int i : zeile) {
            
            list.remove(i-count);
            count++;
            
        }
        
        fireTableDataChanged();
    }

}
