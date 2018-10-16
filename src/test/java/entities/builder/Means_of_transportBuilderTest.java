package entities.builder;

import builder.Means_of_transportBuilder;
import entities.Means_of_transport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Means_of_transportBuilderTest {
    @Test
    void testFull() {
        Means_of_transport means_of_transport = new Means_of_transportBuilder("1").description("alvia madrid-valladolid").price(20).build();
        assertEquals("1", means_of_transport.getId());
        assertEquals("alvia madrid-valladolid", means_of_transport.getDescription());
        assertEquals(20, means_of_transport.getPrice());

    }
    @Test
    void testDescriptionisNull() {
        Means_of_transport means_of_transport = new Means_of_transportBuilder("1").build();
        Assertions.assertNull(means_of_transport.getDescription());
    }
}
