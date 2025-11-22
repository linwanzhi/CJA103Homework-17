package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCollection {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		System.out.println("印出物件裡的所有元素");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(int i = 0; i < list.size(); i++) {
			Object forobj = list.get(i);
			System.out.println(forobj);
		}
		
		for(Object foreachobj : list) {
			System.out.println(foreachobj);
		}
		
		System.out.println("移除不是java.lang.Number相關的物件");
		
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			Object obj = objs.next();
			if(obj instanceof Number) {
				System.out.println(obj);
			}else {
				objs.remove();
			}
		}
		System.out.println("觀察是否已將非Number相關的物件移除成功");
		
		System.out.println(list);
	}

}
