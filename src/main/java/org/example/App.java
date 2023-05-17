package org.example;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> human = Collections.singletonMap("Galina", "Tsivka");
        String humanInformationWithBracets = new Gson().toJson(human);
        String humanInformationFromJsonWithBracet = humanInformationWithBracets.replace("{", "");
        String humanInformationFromJson = humanInformationFromJsonWithBracet.replace("}", "");
        String[] arryHumanIformation = humanInformationFromJson.split(":");
        System.out.print("{ name :" + arryHumanIformation[0] + ", ");
        System.out.println("lastName :" + arryHumanIformation[1] + "}");

    }
}
