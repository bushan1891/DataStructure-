package io.bush.stack;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithStack {
/*
	In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:

		1 x: Enqueue element  into the end of the queue.
		2: Dequeue the element at the front of the queue.
		3: Print the element at the front of the queue*/
	
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in); 
        int i = in.nextInt();
        
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        for(int j=0;j<i;j++){
            int selection = in.nextInt();
            switch(selection){
                case 1: 
                int num = in.nextInt();
                mystack1.push(num);
                break;
                
                case 2: // dequeue
                
                //push all to stack 2 
                while(!mystack1.isEmpty()){
                    mystack2.push(mystack1.pop());
                }
                
                // dequeue a element
                if(!mystack2.isEmpty()){
                    mystack2.pop();
                }
                // moving all back to stack 1
                while(!mystack2.isEmpty()){
                    mystack1.push(mystack2.pop());
                }
                break;
                case 3:
                
                //push all to stack 2 
                while(!mystack1.isEmpty()){
                    mystack2.push(mystack1.pop());
                }
                
                // dequeue a element
                if(!mystack2.isEmpty()){
                   System.out.println(mystack2.peek());
                }
                // moving all back to stack 1
                while(!mystack2.isEmpty()){
                    mystack1.push(mystack2.pop());
                }
                break;
                
            }
            
        }
        
        
    
    
    }
}