package Carforsale;

public class Bus implements Moto {
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

    public Bus() {
        super();
    }

    public Bus(String id, String brand, String type, int preRent) {
        this.preRent = preRent;
        this.id = id;
        this.brand = brand;
        this.type = type;
    }

    public double calRent(int days) {
        if (brand.equals("金龙")) {
            if (type.equals("16座") ) {
                preRent = 800;
            } else {
                preRent = 1500;
            }
        }
        else {
            if (type.equals("34座")) {
                preRent = 1500;
            } else {
                preRent = 800;
            }
        }
        if (days >= 3 && days < 7) {
            return preRent * 0.9;
        } else if (days >= 7 && days < 30) {
            return preRent * 0.8;
        } else if (days >= 30 && days < 150) {
            return preRent * 0.7;
        } else if (days >= 150) {
            return preRent * 0.6;
        } else {
            return preRent;
        }

    }
}
