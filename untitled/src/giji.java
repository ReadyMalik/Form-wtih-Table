import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class giji {
    private JTextField textJumlah;
    private JTable tableBBM;
    private JButton calculateButton;
    private JTextField textNamaMotor;
    private JComboBox comboMerk;
    private JPanel rPanel;
    private JLabel Jarak;
    private JLabel jumlahBbm;
    private JButton loadButton;
    private JTextField textJaraktempuh;
    private JComboBox comboJenis;
    private DefaultTableModel tableModel;

    public void setJarak(String JarakTempuh){
        Jarak.setText(JarakTempuh+"Km/Jam");
    }

    public void setJumlahBbm(String banyakBBM) {
        jumlahBbm.setText(banyakBBM+"Kg");
    }

    public giji() {
        this.initCompliment();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Merk =(String)comboMerk.getSelectedItem();
                String Nama = textNamaMotor.getText();
                double Jumlah = Integer.parseInt(textJumlah.getText());
                int Jarak = Integer.parseInt(textJaraktempuh.getText());
                String Jenis =(String) comboJenis.getSelectedItem();
                Double Akhir = null;
                String kosong = "";

                if(Merk.isBlank() || Nama.isBlank() || Jenis.isBlank() || Jumlah==0 || Jarak==0 ) {
                    JOptionPane.showMessageDialog(rPanel,
                            "Harap Isi data dengan Lengkap!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else {
                    tableModel.addRow(new Object[]{Merk, Nama, Jumlah, Jarak, Jenis, Akhir});
                    comboMerk.setSelectedItem("");
                    textNamaMotor.setText("");
                    textJumlah.setText("");
                    textJaraktempuh.setText("");
                    comboJenis.setSelectedItem("");
                    Akhir.equals(kosong);
                }
                if (comboJenis.getSelectedIndex()==1){
                    Akhir = Double.valueOf(Jumlah/Jarak*0.2);
                }else if(comboJenis.getSelectedIndex()==2){
                    Akhir = Double.valueOf(Jumlah/Jarak*0.3);
                }else if(comboJenis.getSelectedIndex()==3){
                    Akhir = Double.valueOf(Jumlah/Jarak*0.4);
                }


            }
        });
    }

    private void initCompliment(){
        Object [] tabelColom = {
                "Merk Motor",
                "Nama Motor",
                "Jumlah BBM",
                "Jarak Yang Ditempuh",
                "Jenis BBM",
                "Akhir"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tabelColom);
        tableBBM.setModel(tableModel);
        tableBBM.setAutoCreateRowSorter(true);
        tableBBM.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);



    }


    public JPanel getrPanel() {
        return rPanel;
    }


}
