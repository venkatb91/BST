package javaDeveloperScreening;

import java.util.Scanner;

public class BinaryTreeConstruct {

	public static void main(String[] args) {
		System.out.println("Enter the array size:");
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int[] nums = new int[arrayLength];
		System.out.println("Enter the array elements:");
		for(int i=0; i<arrayLength; i++ ) {
			if (scanner.hasNextInt()) {
                nums[i] = scanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
		}
		System.out.println("Enter the index of root in array");
		int root = nums[scanner.nextInt()];
		scanner.close();
		BinaryTree tree = new BinaryTree( root );
		for(int j:nums){
			tree.addNode( j );
		}
		System.out.println("Traverse Pre order:");
		tree.traversePreOrder();
		System.out.println("Traverse In order:");
		tree.traverseInOrder();
		System.out.println("Traverse Post order:");
		tree.traversePostOrder();
	}
}
