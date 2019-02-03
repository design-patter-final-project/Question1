
package designpatternproject;

import java.util.Arrays;
import java.util.Iterator;


public class SwimmerSex implements SIterator{

    SwimmerInfo[] swimmers;
    int arrayValue = 0;
    
    
    public SwimmerSex(){
        swimmers = new SwimmerInfo[7];
        
        addSwimmer("Phelps", 80, 50, 22,"M");
        addSwimmer("Lochte", 70, 150, 21,"M");
        addSwimmer("Sun", 60, 350, 25,"F");
        addSwimmer("Franklin", 83, 550, 34,"M");
        addSwimmer("George", 73, 560, 35,"F");
        addSwimmer("Ledecky", 63, 88, 36,"M");
        addSwimmer("Joseph", 53, 40, 38,"M");
        
        
   
    }
    
    public void addSwimmer(String name, int strokes, int distance, int age, String sex){
        SwimmerInfo swimmerInfo = new SwimmerInfo(name, strokes, distance, age, sex);
        swimmers[arrayValue] = swimmerInfo;
        arrayValue++;
    }
    /*
    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
        
    }
*/

    @Override
    public Iterator createIterator() {
        
        return Arrays.asList(swimmers).iterator();
    
    }
    
}
