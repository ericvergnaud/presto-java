package prompto.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public abstract class FileUtils {

	public static void deleteRecursively(File root, boolean deleteRoot) throws IOException {
		Path rootPath = root.toPath();
		   Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {
			   @Override
			   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				   Files.delete(file);
				   return FileVisitResult.CONTINUE;
			   }

			   @Override
			   public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				   if(deleteRoot || !dir.equals(rootPath))
					   Files.delete(dir);
				   return FileVisitResult.CONTINUE;
			   }

		   });
	}
}
