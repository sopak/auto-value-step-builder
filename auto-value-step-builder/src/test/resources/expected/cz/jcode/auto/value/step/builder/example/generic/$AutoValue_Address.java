
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Address<T> extends Address<T> {

  private final T title;
  private final T street;
  private final ImmutableList<T> streetParts;
  private final T city;
  private final T postcode;
  private final T countryCode;

  $AutoValue_Address(
      T title,
      T street,
      @Nullable ImmutableList<T> streetParts,
      T city,
      T postcode,
      T countryCode) {
    if (title == null) {
      throw new NullPointerException("Null title");
    }
    this.title = title;
    if (street == null) {
      throw new NullPointerException("Null street");
    }
    this.street = street;
    this.streetParts = streetParts;
    if (city == null) {
      throw new NullPointerException("Null city");
    }
    this.city = city;
    if (postcode == null) {
      throw new NullPointerException("Null postcode");
    }
    this.postcode = postcode;
    if (countryCode == null) {
      throw new NullPointerException("Null countryCode");
    }
    this.countryCode = countryCode;
  }

  @Override
  public T title() {
    return title;
  }

  @Override
  public T street() {
    return street;
  }

  @Nullable
  @Override
  public ImmutableList<T> streetParts() {
    return streetParts;
  }

  @Override
  public T city() {
    return city;
  }

  @Override
  public T postcode() {
    return postcode;
  }

  @Override
  public T countryCode() {
    return countryCode;
  }

  @Override
  public String toString() {
    return "Address{"
        + "title=" + title + ", "
        + "street=" + street + ", "
        + "streetParts=" + streetParts + ", "
        + "city=" + city + ", "
        + "postcode=" + postcode + ", "
        + "countryCode=" + countryCode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Address) {
      Address<?> that = (Address<?>) o;
      return (this.title.equals(that.title()))
           && (this.street.equals(that.street()))
           && ((this.streetParts == null) ? (that.streetParts() == null) : this.streetParts.equals(that.streetParts()))
           && (this.city.equals(that.city()))
           && (this.postcode.equals(that.postcode()))
           && (this.countryCode.equals(that.countryCode()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.title.hashCode();
    h *= 1000003;
    h ^= this.street.hashCode();
    h *= 1000003;
    h ^= (streetParts == null) ? 0 : this.streetParts.hashCode();
    h *= 1000003;
    h ^= this.city.hashCode();
    h *= 1000003;
    h ^= this.postcode.hashCode();
    h *= 1000003;
    h ^= this.countryCode.hashCode();
    return h;
  }

  @Override
  public Address.Builder<T> toBuilder() {
    return new Builder<T>(this);
  }

  static final class Builder<T> extends Address.Builder<T> {
    private T title;
    private T street;
    private ImmutableList<T> streetParts;
    private T city;
    private T postcode;
    private T countryCode;
    Builder() {
    }
    private Builder(Address<T> source) {
      this.title = source.title();
      this.street = source.street();
      this.streetParts = source.streetParts();
      this.city = source.city();
      this.postcode = source.postcode();
      this.countryCode = source.countryCode();
    }
    @Override
    public Address.Builder<T> title(T title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public Address.Builder<T> street(T street) {
      if (street == null) {
        throw new NullPointerException("Null street");
      }
      this.street = street;
      return this;
    }
    @Override
    public Address.Builder<T> streetParts(@Nullable ImmutableList<T> streetParts) {
      this.streetParts = streetParts;
      return this;
    }
    @Override
    public Address.Builder<T> city(T city) {
      if (city == null) {
        throw new NullPointerException("Null city");
      }
      this.city = city;
      return this;
    }
    @Override
    public Address.Builder<T> postcode(T postcode) {
      if (postcode == null) {
        throw new NullPointerException("Null postcode");
      }
      this.postcode = postcode;
      return this;
    }
    @Override
    public Address.Builder<T> countryCode(T countryCode) {
      if (countryCode == null) {
        throw new NullPointerException("Null countryCode");
      }
      this.countryCode = countryCode;
      return this;
    }
    @Override
    public Address<T> build() {
      String missing = "";
      if (this.title == null) {
        missing += " title";
      }
      if (this.street == null) {
        missing += " street";
      }
      if (this.city == null) {
        missing += " city";
      }
      if (this.postcode == null) {
        missing += " postcode";
      }
      if (this.countryCode == null) {
        missing += " countryCode";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Address<T>(
          this.title,
          this.street,
          this.streetParts,
          this.city,
          this.postcode,
          this.countryCode);
    }
  }

}

