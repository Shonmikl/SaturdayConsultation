package saturday.patterns.builder;

public interface Builder {
    Builder setName(String name);
    Builder setAge(int age);
    Builder setSalary(double salary);
    Person build();
}

class PersonBuilder implements Builder {
    Person person = new Person();

    @Override
    public Builder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public Builder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public Builder setSalary(double salary) {
        person.setSalary(salary);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}