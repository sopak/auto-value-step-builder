
package cz.jcode.auto.value.step.builder.example.innerclass;

import com.google.common.collect.ImmutableList;
import java.util.Date;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_PersonWithAddress extends PersonWithAddress {

  private final Integer id;
  private final ImmutableList<String> names;
  private final ImmutableList<String> phones;
  private final PersonWithAddress.Address homeAddress;
  private final PersonWithAddress.Address workAddress;
  private final Date birthday;

  $AutoValue_PersonWithAddress(
      Integer id,
      ImmutableList<String> names,
      ImmutableList<String> phones,
      PersonWithAddress.Address homeAddress,
      @Nullable PersonWithAddress.Address workAddress,
      @Nullable Date birthday) {
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (names == null) {
      throw new NullPointerException("Null names");
    }
    this.names = names;
    if (phones == null) {
      throw new NullPointerException("Null phones");
    }
    this.phones = phones;
    if (homeAddress == null) {
      throw new NullPointerException("Null homeAddress");
    }
    this.homeAddress = homeAddress;
    this.workAddress = workAddress;
    this.birthday = birthday;
  }

  @Override
  public Integer id() {
    return id;
  }

  @Override
  public ImmutableList<String> names() {
    return names;
  }

  @Override
  public ImmutableList<String> phones() {
    return phones;
  }

  @Override
  public PersonWithAddress.Address homeAddress() {
    return homeAddress;
  }

  @Nullable
  @Override
  public PersonWithAddress.Address workAddress() {
    return workAddress;
  }

  @Nullable
  @Override
  public Date birthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return "PersonWithAddress{"
        + "id=" + id + ", "
        + "names=" + names + ", "
        + "phones=" + phones + ", "
        + "homeAddress=" + homeAddress + ", "
        + "workAddress=" + workAddress + ", "
        + "birthday=" + birthday
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PersonWithAddress) {
      PersonWithAddress that = (PersonWithAddress) o;
      return (this.id.equals(that.id()))
           && (this.names.equals(that.names()))
           && (this.phones.equals(that.phones()))
           && (this.homeAddress.equals(that.homeAddress()))
           && ((this.workAddress == null) ? (that.workAddress() == null) : this.workAddress.equals(that.workAddress()))
           && ((this.birthday == null) ? (that.birthday() == null) : this.birthday.equals(that.birthday()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.id.hashCode();
    h *= 1000003;
    h ^= this.names.hashCode();
    h *= 1000003;
    h ^= this.phones.hashCode();
    h *= 1000003;
    h ^= this.homeAddress.hashCode();
    h *= 1000003;
    h ^= (workAddress == null) ? 0 : this.workAddress.hashCode();
    h *= 1000003;
    h ^= (birthday == null) ? 0 : this.birthday.hashCode();
    return h;
  }

  @Override
  public PersonWithAddress.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends PersonWithAddress.Builder {
    private Integer id;
    private ImmutableList<String> names;
    private ImmutableList<String> phones;
    private PersonWithAddress.Address homeAddress;
    private PersonWithAddress.Address workAddress;
    private Date birthday;
    Builder() {
    }
    private Builder(PersonWithAddress source) {
      this.id = source.id();
      this.names = source.names();
      this.phones = source.phones();
      this.homeAddress = source.homeAddress();
      this.workAddress = source.workAddress();
      this.birthday = source.birthday();
    }
    @Override
    public PersonWithAddress.Builder id(Integer id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public PersonWithAddress.Builder names(ImmutableList<String> names) {
      if (names == null) {
        throw new NullPointerException("Null names");
      }
      this.names = names;
      return this;
    }
    @Override
    public PersonWithAddress.Builder phones(ImmutableList<String> phones) {
      if (phones == null) {
        throw new NullPointerException("Null phones");
      }
      this.phones = phones;
      return this;
    }
    @Override
    public PersonWithAddress.Builder homeAddress(PersonWithAddress.Address homeAddress) {
      if (homeAddress == null) {
        throw new NullPointerException("Null homeAddress");
      }
      this.homeAddress = homeAddress;
      return this;
    }
    @Override
    public PersonWithAddress.Builder workAddress(@Nullable PersonWithAddress.Address workAddress) {
      this.workAddress = workAddress;
      return this;
    }
    @Override
    public PersonWithAddress.Builder birthday(@Nullable Date birthday) {
      this.birthday = birthday;
      return this;
    }
    @Override
    public PersonWithAddress build() {
      String missing = "";
      if (this.id == null) {
        missing += " id";
      }
      if (this.names == null) {
        missing += " names";
      }
      if (this.phones == null) {
        missing += " phones";
      }
      if (this.homeAddress == null) {
        missing += " homeAddress";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_PersonWithAddress(
          this.id,
          this.names,
          this.phones,
          this.homeAddress,
          this.workAddress,
          this.birthday);
    }
  }

}

