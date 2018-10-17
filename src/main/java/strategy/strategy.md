###Patron Estrategy
Definición:
Con el patrón Estrategia podemos definir familias de algoritmos encapsulandolos y gracias a ello el algoritmo puede ser facilmente
 modificable independientemente de quien lo use. Este patrón captura la abstracción en una interfaz , encerrando los detalles de implementacion en las clases derivadas.

###Participantes:
Interfaz Estrategia.- Declara una interfaz común a todos los algoritmos soportados.
Estrategia concreta.-Implementa el algoritmo usando la interfaz estrategia.
Contexto(la clase base), Es la encargada de delegar a la interfaz estrategia la ejecución.

Este patrón se debe de emplear en las siguientes situaciones:
1) Muchas clases relacionadas que difieren sólo en su comportamiento.
2)Un algoritmo usa datos que los clientes no deberian de conocer.
3)Cuando se observe que una clase defina muchos comportamientos y debido a ello se observen multiples condificonales.

###Consecuencias:
-Nos ofrece una alternativa a la herencia de tal manera que al encapsular el algoritmo nos permite cambiarlo independientemente del contexto esto no suscede con la herencia..
-Al emplear este patrón el diagrama de clases nos queda jerarquizado y formando una familia de algoritmos Para ser reutilizados por el contexto.
-Se eliminan las sentencias condicionales, esto se consigue encapsulando el comportamiento en clases estrategia
-Las estrategias pueden proporcionar distintas implementaciones del mismo comportamiento debido a ello habá que elegir que implementacion usar.
-Al usar Estrategias , se obtendrá un mayor número de objetos.
-Costes de comunicación entre Estrategia y contexto ya que la interfaz de estrategia es compartida por todas las clases de Estrategias concretas.
-solo usarse cuando la variación del comportamiento sea reelevante ya que usar el patrón estrategia tiene 
-como inconveniente de que el cliente debe de comprender en que se diferencia cada Estrategia antes de seleccionar la adecuada.

###Ejemplo:
En el ejemplo elaborado el contexto es en una agencia de viajes la impresión de los tickets
dependiendo de si es se viaja por avion, bus o barco la impresión seria distinta (contendría distintos literales)
Si mañana mas tarde se cambia la impresión de tickets del bus por ejemplo y se añaden campos al texto a imprimir o se eliminan esto no interferiria en el 
resto de clases concretas , y sería mas sencillo de tratar. 
