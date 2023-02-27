package Demo8;

import java.util.ArrayList;

/**
 * @Author: KanZhou
 * @Date: 2023-02-21 1:04 a.m.
 */
public class GroupManager extends User {
    private String name;
    private int remains;
    public GroupManager(String name, int remains) {
        super(name, remains);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> arr = new ArrayList<>();
        return arr;
    }
}
