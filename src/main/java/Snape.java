class Snape extends Professor {
    public Snape() {
        super("Cеверус Снейп", "Зелеваренье");
    }
    @Override
    public void teach() {
        System.out.println("Сегодня я научу вас, как правильно варить зелья.");
    }

}
