/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

/**
 *
 * @author Lab Informatika
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Connector;

public class DAO implements InterfaceDAO{
    Connection connection;
    public  DAO(){
        connection = Connector.getConnection();
    }
    
    @Override
    public void insert(ModelEmployee employee){
        try {
            String sql = "INSERT INTO evaluasi (nama, divisi, nilai_target, nilai_disiplin, nilai_inovasi) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, employee.getNama());
            statement.setString(2, employee.getDivisi());
            statement.setFloat(3, employee.getNilaiTarget());
            statement.setFloat(4, employee.getNilaiDisiplin());
            statement.setFloat(5, employee.getNilaiInovasi());
            
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
        
    @Override
    public void update(ModelEmployee employee){
        try {
            String sql = "UPDATE evaluasi SET nama=?, divisi=?, nilai_target=?, nilai_disiplin=?, nilai_inovasi=? WHERE id_employee=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, employee.getNama());
            statement.setString(2, employee.getDivisi());
            statement.setFloat(3, employee.getNilaiTarget());
            statement.setFloat(4, employee.getNilaiDisiplin());
            statement.setFloat(5, employee.getNilaiInovasi());
            statement.setInt(6, employee.getIdEmployee());
            
            statement.executeUpdate();
            statement.close();
            
        } catch (Exception e) {
            System.out.println("Gagal Update Data: " + e.getMessage());
        }
    }
    
    @Override
    public void delete(int idEmployee){
        try {
            String sql = "DELETE FROM evaluasi WHERE id_employee=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, idEmployee);
            
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal Delete data: " + e.getMessage());
        }
    }
    
    @Override
    public list<ModelEmployee> getAll(){
        List<ModelEmployee> listEmployee = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM evaluasi";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                ModelEmployee employee = new ModelEmployee();
                
                employee.setIdEmployee(resultSet.getInt("id_employee"));
                employee.setNama(resultSet.getString("nama"));
                employee.setDivisi(resultSet.getString("divisi"));
                employee.setNilaiTarget(resultSet.getFloat("nilai_target"));
                employee.setNilaiDisiplin(resultSet.getFloat("nilai_disiplin"));
                employee.setNilaiInovasi(resultSet.getFloat("nilai_inovasi"));
                
                listEmployee.add(employee);
            }
            
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("gagal mengambil data: " + e.getMessage());
        }
        return listEmployee;
    }
    }
}
