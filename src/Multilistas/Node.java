package Multilistas;

public class Node {

    Node Link;
    Subnode Subroot;
    String CarBrand;

    public Node(Node Link, Subnode Subroot, String CarBrand) {
        this.Link = Link;
        this.Subroot = Subroot;
        this.CarBrand = CarBrand;
    }

    public Node getLink() {
        return Link;
    }

    public void setLink(Node Link) {
        this.Link = Link;
    }

    public Subnode getSubroot() {
        return Subroot;
    }

    public void setSubroot(Subnode Subroot) {
        this.Subroot = Subroot;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String CarBrand) {
        this.CarBrand = CarBrand;
    }

}
