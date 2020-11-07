/**
 * Create a queue using an array
 * Requirements:
 * Create a push() method to add an element to the top of the queue
 * Create a pop() method to remove an element from the queue
 * Create a peek() method to print the element at the head of the queue
 */
public class Main {
	static int currentIndex = 0;
	static int rearIndex ;
	
	public static void Print(int[]Queue){					//this method is printing all the elements of a queue
		System.out.println();
		System.out.println("Printing Queue:");
		System.out.println("current index is: "+ currentIndex);
		for(int i = 0; i < currentIndex; i++){              // the currentIndex is the last element added to the queue

			System.out.println("["+i + " ]=>"+Queue[i]+" ");

		}
		System.out.println();
	}
	
	public static void Push(int x, int[]Queue){
		if(currentIndex == 10){								//if current index is 10 then the queue is full
			System.out.println("The queue is full");
			return;											//return to main 
		}
		Queue[currentIndex] = x;							//assigning value to current index and 
		currentIndex++;										// increment the index			
	}
	
	public static void Peek(int[]Queue){
		
		System.out.print("Top of the queue: " + Queue[0]);
	}
	
	public static void Dequeue(int[]Queue){		
		for (int i = 0;  i < currentIndex - 1; i++){  // shifting all elements from current index to current index -1
			Queue[i] = Queue[i + 1];    			 //Queue[0] = Queue[0 + 1]
		
		}
		currentIndex--;	
	}
	public static void Search(int x, int[]Queue){            //searching the queue up to the current index
		for (int i = 0; i < currentIndex; i++){
			if (Queue[i] == x){								//if index is equal to the element we are searching 
				System.out.println(x + " was found in the queue at index " + i);   //print element and its index
				return;
			}	
		}
		System.out.println(x + " was not found in the queue");
	}
	
	public static void main(String[] args) {
		int[] Queue = new int[10];
		
		//Print(Queue);
		Push(5,Queue);
		Push(1,Queue);
		Push(19,Queue);
		Push(27,Queue);
		Push(13,Queue);
		Push(11,Queue);
		
		Push(6,Queue);
		Push(9,Queue);
		Push(30,Queue);
		Push(35,Queue);
		//Push(30,Queue);
		Print(Queue);
	
		
		Print(Queue);
		Search(35, Queue);
		/*
		Dequeue(Queue);
		Dequeue(Queue);
		Dequeue(Queue);
		
		Print(Queue);
		Peek(Queue);*/
	}

}
