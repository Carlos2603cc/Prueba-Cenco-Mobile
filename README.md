# Regresion Conduit

### Prerequisitos:
##### ° Debe tener instalado y configurado Appium.
##### ° Debe apuntar Appium ya sea a el emulado de android estudio.
##### ° debe tener instalado Coduit en el dispositivo en el cual se realizaran las pruebas.
##### ° Se debe iniciar las pruebas en la pantalla de Home des dispositivo y con la app cerrada.

## Escenarios de Gherkin

```gherkin
@Regresion_Conduit_app
Característica: Validar el correcto funsionamiento del proseso de login de la aplicacion Conduit

@Test_login_exitoso
Escenario:Realizar login con credenciales validas
Dado  obteniene credenciales validas abre la aplicacion
Cuando intenta realizar Login
Entonces realiza login exitozamente

@Test_login_fallido
Escenario:Realizar login con credenciales invalidas
Dado obtiene credenciales invalidas
Cuando intenta realizar Login
Entonces no puede acceder a la aplicacion


```

```Bash
gradlew clean test
```
```Bash
gradle clean test -Dcucumber.filter.tags="@Test_login_exitoso"
```
```Bash
gradle clean test -Dcucumber.filter.tags="@Test_login_fallido"
```
