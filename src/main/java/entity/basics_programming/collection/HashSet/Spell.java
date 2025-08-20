package entity.basics_programming.collection.HashSet;

import java.util.Objects;

// 1️⃣ Создайте класс Spell с полями String name и String incantation (название и заклинание).
public class Spell {
    private String name; // название
    private String incantation; // заклинани

    public String getName() {
        return name;
    }

    public String getIncantation() {
        return incantation;
    }

    public Spell(String name, String incantation) {
        this.name = name;
        this.incantation = incantation;
    }

    // Корректно переопределите методы equals() и hashCode() в классе Spell.
    // Два заклинания должны считаться одинаковыми, если у них одинаковые name и incantation.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Spell spell = (Spell) o;
        return Objects.equals(name, spell.name) && Objects.equals(incantation, spell.incantation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, incantation);
    }
}