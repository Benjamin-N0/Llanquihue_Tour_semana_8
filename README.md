#Evaluación Sumativa 3 – Desarrollo Orientado a Objetos I

## Autor del proyecto
- **Nombre completo:** Benjamin Norambuena
- **Carrera:** Analista Programador Computacional

## Descripción de esta semana

En esta octava semana realizarás una actividad sumativa individual llamada “Integrando interfaces, polimorfismo y estructuras dinámicas”, donde se espera que fortalezcas y amplíes tu sistema orientado a objetos, integrando interfaces, diseño polimórfico y validación de tipos mediante instanceof. Además, crearás una interfaz gráfica básica que simule el ingreso y visualización de datos.
Como parte de la evolución del sistema de la agencia Llanquihue Tour, trabajarás sobre el mismo proyecto para incorporar una estructura más flexible, mantenible y adecuada para el uso por parte de operadores internos.

## Caso: "Llanquihue Tour"

Durante las semanas anteriores, desarrollaste una jerarquía de clases para representar los distintos servicios turísticos que ofrece Llanquihue Tour. También organizaste los datos en una colección polimórfica y aplicaste métodos sobrescritos para recorrer y mostrar la información de manera flexible.
En esta etapa, la agencia necesita ampliar su sistema para gestionar otras entidades relevantes para sus operaciones, como guías turísticos, vehículos y colaboradores externos, permitiendo que todas ellas compartan un comportamiento común y puedan ser gestionadas desde una misma colección. Además, se busca dotar al sistema de una interfaz gráfica básica para facilitar la interacción por parte del personal administrativo.

## Problematica:

•	Un contrato de comportamiento común que permita tratar distintas entidades de forma unificada.
•	Validación del tipo de objeto durante la ejecución para personalizar la lógica según su clase.
•	Una interfaz gráfica que facilite el ingreso y visualización de registros por parte de usuarios no técnicos.


## 🧱 Estructura general del proyecto
```plaintext
📁 src/
├── ui/                            # Clase principal con el método main
    └── Main.java

├── model/                         # Clases de dominio
    └── RecusoAgencia.java
    └── GuiaTuristico.java
    └── Vehiculo.java
    └── ColaboradorExterno.java
    └── Registrable.java

├── data/                          # Clase encargda de creacion de rutas
    └── GestorEntidades.java

````
## Ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/Benjamin-N0/Llanquihue_Tour_semana_8
```

2. Abrir el proyecto en Apache NetBeans.
3. Ejecutar la clase
```bash
ui/Main
```
4. Seleccionar el tipo de dato a ingrasar (guia, vehiculo, Trabajador Externo).
5. Completar los datos solicitados.
6. Presionar **Agregar**.
7. Presionar **Mostrar** para visualizar las entidades registradas.

## Descripción de las clases

### RecursoAgencia

Clase base que contiene la información común de todas las entidades, como:

- Nombre
- RUT

---

### GuiaTuristico

Hereda de `RecursoAgencia` y representa un guía turístico.

Atributo adicional:

- Idioma

---

### Vehiculo

Hereda de `RecursoAgencia` y representa un vehículo de la agencia.

Atributo adicional:

- Capacidad

---

### ColaboradorExterno

Hereda de `RecursoAgencia` y representa un colaborador externo.

Atributo adicional:

- Especialidad

---

### Registrable

Interfaz que define el método:

```java
mostrarResumen()
```

Todas las entidades implementan esta interfaz para mostrar su información.

---

### GestorEntidades

Clase encargada de administrar las entidades registradas.

Funciones principales:

- Agregar entidades.
- Almacenar objetos en un `ArrayList<Registrable>`.
- Recorrer la colección.
- Diferenciar los objetos mediante `instanceof`.
- Mostrar el resumen de cada entidad.

---
