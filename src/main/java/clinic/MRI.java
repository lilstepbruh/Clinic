package clinic;

class MRI implements Runnable {
    private Polyclinic polyclinic;

    public MRI(Polyclinic polyclinic) {
        this.polyclinic = polyclinic;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}