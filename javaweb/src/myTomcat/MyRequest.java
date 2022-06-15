package myTomcat;

import java.io.InputStream;

/**
 * TODO
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class MyRequest {

    //请求方法   GET/POST
    private String requestMethod;

    //请求地址
    private String requestUrl;

    public MyRequest(InputStream in) throws Exception{
        //缓存区
        byte[] buffer = new byte[1024];
        //读取数据长度
        int len = 0;
        //请求的变量
        String str = null;

        if((len = in.read(buffer))>0){
            str = new String(buffer,0,len);
        }
        //GET / HTTP 1.1
        String requestHead = str.split("\n")[0];
        String[] param = requestHead.split(" ");
        this.requestMethod = param[0];
        this.requestUrl = param[1];
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
