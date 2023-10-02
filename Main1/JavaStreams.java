package Main;

import java.util.ArrayList;

public class JavaStreams {

    public static void main(String[] args){
        ArrayList<String> names= new ArrayList<>();
        names.add("rahul");
        names.add("gowtham");
        names.add("alli");
        names.add("govardhan");
          int Count=0;
        for(int i=0;i<names.size();i++){
           String actual= names.get(i);
           if(actual.startsWith("g")){
               Count++;
           }
        }
        System.out.println(Count);


    }
}
