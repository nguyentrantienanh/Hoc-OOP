class Main {
    public static void main(String[] a) {
        // Bike myBike1 = new Bike("Green");
        // System.out.print(myBike1.mau_sac); 
        Bike myBike2 = new Bike("Green", 20000);
        System.out.print(myBike2.getGia()); 
    }
}
class Bike {
    public String mau_sac; 
    private double gia;


    public Bike(String m, double g) {
        this.mau_sac = m;
        this.gia = g;
    }
    public double getGia(){
        return this.gia;
    }
}

 