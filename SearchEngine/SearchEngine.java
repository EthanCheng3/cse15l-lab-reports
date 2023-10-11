import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // StringList to be added to by queries
    ArrayList<String> ListofStrings = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            StringBuilder printList = new StringBuilder();
            for (String s : ListofStrings)
                {
                printList.append(s);
                printList.append(", ");
                }
            return printList.toString();
        } else if (url.getPath().contains("/search")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    ArrayList<String> queryList = new ArrayList<String>();
                    for (String s : ListofStrings){
                    if (s.contains(parameters[1])) {
                        queryList.add(s);
                    }
                }
                StringBuilder printList = new StringBuilder();
                    for (String s : queryList) {
                    printList.append(s);
                    printList.append(", ");
                    }
                return printList.toString();
            }
        } else {
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    ListofStrings.add(parameters[1]);
                    return String.format("String added!");
                } 
            }
            return "404 Not Found!";
        }
        return "404 Not Found!";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
