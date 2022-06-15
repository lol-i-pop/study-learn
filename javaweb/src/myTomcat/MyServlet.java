package myTomcat;

/**
 * TODO
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class MyServlet extends MyHttpServlet{

    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        response.write("get ...");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("post ...");
    }
}
