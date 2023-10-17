import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // StringList to be added to by queries
    String[] message = {""};
    int[] sequenceNumber = {1};

    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                message[0] += sequenceNumber[0]++ + "\n" + parameters[1] + "\n";
                }
            return message[0];

        } else {
            return "404 Not Found!";
        }
     }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
