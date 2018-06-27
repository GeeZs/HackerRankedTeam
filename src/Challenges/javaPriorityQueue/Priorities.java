package Challenges.javaPriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Priorities {
    Priorities() {}
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).contains("SERVED")) {
                if (queue.size() > 0) { queue.poll(); }
            } else {
                String[] data = events.get(i).split(" ");
                queue.add(new Student(Integer.parseInt(data[3]), data[1], Double.valueOf(data[2])));
            }
        }

        List<Student> result = new ArrayList<>();
        while (queue.size() > 0) {
            result.add(queue.poll());
        }

        return result;
    }
}
