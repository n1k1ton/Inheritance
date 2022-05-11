import java.util.Objects;

public class Wall extends Rectangle{

    int thickness;

    public Wall(int length, int width, int thickness) {
        super(length, width);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public void destroyHalfHeight() {
        this.setLength(this.getLength() / 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wall wall = (Wall) o;
        return thickness == wall.thickness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), thickness);
    }
}
