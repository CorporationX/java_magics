class Snape extends Professor {
    public Snape() {
        super("Северус Снегг", "Зельеварение");
    }

    @Override
    public void teach() {
        System.out.println("Сегодня я вас научу как правильно варить зелья.");
    }
}
