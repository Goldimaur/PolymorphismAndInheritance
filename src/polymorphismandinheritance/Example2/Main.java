/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 05-03-2021
 *   Time: 18:56
 *   File: Main.java
 */

package polymorphismandinheritance.Example2;
class BoyFriend{
    String name;
    int numberOfExGirlFriends;
    public void care(){
        System.out.println("awwwwwww");
    }
}
class GhatiyaBoyFriend extends BoyFriend{
    // inheritance extends


    @Override
    public void care() {
        // overriding static
        System.out.println("breakup");
    }
        //  if we remove @override then it will print awww and shows symbol of O at the left side .
        // method OVERRIDING
        // RUN-TIME-POLYMORPHISM
        // method OVERLOADING
    public void care(boolean isExamTomorrow){
            System.out.println("Mne Toh Kuch Padha Hai Nhi");
        }
        // overriding dynamic
    // method can have different different signature .
    public void care(int numberOfEX){
        System.out.println("ExtraClass");
    }

}
class GulaamBoyFriend extends BoyFriend{
    @Override
    public void care() {
        System.out.println("sorrybabu");
    }
}
class AchchaBoyFriend extends BoyFriend{
    @Override
    public void care() {
        System.out.println("uhmmmmm");;
    }
}
//abstract class AchachaBoyFriend{
//    public abstract void care();
//}
//class GhatiyaBoyFriend extends AchachaBoyFriend{
//    public void care(){
//
//    }
//}
public class Main { //KCGround
    public static void main(String[] args) {
        BoyFriend boyFriend = new BoyFriend();
        boyFriend.care();
        GhatiyaBoyFriend ghatiyaBoyFriend = new GhatiyaBoyFriend(); // Dynamic method DISPATCH .
        ghatiyaBoyFriend.care();
        // if we not writing GhatiyaBoyFriend class then it will inherit care method from Boyfriend
        BoyFriend boyFriend1 = new AchchaBoyFriend(); // boyfriend(Parent) type ka reference (object)
        // we can store child object in parent class
        // GhatiyaBoyFriend bf = new BoyFriend .. this is not possible . becoz we cannot store parent object in child object
        // not possible
        // if we want use awww then use super.care
        // ghatiyaFriend bf = new GhatiyaFriend(); ... then use bf.care(noOfEX:4) ...
    }
}
