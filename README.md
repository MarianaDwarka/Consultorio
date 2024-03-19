# Clínica odontológica

Una clínica odontológica necesita de una aplicación web para administrar los datos y turnos de cada uno de sus pacientes. Al mismo tiempo, cuenta con diferentes odontólogos (con sus respectivas especialidades) que pueden ser asignados a cada una de las citas de estos pacientes.

Cada odontólogo tiene su propio horario de atención (por ejemplo, de lunes a viernes de 08 a 17) y solo se le pueden asignar pacientes en dichos días y horarios.

En caso de que se requiera una fecha y horario en que el odontólogo no trabaje, el sistema debe manifestar una advertencia y no permitir el ingreso de la cita.

Cada paciente debe estar registrado dentro del sistema en conjunto con sus datos personales, especificación de si cuenta con seguro o si pagará de forma particular, el tipo de tratamiento que necesita, afección que padece o si solo es un control de rutina, etc.

En caso de que el paciente sea menor de edad, se debe poder asignar un responsable (padre, madre, hermano, tutor, etc).

El sistema debe contar con login (control de acceso) y será utilizado principalmente por los secretarios de la clínica. Para poder llevar a cabo el control de acceso se debe tener en cuenta el uso de usuarios y contraseñas que permitan el ingreso al sistema.

Además de los secretarios, cada odontólogo podrá acceder al sistema para visualizar las citas de sus pacientes. Además de esto, podrá registrar nuevas citas y asignar una observación del trabajo realizado luego de atender al paciente.


---

# Implementación

En el desarrollo de esta aplicación web para una clínica odontológica, se emplearon diversas tecnologías para gestionar los datos y turnos de los pacientes, así como la asignación de odontólogos a las citas. Este proyecto integró tecnologías tanto para el backend como para el frontend, proporcionando una solución completa. A continuación, se explica el papel que juega cada tecnología en el desarrollo del proyecto:

### Frontend

#### SB Admin 2 - Bootstrap Admin Theme
- **Descripción**: SB Admin 2 es una plantilla gratuita para paneles de administración basada en Bootstrap, que ofrece una interfaz de usuario (UI) limpia y responsive para aplicaciones web.
- **Rol en el Proyecto**: Fue utilizada como base para la interfaz de usuario del sistema de la clínica odontológica. Esta plantilla fue adaptada para satisfacer las necesidades específicas del proyecto, como formularios para registrar y gestionar pacientes, citas, y odontólogos. La elección de esta plantilla facilitó el desarrollo del frontend, proporcionando elementos de UI predefinidos y responsivos que mejoran la experiencia del usuario.
- Recursos:

  https://startbootstrap.com/theme/sb-admin-2

### Backend

#### Java Web (Java EE)
- **Descripción**: Es una plataforma robusta y escalable para desarrollar aplicaciones y servicios web empresariales. Incluye especificaciones para varias tecnologías web, como Servlets y JavaServer Pages (JSP), entre otros.
- **Rol en el Proyecto**: Java EE fue la base para el desarrollo del backend del sistema. Proporcionó un entorno para desarrollar la lógica de negocio, gestionar la interacción con la base de datos, y procesar las solicitudes y respuestas HTTP a través de Servlets y JSP.

#### Servlets
- **Descripción**: Los Servlets son programas Java que se ejecutan en un servidor web o de aplicaciones, encargados de recibir las peticiones HTTP de los clientes, procesarlas y enviar una respuesta al cliente.
- **Rol en el Proyecto**: Los Servlets manejaron las solicitudes HTTP enviadas desde el frontend, ejecutando operaciones como el registro de usuarios, la asignación de citas, y la visualización de horarios disponibles. Actuaron como controladores en el patrón Modelo-Vista-Controlador (MVC), coordinando el flujo de datos entre el frontend y el backend.

#### JavaServer Pages (JSP)
- **Descripción**: JSP es una tecnología que permite crear contenido dinámico para aplicaciones web, facilitando la integración de código Java en páginas HTML.
- **Rol en el Proyecto**: Se utilizó JSP para generar las vistas del sistema, permitiendo una presentación dinámica de la información procesada por los Servlets. Esto incluyó la generación de formularios, listados de pacientes y odontólogos.

#### Java Persistence API (JPA)
- **Descripción**: JPA es una especificación de Java EE para el mapeo objeto-relacional, que facilita la gestión de bases de datos relacionales en aplicaciones Java.
- **Rol en el Proyecto**: JPA se empleó para interactuar con la base de datos, permitiendo el mapeo de las entidades del dominio (como pacientes, odontólogos, citas) a tablas de la base de datos de manera eficiente. Esto simplificó las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) y la gestión de relaciones entre entidades, haciendo más eficiente el acceso y manipulación de los datos.

### Conclusión
La combinación de estas tecnologías proporcionó una solución robusta y eficiente para el sistema de gestión de la clínica odontológica. El uso de Java EE, con sus Servlets y JPA, formó la columna vertebral del backend, gestionando la lógica de negocio y la interacción con la base de datos. Por otro lado, el frontend se benefició de la adaptabilidad y diseño de la plantilla SB Admin 2, asegurando una interfaz de usuario amigable y funcional. Juntos, estos componentes tecnológicos facilitaron el desarrollo de una aplicación web completa, capaz de satisfacer las necesidades específicas de la clínica odontológica.

---

Se siguieron los tutoriales de TodoCode 

Parte 1: https://youtu.be/R1XT4jbz-Gg?si=tsy9aP_M-P3U6I_m
Parte 2: https://youtu.be/-kWOjRa1fd0?si=vg-0-r1G3346dj7f
Parte 3: https://youtu.be/6m82IB7g6hw?si=SuZSMiRsRBBu6UDu
Parte 4: https://youtu.be/2HbczJw5Eho?si=fGYig9DKADrJWAXe
Parte 5: https://youtu.be/cCf2IuHjLr4?si=7NeuandXLstaN6JX
