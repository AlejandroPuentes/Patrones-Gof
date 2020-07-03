# Patrones de Diseño

<p align= "Justify">El diseño de software orientado a objetos es, en cierta forma, difícil, si a esta tarea sumamos que el software diseñado debe tener ciertas
características deseables como la reusabilidad,
flexibilidad y portabilidad entre otras, la tarea es
aun más difícil.</p>

<p align= "Justify">Algo que conocen muy bien los diseñadores con cierta experiencia, es que no se puede afrontar cada problema desde cero, por lo general reutilizan soluciones que han trabajado en el pasado y que han representado buenas soluciones a los problemas  planteados.</p>
Si estas soluciones les sirven de manera recurrente y estas les brindan las características deseables en el software mencionadas arriba, probablemente se encuentran ante un patrón de diseño.</p>


## Patrones de diseño

<p align= "Justify">Los patrones de diseño son la base para la búsqueda de soluciones a problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces.</p>

Un patrón de diseño es una solución a un problema de diseño.

<p align= "Justify">Los patrones de diseño son un conjunto de prácticas de óptimo diseño que se utilizan para abordar problemas recurrentes en la programación orientada a objetos.</p>

<p align= "Justify">El concepto de patrones de diseño fue el resultado de un trabajo realizado por un grupo de 4 personas Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides, (Gang of four) que se publicó en los 90s en un libro titulado "Design Patterns. Elements of Reusable Object-Oriented Software" en el que se esbozaban 23 patrones de diseño.</p>

<p align= "Justify">Un patrón de diseño puede considerarse como un documento que define una estructura de clases que aborda una situación particular. Para que una solución sea considerada un patrón debe poseer ciertas características. Una de ellas es que debe haber comprobado su efectividad resolviendo problemas similares en ocasiones anteriores. Otra es que debe ser reusable, lo que significa que es aplicable a diferentes problemas de diseño en distintas circunstancias.</p>

<p align= "Justify">Los patrones de diseño representa un nivel de abstracción un poco mas elevado de lo que hasta ahora el estudiante esta habituado a trabajar, pero una vez entendido su funcionamiento y utilidad, los diseños serán mucho más flexibles, modulares y reutilizables. En esencia un patrón tiene los siguientes 4 elementos:</p>

- **Nombre del patrón**:  <p align= "Justify">describe el problema de diseño, su solución y consecuencias en una o dos palabras.</p>

- **El problema**:  <p align= "Justify">describe cuando aplicar el patrón, explica el problema y su contexto.<p>

- **La solución**:  <p align= "Justify">describe los elementos del diseño, sus relaciones, responsabilidades y colaboraciones. No describe la implementación o un diseño particular específicamente ya que se adapta mas a una plantilla (template) que puede ser aplicada a varias situaciones.</p>

- **Las consecuencias**:  <p align= "Justify">son los resultados de aplicar el patrón, los pros y contras de su aplicación. Las consecuencias de la aplicación de un patrón debe incluir el impacto en la flexibilidad, extensibilidad y/o portabilidad del sistema.</p>

## Tipos de patrones

### Creacionales
<p align= "Justify">Los patrones de creación abstraen la forma en la que se crean los objetos, permitiendo tratar las clases a crear de forma genérica dejando para más tarde la decisión de qué clases crear o cómo crearlas.</p>

1. **Abstract Factory**  <p align= "Justify">Proporciona una interfaz para crear familias de objetos o que dependen entre sí, sin especificar sus clases concretas.</p>

![alt text](https://github.com/AlejandroPuentes/Patrones-Gof/blob/master/AbstracFactory.PNG)

2. **Singleton**  <p align= "Justify">Provee una interfaz para crear un objeto, pero deja a las subclases decidir cual clase instanciar, Factory Method permite a una clase aplazar la instanciación a las subclases.</p>
![alt text](https://github.com/AlejandroPuentes/Patrones-Gof/blob/master/Singleton.PNG)

3. **Factory Method**  <p align= "Justify">Provee una interfaz para crear un objeto, pero deja a las subclases decidir cual clase instanciar, Factory Method permite a una clase aplazar la instanciación a las subclases.</p>
![alt text](https://github.com/AlejandroPuentes/Patrones-Gof/blob/master/FactoryMethod.PNG)

4. **Builder**  <p align= "Justify">Su intención es de abstraer el proceso de creación de un objeto complejo, centralizando dicho proceso en un único punto, de tal forma que el mismo proceso de construcción pueda crear representaciones diferentes.</p>
![alt text](https://github.com/AlejandroPuentes/Patrones-Gof/blob/master/Builder.PNG)

5. **Prototype**  <p align= "Justify">Especifica el tipo de objeto a crear usando una instancia prototípica y crea nuevos objetos copiando este prototipo.</p>
![alt text](https://github.com/AlejandroPuentes/Patrones-Gof/blob/master/Prototype.PNG)



BIBLIOGRAFIA 
[1] apdaza/patrones-gof-java. (2020). Retrieved 2 July 2020, from https://github.com/apdaza/patrones-gof-java