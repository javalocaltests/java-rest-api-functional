package com.tecnology.develop.service;

import com.tecnology.develop.model.Customer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Utilizar programación funcional para implementar los siguientes Tests
 */
@ExtendWith(MockitoExtension.class)
public class FunctionalThreeTest {

  final List<Customer> customers = Arrays.asList(
      new Customer("Juan", 20),
      new Customer("Sara", 35),
      new Customer("Jane", 35),
      new Customer("Michael", 18),
      new Customer("Ralph", 18),
      new Customer("Paul", 22));

  /**
   * 4. Muestre la siguiente lista ordenada de forma Ascendente por Edad utilizando expresiones
   * lambda. No programación Imperativa.
   */
  @Test
  void showOrderedListInAscendantFormTest(){

    //TODO: Implementar aqui la solución

    //Assert: Sorted List : [[Michael, 18], [Ralph, 18], [Juan, 20], [Paul, 22], [Sara, 35], [Jane, 35]]

  }

  /**
   * 5. Agrupe la lista "customers" por Grupos de Edad, utilice Expresiones Lambda, no
   * Programacion Imperativa.
   */
  @Test
  void groupingByAgeCustomersTest(){

    //TODO: Implementar aqui la solución

    //Assert {18=[[Michael, 18], [Ralph, 18]], 35=[[Sara, 35], [Jane, 35]], 20=[[Juan, 20]], 22=[[Paul, 22]]}

  }

}
