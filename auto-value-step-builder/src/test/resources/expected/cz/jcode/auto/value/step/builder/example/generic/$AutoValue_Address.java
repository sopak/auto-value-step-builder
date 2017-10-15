
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Address<T1> extends Address<T1> {

  private final T1 title;
  private final T1 street;
  private final ImmutableList<T1> streetParts;
  private final T1 city;
  private final T1 postcode;
  private final T1 countryCode;

  $AutoValue_Address(
      T1 title,
      T1 street,
      @Nullable ImmutableList<T1> streetParts,
      T1 city,
      T1 postcode,
      T1 countryCode) {
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
  public T1 title() {
    return title;
  }

  @Override
  public T1 street() {
    return street;
  }

  @Nullable
  @Override
  public ImmutableList<T1> streetParts() {
    return streetParts;
  }

  @Override
  public T1 city() {
    return city;
  }

  @Override
  public T1 postcode() {
    return postcode;
  }

  @Override
  public T1 countryCode() {
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
  public Address.Builder<T1> toBuilder() {
    return new Builder<T1>(this);
  }

  static final class Builder<T1> extends Address.Builder<T1> {
    private T1 title;
    private T1 street;
    private ImmutableList<T1> streetParts;
    private T1 city;
    private T1 postcode;
    private T1 countryCode;
    Builder() {
    }
    private Builder(Address<T1> source) {
      this.title = source.title();
      this.street = source.street();
      this.streetParts = source.streetParts();
      this.city = source.city();
      this.postcode = source.postcode();
      this.countryCode = source.countryCode();
    }
    @Override
    public Address.Builder<T1> title(T1 title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public Address.Builder<T1> street(T1 street) {
      if (street == null) {
        throw new NullPointerException("Null street");
      }
      this.street = street;
      return this;
    }
    @Override
    public Address.Builder<T1> streetParts(@Nullable ImmutableList<T1> streetParts) {
      this.streetParts = streetParts;
      return this;
    }
    @Override
    public Address.Builder<T1> city(T1 city) {
      if (city == null) {
        throw new NullPointerException("Null city");
      }
      this.city = city;
      return this;
    }
    @Override
    public Address.Builder<T1> postcode(T1 postcode) {
      if (postcode == null) {
        throw new NullPointerException("Null postcode");
      }
      this.postcode = postcode;
      return this;
    }
    @Override
    public Address.Builder<T1> countryCode(T1 countryCode) {
      if (countryCode == null) {
        throw new NullPointerException("Null countryCode");
      }
      this.countryCode = countryCode;
      return this;
    }
    @Override
    public Address<T1> build() {
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
      return new AutoValue_Address<T1>(
          this.title,
          this.street,
          this.streetParts,
          this.city,
          this.postcode,
          this.countryCode);
    }
  }

}

