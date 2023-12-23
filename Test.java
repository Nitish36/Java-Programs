package practice;
class swap<T> { // T is a TYPE PARAMETER
    private T i,j;
    public void assign(T a, T b)  {
        i=a; j=b;
        System.out.println(i.getClass());
    }
    
    public void swap()   {
        T t=i;
        System.out.println(t.getClass());
        i=j;    //Assignment or binary bits copy can be done irrespective of the type
        j=t;
    }
    public void display()
    {  System.out.println(i+" "+j);   }
public T acess()
    {  return i; }
    public void modify(T a)
    {i=a;}
}
public class Test
{
    public static void main(String[] args) {
    swap<int> a = new swap<>();
// Integer is a TYPE ARGUMENT
    a.assign(1,2);
    a.display();
    Integer t = a.acess();          t=t+10;        a.modify(t);        
          a.display();
    a.swap();    a.display();
    }    }