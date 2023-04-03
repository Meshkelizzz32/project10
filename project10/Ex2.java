package project2;
import java.util.*;
import java.util.regex.Pattern;

import project1.Countries;

public class Ex2 {
public static void main(String[] args) {
	Map<String,String> m=new HashMap<String,String>();
	Set<String> s=m.keySet();
	Pattern p=Pattern.compile("A[a-zA-Z]*");
	for(int i=0;i < Countries.DATA.length;i++) {
		if(p.matcher(Countries.DATA[i][0]).matches())
				m.put(Countries.DATA[i][0], Countries.DATA[i][1]);
	}
	System.out.println(m);
	System.out.println(s);
}
}
