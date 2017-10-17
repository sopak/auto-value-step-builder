
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_NoBuilderAddress<T> extends NoBuilderAddress<T> {

  private final T title;
  private final T street;
  private final ImmutableList<T> streetParts;
  private final T city;
  private final T postcode;
  private final T countryCode;

  $AutoValue_NoBuilderAddress(
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
      NoBuilderAddress<?> that = (NoBuilderAddress<?>) o;
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

