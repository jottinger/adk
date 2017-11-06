package child.a;

public interface Greeter {
    default String getHello() { return getHello("world");}
    default String getHello(String target) { return "hello "+target; }
}
