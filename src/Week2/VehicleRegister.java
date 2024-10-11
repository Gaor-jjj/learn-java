package Week2;

import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return null;
        }
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        System.out.println("Registration plates: ");
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        System.out.println("Owners:");
        HashSet<String> uniqueOwners = new HashSet<>(owners.values());
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
