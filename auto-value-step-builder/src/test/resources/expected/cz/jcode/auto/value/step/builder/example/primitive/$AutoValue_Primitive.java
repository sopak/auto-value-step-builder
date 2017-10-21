
package cz.jcode.auto.value.step.builder.example.primitive;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Primitive extends Primitive {

  private final int primitiveInt;
  private final long primitiveLong;
  private final double primitiveDouble;
  private final float primitiveFloat;
  private final boolean primitiveBoolean;
  private final byte primitiveByte;
  private final char primitiveChar;

  $AutoValue_Primitive(
      int primitiveInt,
      long primitiveLong,
      double primitiveDouble,
      float primitiveFloat,
      boolean primitiveBoolean,
      byte primitiveByte,
      char primitiveChar) {
    this.primitiveInt = primitiveInt;
    this.primitiveLong = primitiveLong;
    this.primitiveDouble = primitiveDouble;
    this.primitiveFloat = primitiveFloat;
    this.primitiveBoolean = primitiveBoolean;
    this.primitiveByte = primitiveByte;
    this.primitiveChar = primitiveChar;
  }

  @Override
  public int primitiveInt() {
    return primitiveInt;
  }

  @Override
  public long primitiveLong() {
    return primitiveLong;
  }

  @Override
  public double primitiveDouble() {
    return primitiveDouble;
  }

  @Override
  public float primitiveFloat() {
    return primitiveFloat;
  }

  @Override
  public boolean primitiveBoolean() {
    return primitiveBoolean;
  }

  @Override
  public byte primitiveByte() {
    return primitiveByte;
  }

  @Override
  public char primitiveChar() {
    return primitiveChar;
  }

  @Override
  public String toString() {
    return "Primitive{"
        + "primitiveInt=" + primitiveInt + ", "
        + "primitiveLong=" + primitiveLong + ", "
        + "primitiveDouble=" + primitiveDouble + ", "
        + "primitiveFloat=" + primitiveFloat + ", "
        + "primitiveBoolean=" + primitiveBoolean + ", "
        + "primitiveByte=" + primitiveByte + ", "
        + "primitiveChar=" + primitiveChar
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Primitive) {
      Primitive that = (Primitive) o;
      return (this.primitiveInt == that.primitiveInt())
           && (this.primitiveLong == that.primitiveLong())
           && (Double.doubleToLongBits(this.primitiveDouble) == Double.doubleToLongBits(that.primitiveDouble()))
           && (Float.floatToIntBits(this.primitiveFloat) == Float.floatToIntBits(that.primitiveFloat()))
           && (this.primitiveBoolean == that.primitiveBoolean())
           && (this.primitiveByte == that.primitiveByte())
           && (this.primitiveChar == that.primitiveChar());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.primitiveInt;
    h *= 1000003;
    h ^= (int) ((this.primitiveLong >>> 32) ^ this.primitiveLong);
    h *= 1000003;
    h ^= (int) ((Double.doubleToLongBits(this.primitiveDouble) >>> 32) ^ Double.doubleToLongBits(this.primitiveDouble));
    h *= 1000003;
    h ^= Float.floatToIntBits(this.primitiveFloat);
    h *= 1000003;
    h ^= this.primitiveBoolean ? 1231 : 1237;
    h *= 1000003;
    h ^= this.primitiveByte;
    h *= 1000003;
    h ^= this.primitiveChar;
    return h;
  }

}

