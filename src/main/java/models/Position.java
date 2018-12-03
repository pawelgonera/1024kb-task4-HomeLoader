package models;

public class Position
{
    private float positionX;
    private float positionY;
    private float positionZ;

    public Position(float positionX, float positionY, float positionZ)
    {
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public float getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(float positionZ) {
        this.positionZ = positionZ;
    }

    @Override
    public String toString()
    {
        return "Position{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", positionZ=" + positionZ +
                '}';
    }
}
