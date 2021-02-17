package datastructure;

//���� Ʈ��, ������ �������� ũ�⿡ ���� ����� ��ġ�� ������ ��.
//����
//1) ��� ���Ҵ� ���� �ٸ� ������ Ű�� ���´�.
//2) ���� ���� Ʈ���� �ִ� ������ Ű�� �� ��Ʈ�� Ű���� �۴�.
//3) ������ ���� Ʈ���� �ִ� ������ Ű�� �� ��Ʈ�� Ű���� ũ��.
//4) ���� ���� Ʈ���� ������ ���� Ʈ���� ����Ž�� Ʈ����.
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
