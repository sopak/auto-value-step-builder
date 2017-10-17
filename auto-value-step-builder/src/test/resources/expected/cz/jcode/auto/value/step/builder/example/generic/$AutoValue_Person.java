
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import java.util.Date;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_Person<T, H, W> extends Person<T, H, W> {

  private final Integer id;
  private final ImmutableList<T> names;
  private final ImmutableList<T> phones;
  private final H homeAddress;
  private final W workAddress;
  private final Date birthday;

  $AutoValue_Person(
      Integer id,
      ImmutableList<T> names,
      ImmutableList<T> phones,
      H homeAddress,
      @Nullable W workAddress,
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
  public ImmutableList<T> names() {
    return names;
  }

  @Override
  public ImmutableList<T> phones() {
    return phones;
  }

  @Override
  public H homeAddress() {
    return homeAddress;
  }

  @Nullable
  @Override
  public W workAddress() {
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
      Person<?, ?, ?> that = (Person<?, ?, ?>) o;
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
  public Person.Builder<T, H, W> toBuilder() {
    return new Builder<T, H, W>(this);
  }

  static final class Builder<T, H, W> extends Person.Builder<T, H, W> {
    private Integer id;
    private ImmutableList<T> names;
    private ImmutableList<T> phones;
    private H homeAddress;
    private W workAddress;
    private Date birthday;
    Builder() {
    }
    private Builder(Person<T, H, W> source) {
      this.id = source.id();
      this.names = source.names();
      this.phones = source.phones();
      this.homeAddress = source.homeAddress();
      this.workAddress = source.workAddress();
      this.birthday = source.birthday();
    }
    @Override
    public Person.Builder<T, H, W> id(Integer id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public Person.Builder<T, H, W> names(ImmutableList<T> names) {
      if (names == null) {
        throw new NullPointerException("Null names");
      }
      this.names = names;
      return this;
    }
    @Override
    public Person.Builder<T, H, W> phones(ImmutableList<T> phones) {
      if (phones == null) {
        throw new NullPointerException("Null phones");
      }
      this.phones = phones;
      return this;
    }
    @Override
    public Person.Builder<T, H, W> homeAddress(H homeAddress) {
      if (homeAddress == null) {
        throw new NullPointerException("Null homeAddress");
      }
      this.homeAddress = homeAddress;
      return this;
    }
    @Override
    public Person.Builder<T, H, W> workAddress(@Nullable W workAddress) {
      this.workAddress = workAddress;
      return this;
    }
    @Override
    public Person.Builder<T, H, W> birthday(@Nullable Date birthday) {
      this.birthday = birthday;
      return this;
    }
    @Override
    public Person<T, H, W> build() {
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
      return new AutoValue_Person<T, H, W>(
          this.id,
          this.names,
          this.phones,
          this.homeAddress,
          this.workAddress,
          this.birthday);
    }
  }

}

