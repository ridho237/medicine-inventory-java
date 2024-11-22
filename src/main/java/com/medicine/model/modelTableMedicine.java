package com.medicine.model;
/**
 *
 * @author Wiliam Devin Septianus Pranggono
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modelTableMedicine extends AbstractTableModel {
    private List<modelMedicine> listMedicine;
    private String[] columnNames = {"ID", "Nama Obat", "Jenis Obat", "Jumlah", "Satuan", "Tanggal Kadaluarsa"};
    
    public modelTableMedicine(List<modelMedicine> listMedicine) {
        this.listMedicine = listMedicine;
    }
    
    @Override
    public int getRowCount() {
        return listMedicine.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modelMedicine medicine = listMedicine.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return medicine.getId();
            case 1:
                return medicine.getNama_obat();
            case 2:
                return medicine.getJenis_obat();
            case 3:
                return medicine.getJumlah();
            case 4:
                return medicine.getSatuan();
            case 5:
                return medicine.getExpired();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void setListMedicine(List<modelMedicine> listMedicine) {
        this.listMedicine = listMedicine;
        fireTableDataChanged();
    }
}
