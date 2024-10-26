package classExercize.io.FileClassProgram;

import java.io.File;

public class EmptyDir {
    public static void main(String[] args) {
        File file = new File("E:\\DeleteFileTest");
        if(file.isDirectory()){
            String files[] = file.list();
            if(files.length>0){
                System.out.println("The "+file.getPath()+" is not empty!");
            }
        }
    }
}
