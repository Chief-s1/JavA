import java.util.*;

public class Str1{


	public static void main(String args[]){

		String s="Hello";
		System.out.println(s.concat(" World"));
		System.out.println(s);//ORiginal String Does Not Change

		System.out.println("Character at index 4="+s.charAt(4));
		System.out.println("Index Of First l:"+s.indexOf('l'));

		System.out.println("Index of last l:"+s.lastIndexOf('l'));	

		String s2="HELLO";

		System.out.println("Are the Strings "+s+" And "+s2+" Equal ?"+s.equals(s2));

		System.out.println("After ignoring Cases are they equal ?"+s.equalsIgnoreCase(s2));//s.equalsIgnoreCase(s2))

		System.out.println("Last Index of l:"+(s.lastIndexOf('l')+1));


}

}