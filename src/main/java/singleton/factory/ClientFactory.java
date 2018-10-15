package singleton.factory;

import entities.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private static final ClientFactory factory = new ClientFactory();
    private Map<String, Client> references;

    private ClientFactory() {
        this.references = new HashMap<>();
    }
    public static ClientFactory getFactory() {
        return factory;
    }
    public void addClient(Client client){ references.put(client.getId(),client);}

    public Client getReference(String key) {
        return references.computeIfAbsent(key, k -> references.get(key));
    }
    public void removeReference(String key) {
        this.references.remove(key);
    }
    public int numClients(){return references.size();}
}
