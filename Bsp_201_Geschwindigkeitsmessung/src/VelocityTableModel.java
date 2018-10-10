
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
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
 public void save()throws Exception{
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("*.ser","ser"));
         
            File file = null;
            int result = chooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
            }

            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(list);
            oos.flush();
            fos.close();
            
        } catch (Exception e) {
            throw e;
        }
    }

    public void load() throws Exception{
        list.removeAll(list);
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("*.ser","ser"));
            File file = null;
            int result = chooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
            }
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Measurement>) ois.readObject();
            
            fis.close();
            fireTableDataChanged();
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    public double getDurchschnitt(){
        double durchschnitt=0;
            for (Measurement measurement : list) {
            durchschnitt+=measurement.getÜbertretung();
        }
            return durchschnitt/list.size();
        }
}
