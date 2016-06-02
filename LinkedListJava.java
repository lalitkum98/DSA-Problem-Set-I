package ProblemSetI;

public class LinkedListJava {
	static class P {
		public P link;
		public char data;

	}

	public void insert(P p, char value) {
		P temp = new P();
		temp = p;
		while (temp.link != null) {
			temp = temp.link;
		}
		temp.link = new P();
		temp.link.data = value;

	}

	public void delete(P p, char value) {
		P temp = new P();
		P previousnode = new P();
		temp = p;

		while (temp.link != null) {
			if (temp.data == value) {
				previousnode.link = temp.link;
				temp = null;
				break;
			} else {
				previousnode = temp;
				temp = temp.link;

			}
		}

	}
	public void PrintLinkedList(P p) {
		while (p != null) {
			System.out.println(p.data);
			p = p.link;
		}
	}
	public static void main(String arg[]) {
		P p = new P();
		p.data = 'a';
		p.link = new P();
		p.link.data = 'b';
		p.link.link = new P();
		p.link.link.data = 'd';

		LinkedListJava llj = new LinkedListJava();
		llj.insert(p, 'g');
		llj.insert(p, 'k');
		llj.delete(p, 'b');
		llj.PrintLinkedList(p);

	}

}
