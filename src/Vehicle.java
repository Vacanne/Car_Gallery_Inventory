import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String modelName;
    protected int basePrice;
    protected List<String> optionals;

    public Vehicle(String modelName, int basePrice) {
        this.modelName = modelName;
        this.basePrice = basePrice;
        this.optionals = new ArrayList<>();
    }

    public abstract int getPrice();

    public void addOptional(String optional) {
        optionals.add(optional);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(modelName).append(" with");
        if (optionals.isEmpty()) {
            sb.append(" no optionals");
        } else {
            sb.append(" optionals: ");
            for (int i = 0; i < optionals.size(); i++) {
                sb.append(optionals.get(i));
                if (i < optionals.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(" having a total price of ").append(getPrice()).append(" TL");
        return sb.toString();
    }
}
