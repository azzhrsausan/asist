package Essay2.No3;


public class EmployeOO {
    // 1. Class Variables (State)
    private String nama;
    private String posisi;
    private int umur;
    private int gaji;


    public EmployeOO(String name, String position, int age, int salary) {
        this.nama = name;
        this.posisi = position;
        this.umur = age;
        this.gaji = salary;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public int getUmur() {
        return umur;
    }

    public int getGaji() {
        return gaji;
    }

    public void naikGaji(int kenaikan) {
        this.gaji = this.gaji + kenaikan;
    }

    public void kenaPenalti(int penalti) {
        this.gaji = this.gaji - penalti;
    }

    public String panggilEmployee() {
        return "Employee: " + this.getNama() + " posisi " + this.getPosisi() + " berumur " + this.getUmur();
    }
}
