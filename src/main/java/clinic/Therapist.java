package clinic;

class Therapist implements Runnable {
    private Polyclinic polyclinic;

    public Therapist(Polyclinic polyclinic) {
        this.polyclinic = polyclinic;
    }

    @Override
    public void run() {
        while (true) {
            Patient patient = polyclinic.nextPatient();
            if (patient == null) {
                continue;
            }

            System.out.println("Терапевт осматривает пациента");

            synchronized (patient) {
                patient.notify();
            }
        }
    }
}
