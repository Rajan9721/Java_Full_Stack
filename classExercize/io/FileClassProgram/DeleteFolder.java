package classExercize.io.FileClassProgram;

import java.io.File;

public class DeleteFolder {
    public static void deleteFolder(File f){
        File[] files = f.listFiles();
        for(File fi : files){
            if(fi.isDirectory()){
                deleteFolder(fi);
            }
            fi.delete();
        }
    }
    public static void main(String[] args){
        File f = new File("E:\\DeleteFileTest");
        deleteFolder(f);
        f.delete();
    }
}
