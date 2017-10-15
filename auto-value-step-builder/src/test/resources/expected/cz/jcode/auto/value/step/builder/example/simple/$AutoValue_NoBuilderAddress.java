
package cz.jcode.auto.value.step.builder.example.simple;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NoBuilderAddress extends NoBuilderAddress {

  private final String title;
  private final String street;
  private final ImmutableList<String> streetParts;
  private final String city;
  private final String postcode;
  private final String countryCode;

  $AutoValue_NoBuilderAddress(
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
    return "NoBuilderAddress{"
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
    if (o instanceof NoBuilderAddress) {
      NoBuilderAddress that = (NoBuilderAddress) o;
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

}

