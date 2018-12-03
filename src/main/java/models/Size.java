package models;

public class Size
{
    private float length;
    private float width;
    private float height;

    public Size(float length, float width, float height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Size{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
