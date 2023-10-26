package clinic;

import java.util.LinkedList;
import java.util.Queue;

public class Polyclinic {
    private final Queue<Patient> queue = new LinkedList<>();
    private int maxQueueLength = 0;

    public synchronized void addPatient(Patient patient) {
        queue.add(patient);
        if (queue.size() > maxQueueLength) {
            maxQueueLength = queue.size();
        }
    }

    public synchronized Patient nextPatient() {
        return queue.poll();
    }

    public int getMaxQueueLength() {
        return maxQueueLength;
    }
}