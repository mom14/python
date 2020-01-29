class A1 implements Runnable
{
String threadname;
Thread d;
void start()
{
System.out.println("dsfsfd");
d=new Thread(this,threadname);
d.start();
}
public void run()
{
for(int i=0;i<10;i++)
System.out.println("hii i m thread 1 who is running");
}
public static void main(String...l)
{
A obj = new A();
obj.threadname="thread1";
obj.start();
for(int i= 0;i<20;i++)
{
System.out.println("yooo");
}
}
}
