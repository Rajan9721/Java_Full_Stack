package classExercize.io.FileClassProgram;

import java.io.File;
import java.io.FilenameFilter;

class ExtensionFilter implements FilenameFilter{
    String ext;
    int i = 1;
    public ExtensionFilter(String ext){
        this.ext = "."+ext;
    }
    @Override
    public boolean accept(File dir, String name){
        System.out.println("accept");
        return name.endsWith(ext);
    }
}
public class ExtensionFilterEx {
    public static void main(String[] args) {
        String dirname = "E:\\Java_CMD_Run\\IO\\File_Class";
        File f1 = new File(dirname);
        FilenameFilter only = new ExtensionFilter("java");

    }
}
