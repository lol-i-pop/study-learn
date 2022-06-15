package myTomcat;

import java.io.OutputStream;

/**
 * TODO
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class MyResponse {
    private OutputStream out;

    public MyResponse(OutputStream out) {
        this.out = out;
    }

    public void write(String str) throws  Exception{
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<body>")
                .append("<h1>"+str+"</h1>")
                .append("</body>")
                .append("</html>");
        this.out.write(sb.toString().getBytes());
        this.out.flush();
        this.out.close();
    }
}
