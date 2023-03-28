package hooks;

import io.cucumber.java.Before;

import static base_urls.MedunnaBaseUrl.medunnaSetUp;

public class Hooks {
    @Before("@TC01_Api")
    public void beforeApi(){
        medunnaSetUp();
    }
}
