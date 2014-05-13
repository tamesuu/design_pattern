package Ex7;
import java.io.*;

public class HTMLBuilder {
	private String filename;
	private PrintWriter writer;
	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}
	public void makeString(String str){
		writer.println("<p>" + str + "</p>");
	}
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for(int i = 0; i < items.length; i++){
			writer.println("<ul>");
			for(int i = 0; i < items.length; i++){
				writer.println("<li>" + items[i] + "</li>");
			}
		}
	}
	
}
