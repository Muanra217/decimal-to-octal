package konversibiloktal;


public class stack {
	private int ukuran;
    public int[] tumpukan;
    private int top;

    public stack(int s){
        ukuran = s;
        tumpukan = new int[ukuran];
        top = -1;
    }
    public void konbin(int b){
    if (b>0){
        konbin(b/8);
    }
    System.out.println(b%8);
}

    public void push(int j){
        tumpukan[++top] = j;
    }
    
  

    public int pop(){
        return tumpukan[top--];
    }

    public int peak(){
        return tumpukan[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == ukuran - 1);
    }
    

    public void baca(){
       
        int i = top;
        while (i >= 0){
            System.out.print(tumpukan[i]);
            System.out.println(" ");
            i--;
        }
        System.out.println(" ");
    
    }
  }
