package com.srinivart;

import org.json.JSONArray;
import org.json.JSONObject;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Download{

       String token = "IGQVJWaUphaWhSdzFqNE1lN3dFQThZAa3dCdV8wOVRmZAVVoUVREZAlV2eTNOWEdnLUxSU2hkMkNDY2pabnpoeHJrb3RvaUJoR1JQUXdWN3N5eUN6V29heWdqSll6a2l0S0JScFp2NGlB";


    public void downloadAllImages() throws Exception{
        int j=0;
        String url = "https://graph.instagram.com/me/media?fields=id,media_type,media_url&access_token=" + token + "&limit=300";
        do {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            //add request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            JSONObject myResponse = new JSONObject(response.toString());

                List<String> urlList = new ArrayList<>();
                JSONArray data = myResponse.getJSONArray("data");
                for (int i = 0; i < data.length(); i++) {
                    if (data.getJSONObject(i).get("media_type").equals("IMAGE")) {
                        urlList.add(data.getJSONObject(i).get("media_url").toString());
                    }
                }

                BufferedImage image = null;
                for (int i = 0; i < urlList.size(); i++,j++) {
                    URL url1 = new URL(urlList.get(i));
                    image = ImageIO.read(url1);
                    ImageIO.write(image, "jpg", new File("//Users/srinivaspanaganti/Desktop/Insta/image" + j + ".jpg"));
                }

            url = myResponse.getJSONObject("paging").getString("next");
        } while (url!=null) ;

        }
}
