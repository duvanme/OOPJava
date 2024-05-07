CRUD utilzando en modelo vista controlador. 

El front-end fue realizado con Bootstrap, para el back-end, se utilizó Java JSP y como base de datos MySQL.

El proyecto cuenta con su página de login, un formulario para cambiar contraseña y un formulario para guardar un nuevo usuario y editarlo. 

Se usaron dos roles, el rol admin y el general. El rol admin puede hacer todas las operaciones CRUD, sin embargo el rol general solo puede editar y ver los usuarios en la base de datos. 
La vista principal cuenta también con un buscador en dónde se puede buscar usuarios por palabras clave. 

Para el back-end se creó un Modelo llamado User, y un DAO, a través del cual se realizan todas las consultas a la base de datos. 

El Servlet recibe peticiones de las vistas y este a su vez, hace peticiones a la clase UserDAO. 

La clase UserDAO contiene métodos para: 

1. Conxión y desconexión a base de datos
2. Listar usuarios
3. Listar usuarios por búsqueda
4. Crear nuevo usuario
5. Actualizar usuario
6. Eliminar usuario
7. Validación de Login
8. Encriptación de contraseña

Cada método en el servlet tiene su método equivalente en la clase UserDAO. Todas las peticiones son hechas a través de método DoPost, y este redirige al método DoGet.
En el método doGet, dependiendo de la ruta solicitada, se redirige usando el statement Switch, a cada método el cual al finzalizar su ejecución, devuelve una respuesta al front-end. 



