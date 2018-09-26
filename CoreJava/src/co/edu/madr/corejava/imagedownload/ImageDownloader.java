package co.edu.madr.corejava.imagedownload;

import java.util.HashMap;

public class ImageDownloader {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "sas");
		map.put(null, "asdf" );
		System.out.println(map.get(null));
		System.out.println(map.keySet());
		
		map.remove("sdgsdf");

	}

} 
