package builder;

import entities.Means_of_transport;

public class Means_of_transportBuilder {
    private String id;
    private Means_of_transport means_of_transport;

    public Means_of_transportBuilder(String id) {
        this.means_of_transport = new Means_of_transport(id);

    }
    public Means_of_transportBuilder(String id,int price,String description) {
        this.means_of_transport = new Means_of_transport(id,price,description);

    }

    public Means_of_transportBuilder description(String description) {
        this.means_of_transport.setDescription(description);
        return this;
    }

    public Means_of_transportBuilder price(int price) {
        this.means_of_transport.setPrice(price);
        return this;
    }


    public Means_of_transport build() {
            return this.means_of_transport;
        }

}
