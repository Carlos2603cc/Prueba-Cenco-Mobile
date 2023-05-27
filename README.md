# Mi Proyecto

## Escenarios de Gherkin

```gherkin
Característica: Realizar a los diversos metodos de la 
  API JSONPlaceholder

  @Obtencion_de_recursos_literarios
  Escenario: Obtencion de recursos literarios
    Dado que existe un poema en la base de datos
    Cuando se realiza una solicitud GET a posts con idPoema
    Entonces se obtiene una respuesta con el poema deseado

  @Editar_artículos_literarios
  Escenario: Editar artículos literarios
    Dado que existen correcciones a realizar a un poema
    Cuando se realiza una solicitud PUT a posts con idPoema
    Entonces se obtene una respuesta exitosa y el Poema se actualiza correctamente

  @Agregar_artículos_literarios
  Escenario: Agregar artículos literarios
    Dado que se tiene los datos de un Pema nuevo
    Cuando se realiza una solicitud POST a posts
    Entonces se obtiene una respuesta exitosa y el Poema se crea correctamente

```

```Bash
./gradlew test
```