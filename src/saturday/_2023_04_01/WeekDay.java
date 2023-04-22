package saturday._2023_04_01;

public enum WeekDay {
    MONDAY,FRIDAY
}

enum EnglishLevel {
    A1, A2, B1, B2, C1, C2
}

class Person {
    EnglishLevel englishLevel;

    public Person(EnglishLevel englishLevel) {
        this.englishLevel = englishLevel;
    }
}

class Week {
    public static final String monday = "MONDAY";
}

class Main {
    public static void main(String[] args) {
      Person person = new Person(EnglishLevel.B2);
      Syst s1 = new Syst(Currency.EUR);
      Syst s2 = new Syst(Currency.USD);
    }
}

class Syst {
    Currency currency;

    public Syst(Currency currency) {
        this.currency = currency;
    }
}

enum Currency {
    USD, RUR, EUR,
}