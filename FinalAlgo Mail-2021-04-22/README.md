## Enunciado: Algo Mail

Requerimientos funcionales:
La facultad está implementando el mecanismo de inicio de sesión de un cliente. Este mail tiene varios mecanismos de autenticación, a saber:

Simple: Solo se pide password y usuario.

Multi-factor:

Se pide usuario y un código de seguridad (un texto).
Se pide usuario y una imagen (un QR).
Se pide usuario y password, si son válidos, se pide un código de seguridad (tal como en el punto 2.a).

Nota 1:
No es necesario modelar la configuración del mecanismo de autorización que el usuario tenga configurado en su cuenta. 

Nota 2: 
Si algo no está especificado en el enunciado, agregue los supuestos en el diagrama de clases como notas.

Pedimos
Escribir el código necesario para:

- Un usuario con una configuración de cuenta equivalente a 1, intenta iniciarse sesión de manera satisfactoria.

- Un usuario con una configuración de cuenta equivalente a 2.b, intenta iniciarse sesión de manera satisfactoria.

- Un usuario con una configuración de cuenta equivalente a 2.c, intenta iniciar sesión y falla al ingresar el código de seguridad.

- Diagrama de secuencias para los escenarios antes descritos.

- Diagrama de clases (completo) que corresponden a los diagramas de secuencia.


### link al resuelto de sanchez:
 https://github.com/fiuba/algo3_finales/tree/master/2021-04-22 

### Fe de erratas
- En los diagramas falta mandar el mail y arreglar que todos sean void --> booelanps
- Chequiar plus es un metodo abstracto que cada decorator implementa
- Agregar 1..* relacion
