package composite;

public abstract class ClientComponent {


    public abstract boolean isComposite();

    public abstract void add(ClientComponent clienteComponent);

    public abstract void remove(ClientComponent cameraComponent);

    public abstract String view();

}
