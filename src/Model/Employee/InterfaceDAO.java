/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Employee;


import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAO {
    public void insert(ModelEmployee employee);
    public void update(ModelEmployee employee);
    public void delete(int IdEmployee);
    public List<ModelEmployee> getAll();
   
}
