import java.util.Scanner;
class cal{
public strtic void main(String args[]){
double n1,n2,ans;
char op;
Scanner reader=new Scanner(System.in);
System.out.println("Enter two numbers");
n1=reader.nextDouble();
n2=reader.nextDouble();
System.out.println("Enter operator(+,-,*,/)");
op=reader.next().charAt(0);
switch(op){
case'+':ans=n1+n2;
break;
case'-':ans=n1-n2;
break;
case'*':ans=n1*n2;
break;
case'/':ans=n1/n2;
break;
default:System.out.println("Enter correct output");
return;
}
System.out.println("result="+ans);
}
}



