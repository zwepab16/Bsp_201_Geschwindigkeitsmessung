
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class VelocityTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel label = new JLabel();
        Measurement c = (Measurement) o;
        switch (i1) {
            case 0:
                label.setText("" + c.getDatum().toLocalDate().toString());
                break;
            case 1:
                label.setText("" + c.getDatum().toLocalTime().toString());
                break;
            case 2:
                label.setText("" + c.getKennzeichen());
                break;
            case 3:
                label.setText("" + c.getGemessen());
                break;
            case 4:
                label.setText("" + c.getErlaubt());
                break;
            case 5:
                label.setText("" + c.getÜbertretung());
                if (c.getÜbertretung() > 30) {
                    label.setBackground(Color.RED);
                } else if (c.getÜbertretung() > 20) {
                    label.setBackground(Color.ORANGE);
                } else if (c.getÜbertretung() > 10) {
                    label.setBackground(Color.YELLOW);
                } else if (c.getÜbertretung() > 0) {
                    label.setBackground(Color.blue);
                }
                break;
        }
        if (bln) {
            label.setBackground(new Color(130, 200, 240, 123));
        }

        // label.setText(o.toString());
        label.setOpaque(true);

        return label;
    }

}
