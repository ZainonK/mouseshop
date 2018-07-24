package controllers;

import models.Bbguns;
import play.*;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {


    public static Result main(Html content){
        return ok(main.render(content));

    }

    public static Result Gun() {
        Bbguns S = new Bbguns();
        S.setId("001");
        S.setName("M4A1");
        S.setPrice(9000);
        S.setType("ปืนกล");
        S.setMaterial("เหล็ก");
        S.setSystem("ไฟฟ้า");
        S.setWeight(15);
        S.setLength(95);

        Bbguns a = new Bbguns("002", "barrett m82", "เหล็ก", "ไฟฟ้า", "ปืนกล", 450000, 20, 65);
        Bbguns b = new Bbguns("003", "G28", "เหล็ก", "ไฟฟ้า", "ปืนพก", 5000, 6, 20);
        Bbguns c = new Bbguns("004", "GLM6", "เหล็ก", "ไฟฟ้า", "ปืนระเบิด", 600000, 18, 40);
        Bbguns d = new Bbguns("005", "Tiberius T9.1", "เหล็ก", "ไฟฟ้า", "ปืนกลเบา", 7000, 20, 30);
        Bbguns f = new Bbguns("006", "FAMAS", "เหล็ก", "ไฟฟ้า", "ปืนกลเบา", 4500, 14, 40);

        return main(Gun.render(S,a,b,c,d,f));
    }


    public static Result index() {

        return main(home.render());
    }

    public static Result M4() {

        return main(M4.render());
    }
    public static Result AK() {

        return main(AK.render());
    }
    public static Result G36() {

        return main(G36.render());
    }






}
