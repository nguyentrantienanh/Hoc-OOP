
    public class Bike{
        // kiểu dữ liệu / data_type
        String mau_sac;
        String kich_thuoc;
        String thuong_hieu;
        String loai_xe;
        double gia;

        Bike(){
            mau_sac = "Do";
            kich_thuoc = "Lon";
            thuong_hieu = "Honda";
            loai_xe = "Xe may";
            gia = 12000;
        }

        public static void main(String[] args) {
            Bike myBike = new Bike();
            System.out.println("Mau sac: " + myBike.mau_sac);
            System.out.println("Kich thuoc: " + myBike.kich_thuoc);
            System.out.println("Thuong hieu: " + myBike.thuong_hieu);
            System.out.println("Loai xe: " + myBike.loai_xe);
            System.out.println("Gia: " + myBike.gia);
        }
    }
