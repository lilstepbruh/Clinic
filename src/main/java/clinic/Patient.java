package clinic;

public class Patient implements Runnable {
    private Polyclinic polyclinic;

    public Patient(Polyclinic polyclinic) {
        this.polyclinic = polyclinic;
    }

    @Override
    public void run() {
        polyclinic.addPatient(this);
        System.out.println("Пациент пришел в поликлинику");

        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Пациент отправляется на МРТ");
    }
}