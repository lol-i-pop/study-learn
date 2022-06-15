package myTomcat;

import java.util.HashMap;

/**
 * TODO
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class MyMapping {
    public static HashMap<String,String> mapping = new HashMap<>();

    static {
        mapping.put("/myTomcat","myTomcat.MyServlet");
    }

    public HashMap<String,String> getMapping(){
        return mapping;
    }
}
