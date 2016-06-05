package cc.openhome;
import java.util.*;
import static java.lang.System.out;
public class Guest{
public static void main(String[] args){
List name = new ArrayList();
collectNameTo(name);
System.out.println("访问名单： ");
printUpperCase(names);
}
static void collectNameTo(List names){
Scanner console = new Scanner(System.in);
while(true){
System.out.println("访客名称：");
String name = console.nextLine();
if(name.equals("quit")){
break;
}
name.add(name);
}
}
static void printUpperCase(List names){
for(int i = 0;i<names.size();i++){
String name = (String) name.get(i);
System.out.println(name.toUpperCase());
}

}
}

