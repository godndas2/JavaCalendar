package collection.test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest02 {

	public static void main(String[] args) {
		ArrayList org = new ArrayList(10);
		ArrayList copy = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for (int i = 0; i < 10; i++) {
			org.add(i+"");
			Iterator it = org.iterator();
			
			while (it.hasNext()) {
				copy.add(it.next());
				
				System.out.println("= Org���� copy�� ���� ");
				System.out.println("= org:" + org);
				System.out.println("= copy:" + copy);
				System.out.println();
				
				it = org.iterator(); // Iterator�� ������ �Ұ����ϹǷ� �ٽ� ���´�.
				
				while (it.hasNext()) {
					copy2.add(it.next());
					it.remove();
				}
				System.out.println("= Org���� copy2�� �̵� ");
				System.out.println("org:" + org);
				System.out.println("copy2:" + copy2);
				System.out.println();
			}
		}
	}

}
