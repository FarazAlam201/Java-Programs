// Faraz Alam (13948)
// Demonstrate method overloading.
class OverloadDemo {
void test() {
System.out.println("No parameters");
}
// Overload test for one integer parameter.
void test(int a) {
System.out.println("a: " + a);
} 
// Overload test for two integer parameters.
void test(int a, int b) {
System.out.println("a and b: " + a + " " + b);}
// overload test for a double parameter
double test(double a) {
System.out.println("double a: " + a);
return a*a;             }
OverloadDemo(){
System.out.println("No-args constructor ");}
OverloadDemo(int demo){
System.out.println("Parameterized Constructor  :" + demo) ;} }
// ___________ Calling Class ___________ 
public class Overload {
public static void main(String args[]) {
OverloadDemo ob = new OverloadDemo();
OverloadDemo ob1 = new OverloadDemo(33);
double result;
// call all versions of test()
ob.test();
ob.test(10);
ob.test(10, 20);
result = ob.test(123.25);
System.out.println("Result of ob.test(123.25): " + result);
 }
}
