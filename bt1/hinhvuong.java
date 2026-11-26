
class Main {
     public static void main(String[] a)
     {
        System.out.println("Dien tich la: " + HinhVuong.TinhDienTich(4));
     }
}

class HinhVuong {
    static int TinhDienTich(int canh) {
        int dien_tich;
        dien_tich = canh * canh;
        return dien_tich;   
    }
    int TinhChuVi(int canh){
        int chu_vi;
        chu_vi = 4 * canh ;
        return chu_vi;
    }
    public static void main(String[] a){
        // hv là object
        HinhVuong hv = new HinhVuong();
        int dt;
        dt = hv.TinhDienTich(10);
        System.out.println("dien tich hinh vuong: " + dt); 

        // myHinhVuong là object
        HinhVuong myHinhVuong = new HinhVuong();
        int cv;
        cv = myHinhVuong.TinhChuVi(6);
        System.out.println("chu vi hinh vuong: " + cv);
    }
}
