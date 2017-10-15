
package cz.jcode.auto.value.step.builder.example.simple;

import com.google.common.collect.ImmutableList;
import java.util.Date;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Person extends Person {

  private final Integer id;
  private final ImmutableList<String> names;
  private final ImmutableList<String> phones;
  private final Address homeAddress;
  private final NoBuilderAddress workAddress;
  private final Date birthday;

  $AutoValue_Person(
      Integer id,
      ImmutableList<String> names,
      ImmutableList<String> phones,
      Address homeAddress,
      @Nullable NoBuilderAddress workAddress,
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
  public Address homeAddress() {
    return homeAddress;
  }

  @Nullable
  @Override
  public NoBuilderAddress workAddress() {
    return workAddress;
  }

  @Nullable
  @Override
  public Date birthday() {
    return birthday;
  }

  @Override
  public String toString() {
    return "Person{"
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
    if (o instanceof Person) {
      Person that = (Person) o;
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
  public Person.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Person.Builder {
    private Integer id;
    private ImmutableList<String> names;
    private ImmutableList<String> phones;
    private Address homeAddress;
    private NoBuilderAddress workAddress;
    private Date birthday;
    Builder() {
    }
    private Builder(Person source) {
      this.id = source.id();
      this.names = source.names();
      this.phones = source.phones();
      this.homeAddress = source.homeAddress();
      this.workAddress = source.workAddress();
      this.birthday = source.birthday();
    }
    @Override
    public Person.Builder id(Integer id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public Person.Builder names(ImmutableList<String> names) {
      if (names == null) {
        throw new NullPointerException("Null names");
      }
      this.names = names;
      return this;
    }
    @Override
    public Person.Builder phones(ImmutableList<String> phones) {
      if (phones == null) {
        throw new NullPointerException("Null phones");
      }
      this.phones = phones;
      return this;
    }
    @Override
    public Person.Builder homeAddress(Address homeAddress) {
      if (homeAddress == null) {
        throw new NullPointerException("Null homeAddress");
      }
      this.homeAddress = homeAddress;
      return this;
    }
    @Override
    public Person.Builder workAddress(@Nullable NoBuilderAddress workAddress) {
      this.workAddress = workAddress;
      return this;
    }
    @Override
    public Person.Builder birthday(@Nullable Date birthday) {
      this.birthday = birthday;
      return this;
    }
    @Override
    public Person build() {
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
      return new AutoValue_Person(
          this.id,
          this.names,
          this.phones,
          this.homeAddress,
          this.workAddress,
          this.birthday);
    }
  }

}

