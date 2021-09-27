package hackveda.bhavesh.firstProject;

import hackveda.bhavesh.firstProject.MyTreeTest.Tree.Node;

public class MyTreeTest {
	
	public static void main(String args[])
	{
		Tree tree = new Tree();
		Node root= new Tree.Node(5);
		
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		
		System.out.println("Traverse the Tree");
		tree.traverseInOrder(root);
	}

	public static class Tree{
		
		static class Node{
			
			int value;
			Node left,right;
			
			Node(int value){
				this.value=value;
				left=null;
				right=null;
			}
		
		}
		public void insert(Node node, int value) {
			
			if(value < node.value) {
				if(node.left != null) {
					insert(node.left, value);
				}
				else {
					System.out.println("Insert " + value + " to the left of " + node.value);
					node.left= new Node(value);
				}
			}
			else if( value > node.value) {
				if(node.right != null) {
					insert(node.right, value);
				}
				else {
					System.out.println("Insert " + value + " to the right of " + node.value);
					node.right= new Node(value);
				}
			}
		}
		
		public void traverseInOrder(Node node) {
			if( node !=null) {
				traverseInOrder(node.left);
				System.out.println(" " + node.value);
				traverseInOrder(node.right);
			}
		}
	}
}