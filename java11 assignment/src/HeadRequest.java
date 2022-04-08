import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;

public class HeadRequest {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create("https://httpbin.org/get"))
                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<Void> response = client.send(request,
                HttpResponse.BodyHandlers.discarding());

        HttpHeaders headers = response.headers();

        headers.map().forEach((key, values) -> {
            System.out.printf("%s: %s%n", key, values);
        });
        var fileName = "https://httpbin.org/get";

       try {
    	   HttpResponse response1 = client.send(request,
       
                HttpResponse.BodyHandlers.ofFile(Paths.get(fileName)));
       
      
       
    	   System.out.println("handeled");
       
        System.out.println(response1.statusCode());}
       catch(Exception e)
       {
    	   System.out.println("ex HANDELED");
       }
    }
}