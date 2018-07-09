import models.Randomiser;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        Randomiser rand = new Randomiser();

        get("/randomiser/one", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            String random = rand.oneRandoName();
            model.put("random", random);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/randomiser/two", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            ArrayList<String> randtwo = rand.twoRandoNames();
            model.put("randtwo", randtwo);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }
}
