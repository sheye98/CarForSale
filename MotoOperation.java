package Carforsale;

public class MotoOperation {
    private Moto[] motos = new Moto[8];

    public void init() {
        motos[0] = new Car("京NY28588", "宝马", "X6", 800);
        motos[1] = new Car("京NY3284", "宝马", "550i", 600);
        motos[2] = new Car("京NT37465", "别克", "林荫大道", 300);
        motos[3] = new Car("京NT96968", "别克", "别克GL8", 600);
        motos[4] = new Bus("京6566754", "金杯", "16座", 800);
        motos[5] = new Bus("京8696997", "金龙", "16座", 800);
        motos[6] = new Bus("京9696996", "金龙", "34座", 1500);
        motos[7] = new Bus("京8696998", "金杯", "34座", 1500);

    }

    public Moto motoLeaseOut(String brand, String type) {
        init();
        if (brand.equals( "宝马")) {
            if (type.equals("X6")) {
                return motos[0];
            } else {
                return motos[1];
            }
        }
        else if (brand.equals("别克")) {
            if (type.equals("别克林荫大道")) {
                return motos[2];
            } else {
                return motos[3];
            }
        }
        else if (brand.equals("金龙")) {
            if (type.equals("16座")) {
                return motos[5];
            } else {
                return motos[6];
            }
        }
        else if (brand.equals("金杯")){
            if (type.equals("16座")) {
                return motos[4];
            } else {
                return motos[7];
            }
        }
        return null;
    }
}