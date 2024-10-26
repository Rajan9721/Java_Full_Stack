package classExercize.io.nio;

import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class JarFileEx{
	
	private static void process(Object obj){
		JarEntry entry = (JarEntry)obj;
		String name = entry.getName();
		long size = entry.getSize();
		long compressedSize = entry.getCompressedSize();
		System.out.println(name+"\t"+size+"\t"+compressedSize);
	}
	
	public static void main(String[] args) throws IOException{
		JarFile jarFile = new JarFile("E:\\Java_CMD_Run\\JarFile\\t1.jar");
		Enumeration en = jarFile.entries();
		
		while(en.hasMoreElements()){
			process(en.nextElement());
		}
		
		jarFile.close();
	}
	
	
}