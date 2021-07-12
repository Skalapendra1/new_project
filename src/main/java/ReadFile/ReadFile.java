package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\user\\Desktop\\wtf.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        String v =null;
        String ls = System.getProperty("line.separator");
        while( ( v = br.readLine() ) != null ) {
            stringBuilder.append( v );
            stringBuilder.append( ls );
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        String str = stringBuilder.toString();
        str = str.toLowerCase();
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] mas = str.split(" ");
        for (int i = 0; i < mas.length; i++) {
            if (!mas[i].trim().isEmpty())
                arrayList.add(mas[i].trim());
        }
        System.out.println(arrayList);
        Collections.sort(arrayList, (a, b) -> a.compareTo(b));
        System.out.println("Отсортированный массив");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            String temp = arrayList.get(i);
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                map.put(temp, map.get(temp) + 1);
            }
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(" <"+entry.getKey() + ">  = '" + entry.getValue() + "' раз");
        }
        System.out.println("<---------------------------------------------------------------------------------------------------->");
        String key = null;
        int value = 0;
        int maxCount = 1;
        String zn = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            key =entry.getKey() ;
            value = entry.getValue();
            if (value >= maxCount) {
                maxCount = value ;
                zn = key;
            }
        }
        System.out.println("слово с максимальным количеством повторений^");
        System.out.println(zn + " = " + maxCount);

    }
}



