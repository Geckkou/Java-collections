package collectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {
    public static void main(String[] args) {
        //TreeMap<String, String> estados = new TreeMap<>();
        Map<String, String> estados = new HashMap<>();

        estados.put("Acre " ," AC");
        estados.put("Alagoas" ,"AL");
        estados.put("Amapá" ,"AP");
        estados.put("Amazonas", "AM");
        estados.put("Bahia" ,"BA");
        estados.put("Ceará" ,"CE") ;
        estados.put("Espírito Santo " ,"ES");
        estados.put("Goiás " ,"GO");
        estados.put("Maranhão" ," MA");
        estados.put("Mato Grosso " ,"MT");
        estados.put("Mato Grosso do Sul " ,"MS");
        estados.put("Minas Gerais " ,"MG");
        estados.put("Pará " ,"PA");
        estados.put("Paraíba " ,"PB");
        estados.put("Paraná " ,"PR");
        estados.put("Pernambuco " ,"PE");
        estados.put("Piauí " ,"PI");
        estados.put("Rio de Janeiro " ,"RJ");
        estados.put("Rio Grande do Norte " ," RN");
        estados.put("Rio Grande do Sul " ,"RS");
        estados.put("Rondônia" ,"RO");
        estados.put("Roraima" ,"RR");
        estados.put("Santa Catarina" ,"SC");
        estados.put("São Paulo" ,"SP");
        estados.put("Sergipe" ,"SE");
        estados.put("ocantins ","TO");
        estados.put("Distrito" ,"Federal DF");

        estados.remove("Minas Gerais ");
        System.out.println(estados.size());
        estados.remove("Mato Grosso do Sul ", "MS");

        for(Map.Entry<String, String> entry: estados.entrySet()){
            System.out.println(entry.getKey() + " Sigla : " + entry.getValue());
        }

        System.out.println(estados.containsValue("SC"));
        System.out.println(estados.containsKey("Maranhão"));


        /*estados.remove("Minas Gerais ", "MG");

        System.out.println(estados.size());

        estados.remove("Mato Grosso do Sul ");
        System.out.println(estados.size());

        for(String brasil: estados.keySet()){
            System.out.println(brasil + " Sigla: " + estados.get(brasil));
        }

        System.out.println(estados.containsValue("SC"));

        System.out.println(estados.containsKey("Maranhão"));

         */
    }
}
