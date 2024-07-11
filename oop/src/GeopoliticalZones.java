public enum GeopoliticalZones {

    NORTH_CENTAL("Benue", "FCT","Kogi","Kwara","Nasarawa","Niger","Plateu"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private final String[] states;

    GeopoliticalZones(String... states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }

    public String findGeoPoliticalZone(String state) {
        for (GeopoliticalZones z : GeopoliticalZones.values()) {

            if (z.getStates()[0].equals(state)) {
                return z.getStates()[1];
            }
        }
        throw new IllegalArgumentException("No such geopolitical zone: " + state);
    }


}