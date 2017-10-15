
package cz.jcode.auto.value.step.builder.example.simple;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Address extends Address {

  private final String title;
  private final String street;
  private final ImmutableList<String> streetParts;
  private final String city;
  private final String postcode;
  private final String countryCode;

  $AutoValue_Address(
      String title,
      String street,
      @Nullable ImmutableList<String> streetParts,
      String city,
      String postcode,
      String countryCode) {
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
  public String title() {
    return title;
  }

  @Override
  public String street() {
    return street;
  }

  @Nullable
  @Override
  public ImmutableList<String> streetParts() {
    return streetParts;
  }

  @Override
  public String city() {
    return city;
  }

  @Override
  public String postcode() {
    return postcode;
  }

  @Override
  public String countryCode() {
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
      Address that = (Address) o;
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
  public Address.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Address.Builder {
    private String title;
    private String street;
    private ImmutableList<String> streetParts;
    private String city;
    private String postcode;
    private String countryCode;
    Builder() {
    }
    private Builder(Address source) {
      this.title = source.title();
      this.street = source.street();
      this.streetParts = source.streetParts();
      this.city = source.city();
      this.postcode = source.postcode();
      this.countryCode = source.countryCode();
    }
    @Override
    public Address.Builder title(String title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public Address.Builder street(String street) {
      if (street == null) {
        throw new NullPointerException("Null street");
      }
      this.street = street;
      return this;
    }
    @Override
    public Address.Builder streetParts(@Nullable ImmutableList<String> streetParts) {
      this.streetParts = streetParts;
      return this;
    }
    @Override
    public Address.Builder city(String city) {
      if (city == null) {
        throw new NullPointerException("Null city");
      }
      this.city = city;
      return this;
    }
    @Override
    public Address.Builder postcode(String postcode) {
      if (postcode == null) {
        throw new NullPointerException("Null postcode");
      }
      this.postcode = postcode;
      return this;
    }
    @Override
    public Address.Builder countryCode(String countryCode) {
      if (countryCode == null) {
        throw new NullPointerException("Null countryCode");
      }
      this.countryCode = countryCode;
      return this;
    }
    @Override
    public Address build() {
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
      return new AutoValue_Address(
          this.title,
          this.street,
          this.streetParts,
          this.city,
          this.postcode,
          this.countryCode);
    }
  }

}

