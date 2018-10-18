package composite;

import entities.Client;

public class ClientLeaf extends ClientComponent{
   private Client client;

    public Client getClient() {
        return client;
    }

    public ClientLeaf(Client client) {
        this.client = client;
    }

    @Override
    public int number() {
        return 1;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(ClientComponent clientComponent) {
        // Do nothing because is leaf
    }

    @Override
    public void remove(ClientComponent clientComponent) {
        // Do nothing because is leaf
    }

    @Override
    public String view() {
        return this.client.getId();
    }
}
