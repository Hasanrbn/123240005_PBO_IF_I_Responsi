/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

/**
 *
 * @author Lab Informatika
 */
public class ModelEmployee {
    private int idEmployee;
    private String nama;
    private String divisi;
    private float nilai_target;
    private float nilai_disiplin;
    private float nilai_inovasi;
    
    public int getIdEmployee(){
        return idEmployee;
    }
    
    public void setIdEmployee(int idEmployee){
        this.idEmployee = idEmployee;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getDivisi(){
        return divisi;
    }
    
    public void setDivisi(String divisi){
        this.divisi = divisi;
    }
    
    public float getNilaiTarget(){
        return nilai_target;
    }
    
    public void setNilaiTarget(float nilai_target){
        this.nilai_target = nilai_target;
    }
    
    public float getNilaiDisiplin(){
        return nilai_disiplin;
    }
    
    public void setNilaiDisiplin(float nilai_disiplin){
        this.nilai_target = nilai_target;
    }    
    
    public float getNilaiInovasi(){
        return nilai_inovasi;
    }
    
    public void setNilaiInovasi(float nilai_inovasi){
        this.nilai_inovasi = nilai_inovasi;
    }
    
}
