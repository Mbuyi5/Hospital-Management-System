package com.mpather47.git.entity.person;

import java.io.Serializable;

public class Person  {

    private String personId,name, dateOfBirth;
    private Person(){}
    private Person(Builder builder) {
        this.personId = builder.personId;
        this.name = builder.name;
        this.dateOfBirth = builder.dateOfBirth;
    }


    public String getPersonId()
    {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", date=" + dateOfBirth +
                '}';
    }

    public static class Builder{
        private String personId, name,dateOfBirth;

        public Builder setPersonId(String personId) {
            this.personId = personId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder copy(Person person){
            this.personId = person.personId;
            this.name = person.name;
            this.dateOfBirth = person.dateOfBirth;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}

