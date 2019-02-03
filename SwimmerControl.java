
package designpatternproject;

import java.util.Iterator;



public class SwimmerControl  extends Swim{
    
    AgeGroup agegroup;
    SwimmerSex swimmersex;

    SIterator iterAgeGroup;
    SIterator iterSwimmerSex;
    
    
    public SwimmerControl(SIterator newAgeGroup, SIterator newSwimmerSex) {

        iterAgeGroup = newAgeGroup;
        iterSwimmerSex = newSwimmerSex;

    }
    
    
    public void listByAgeGroup() {
        Iterator agegroup = iterAgeGroup.createIterator();
        Iterator swimmersex = iterSwimmerSex.createIterator();

        System.out.println("Sort by age group");
        
        printTheSwimmers(agegroup);
    }

    public void listByAgeGroup2() {
        Iterator agegroup = iterAgeGroup.createIterator();
        Iterator swimmersex = iterSwimmerSex.createIterator();

        System.out.println("Sort by age group");
        printTheSwimmers2(agegroup);
    }

    public void printTheSwimmers(Iterator iterator) {
        while (iterator.hasNext()) {

            SwimmerInfo swimmerInfo = (SwimmerInfo) iterator.next();

            if (swimmerInfo.getage() >=30) {

                String name = swimmerInfo.getname();
                int age = swimmerInfo.getage();
                
              System.out.println(name);
              System.out.println(age);
                
             
                 
            }
            
            
            

        }
    }

    public void printTheSwimmers2(Iterator iterator) {
        while (iterator.hasNext()) {

            SwimmerInfo swimmerInfo = (SwimmerInfo) iterator.next();

            if (swimmerInfo.getage() < 30) {
                String name = swimmerInfo.getname();
                String sex = swimmerInfo.getname();

                System.out.println(swimmerInfo.getname());
                System.out.println(swimmerInfo.getage());
                System.out.println(swimmerInfo.getsex());


            } else {

            }

        }
    }

    public void listBySex() {
        Iterator agegroup = iterAgeGroup.createIterator();
        Iterator swimmersex = iterSwimmerSex.createIterator();

        System.out.println("Sort by Sex");
        printTheSex(agegroup);
    }

    public void printTheSex(Iterator iterator) {
        while (iterator.hasNext()) {

            SwimmerInfo swimmerInfo = (SwimmerInfo) iterator.next();

            if (swimmerInfo.getsex().equals("M")) {

                String name = swimmerInfo.getname();
                String sex = swimmerInfo.getname();

                System.out.println(swimmerInfo.getname());
                System.out.println(swimmerInfo.getage());
                System.out.println(swimmerInfo.getsex());

            } else {

            }

        }
    }

    public void listBySex2() {
        Iterator agegroup = iterAgeGroup.createIterator();
        Iterator swimmersex = iterSwimmerSex.createIterator();

        System.out.println("Sort by Sex");
        printTheSex2(agegroup);
    }

    public void printTheSex2(Iterator iterator) {
        while (iterator.hasNext()) {

            SwimmerInfo swimmerInfo = (SwimmerInfo) iterator.next();
            String name;
            name = swimmerInfo.getname();

            if (swimmerInfo.getsex() == "F") {

               
                System.out.println(swimmerInfo.getname());
                System.out.println(swimmerInfo.getage());
                System.out.println(swimmerInfo.getsex());

            } else {

            }

        }
    }

    }
        
       


       

