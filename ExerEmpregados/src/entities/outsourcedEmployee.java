package entities;

public class outsourcedEmployee extends Employee {

    private Double addictionalCharge;

    public outsourcedEmployee() {
        super();
    }

    public outsourcedEmployee(String name, Integer hour, Double valuePerHour, Double adictionalCharge) {
        super(name, hour, valuePerHour);
        this.addictionalCharge = adictionalCharge;
    }

    public Double getAdictionalCharge() {
        return addictionalCharge;
    }

    public void setAdictionalCharge(Double adictionalCharge) {
        this.addictionalCharge = adictionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + addictionalCharge * 1.1;
    }
}
