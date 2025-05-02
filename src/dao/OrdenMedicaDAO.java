/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.lang.reflect.Type;
import java.time.LocalDate;



import java.util.ArrayList;
import java.util.List;
import model.OrdenMedica;

/**
 *
 * @author HP
 */
public class OrdenMedicaDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\HP\\Documents\\NetBeansProjects\\farmaSalud-software\\src\\resources\\data\\ordenmedica.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    
    public List<OrdenMedica>cargarTodas() {
      try(Reader reader = new FileReader(ARCHIVO_JSON)){
         Type tipoLista = new TypeToken<ArrayList<OrdenMedica>>(){}.getType();
         List<OrdenMedica>ordenesmedicas = gson.fromJson(reader, tipoLista);
         return ordenesmedicas != null ? ordenesmedicas : new ArrayList<>();
      }catch (Exception e){
          System.out.println("Tienes eso malo y no se puede cargar" + e.getMessage());
          return new ArrayList<>();
      }
    }
    
    public void guardarOrdenMedica(OrdenMedica ordenmedica){
        
    List<OrdenMedica>ordenesmedicas = cargarTodas();
    ordenesmedicas.add(ordenmedica);
    guardarTodas(ordenesmedicas);
    
    }
    
    public void guardarTodas(List<OrdenMedica> ordenesmedicas){
       try (FileWriter writer = new FileWriter(ARCHIVO_JSON)){
           gson.toJson(ordenesmedicas, writer);
       }catch (Exception e){
           System.err.println("Error al guardar orden: " + e.getMessage());

       }
    }
    
    
    
}
