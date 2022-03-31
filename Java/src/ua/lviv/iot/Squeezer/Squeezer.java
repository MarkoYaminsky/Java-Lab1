package ua.lviv.iot.Squeezer;

record Squeezer(String colour, Double maxJuiceAmountInLph, Double powerInKw, String producer,
                Double capacityInCubeDm, String countryProducer, Integer guaranteeAgeInM) {
    private static final String BRAND = "Bosch";

    public Squeezer(){
        this("red", 0.0, 0.0, null, 0.0, null, 0);}

    public Squeezer(String colour, double maxJuiceAmountInLph, double powerInKw) {
        this(colour, maxJuiceAmountInLph, powerInKw, null, 0.0, null, 0);}

    @Override
    public String toString() {
        return "Squeezer(colour = " + this.colour
                + ", maximum juice amount in liters per hour = " + this.maxJuiceAmountInLph
                + ", power in kilowatts = " + this.powerInKw
                + ", producer = " + this.producer
                + ", capacity in cube decimeters = " + this.capacityInCubeDm
                + ", country producer = " + this.countryProducer
                + ", guaranteed period in months " + this.guaranteeAgeInM
                + ")";
    }

    public static String getBrand(){
        return BRAND;
    }
}