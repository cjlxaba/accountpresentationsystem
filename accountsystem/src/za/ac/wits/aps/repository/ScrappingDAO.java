/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author f4780027
 *
 */
public class ScrappingDAO {

	public static List<String> searchFolderById(String folder, String startsWitch) throws IOException {

		List<String> fileList = new ArrayList<>();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folder))) {
			for (Path path : stream) {
				if (!Files.isDirectory(path)) {

					if (path.getFileName().toString().startsWith(startsWitch))
						fileList.add(path.getFileName().toString());
				}
			}
		}
		return fileList;
	}

	public static void main(String args[]) throws IOException {

		searchDirectoryById("C:\\dev\\esp\\samples\\customiseResponse\\", "WIMSelect");

	}

	public static List<String> searchDirectoryById(String directory, String searchById) throws IOException {

		List<String> accountListXml = new ArrayList<>();

		File folder = new File(directory);

		for (File fileEntry : folder.listFiles()) {

			accountListXml.addAll(searchFolderById(fileEntry.toString(), searchById));
		}
		return accountListXml;
	}
}
