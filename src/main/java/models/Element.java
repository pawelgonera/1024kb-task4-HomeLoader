package models;

public class Element
{
    private String elementName;
    private Position position;
    private float weight;
    private Size size;

    public Element(String elementName, Position position, float weight, Size size)
    {
        this.elementName = elementName;
        this.position = position;
        this.weight = weight;
        this.size = size;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position element) {
        this.position = element;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Element{" +
                "elementName='" + elementName + '\'' +
                ", element=" + position +
                ", size=" + size +
                '}';
    }
}
