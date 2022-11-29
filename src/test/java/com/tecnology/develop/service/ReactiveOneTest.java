package com.tecnology.develop.service;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Utilizar programación reactiva con webflux (Flux y Mono) para implementar los siguientes Tests
 */
@ExtendWith(MockitoExtension.class)
class ReactiveOneTest {

  List<String> frutas = Arrays.asList("Mango", "Naranja", "Manzana","Plátano", "Cereza");

  List<String> frutasNew = Arrays.asList("Arándano", "Fresa");

  /**
   * 6. Mostrar la lista de  Frutas en Mayúsculas y comprobar su resultado con un Assert.
   */
  @Test
  void showFruitsInUpperCaseFormatTest(){

    //TODO: Implementar aqui la solución

    //Assert: "MANGO", "NARANJA","MANZANA", "PLÁTANO", "CEREZA"

  }

  /**
   * 7. Filtrar por cantidad de caracteres (5 caracteres) los nombres de la lista frutas
   */
  @Test
  void filterByCharactersLengthTest() {

    //TODO: Implementar aqui la solución

		//Assert: Mango

  }

  /**
   * 8. Retorne ambas listas: frutas y frutasNew en un unico Stream de datos. Es decir debe unir
   * las dos listas en una sola.
   */
  @Test
  void obtainListsInUniqueStreamOfDataTest() {

    //TODO: Implementar aqui la solución

    //Assert : "Mango", "Naranja", "Manzana", "Plátano", "Cereza", "Arándano", "Fresa"
  }

}
