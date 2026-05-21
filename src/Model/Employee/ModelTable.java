/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;


import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTable extends AbstractTableModel {
    List<ModelEmployee> listEmployee;
    
    public ModelTable(List<ModelEmployee> ListEmployee){
        this.listEmployee = listEmployee;
    }
    
    @Override
    public int getRowCount(){
        return listEmployee.size();
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public Object getValueAt(int row, int column){
        switch (column) {
            case 0:
                return listEmployee.get(row).getNama();
            case 1:
                return listEmployee.get(row).getDivisi();
            case 2:
                return listEmployee.get(row).getNilaiTarget();
            case 3:
                return listEmployee.get(row).getNilaiDisiplin();
            case 4:
                return listEmployee.get(row).getNilaiInovasi();
            default:
                return null;
        }
    }
}
