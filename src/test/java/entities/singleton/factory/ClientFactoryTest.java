package entities.singleton.factory;

import entities.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singleton.factory.ClientFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientFactoryTest {
    Client client;
    @BeforeEach
    void before() {
        client = new Client("1", "rosario","orbezo");
        ClientFactory.getFactory().addClient(client);
    }

    @Test
    void testGetReference() {

        assertEquals("rosario", ClientFactory.getFactory().getReference("1").getName());
        assertEquals("orbezo", ClientFactory.getFactory().getReference("1").getFirst_surname());
    }

    @Test
    void testRemoveReference() {

        assertEquals(1, ClientFactory.getFactory().numClients());
        ClientFactory.getFactory().removeReference("1");
        assertEquals(0, ClientFactory.getFactory().numClients());
    }
    @Test
    void testNumClient(){
        assertEquals(1, ClientFactory.getFactory().numClients());
    }

}
