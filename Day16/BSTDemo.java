package Trees;

import java.util.Scanner;

public class BSTDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Enter the root node data: ");
		int rootdata = sc.nextInt();
		Node rootNode = new Node(rootdata);
		
		System.out.println("How many nodes you want to insert after root?");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " nodes data:");
		for(int i = 0 ; i < n ; i++) {
			int data = sc.nextInt();
			Node nodeToInsert = new Node(data);
			BinarySearchTree.insertNode(nodeToInsert, rootNode);
		}
		
		
	}

}
