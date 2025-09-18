package alfert;

class Ship {
    String name;
    String captain;
// setter
    Ship(String name, String captain) {
        this.name = name;
        this.captain = captain;
    }
//getter
    public String toString() {
        return name + " | Capt. " + captain;
    }
}
