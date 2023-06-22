package birzeit.phase1;

public class Item {
    String name;
    String copy;
    int image;

    public Item(String name, String copy, int image) {
        this.name = name;
        this.copy = copy;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
