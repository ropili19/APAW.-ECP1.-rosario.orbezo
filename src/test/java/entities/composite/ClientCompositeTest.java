package entities.composite;

import composite.ClientComponent;
import composite.ClientComposite;
import composite.ClientLeaf;
import entities.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientCompositeTest {

        private Client client;
        private ClientComponent clientleaf;
        private ClientComponent clientComposite;

        @BeforeEach
        void before() {
            client = new Client("1","rosario");
            clientleaf = new ClientLeaf(client);
            clientComposite = new ClientComposite("Empleados empresa IECI S.A");
            clientComposite.add(clientleaf);
        }

        @Test
        private void testIsLeaf() {
            assertFalse(clientleaf.isComposite());

        }

        @Test
        void testIsNotLeaf() {
            assertTrue(clientComposite.isComposite());
        }

        @Test
        void testRemoveClientLeaf() {
          ClientComposite  c2 = new ClientComposite("Empleados empresa rab S.A");
          clientComposite.add(c2);
          assertEquals(2,clientComposite.number());
          clientComposite.remove(c2);
          assertEquals(1,clientComposite.number());
        }


}
