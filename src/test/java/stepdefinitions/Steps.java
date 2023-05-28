package stepdefinitions;


import io.cucumber.java.es.*;
import io.appium.java_client.android.AndroidDriver;
import tasks.setSession;
import tasks.login;
import questions.userAssert;
import tasks.navigateTo;
import tasks.logOut;
import tasks.Android;

import java.net.MalformedURLException;

public class Steps {

    public AndroidDriver hisMobileDevise;
    public String user;
    public String password;


    @Dado("obteniene credenciales validas abre la aplicacion")
    public void  obteniene_credenciales_validas_abre_la_aplicacion() throws MalformedURLException {
        hisMobileDevise = setSession.startSession();
        user = "prueba@accenture.com";
        password = "123456";
    }

    @Cuando("intenta realizar Login con datos validos")
    public void intenta_realizar_Login_con_datos_validos(){
        navigateTo.LoginPage(hisMobileDevise);
        login.tryLogin(hisMobileDevise, user, password);
    }

    @Entonces("realiza login exitozamente")
    public void realiza_login_exitozamente(){
        userAssert.loginSuccessful(hisMobileDevise);
        logOut.try_logOut(hisMobileDevise);
        Android.navigateToHome(hisMobileDevise);
    }



}
