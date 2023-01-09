public class PriorityThread extends Thread{
    private int id;

    public PriorityThread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Thread with id:" + id + " is performing the operation:");
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }
    }
}
