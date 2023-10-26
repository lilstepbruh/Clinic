package clinic;

public class PolyclinicSimulation {

    public static void main(String[] args) {
        Polyclinic polyclinic = new Polyclinic();

        for (int i = 0; i < 100; i++) {
            Patient patient = new Patient(polyclinic);
            Thread thread = new Thread(patient);
            thread.start();
        }
    }
}









