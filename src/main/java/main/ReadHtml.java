package main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReadHtml {
//"https://en.wikipedia.org/"
	public static void main(String[] args) {
		Document doc;
		try {
			
			System.out.println("***********************************");
			doc = Jsoup.connect("https://fr.glosbe.com/fr/kab/homme").get();
			System.out.println("Title : "+doc.title());
			
			System.out.println("***********************************");
			//
			Elements newsHeadlines = doc.select(".translation");
			for (Element headline : newsHeadlines) {
				System.out.println(headline.text());//.attr("title")+"\n\t"+headline.absUrl("href"));
			}
			System.out.println("***********************************");
			newsHeadlines = doc.select(".tmem__item div"); //mp-itn b a");
			for (Element headline : newsHeadlines) {
				System.out.println(headline.text());//.attr("title")+"\n\t"+headline.absUrl("href"));
			}
			System.out.println("***********************************");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}	
}
