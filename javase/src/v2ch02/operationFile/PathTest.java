package v2ch02.operationFile;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Path and Paths Test
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class PathTest {
    public static void main(String[] args) {
        Path p = Paths.get("/home/fred");
        Path r = Paths.get("/home/fred/input.txt");
        Path q = p.relativize(r);  //其结果为 "../fred/input.txt" , 其中，假设..表示文件系统的目录
        System.out.println(q);

        Path x = Paths.get("/home/harry/../fred/./input.txt");
        Path y = x.normalize(); // 其结果为"/home/harry/fred/input.txt"
        System.out.println(y);

        Path m = Paths.get("/zyz");
        Path n = m.toAbsolutePath();
        System.out.println(n); // 其结果为 “F:\zyz”

        Path path = Paths.get("/home","fred","myprog.properties");
        Path parent = path.getParent(); // the path "/home/fred"
        Path file = path.getFileName();// the path "myprog.properties"
        Path root = path.getRoot(); // the path "/"

        System.out.println(parent);
        System.out.println(file);
        System.out.println(root);

    }
}
