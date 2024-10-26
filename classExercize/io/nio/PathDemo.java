package classExercize.io.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

    public static void printDetails(Path p){
        System.out.println("Details for path: "+p);

        int count = p.getNameCount();
        System.out.println("Name count: "+count);

        for(int i=0; i<count; i++){
            Path name = p.getName(i);
            System.out.println("Name at index "+i+" is: "+name);
        }

        Path parent = p.getParent(); // after the root and before the last 'file/folder' everyFolder are comes under the "parent"
        Path root = p.getRoot();    // root is the name of drive
        Path fileName = p.getFileName(); // name of the file

        System.out.println("Parent: "+parent+", Root: "+root+", File Name: "+fileName);
        System.out.println("Absolute Path: "+p.isAbsolute());  // return true is absolute path is present
    }
    public static void main(String[] args) {
        Path p1 = Paths.get("E:\\rajan\\Demo\\New folder");
        printDetails(p1);

//        Path p2 = Paths.get("Pathdemo.java");
//        printDetails(p2);
    }
}
