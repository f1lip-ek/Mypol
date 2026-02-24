package mypol.logika.json;

import com.google.gson.Gson;
import mypol.Main;
import mypol.logika.json.Linka.Linka;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JsonLoad {

    private Linka linka;

    /**
     * Načte herní data ze souboru JSON.
     * @param cestaKSouboru cesta ke zdrojovému souboru (resources)
     * @return objekt GameData naplněný načtenými daty
     */
    public static JsonLoad loadGameDataFromResources(String cestaKSouboru) {
        Gson gson = new Gson();
        try (/*InputStream is = Main.class.getResourceAsStream(cestaKSouboru)*/InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(cestaKSouboru)) {
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + cestaKSouboru + " (zkontrolujte, že soubor je v src/main/resources).");
            }
            return gson.fromJson(new InputStreamReader(is, StandardCharsets.UTF_8), JsonLoad.class);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }
    }

    public Linka getLinka() {
        return linka;
    }

}
