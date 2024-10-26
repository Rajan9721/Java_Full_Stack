package classExercize.io.FileClassProgram;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

class MyFilter implements FileFilter {
    @Override
    public boolean accept(File f){
        System.out.println("accept");
        if(f.isFile() || f.isDirectory()) {
            String fileName = f.getName().toLowerCase();
            if (fileName.endsWith(".java")) {
                return true;
            }
        }

        return false;
    }
}
public class Filter1 {
    public static void main(String[] args) {
        String dirPath = "E:\\Java_CMD_Run\\IO\\File_Class";
        File dir = new File(dirPath);
        MyFilter filter = new MyFilter();

        File[] list = dir.listFiles(filter);
        for(int i=0; i<list.length; i++){
            if(list[i].isFile()){
                System.out.println(list[i].getPath()+" (File)");
            }else if(list[i].isDirectory()){
                System.out.println(list[i].getPath()+" (directory)");
            }
        }
    }
}
