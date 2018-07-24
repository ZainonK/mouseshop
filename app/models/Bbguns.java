package models;

/**
 * Created by COM2-02-PC on 7/10/2018.
 */
public class Bbguns {
    private String id,name,material,system,type;
    private int price ,weight,length;

    public Bbguns() {
    }

    public Bbguns(String id, String name, String material, String system, String type, int price, int weight, int length) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.system = system;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
