class PotionVessel {
    String potionName;
    double volume;
    boolean isMagical;
    HogwartsStudent creator;
   
    public PotionVessel(String potionName, double volume, boolean isMagical, HogwartsStudent creator) {
        this.potionName = potionName;
        this.volume = volume;
        this.isMagical = isMagical;
        this.creator = creator;
    }

    public PotionVessel(double volume, HogwartsStudent creator) {
        this.potionName = "не известно";
        this.volume = volume;
        this.isMagical = false;
        this.creator = creator;
    }

    

    
}
