package _0001_0100;

import java.util.LinkedList;
import java.util.Queue;

public class _0225_ImplementStackUsingQueues {
    private int posCurQueue = 0;
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public _0225_ImplementStackUsingQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    private void changeQueue() {
        if(posCurQueue == 0)
            posCurQueue = 1;
        else
            posCurQueue = 0;
    }

    private Queue<Integer> curQueue() {
        if(posCurQueue == 0)
            return queue1;
        else
            return queue2;
    }

    private Queue<Integer> backupQueue() {
        if(posCurQueue == 0)
            return queue2;
        else
            return queue1;
    }

    public void push(int x) {
        curQueue().add(x);
    }

    public int pop() {
        int retData = 0;

        if(curQueue().size() == 0)
            return 0;

        while(curQueue().size() > 1)
        {
            backupQueue().add(curQueue().poll());
        }

        retData = curQueue().poll();
        changeQueue();

        return retData;
    }

    public int top() {
        int retData = 0;

        if(curQueue().size() == 0)
            return 0;

        while(curQueue().size() > 1)
        {
            backupQueue().add(curQueue().poll());
        }

        retData = curQueue().poll();
        backupQueue().add(retData);
        changeQueue();

        return retData;
    }

    public boolean empty() {
        if(curQueue().size() != 0)
            return false;

        return true;
    }
}
