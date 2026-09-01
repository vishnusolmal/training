package day9;

public class tree3 {
	static class Node{
		int data;
		Node left;
		Node right;
		Node (int data){
			this.data = data;
		}
	}

	 static void Inorder(Node root) {
		if (root == null) {
			return;
		}
		Inorder(root.left);
		System.out.println(root.data +" ");
		Inorder(root.right);
			
	 }

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right =new Node(3);
		root.left.left =new Node(4);
		root.left.right =new Node(5);
		Inorder(root);

	}

}
