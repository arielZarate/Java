# Testing java

## Junit5 Jupiter 
Es una potente librería de pruebas unitarias para Java, diseñada para
facilitar el proceso de escribir y ejecutar tests de manera eficiente y efectiva. Su
objetivo principal es proporcionar un marco de trabajo moderno y flexible que
permita a los desarrolladores realizar pruebas unitarias de manera más sencilla y
efectiva, mejorando así la calidad y confiabilidad del software desarrollado.
Componentes de Junit5 Jupiter
## Anotaciones
Cuenta con un conjunto de anotaciones que permiten definir y configurar las pruebas
unitarias de manera declarativa. Algunas de las anotaciones más comunes son @Test,
que indica que un método es una prueba unitaria, y @BeforeEach y @AfterEach, que
permiten configurar acciones que se ejecutan antes y después de cada prueba.
Asunciones
Incluye un conjunto de métodos de asunciones que permiten verificar supuestos sobre el
entorno en el que se ejecutan las pruebas. Por ejemplo, la asunción assumeTrue()
permite omitir una prueba si cierta condición no se cumple, lo que es útil para evitar
errores innecesarios
## Assertions
La librería ofrece una amplia gama de métodos de aserción que permiten verificar los
resultados esperados de las pruebas. Estas aserciones permiten comprobar si un
resultado es verdadero, falso, nulo, igual, etc., lo que facilita la validación de los
resultados de las pruebas.
## Extensiones
Permite la creación de extensiones personalizadas que agregan funcionalidades
adicionales a las pruebas. Estas extensiones pueden utilizarse para configurar el entorno
de prueba, capturar información de ejecución y muchas otras funcionalidades.
Integración con otros frameworks
Se integra de manera nativa con otros frameworks y librerías populares, lo que facilita su
uso y permite aprovechar sus características junto con otras herramientas de testing.
Junit5 Jupiter se ha convertido en una opción preferida para realizar pruebas
unitarias en proyectos Java debido a su facilidad de uso y la amplia variedad de
funcionalidades que ofrece.




# Test unitario
El test unitario es una técnica fundamental dentro del desarrollo de software que
permite verificar el correcto funcionamiento de unidades individuales de código,
como métodos o funciones, de manera aislada y sin depender de otros componentes
del sistema. Su objetivo principal es asegurar que cada unidad de código, por sí
sola, produce los resultados esperados y cumple con los requerimientos
establecidos.

Caracteristicas:
- Aislamiento de la unidad 
- independencia del entorno
- cobertura especifica
- ejecucuion rapida
- automatizacion
- ejecucion de resultados 


### ¿Cómo está formado un test unitario?
La composición de los test unitarios utilizando la práctica GIVEN/WHEN/THEN es
una técnica de escritura de pruebas que ayuda a mejorar la claridad y organización
de los casos de prueba. Esta metodología se basa en dividir el caso de prueba en
tres secciones distintas: el contexto (GIVEN), la acción (WHEN) y el resultado
esperado (THEN). Cada componente fundamental juega un papel importante en esta
estructura: 

 
```bash
       / ============\
      /               \
     /                 \
    /  TEST MANUALES    \
   / =================== \
  / TEST DE INTEGRACION   \
 / =====================   \
/     TEST UNITARIOS        \
=============================

```

- @DisplayName: Esta anotación se utiliza para proporcionar un nombre descriptivo
    y significativo a cada caso de prueba. Ayuda a identificar claramente qué
    funcionalidad o comportamiento está siendo probado y mejora la legibilidad de los
    r0esultados de las pruebas. Un buen nombre de prueba debe ser informativo y
    expresar la intención del caso de prueba.
- @Test: La anotación @Test se utiliza para marcar un método como un caso de
   prueba. Esto indica al entorno de pruebas que el método debe ser ejecutado como
   parte de las pruebas unitarias. Cada método marcado con @Test representa un
   caso de prueba individual y debe estar aislado y no depender de otros métodos de
    prueba
- @Disabled: La anotación @Disabled se utiliza para desactivar temporalmente un
   caso de prueba. Puede ser útil cuando se está desarrollando una funcionalidad y se
   necesita excluir ciertos casos de prueba que aún no están completos o están
   fallando. Esto permite centrarse en la resolución de problemas en otras áreas y
   evitar la distracción de casos de prueba incompletos
   La estructura GIVEN/WHEN/THEN guía la organización del código del caso de
   prueba de la siguiente manera:
- GIVEN (Contexto): En esta sección, se establece el estado inicial o contexto
  necesario para el caso de prueba. Esto puede incluir la creación de objetos, la
  configuración de variables, la preparación de datos y cualquier otra configuración
  necesaria para realizar la prueba
- WHEN (Acción): En esta sección, se lleva a cabo la acción o el evento que se
  está probando. Es decir, se ejecuta el método o función que se quiere probar,
  pasando los datos necesarios que se prepararon en la sección GIVEN.
- THEN (Resultado Esperado): En esta sección, se verifica si el resultado de la
  acción es el esperado. Se utilizan aserciones (assertions) para comparar el resultado
  obtenido con el resultado esperado. Si las aserciones son verdaderas, el caso de
  prueba se considera exitoso. Si alguna aserción falla, indica que el comportamiento
  del código no es el esperado y se debe investigar y corregir el problema




# test de integracion 

Los tests de integración son pruebas que evalúan la interacción entre diferentes
componentes o módulos del sistema para verificar si funcionan correctamente en
conjunto. A diferencia de los tests unitarios, que se centran en aislar unidades
individuales de código, los tests de integración evalúan cómo las diferentes partes
del sistema interactúan y colaboran entre sí para cumplir con las funcionalidades
requeridas. Estas pruebas son más complejas y pueden involucrar bases de datos,
servicios externos o cualquier otro recurso compartido
### Objetivo del Test de Integración:
El principal objetivo de los tests de integración es asegurar que los diferentes
componentes del sistema trabajen adecuadamente en conjunto y cumplan con los
requisitos de integración establecidos. Estas pruebas son esenciales para verificar la
interoperabilidad entre los módulos y garantizar que todas las partes se integren de
manera efectiva. Además, los tests de integración permiten detectar posibles
problemas de comunicación y colaboración entre los componentes, lo que contribuye
a la creación de un software confiable y robusto.


## Test unitarios vs tests de integración
Aunque los tests de integración y los tests unitarios comparten la estructura
GIVEN/WHEN/THEN y ambos buscan mejorar la calidad del software, se diferencian
en su enfoque. Los tests de integración evalúan la colaboración y comunicación
entre los componentes, mientras que los tests unitarios se concentran en la
funcionalidad específica de unidades individuales de código.
Los tests de integración son más complejos y pueden requerir la configuración de
recursos compartidos, como bases de datos, mientras que los tests unitarios son
más aislados y no involucran la interacción con otros componentes. Ambos tipos de
pruebas son complementarios y juntos contribuyen a una estrategia completa de
testing para asegurar la calidad y fiabilidad del software.
Es importante destacar que tanto los tests unitarios como los tests de integración
son fundamentales en el proceso de desarrollo de software. Los tests unitarios nos
permiten probar unidades individuales de código para asegurarnos de que funcionen
correctamente de manera aislada. Por otro lado, los tests de integración nos
permiten verificar que los diferentes componentes del sistema trabajen
adecuadamente juntos, asegurando la correcta interacción entre ellos


## ¡Sumamos a Mockito!
Mockito es una popular biblioteca de pruebas en Java que permite crear objetos
simulados o "mocks" para realizar pruebas unitarias más eficientes y efectivas. Estos
mocks simulan el comportamiento de objetos reales y se utilizan para aislar y probar
unidades individuales de código de manera independiente.


### Principales características de Mockito
• Creación de mocks: Mockito permite crear fácilmente objetos simulados
de interfaces o clases con un comportamiento predefinido. Esto permite aislar
las dependencias externas y centrarse en la unidad de código que se está
probando
• Configuración del comportamiento: Los mocks pueden ser
configurados para devolver valores específicos, lanzar excepciones o realizar
otras acciones cuando se llaman a sus métodos. Esto permite simular
diferentes escenarios de prueba.
• Verificación de interacciones: Mockito proporciona métodos para
verificar si ciertos métodos de los mocks fueron llamados o no, y con qué argumentos. Esto es útil para asegurarse de que el código bajo prueba
interactúa correctamente con sus dependencias.
• Sintaxis clara y legible: Mockito ofrece una sintaxis simple y legible que
facilita la escritura y comprensión de las pruebas unitarias. Esto hace que el
código de prueba sea más mantenible y fácil de leer.
Integración con frameworks de pruebas: Mockito se integra bien con
otros frameworks de pruebas, como JUnit, facilitando su uso en proyectos
existentes
En resumen, Mockito es una herramienta poderosa y versátil que simplifica la
creación de pruebas unitarias en Java y ayuda a garantizar la calidad y
robustez del código


### @Mock: 
se utiliza para crear objetos simulados (mocks) de interfaces o clases.
Estos mocks se utilizan para simular el comportamiento de las dependencias
externas durante las pruebas unitarias.
import org.mockito.Mock;
public class MyTest {
@Mock
private EjemploDependencia dependencia;
// ... código de prueba ...
}

### @InjectMocks: 
se utiliza para inyectar automáticamente los mocks creados con la
anotación @Mock en la instancia de la clase bajo prueba. Esto evita la necesidad de
crear manualmente los mocks e insertarlos en la clase.
import org.mockito.InjectMocks;
import org.mockito.Mock;
public class MiTest {
@Mock
private EjemploDependencia dependencia;;
@InjectMocks
private MiClaseTesteada miClaseTesteada;
// ... código de prueba ...
}

### @Spy: 
se utiliza para crear objetos espía, que son objetos reales con ciertos
métodos simulados. A diferencia de los mocks, los espías mantienen el
comportamiento original de los métodos no simulados, lo que permite realizar
pruebas en objetos reales con algunos métodos simulados.
import org.mockito.Spy;
public class MiTest {
@Spy
private ObjetoReal objetoReal;
// ... código de prueba ...
}


## Uso de métodos principales:
### when/thenReturn: 
El método when() se utiliza para especificar el comportamiento
de un mock cuando se llama a uno de sus métodos. Luego, el método thenReturn()
se utiliza para indicar el valor que debe devolver el mock cuando se llame al método
especificado.

import static org.mockito.Mockito.*;
public class MiTest {
@Test
public void testComportamientoMock() {
MiDependencia miDependenciaMock = mock(MiDependencia.class);
when(miDependenciaMock.getValue()).thenReturn(42);
// ... código de prueba ...
}
}

### doReturn/when: 
En algunos casos, cuando el método a simular tiene una firma
que no puede usarse con when/thenReturn, se puede utilizar doReturn() en
combinación con el método when() para configurar el comportamiento del mock.
import static org.mockito.Mockito.*;
public class MiTest {
@Test
public void testComportamientoMock() {
MiDependencia miDependenciaMock = mock(MiDependencia.class);
doReturn(42).when(miDependenciaMock).getValue();
// ... código de prueba ...
}
}

### verify:
El método verify() se utiliza para verificar si se ha llamado a un método
específico de un mock y con qué argumentos. Esto permite comprobar si el código
bajo prueba interactuó correctamente con sus dependencias.
import static org.mockito.Mockito.*;
public class MiTest {
@Test
public void testInteraccionClasePrueba() {
MiDependencia miDependenciaMock = mock(MiDependencia.class);
ClasePruebaTesteada clasePruebaTesteada = new
ClasePruebaTesteada(miDependenciaMock);
// ... código de prueba ...
verify(miDependenciaMock).métodoAEjecutar(arg1, arg2);
}
}

### doThrow: 
El método doThrow() se utiliza para simular que un método arroja una
excepción. Se puede combinar con el método when() para configurar el
comportamiento del mock y lanzar una excepción cuando se llama al método
especificado
import static org.mockito.Mockito.*;
public class MiTest {
@Test(expected = UnaExcepcionCualquiera.class)
public void testDeExcepcion() {
MiDependencia miDependenciaMock = mock(MiDependencia.class);
when(miDependenciaMock.metodoAEjecutar()).thenThrow(new
UnaExcepcionCualquiera());
// ... código de prueba ...
}
}


aca la implementacion de un mock 
```java
package Mockito;

import Operations.Operations;


import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;



//@Mock
public class CalculatorServiceTest  {

    //@InjectMocks   //se utiliza para inyectar automáticamente los mocks creados
    private CalculatorService calculatorService;
    private Operations operationsMocks ;



     @Before
     public void setup(){
     //creamos un mock de la clase Operations
        operationsMocks= Mockito.mock(Operations.class);  //existe otra opcion con @Mock
         // Crear una instancia de CalculatorService con el mock
         calculatorService=new CalculatorService(operationsMocks);
     }


     @Test
    public void testPerformAdiccion() {
         //configurar el comportamiento del mock
    when(operationsMocks.suma(2.0,3.0)).thenReturn(5.0);
    // Lllamar el metodo bajo prueba

         double resultado=calculatorService.performAdiccion(2.0,3.0);

         //verificar el resultado
         assertEquals(5.0,resultado,0.001);
        //verificar que el metodo suma del mock fue llamado una vez
         verify(operationsMocks,times(1)).suma(2.0,3.0);
    }

    public void testPerformDivisionByZero() {
        // Configurar el comportamiento del mock para lanzar una excepción
         when(operationsMocks.division(6.0,0.0)).thenThrow(new IllegalArgumentException("divisor no puede ser 0"));

        // Llamar al método bajo prueba, que debería lanzar una excepción
         calculatorService.performDivision(6.0,0.0);

    }
}
```


### Propósito de los Mocks
1. Simulación de Comportamiento: Cuando creas un mock de una clase (por ejemplo, Operations), estás creando una versión simulada de esa clase. Este mock puede ser configurado para devolver valores específicos o lanzar excepciones cuando se llamen sus métodos, simulando el comportamiento de la clase real.

2. Aislamiento de Dependencias: Al usar mocks, puedes aislar la unidad de código que estás probando (por ejemplo, CalculatorService) de sus dependencias (por ejemplo, Operations). Esto te permite centrarte en probar la lógica de CalculatorService sin preocuparte por la implementación interna de Operations.

3. Control y Verificación: Los mocks te permiten controlar exactamente cómo se comportan las dependencias y también verificar cómo interactúa la unidad de código bajo prueba con esas dependencias. Puedes asegurarte de que los métodos correctos se llaman con los parámetros correctos.


### Stubbing
El "stubbing" en el contexto de pruebas unitarias y el uso de mocks, se refiere al proceso de configurar un mock para que devuelva valores específicos cuando se llamen sus métodos con ciertos argumentos. Es decir, estás definiendo el comportamiento esperado del mock en diferentes escenarios.

Vamos a ver cómo se aplica el stubbing en el ejemplo que hemos utilizado antes.

Explicación del Stubbing en el Ejemplo
1. Stubbing del Método suma:
```java
when(operationsMock.suma(2.0, 3.0)).thenReturn(5.0);


```
Aquí, estás configurando el mock operationsMock para que devuelva 5.0 cuando se llame al método suma con los argumentos 2.0 y 3.0. Este es el proceso de "stubbing", donde defines cómo debe comportarse el mock en respuesta a ciertas llamadas.

2. Stubbing del Método division:
```java
when(operationsMock.division(6.0, 0.0)).thenThrow(new IllegalArgumentException("Divisor no puede ser cero"));
 

```


# Mejores prácticas y consejos
Algunos consejos generales de la comunidad para mejorar nuestros tests.
## Nombres de pruebas descriptivos:
Los nombres de las pruebas deben ser descriptivos y claros para que cualquier
persona que lea el código pueda entender qué se está probando sin tener que
revisar el código de la prueba en detalle. Un nombre descriptivo debe indicar
claramente el escenario que se está probando y el resultado esperado.
Por ejemplo, si estamos probando una función que suma dos números, un buen
nombre de prueba podría ser "testSumaNumerosPositivos" o
"testSumaNumerosNegativos".
## Mantenimiento de pruebas a lo largo del tiempo:
A medida que nuestro código evoluciona con el tiempo, también deben hacerlo
nuestras pruebas. Es importante mantener las pruebas actualizadas y reflejar
cualquier cambio realizado en el código.
Cuando hagamos modificaciones en el código, debemos revisar y, si es necesario,
actualizar las pruebas para asegurarnos de que sigan siendo relevantes y precisas.
Además, debemos eliminar pruebas obsoletas o que ya no son relevantes
## Técnicas de diseño para facilitar las pruebas:
Al diseñar nuestro código, podemos aplicar técnicas que faciliten la escritura y
mantenimiento de las pruebas:

1. Inyección de dependencias: Diseñar nuestro código para que dependa de
interfaces y utilizar la inyección de dependencias nos permite simular fácilmente
objetos en nuestras pruebas y aislar el código bajo prueba.
2. Desarrollo por capas: Organizar nuestro código en capas facilita la escritura de
pruebas unitarias, ya que podemos probar cada capa de manera aislada.
3. Diseño modular: Desarrollar funciones o métodos pequeños y cohesivos facilita
la escritura de pruebas que cubran todos los casos posibles.
4. Evitar acoplamiento excesivo: Reducir el acoplamiento entre componentes
del código nos permite cambiar partes del código sin afectar otras áreas, lo que
facilita las pruebas.
5. Uso de patrones de diseño: Al aplicar patrones de diseño en nuestro código,
podemos mejorar la legibilidad y testabilidad, lo que facilita la escritura de pruebas.
En resumen, al seguir buenas prácticas como usar nombres descriptivos para las
pruebas, mantener las pruebas actualizadas con el código y aplicar técnicas de
diseño adecuadas, podemos desarrollar pruebas más efectivas y de alta calidad.