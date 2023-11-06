package webpageScrapper;

import java.io.IOException;

import javax.swing.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;

public class Main {
	public static void main(String[] args) throws IOException {
	Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();
	
	JFrame frame = new JFrame();
	JEditorPane editor = new JEditorPane();
	editor.setContentType("text/html");
	editor.setText(doc.html());
	frame.setBounds(0, 0, 1920, 1080);
	frame.add(editor);
	frame.setVisible(true);
	}
}
