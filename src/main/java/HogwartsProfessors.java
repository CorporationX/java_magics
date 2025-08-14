public class HogwartsProfessors {
    public static void main(String[] args) {
        Professor[] professors = {
                new Snape("Северус Снегг", "Зельеварение"),
                new McGonagall("Минерва МакГонагал", "Трансфигурация"),
                new Lupin("Ремус Люпин", "Защита от Тёмных Искусств")
        };

        for (Professor professor : professors) {
            professor.introduce();
            professor.teach();
            System.out.println();
        }
    }
}
