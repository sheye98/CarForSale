package Carforsale;

public class Car implements Moto  {
    int preRent;
    String id;
    String brand;
    String type;

    public int getPreRent() {
        return preRent;
    }

    public void setPreRent(int preRent) {
        this.preRent = preRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car() {
        super();
    }

    public Car(String id, String brand, String type, int preRent) {
        this.preRent = preRent;
        this.id = id;
        this.brand = brand;
        this.type = type;
    }


    public double calRent(int days) {
        if (brand.equals("宝马")) {
            if (type.equals("X6") ) {
                preRent = 800;
            } else {
                preRent = 600;
            }
        }
        else {
            if (type.equals("别克林荫大道")) {
                preRent = 300;
            } else {
                preRent = 600;
            }
        }
        if (days > 7 && days < 30) {
            return preRent * 0.9;
        }
        else if (days > 30 && days < 150) {
            return preRent * 0.8;
        }
        else if (days > 150) {
            return preRent * 0.7;
        }
        else {
            return preRent;
        }

    }
}