package Main;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("rahul");
        names.add("gowtham");
        names.add("alli");
        names.add("govardhan");

      Long c=  names.stream().filter(s->s.startsWith("g")).count();


        System.out.println(c);

       Long d= Stream.of("Kiran","Kumar","Harsha","Gowtham").filter(s->
       {
           s.startsWith("G");
           return true;
       }).count();
       System.out.println(d);
       names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
       names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));


    }
    public void StreamMap(){
        ArrayList<String> al= new ArrayList<>();
        al.add("man");
        al.add("don");
        al.add("women");

        //print letters have last letter a with uppercase
        Stream.of("Rama","Arjuna","Manasa","Mounika","Adam","Gowtham").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));
    }
}