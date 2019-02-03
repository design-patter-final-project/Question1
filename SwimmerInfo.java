
package designpatternproject;


public class SwimmerInfo {
    String name;
    int strokes;
    int distance;
    int age;
    String sex;
    public SwimmerInfo(String nname, int nstrokes, int ndistance, int nage, String ssex)
    {
        name = nname;
        strokes = nstrokes;
        distance = ndistance;
        age = nage;
        sex = ssex;
    
    
    }
    public String getname(){
        return name;
    }
    public int getstrokes(){
        return strokes;
    }
    
    public int getdistance(){
        return distance;
    }
    
    public int getage(){
        return age;
    
    }
    public String getsex(){
        return sex;
    }
    }
 
  
    

