/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lab Informatika
 */

import java.util.List;
import javax.swing.JOptionPane;
import Model.Employee.DAO;
import Model.Employee.InterfaceDAO;
import Model.Employee.ModelEmployee;
import Model.Employee.ModelTable;
import View.Karyawan.ViewData;

public class ControllerEmployee {
    ViewData view;
    InterfaceDAO dao;
    List<ModelEmployee> listEmployee;
    
    public ControllerEmployee(ViewData view){
        this.view = view;
        dao = new DAO();
    }
    
    public void tampilData(){
        listEmployee = dao.getAll();
        ModelTable table = new ModelTable(listEmployee);
        view.getTableEmployee().setModel(table);
    }
    
    public void insert(){
        try{
            String 
        }
    }
    
}
