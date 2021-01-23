
public class MyStack {
    public int[] elem;
    public int top;

    public MyStack(){
        this.elem = new int[10];
    }
    public boolean isFill(){
        return this.top == this.elem.length;
    }
    //入栈
    public int push(int val){
        if(isFill()) return -1;
        this.elem[this.top] = val;
        this.top++;
        return this.elem[this.top - 1];
    }
    //拿栈顶元素并删除
    public int pop(){
        if(isEmpty()) return -1;
        this.top--;
        return this.elem[this.top];

    }
    public int size(){
        return this.top;
    }
    //拿出栈顶元素
    public int peek(){
        if(isEmpty()) return -1;
        return this.elem[this.top - 1];
    }

    public boolean isEmpty(){
        return this.top == 0;
    }
    public void display(){
        for (int i = 0; i < this.top; i++) {
            System.out.println(this.elem[i]);
        }
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        ms.display();
    }
}
