package programPackage;

public class SwapTwoString{
public static void main(String []args){
String Name1="Lalitha", Name2="Alen";
Name1=Name1+Name2;    // Name1= LaithaAlen
Name2=Name1.substring(0,7);   //Name2=Lalitha
Name1=Name1.substring(7);   //Name1=Alen
System.out.println("Name1 = "+Name1);
System.out.println("Name2 = "+Name2);

}
}