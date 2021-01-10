import java.util.*;
public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c=Arrays.asList("One","Two","Three");
		//c.forEach(s->System.out.println(s));
		String[] data= {"phalna","dhimkana","chilna"};
		/*for(String s:data)
			System.out.println(s);*/
		Iterator<String> it=c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
	}

}
