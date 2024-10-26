package classExercize.io.nio;
    /*Copying Files

    Files class copy (Path source, Path target, CopyOption... options) method can copy the specified 4
    source path to the specified target path.

    if the specified source file is a symbolic link, the target of the symbolic link is copied,
    not the symbolic link

    if the specified source file is a directory,an empty directory at the target location is created
    without copying thr contents of the directory.

    We can specify one or more of the following copy options with the copy() method:

        StandardCopyOption.REPLACE_EXISTING
        StandardCopyOption.COPY_ATTRIBUTES
        LinkOption.NOFOLLOW_LINKS

    We can specify the REPLACE_EXISTING option to replace the existing target file.

    If the target file is a symbolic link and id it exists, the symbolic link is replaced by specifying
    the REPLACE_EXISTING option, not the target of the symbolic link

    The COPY ATTRIBUTES option copies the attributes of the source file to the target file.

    If the NOFOLLOW_LINKS option is used, the copy() method copies the symbolic link, not the target
    of the symbolic link.

    */

import java.awt.image.DirectColorModel;
import java.io.IOException;
import java.nio.file.*;


import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFile{
    public static void main(String[] args) {
        Path source = Paths.get("");
        Path target = Paths.get("");

        try{
            Path p = Files.copy(source, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
            System.out.println(source+" has been copied to "+p);
        }catch (FileAlreadyExistsException e){
            System.out.println(target+" already exists.");
        }catch(DirectoryNotEmptyException e){
            System.out.println(target+ " is not empty.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

