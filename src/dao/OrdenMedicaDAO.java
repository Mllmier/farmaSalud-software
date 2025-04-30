/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class OrdenMedicaDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\HP\\Documents\\NetBeansProjects\\farmaSalud-software\\src\\resources\\data\\ordenmedica.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDate.class,new LocalDateAdapter())
            .create();

    private static class LocalDateAdapter {

        public LocalDateAdapter() {
        }
    }
}
