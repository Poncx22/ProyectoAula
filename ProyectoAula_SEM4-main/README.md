# GastroTec - Sistema de Gestión de Inventario para Restaurantes 🍽️

GastroTec es una aplicación web integral diseñada para optimizar y facilitar la gestión de inventarios y pedidos en el entorno de los restaurantes. Su objetivo principal es brindar una herramienta eficiente y fácil de usar para administrar el stock de productos, registrar trabajadores y gestionar la relación con los clientes.

## 🚀 Características Principales

*   **Gestión de Inventario:** Control total sobre los productos, registro de entradas y salidas, y monitoreo de stock en tiempo real.
*   **Gestión de Pedidos:** Facilita la creación, seguimiento y administración de los pedidos realizados por los clientes.
*   **Administración de Clientes:** Módulo completo para registrar, visualizar, actualizar y eliminar (CRUD) información de los clientes, permitiendo un seguimiento personalizado.
*   **Gestión de Personal:** Registro y control de los trabajadores del restaurante.
*   **Interfaz Moderna y Dinámica:** Diseño web intuitivo y profesional con efectos visuales atractivos ("glow effects") para mejorar la experiencia de usuario en las tablas de datos.

## 💻 Tecnologías y Herramientas

El proyecto está construido bajo una arquitectura cliente-servidor robusta y moderna, utilizando las siguientes tecnologías:

### Frontend
*   **HTML5:** Estructuración semántica de las vistas y componentes web.
*   **CSS3 (Vanilla):** Estilos modulares, diseño adaptable (Responsive Design) y animaciones personalizadas ("glow effects") para una interfaz de usuario premium.

### Backend
*   **Java 21:** Lenguaje de programación principal para la lógica de negocio.
*   **Spring Boot:** Framework robusto para el desarrollo rápido de aplicaciones web y servicios RESTful.
*   **Spring Data JPA:** Abstracción para el manejo y acceso a datos.

### Base de Datos
*   **MySQL:** Sistema de gestión de bases de datos relacional para el almacenamiento seguro y consistente de la información de inventario, pedidos, clientes y trabajadores.

### Control de Versiones y Desarrollo
*   **Git y GitHub:** Colaboración, control de versiones y almacenamiento del código fuente.
*   **Spring Boot DevTools:** Herramienta para facilitar el desarrollo con recargas automáticas y reinicios rápidos.

## 🛠️ Estructura del Proyecto

El código fuente está estructurado bajo el patrón Modelo-Vista-Controlador (MVC), asegurando una separación clara de responsabilidades:
*   `Controller/`: Maneja las peticiones HTTP y la lógica de enrutamiento (ej. `ClienteController.java`).
*   `Service/`: Contiene la lógica de negocio y las reglas de validación (ej. `ClienteService.java`).
*   `Repository/`: Interfaces que manejan las operaciones CRUD con la base de datos MySQL (ej. `ClienteRepository.java`).
*   `Model/`: Clases de entidad que representan las tablas en la base de datos.
*   `resources/`: Contiene las propiedades de configuración (`application.properties`) y los archivos estáticos y plantillas del frontend (HTML, CSS divididos modularmente).

## ⚙️ Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/Poncx22/ProyectoAula.git
    cd ProyectoAula_SEM4-main/GastroTec
    ```
2.  **Configurar la Base de Datos:**
    *   Asegúrate de tener un servidor MySQL en ejecución.
    *   Verifica las credenciales en `src/main/resources/application.properties` (por defecto: `root`/`admin123`).
3.  **Ejecutar la aplicación:**
    *   Puedes iniciar el proyecto usando Maven:
        ```bash
        mvn spring-boot:run
        ```
    *   O ejecutando la clase principal desde tu IDE preferido.
4.  **Acceso:**
    *   La aplicación estará disponible en tu navegador en `http://localhost:8080`.
