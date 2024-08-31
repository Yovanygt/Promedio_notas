# Promedio de Notas

## Índice

1. [Introducción](#introducción)
2. [Descripción del Proyecto](#descripción-del-proyecto)
3. [Requisitos del Sistema](#requisitos-del-sistema)
4. [Instalación y Configuración](#instalación-y-configuración)
5. [Guía de Uso](#guía-de-uso)
6. [Arquitectura del Sistema](#arquitectura-del-sistema)
7. [Descripción de Clases](#descripción-de-clases)


## Introducción

**Nombre del Proyecto**: Promedio de Notas

**Descripción**: Este proyecto es una aplicación de escritorio desarrollada en Java que permite gestionar información de estudiantes, incluyendo detalles como código, nombre, género, edad, grado y sección. La aplicación proporciona una interfaz gráfica de usuario (GUI) para facilitar la entrada, validación y almacenamiento de datos en un archivo de texto.

## Descripción del Proyecto

La aplicación **Gestión de Estudiantes** está diseñada para instituciones educativas que necesitan llevar un registro sencillo de sus estudiantes. Las funcionalidades principales incluyen:

- **Agregar Estudiantes**: Permite ingresar nuevos registros de estudiantes.
- **Validación de Datos**: Verifica que todos los campos estén completos y que el código del estudiante sea único.
- **Almacenamiento de Datos**: Guarda la información de los estudiantes en un archivo de texto (`estudiantes.txt`).
- **Interfaz Intuitiva**: Utiliza Java Swing para proporcionar una GUI amigable.

## Requisitos del Sistema

- **Sistema Operativo**: Windows, macOS o Linux.
- **Java Development Kit (JDK)**: Versión 8 o superior.
- **IDE recomendado**: IntelliJ IDEA, Eclipse, NetBeans (opcional pero recomendado para desarrollo).
- **Espacio en Disco**: Mínimo 100 MB para el proyecto y archivos asociados.

## Instalación y Configuración

### 1. Descargar el Proyecto

Clona el repositorio o descarga el código fuente del proyecto desde [https://github.com/Yovanygt/Promedio_notas].



# 2. Configurar el Entorno de Desarrollo
Instalar JDK: Asegúrate de tener instalado el JDK. Puedes descargarlo desde Oracle o usar OpenJDK.

### Configurar el IDE:

IntelliJ IDEA:

Abre IntelliJ y selecciona File > Open.
Navega hasta la carpeta del proyecto y ábrela.
Asegúrate de que el SDK esté configurado correctamente (Project Structure > Project > Project SDK).
Eclipse:

Abre Eclipse y selecciona File > Import > Existing Projects into Workspace.
Navega hasta la carpeta del proyecto y selecciónalo.
Configura el JDK en Window > Preferences > Java > Installed JREs.


## 3. Ejecutar la Aplicación
Dentro del IDE:

Localiza la clase estudianteJ.java.
Haz clic derecho sobre la clase y selecciona Run 'estudianteJ.main()'.
La interfaz gráfica de la aplicación debería aparecer.
Guía de Uso
Interfaz de Usuario
La aplicación presenta una ventana con los siguientes campos y botones:

## Campos de Entrada Estudiante:

1. Código de Estudiante: Campo para ingresar un identificador único.
1. Nombre del Estudiante: Campo para el nombre completo.
1. Género del Estudiante: Campo para especificar el género.
1. Edad del Estudiante: Campo para ingresar la edad (numérico).
1. Grado del Estudiante: Campo para indicar el grado escolar.
1. Sección del Estudiante: Campo para la sección o clase.
1. Botones:

Guardar Datos: Valida y guarda la información ingresada.
Limpiar Pantalla: Limpia todos los campos de entrada para nuevos registros.

![ ](https://github.com/Yovanygt/imagenes/blob/main/Crear_est.png)

## Campos de Entrada Estudiante:

1. Código de Estudiante: Campo para ingresar un identificador único.
1. Nombre del Estudiante: Campo para el nombre completo.
1. Grado del Estudiante: Campo para especificar el grado.
1. Seccion del Estudiante: Campo para ingresar seccion del estudiante
1. Profesor del Estudiante: Campo para indicar el profesor Materia.
1. materia del Estudiante: Campo para indicar la Materia.
1. Año: Campo para indicar el año de estudios.
   
1. Botones:

Guardar Datos: Valida y guarda la información ingresada.
Buscar Datos: Valida y busca la información ingresada.
Limpiar Pantalla: Limpia todos los campos de entrada para nuevos registros

![ ](https://github.com/Yovanygt/imagenes/blob/main/grado_estu.png)

## Campos de Promedio de Notas:

1. Código de Estudiante: Campo para ingresar un identificador único.
1. Nombre del Estudiante: Campo para el nombre completo.
1. Grado del Estudiante: Campo para especificar el grado.
1. Seccion del Estudiante: Campo para ingresar seccion del estudiante
1. materia del Estudiante: Campo para indicar la Materia.
2. Notas Bimestre 1 : ingresa las notas primer bimestre materia
3. Notas Bimestre 2 : ingresa las notas Segundo bimestre materia
4. Notas Bimestre 3 : ingresa las notas Tercero bimestre materia
5. Notas Bimestre 4 : ingresa las notas Cuarto bimestre materia 
1. Profesor del Estudiante: Campo para indicar el profesor Materia.

1. Botones:

Guardar Datos: Valida y guarda la información ingresada, que no se repita, y muestra el promedio si Aprobo o Reprobo el alumno
Buscar Datos: Valida y busca la información ingresada.
![ ](https://github.com/Yovanygt/imagenes/blob/main/notas_finales.png)



## Arquitectura del Sistema
La aplicación está estructurada en dos clases principales dentro del paquete controlnotas:

1. Estudiante.java: Clase modelo que representa a un estudiante con sus atributos y métodos getters.
1. Grado.java: Clase modelo que representa a un grado con sus atributos y métodos getters.
1. Notas Finales.java: Clase modelo que representa una libreta de cañificaciones con sus atributos y métodos getters.

1. estudianteJ.java: Clase que extiende JFrame y maneja la interfaz gráfica, validación de datos y almacenamiento, de un estuidante nuevo.
1. gradoJ.java: Clase que extiende JFrame y maneja la interfaz gráfica, validación de datos y almacenamiento, de un grado.
1. notas finalesJ.java: Clase que extiende JFrame y maneja la interfaz gráfica, validación de datos y almacenamiento de notas finales

![ ](https://github.com/Yovanygt/imagenes/blob/main/diagrama_promedio.png)

