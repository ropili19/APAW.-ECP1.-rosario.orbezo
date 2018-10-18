package composite;

import java.util.ArrayList;
import java.util.List;

public class ClientComposite extends ClientComponent {

    List<ClientComponent> clientcomponentsList;
    private String name;

    public ClientComposite(String name) {
        this.name=name;
        clientcomponentsList=new ArrayList<>();
    }


    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(ClientComponent clienteComponent) {
        assert clienteComponent!=null;
        clientcomponentsList.add(clienteComponent);
    }

    @Override
    public void remove(ClientComponent clientComponent) {
    assert clientComponent!=null;
    clientcomponentsList.remove(clientComponent);
    }

    @Override
    public String view() {
      return name;
    }
}
