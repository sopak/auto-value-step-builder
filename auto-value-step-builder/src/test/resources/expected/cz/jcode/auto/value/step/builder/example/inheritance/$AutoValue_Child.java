
package cz.jcode.auto.value.step.builder.example.inheritance;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Child extends Child {

  private final Integer parentNumber;
  private final Integer childNumber;

  $AutoValue_Child(
      Integer parentNumber,
      Integer childNumber) {
    if (parentNumber == null) {
      throw new NullPointerException("Null parentNumber");
    }
    this.parentNumber = parentNumber;
    if (childNumber == null) {
      throw new NullPointerException("Null childNumber");
    }
    this.childNumber = childNumber;
  }

  @Override
  public Integer parentNumber() {
    return parentNumber;
  }

  @Override
  public Integer childNumber() {
    return childNumber;
  }

  @Override
  public String toString() {
    return "Child{"
        + "parentNumber=" + parentNumber + ", "
        + "childNumber=" + childNumber
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Child) {
      Child that = (Child) o;
      return (this.parentNumber.equals(that.parentNumber()))
           && (this.childNumber.equals(that.childNumber()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.parentNumber.hashCode();
    h *= 1000003;
    h ^= this.childNumber.hashCode();
    return h;
  }

  @Override
  public Child.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Child.Builder {
    private Integer parentNumber;
    private Integer childNumber;
    Builder() {
    }
    private Builder(Child source) {
      this.parentNumber = source.parentNumber();
      this.childNumber = source.childNumber();
    }
    @Override
    public Child.Builder parentNumber(Integer parentNumber) {
      if (parentNumber == null) {
        throw new NullPointerException("Null parentNumber");
      }
      this.parentNumber = parentNumber;
      return this;
    }
    @Override
    public Child.Builder childNumber(Integer childNumber) {
      if (childNumber == null) {
        throw new NullPointerException("Null childNumber");
      }
      this.childNumber = childNumber;
      return this;
    }
    @Override
    public Child build() {
      String missing = "";
      if (this.parentNumber == null) {
        missing += " parentNumber";
      }
      if (this.childNumber == null) {
        missing += " childNumber";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Child(
          this.parentNumber,
          this.childNumber);
    }
  }

}

