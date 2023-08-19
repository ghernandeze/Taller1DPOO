package uniandes.dpoo.taller0.modificacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.taller0.modelo.Atleta;
import uniandes.dpoo.taller0.modelo.Genero;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;



public class Modificacion {

	public static void main(String[] args) {
		
		System.out.println("Hola, mundo!");
	
	
	
	try {
        // Carga el archivo utilizando LoaderOlimpicos
        CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
        
        // Imprime el país con más medallistas utilizando la instancia de CalculadoraEstadisticas
        System.out.println(calc.paisConMasMedallistas());
    } catch (IOException e) {
        System.err.println("Error al cargar el archivo: " + e.getMessage());
    }
}
	
	
	
}
