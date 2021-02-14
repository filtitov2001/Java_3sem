package Lab20;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, Integer> dictionary = new HashMap<>();


    public static void main(String[] args) {

        words();
        print();
        sec_file(false, "","voda2.txt");
        buff();

    }


    public static void buff(){
        try {
            File file = new File("voda.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line = line.replace(' ','#');
                sec_file(true,line,"voda2.txt");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        sec_file(false,"", "voda.txt");

        try {
            File file = new File("voda2.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                sec_file(true,line, "voda.txt");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void sec_file(boolean append, String text, String name){
        try
        {
            FileWriter fileWriter = new FileWriter(name, append);
            fileWriter.write(text);
            fileWriter.write('\n');
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void words(){
        try {
            File file = new File("voda.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] subStr;
                subStr = line.split(" ");
                for(int i=0;i<subStr.length; i++){
                    if(!subStr[i].equals("")){

                        if(dictionary.get(subStr[i])==null){
                            dictionary.put(subStr[i],1);
                        }else {
                            dictionary.put(subStr[i], dictionary.get(subStr[i]) + 1);
                        }

                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void print(){

        Map <Integer, String> array = new HashMap<>();
        int size = 0;

        for(int j =0;j<10;j++) {


            int max = 0;
            String word = "";
            String allKeys = dictionary.keySet().toString();
            allKeys = allKeys.substring(1, allKeys.length() - 1);
            String[] massKeys = allKeys.split(", ");


            for (int i = 0; i < massKeys.length; i++) {
                boolean flag = true;
                for(int k =0;k< array.size();k++){
                    if(massKeys[i].equals(array.get(k+1))){
                        flag = false;
                    }
                }

                if (dictionary.get(massKeys[i]) > max && flag && !massKeys[i].equals("-")) {
                    word = massKeys[i];
                    max = dictionary.get(massKeys[i]);
                } else dictionary.get(massKeys[i]);


            }
            System.out.println("Cлово: "+ "\"" + word + "\"");
            System.out.println("Оно повторяется " + max + " раз");
            size++;
            array.put(size,word);

        }



    }
}