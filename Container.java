package alfert;

class Container {
    String id;
    String description;
    int weight;

    Container(String id, String description, int weight) {
        this.id = id;
        this.description = description;
        this.weight = weight;
    }

    public String toString() {
        return id + " | " + description + " | " + weight + "kg";
    }
}
