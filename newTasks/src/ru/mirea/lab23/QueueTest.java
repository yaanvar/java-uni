package ru.mirea.lab23;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        fillQueue(arrayQueue,10);
        System.out.println(arrayQueue.show());
        System.out.println(arrayQueue.element());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.size());
        arrayQueue.enqueue(11);
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.show());
        arrayQueue.clear();
        System.out.println(arrayQueue.show() +"\n\n");

        new ArrayQueueModule();
        fillModule(10);
        System.out.println(ArrayQueueModule.show());
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
        ArrayQueueModule.enqueue(12);
        System.out.println(ArrayQueueModule.isEmpty());
        System.out.println(ArrayQueueModule.show());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.show() + "\n\n");

        ArrayQueueADT ADTqueue = new ArrayQueueADT();
        fillADT(ADTqueue,10);
        System.out.println(ArrayQueueADT.show(ADTqueue));
        System.out.println(ArrayQueueADT.element(ADTqueue));
        System.out.println(ArrayQueueADT.dequeue(ADTqueue));
        System.out.println(ArrayQueueADT.size(ADTqueue));
        ArrayQueueADT.enqueue(ADTqueue, 13);
        System.out.println(ArrayQueueADT.isEmpty(ADTqueue));
        System.out.println(ArrayQueueADT.show(ADTqueue));
        ArrayQueueADT.clear(ADTqueue);
        System.out.println(ArrayQueueADT.show(ADTqueue));
    }

    public static void fillADT(ArrayQueueADT queueADT,int size){
        for (int i = 0; i < size; i++) ArrayQueueADT.enqueue(queueADT, i);
    }

    public static void fillModule(int size){
        for(int i =0 ;i < size; i++){
            ArrayQueueModule.enqueue(i);
        }
    }
    public static void fillQueue(ArrayQueue queue, int size){
        for(int i = 0; i < size; i++) queue.enqueue(i);
    }
}