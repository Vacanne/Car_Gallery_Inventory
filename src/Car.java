class Car extends Vehicle {
    private boolean abs;
    private boolean musicSystem;
    private boolean airbag;
    private boolean sunroof;

    // Car class with optionals
    public Car(String modelName, int basePrice) {
        super(modelName, basePrice);
        this.abs = false;
        this.musicSystem = false;
        this.airbag = false;
        this.sunroof = false;
    }

    //adding optionals between 17 amd 43
    public void setAbs(boolean abs) {
        this.abs = abs;
        if (abs) {
            addOptional("ABS");
        }
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
        if (musicSystem) {
            addOptional("Music System");
        }
    }

    public void setAirBag(boolean airbag) {
        this.airbag = airbag;
        if (airbag) {
            addOptional("Airbag");
        }
    }

    public void setSunRoof(boolean sunroof) {
        this.sunroof = sunroof;
        if (sunroof) {
            addOptional("Sunroof");
        }
    }

    @Override
    public int getPrice() {
        int totalPrice = basePrice;
        boolean absIncluded = false;
        boolean musicSystemIncluded = false;
        boolean airbagIncluded = false;
        boolean sunroofIncluded = false;

        for (String optional : optionals) {
            switch (optional) {
                case "ABS":
                    if (abs && !absIncluded) {
                        totalPrice += 5000;
                        absIncluded = true;
                    }
                    break;
                case "Music System":
                    if (musicSystem && !musicSystemIncluded) {
                        totalPrice += 1000;
                        musicSystemIncluded = true;
                    }
                    break;
                case "Airbag":
                    if (airbag && !airbagIncluded) {
                        totalPrice += 3000;
                        airbagIncluded = true;
                    }
                    break;
                case "Sunroof":
                    if (sunroof && !sunroofIncluded) {
                        totalPrice += 2000;
                        sunroofIncluded = true;
                    }
                    break;
            }
        }
        return totalPrice;
    }

}
