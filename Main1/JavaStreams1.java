package Main;

import dev.failsafe.internal.util.Assert;

import java.util.*;
import java.util.stream.Stream;

public class JavaStreams1 {

    public  static void main (String[] args){

        ArrayList<String> names1=new ArrayList<>();
        names1.add("Gokul");
        names1.add("surendra");
        names1.add("Vamsi");

        //print letters have last letter a with uppercase
        Stream.of("Rama","Arjuna","Manasa","Mounika","Adam","Gowtham").
                filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        //print names have first letter a with uppercase and sorted
       List<String> names= Arrays.asList("Seetha","Arjun","Akhil","Adam","Gowtham","Abcd");

       names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
      // merging 2 different lists
      Stream<String> newstream= Stream.concat(names.stream(),names1.stream());
      //newstream.sorted().forEach(s->System.out.println(s));
      Boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Adam"));
      System.out.println(flag);

            }



    }

