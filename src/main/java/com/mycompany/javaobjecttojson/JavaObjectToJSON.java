
package com.mycompany.javaobjecttojson;

import com.google.gson.Gson;
import com.mycompany.javaobjecttojson.model.Client;

public class JavaObjectToJSON {

    public static void main(String[] args) {
        Client client = new Client("Fulano", "Silva", "fulano.silva@gmail.com");
        System.out.println(client.toString());
        System.out.println(new Gson().toJson(client));
        
    }
}
