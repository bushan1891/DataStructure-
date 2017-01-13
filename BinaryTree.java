package io.bush.binarytree;

public class BinaryTree {
	
	// our root node 
	Node root;
	
	// adding a node to the tree 
	public void addNode(int key,String name){
		Node newNode = new Node(key,name);
		
		// if its the first element 
		if(root==null){
			root=newNode;
		}
		else{
			//making our focusNode point root
			Node focusNode = root;
			
			Node parent;
			
			// entering in to infinite loop
			while(true){
				
				parent=focusNode;
				
				if(key<focusNode.key){
					//going left
					focusNode = focusNode.leftChild;
					if(focusNode ==null){
						parent.leftChild =newNode;
						return;
					}
					
				}
				else{
					// going right 
					focusNode = focusNode.rightChild;

					if(focusNode == null){
						parent.rightChild=newNode;
						return;
					}
					
				}
			}
			
		}
		//
		
		
	}
	
	
	// inorder traversal 
	public void inOrderTraversal(Node focusNode){
		if(focusNode != null){
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversal(focusNode.rightChild);
		}
	}
	
	public void preOrderTraversal(Node focusNode){
		if(focusNode !=null){
			System.out.println(focusNode);
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);
		}
	}
	
	public void postOrderTraversal(Node focusNode){
		if(focusNode !=null){
			
			postOrderTraversal(focusNode.leftChild);
			postOrderTraversal(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public Node findNode(int key){
		Node focusNode = root;
		
		while(focusNode.key !=key){
			
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			}else{
				focusNode=focusNode.rightChild;
			}
			
			if(focusNode == null)
				return null;
			
		}
		
		return focusNode;
	}
	
	
	public static void e(String[] args) {
		
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(10,"Boss");
		theTree.addNode(100,"Ashwini");
		theTree.addNode(45,"Bushan");
		theTree.addNode(89,"Carlo");
		theTree.addNode(37,"Zaiba");
		
		System.out.println("######## In order traversal");
		
		theTree.inOrderTraversal(theTree.root);
		
		System.out.println("###### Pre order traversal");
		
		theTree.preOrderTraversal(theTree.root);
		
		System.out.println(" ###### Post order traversal");
		
		theTree.postOrderTraversal(theTree.root);
		
		
		System.out.println("Searching a Node 89");
	    
		Node searchNode =theTree.findNode(89);
		
		System.out.println(searchNode);
		
	}
	
	
	private class Node{
		int key;
		String name;
		
		Node leftChild;
		Node rightChild;
		
		Node(int key, String name ){
			this.key=key;
			this.name=name;
		}
		
		public String toString(){
			return name + " has a key " +key;
		}
		
	}
}
