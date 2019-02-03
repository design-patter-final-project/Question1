
package designpatternproject;

import java.util.ArrayList;
import java.util.Iterator;


public class AgeGroup implements SIterator{

    ArrayList<SwimmerInfo> swimmers;
    
    
    public AgeGroup(){
        swimmers = new ArrayList<SwimmerInfo>();
        
        addSwimmer("Phelps", 80, 50, 22,"M");
        addSwimmer("Lochte", 70, 150, 21,"M");
        addSwimmer("Sun", 60, 350, 25,"M");
        addSwimmer("Franklin", 83, 550, 34,"F");
        addSwimmer("George", 73, 560, 35,"M");
        addSwimmer("Ledecky", 63, 88, 36,"F");
        addSwimmer("Joseph", 53, 40, 38,"M");
        
        
   
    }
    
    public void addSwimmer(String name, int strokes, int distance, int age, String sex){
        SwimmerInfo swimmerInfo = new SwimmerInfo(name, strokes, distance, age, sex);
        swimmers.add(swimmerInfo);
    }
    /*
    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
        
    }
*/

    @Override
    public Iterator createIterator() {
        
        return  swimmers.iterator();
    
    
    }
    
}
