package lt.codeacademy.javaua5.lvl2.json.utils;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class ResourceUtil {

	public static File getFileFromResource(String fileName) throws URISyntaxException {
		final ClassLoader classLoader = ResourceUtil.class.getClassLoader();
		final URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return new File(resource.toURI());
		}
	}
}

