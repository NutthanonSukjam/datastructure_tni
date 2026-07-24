
public class TodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList todolist = new DoublyLinkedList();
		
		todolist.insert("Finish Homework");
		System.out.println(todolist.traversal());
		
		todolist.insert("Laundry");
		todolist.insert("Group meeting");
		System.out.println(todolist.traversal());
		
		todolist.insert(0,"Submit Report");
		System.out.println(todolist.traversal());
		
		todolist.insert(2, "Buy Food");
		System.out.println(todolist.traversal());
		
		todolist.insert("Go to Gym");
		System.out.println(todolist.traversal());
	}

}
