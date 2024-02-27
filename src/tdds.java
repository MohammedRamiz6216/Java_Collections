
import java.util.*;
public class tdds {
 public void testcases(){
  String username ="Pranavpasumarthi";
  String username1 ="Pranav pasumarthi";
  String username2 = "Pranav@123";
  String username3 = "Pranav_pasumarthi";
  String username4 = "Pranav/pasumarthi";
  String username5 = "Pranav#pasumarthi";
isValidUsername(username);
isValidUsername(username1);
  isValidUsername(username2);
  isValidUsername(username3);
  isValidUsername(username4);
  isValidUsername(username5);






 }
 static boolean isValidUsername(String name){
  if(name.contains("/")||name.contains("a")||name.contains(" ")){
   return false;
  }
  return true;
 }

 public static void main(String[] args) {
  System.out.println("Hello");
  String userName = "Pranavpasumarthi";
  String userName1 = "Pranav pasumarthi";
  isValidUsername(userName);
 }
}
