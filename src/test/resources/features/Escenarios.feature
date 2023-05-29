# language: es

Característica: Validar el correcto funsionamiento del proseso de login de la aplicacion Conduit


  Escenario:Realizar login con credenciales validas
    Dado  obteniene credenciales validas abre la aplicacion
    Cuando intenta realizar Login
    Entonces realiza login exitozamente


  Escenario:Realizar login con credenciales invalidas
    Dado obtiene credenciales invalidas
    Cuando intenta realizar Login
    Entonces no puede acceder a la aplicacion


