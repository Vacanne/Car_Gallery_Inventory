class Motorbike extends Vehicle {
    private boolean abs;
    private boolean seatHeating;

    public Motorbike(String modelName, int basePrice) {
        super(modelName, basePrice);
        this.abs = false;
        this.seatHeating = false;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
        if (abs) {
            addOptional("ABS");
        }
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
        if (seatHeating) {
            addOptional("Seat Heating");
        }
    }

    @Override
    public int getPrice() {
        int totalPrice = basePrice;

        for (String optional : optionals) {
            switch (optional) {
                case "ABS":
                    if (abs) {
                        totalPrice += 5000;
                    }
                    break;
                case "Seat Heating":
                    if (seatHeating) {
                        totalPrice += 2000;
                    }
                    break;
            }
        }
        return totalPrice;
    }
}
