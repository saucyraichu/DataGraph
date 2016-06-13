import java.net.*;
import java.util.*;
import com.google.gson.*;

public class BitCoinInspection {
    public static void main(String[] args) {
        String s = "https://www.quandl.com/api/v3/datasets/BCHAIN/NETDF.json";
        URL url = null;
        try {
            url = new URL(s);
        } catch (Exception e) {
            System.out.println("Improper URL " + s);
            System.exit(-1);
        }
     
        // read from the URL
        Scanner scan = null;
        try {
            scan = new Scanner(url.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + s);
            System.exit(-1);
        }
        
        String str = new String();
        while (scan.hasNext()) {
            str += scan.nextLine() + "\n";
        }
        scan.close();

        Gson gson = new Gson();
        BitCoinDataSet data = gson.fromJson(str, BitCoinDataSet.class);
        System.out.println(data.toString());
    }
}
