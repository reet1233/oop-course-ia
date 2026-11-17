package q2_7;

public class Vector2D {
    private float x;
    private float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Mutates this vector in place by adding v
    public void add(Vector2D v) {
        this.x += v.x;
        this.y += v.y;
    }

    public float dot(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }

    // Normalises this vector in place to unit length
    public void normalise() {
        float mag = this.magnitude();
        if (mag == 0.0f) {
            throw new ArithmeticException("Cannot normalise the zero vector");
        }
        this.x /= mag;
        this.y /= mag;
    }
}