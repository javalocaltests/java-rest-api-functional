package com.tecnology.develop.service;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Utilizar programación funcional para implementar los siguientes Tests
 */
@ExtendWith(MockitoExtension.class)
class FunctionalOneTest {

	final List<String> names = Arrays.asList(
			"Gabriel", "Francisco", "Antonio", "Gerson", "Armando",
			"Carlos", "Bruno", "Oscar", "Sara", "Omar",
			"German", "Otoniel", "Olenka", "Ernesto", "Eduardo",
			"Americo", "Ricardo", "Nicolás", "Juan", "Diógenes"
	);

	/**
	 * 1. Obtener la suma total de la longitud de caracteres de todos los nombres de la lista
	 * "names".
	 *
	 */
	@Test
	void obtainTotalCharLengthOfAllItemsOfListTest() {

		//TODO: Implementar aqui la solución

		//assertEquals(126, totalChars);
	}

	/**
	 * 2. Obtener la cantidad de nombres de la lista names que empiecen con A, O y G,
	 * no construya filtros para cada letra, solo uno que sea parámetrico.
	 *
	 */
	@Test
	void obtainQuantityOfNamesByLetterTest() {

		//TODO: Implementar aqui la solución

		//assertEquals (3, ctdA);
		//assertEquals (4, ctdO);
		//assertEquals (3, ctdG);

	}

}
