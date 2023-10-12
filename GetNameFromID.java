import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetNameFromID {
  public static void main(String[] args) throws IOException {
    System.out.print("Enter id: ");
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String username = input.readLine();
    Document doc = Jsoup.connect("https://www.ecs.soton.ac.uk/people/"+username).get();
    System.out.println(doc.title().substring(0,doc.title().length()-28).replace("Doctor ","").replace("Professor ",""));
  }
}