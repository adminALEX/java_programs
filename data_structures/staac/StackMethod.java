package data_structures.staac;

public class StackMethod {
    int length = 2;
    int length_temp = size();
    int stack[] = new int[length];
    int top=0; 
    public void push(int data){
        if(top==length)
            expand();
        stack[top]=data; 
        top++; 
    }

    public int size(){
        return top;
    }
    private void expand(){
        int new_length = length;      
        int new_stack[] = new int[length*2];
        System.arraycopy(stack, 0, new_stack, 0, new_length);
        stack = new_stack;
        length *= 2;
        }
    public void show(){
        for(int i : stack)
        System.out.print(i+" | ");
        System.out.println();
    }
    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            data  = stack[top];
            stack[top]=0;
            shrink();
        }
          
        return data; 
    }
    public int peek(){
        int data;
        data  = stack[top];
        return data;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    
    public void shrink(){
        int s = size();
        if (s <= (length/2)/2)
            length = length/2;
        int new_stack[] = new int[length];
        System.arraycopy(stack, 0, new_stack, 0, s);
        stack = new_stack;
        }
    }
