/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Data.FakeDataBase;
import java.util.ArrayList;
import modelos.Paciente;

/**
 *
 * @author HP
 */
public class PacienteController {
    
    private FakeDataBase dataBase;
    
    public PacienteController(){
        dataBase = FakeDataBase.getInstancia();
    }
    
    public ArrayList<Paciente> GetPacientes(){
        try{
            dataBase.AllPacientes();
            return new ArrayList<Paciente>();
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            return null;
        }
    }
    
}
