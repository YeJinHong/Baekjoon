package datastructure;

//이진 트리, 저장할 데이터의 크기에 따라 노드의 위치를 정의한 것.
//정의
//1) 모든 원소는 서로 다른 유일한 키를 갖는다.
//2) 왼쪽 서브 트리에 있는 원소의 키는 그 루트의 키보다 작다.
//3) 오른쪽 서브 트리에 있는 원소의 키는 그 루트의 키보다 크다.
//4) 왼쪽 서브 트리와 오른쪽 서브 트리도 이진탐색 트리다.
class TreeNode{
	char data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode() {
		this.left=null;
		this.right=null;
	}
	
	public TreeNode(char data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public Object getData() {
		return data;
	}
}

public class BinarySearchTree {
	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode(x);
		
		if(p==null) {
			return newNode;
		}else if(p.data>newNode.data) {
			p.left = insertKey(p.left, x);
			return p;
		}else if(p.data<newNode.data) {
			p.right = insertKey(p.right, x);
			return p;
		}else {
			return p;
		}
	}
	
	public void insertBST(char x) {
		root = insertKey(root, x);
	}
	
	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while(p!=null) {
			if(x<p.data) p = p.left;
			else if(x>p.data) p = p.right;
			else return p;
		}
		return p;
	}
	
	public void inorder(TreeNode root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	public void printBST() {
		inorder(root);
		System.out.println();
	}
}
