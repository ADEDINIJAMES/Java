import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Ternary Operator
//if you don't have an else you cannot use a ternary operator
public class Main {
    public static void main(String[] args) {
        int level=70 ;
       boolean condition1= level >5;
       boolean condition2= level>3 && level==3;
       boolean condition3 = level==3;
       String correct = condition1? "You are a senior Dev":(condition2?"You are still a junior": condition3?"you are at intermediate":"lets have yo do what you have");
        System.out.println(correct);
        String correct1= (condition1)?"please go": (condition2)? "You are staying too long": (condition3)?"i'll call the security": "you are free";
        System.out.println(correct1);
   }
}
class Another{
    public static void main(String[] args) {
        int month = 9;
        String result = (month==1)?"January":(month==2)?"February": (month==3)?"March": (month==4)?"April": (month==5)?"May":(month==6)?"June": (month==7)?"July":(month==8)?"August":(month==9)?"September": (month==10)?"October": (month==11)?"November": (month==12)?"December":"Wrong number of month";
        System.out.println(result);

    }

}
class TryNow {
    public static void main(String[] args) {
        String[] arraylist = {"PEOPLE", "family", "parents", "Teachers", "Classmates", "Members"};
        for (int i = 0 ; i <arraylist.length; i++){
            System.out.println("Index i: " + i+ "  "+ "Element:  " + arraylist[i]);

        }
        System.out.println(arraylist[2]);

        }

    }
    class MultiDimension{
        public static void main(String[] args) {
            String[][] arraylist = {new String[]{"PEOPLE", "family", "parents", "Teachers", "Classmates", "Members"},{"JAMES", "PETER", "PAUL", "NICOLAS"}};
            System.out.println("the length of the array is: "+ arraylist.length);
            for (int i = 0; i < arraylist.length; i++) {
                for (int j = 0; j < arraylist[i].length; j++) {
                    System.out.println("index: "+i +" "+"Element:" + arraylist[i][j]);

                }

            }
        }
        

    }
class compare{
    public static void main(String[] args) {
        int []arr = {1,2,22,3,6,6,7,6,8,9,7};
        boolean isDuplicate= false;
        for (int i = 0; i < arr.length; i++) {
            for(int j =i+1; j<arr.length; j++){
                System.out.println("Comparing :"+ arr[i] + " "+ "with"+"----------"+" " +arr[j]);
                if (arr[i]==arr[j]){
                    isDuplicate = true;
                }


            }

        }
        System.out.println("Duplicate: "+ isDuplicate);
    }

}
class Compare2 {
    //Breaks at the point of duplicate
    public static void main(String[] args) {

        int[] arr = {1, 2, 22, 3, 6, 6, 7, 6, 8, 9, 7};
        boolean isDuplicate = false;
      loop1:  for (int i = 0; i < arr.length; i++) {
       loop2:     for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Comparing :" + arr[i] + " " + "with" + "----------" + " " + arr[j]);
                if (arr[i] == arr[j]) {
                    isDuplicate = true;

                    break loop2; // stops loop2 at the point of duplicate and goes back to pick another value in loop one for comparison. Then start loop 2 to check


                }

            }
            System.out.println("Duplicate: " +isDuplicate);
        }

    }
}
class Compare3{
    public static void main(String[] args) {
        int[] arrayl= {1,2,45,5,6,7,4,3,4,5,7,8,5,3,2,1};
        System.out.println(arrayl.length);
        List<Integer> arrayDuplicates= new ArrayList<>();// to store the duplicates
        boolean isDuplicate= false;
        for (int i = 0; i < arrayl.length; i++) {
            for (int j = i+1; j < arrayl.length; j++) {
                System.out.println("Checking:"+arrayl[i]+""+ " "+""+"with :  "+ arrayl[j] );
                if(arrayl[i]==arrayl[j]){
                    isDuplicate=true;
                    arrayDuplicates.add(arrayl[i]);

                }

            }
            System.out.println("Are there duplicates? " + " "+ isDuplicate);
        }

        System.out.println("The duplicates are : "+ arrayDuplicates);

        System.out.println("The duplicates are (without repitition): "+ arrayDuplicates.stream().distinct().collect(Collectors.toList()));
        System.out.println("The duplicates are (arranged): "+ arrayDuplicates.stream().sorted().collect(Collectors.toList()));


    }}






