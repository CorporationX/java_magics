package entity.basics_programming.exceptions;

public class SpellTrainer {
    // по условию задачи метод main надо реализовать здесь же, в этом классе...
    public static void main(String[] args) {
        String[] spells = {"Expelliarmus", "Avada Kedavra", "Lumos", "Perceptio Recupero"};

        for (String spell : spells) {
            try {
                castSpell(spell);
            } catch (IllegalArgumentException e) {
                System.out.print("Ошибка обезоруживания: ");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.print("Общая магическая ошибка: ");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Закрываем поток магической энергии\n");
            }
        }
    }

    public static void castSpell(String spellName) {
        System.out.println("Начинаем произносить заклинание: \"" + spellName + "\"");
        switch (spellName) {
            case "Expelliarmus":
                // это мы в теме не проходили, но посмотрел, что можно создать экземпляр класса с сообщением и попробовал
                // реализовать, на мое удивление - получилось!
                // Как иначе сделать - не догадался, думал через еще один метод сделать и туда сообщение передавать,
                // но, реализованное ниже, попробовал - получилось и не стал иначе реализовывать
                IllegalArgumentException exception1 = new IllegalArgumentException("заклинание обезоруживания дало сбой");
                throw exception1;
                // По условию задачи Avada Kedavra - тоже RuntimeException, вынес в дефолт
//            case "Avada Kedavra":
//                RuntimeException exception2 = new RuntimeException("заклинание запрещено!");
//                throw exception2;
            case "Lumos":
                System.out.println("Заклинание успешно выполнено");
                break;
            default:
                RuntimeException exception2 = new RuntimeException("заклинание запрещено!");
                throw exception2;
        }
    }
}

