package stepdefinitions;

import com.google.gson.JsonObject;
import io.cucumber.java.es.*;
import helpers.helpers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import questions.userAssert;

public class Steps {


    private  int id_poema;
    private String titulo;
    private String cita;
    private int id_user;
    private Response response;

    private  JsonObject bodyResponse;

    @Dado("que existe un poema en la base de datos")
    public void que_existe_un_poema_en_la_base_de_datos() {
        id_poema = helpers.generateRandomNumber(1, 100);
    }

    @Cuando("se realiza una solicitud GET a posts con idPoema")
    public void se_realiza_una_solicitud_get_a_posts_con_id_poema() {
        response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/"+id_poema);
        bodyResponse = helpers.generaObjetoJson(response.getBody().asString());
    }

    @Entonces("se obtiene una respuesta con el poema deseado")
    public void se_obtiene_una_respuesta_con_el_poema_deseado() {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
        Assert.assertEquals(bodyResponse.get("id").getAsInt(), id_poema);

    }

    @Dado("que existen correcciones a realizar a un poema")
    public void que_existen_correcciones_a_realizar_a_un_poema() {
        id_poema = helpers.generateRandomNumber(1, 100);
        cita = helpers.generardorLoremIpsum();
    }

    @Cuando("se realiza una solicitud PUT a posts con idPoema")
    public void se_realiza_una_solicitud_put_a_posts_con_id_poema() {
        String requestBody = "{\"body\": \""+ cita +"\"}";
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Content-type", "application/json")
                .and()
                .header("charset","UTF-8")
                .body(requestBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/"+id_poema);
        bodyResponse = helpers.generaObjetoJson(response.getBody().asString());

    }

    @Entonces("se obtene una respuesta exitosa y el Poema se actualiza correctamente")
    public void se_obtene_una_respuesta_exitosa_y_el_poema_se_actualiza_correctamente() {
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
        Assert.assertEquals(bodyResponse.get("id").getAsInt(), id_poema);
        Assert.assertEquals(bodyResponse.get("body").getAsString(), cita);
    }

    @Dado("que se tiene los datos de un Pema nuevo")
    public void que_se_tiene_los_datos_de_un_pema_nuevo() {
        id_user = helpers.generateRandomNumber(1, 10);
        titulo = helpers.generardorLoremIpsum();
        cita = helpers.generardorLoremIpsum();
    }

    @Cuando("se realiza una solicitud POST a posts")
    public void se_realiza_una_solicitud_post_a_posts() {
        String requestBody = "{\"title\":\""+titulo+"\",\"body\": \""+ cita +"\",\"userId\":\""+id_user+"\"}";
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Content-type", "application/json")
                .and()
                .header("charset","UTF-8")
                .body(requestBody)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");
        bodyResponse = helpers.generaObjetoJson(response.getBody().asString());
    }

    @Entonces("se obtiene una respuesta exitosa y el Poema se crea correctamente")
    public void se_obtiene_una_respuesta_exitosa_y_el_poema_se_crea_correctamente() {
        int statusCode = response.getStatusCode();
        userAssert.StatusCodeValidation(statusCode);
        Assert.assertEquals(bodyResponse.get("userId").getAsInt(), id_user);
        Assert.assertEquals(bodyResponse.get("title").getAsString(), titulo);
        Assert.assertEquals(bodyResponse.get("body").getAsString(), cita);

    }
}
