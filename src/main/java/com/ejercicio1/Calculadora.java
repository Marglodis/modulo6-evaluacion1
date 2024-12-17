package com.ejercicio1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Calculadora implements ICalculadora {

	private List<Alumno> alumnos;

	@Override
	public List<Alumno> calcularPromedios() {

		int indice = 0;
		for(Alumno alumno : alumnos) {
			float sumaNotas = 0F;
			int cantidadNotas = 0;

			for(Integer nota : alumno.getNotas()) {
				sumaNotas += nota;
				cantidadNotas++;
			}
		}
		return alumnos;
	}


}
