package Collections;

import java.util.Objects;

public class Spell {
    private String name;
    private String incantation;

    public Spell(String name, String incantation) {
        this.name = name;
        this.incantation = incantation;
    }

    // equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если это тот же объект
        if (o == null || getClass() != o.getClass()) return false; // Проверка типа

        Spell spell = (Spell) o; // Приведение типа

        // Сравниваем оба поля
        return Objects.equals(name, spell.name) &&
                Objects.equals(incantation, spell.incantation);
    }

    // hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, incantation);
    }

    @Override
    public String toString() {
        return name + " (" + incantation + ")";
    }

    public String getName() {
        return name;
    }

    public String getIncantation() {
        return incantation;
    }
}