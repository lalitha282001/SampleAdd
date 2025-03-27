package programPackage;

public class SwapTwoNumber{
public static void main(String []args){
int value1=15, value2=5;

value1=value1-value2;  //value1=10
value2=value1+value2; // value2=15
value1=value2-value1; //value1=5
System.out.println("value1 is "+value1+ " value2 is "+value2);
}
}