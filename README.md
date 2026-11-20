Ejercicio 18 - Refactorización de Código Condicional hacia Factory Method

Explicación del programa

En este ejercicio se refactorizó la creación de importadores de datos (CSV, XML y JSON) eliminando condicionales en la lógica de procesamiento principal y aplicando el patrón de diseño Factory Method junto con inyección del creador, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ImportadorDatos con el método importar(String origen).
- Tres clases concretas (ImportadorCSV, ImportadorXML y ImportadorJSON) encargadas exclusivamente de la lectura de cada formato.
- Una clase abstracta CreadorImportador con el método de fábrica crearImportador().
- Tres clases creadoras concretas (CreadorImportadorCSV, CreadorImportadorXML y CreadorImportadorJSON) encargadas exclusivamente de instanciar cada importador.
- Una clase ProcesadorImportacion que recibe CreadorImportador y ejecuta la importación mediante ImportadorDatos sin conocer las clases concretas.

Luego, dentro del método main, se instancia ProcesadorImportacion con cada creador concreto y se ejecutan las importaciones.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ImportadorDatos para desacoplar el consumo del formato específico.
- Separar la responsabilidad de instanciación en subclases de CreadorImportador y la lectura de datos en cada importador concreto.
- Inyectar el creador en ProcesadorImportacion para evitar estructuras condicionales y acoplamiento directo.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
[CSV] Leyendo registros separados por coma desde: clientes.csv
[XML] Parseando nodos estructurados desde: catalogo.xml
[JSON] Deserializando objetos desde: ordenes.json

Captura de pantalla

<img width="721" height="177" alt="image" src="https://github.com/user-attachments/assets/0f4629d4-0685-4046-93d7-a79c275c2e54" />

