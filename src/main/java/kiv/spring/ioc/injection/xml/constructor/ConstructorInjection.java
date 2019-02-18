package kiv.spring.ioc.injection.xml.constructor;

public class ConstructorInjection implements MessageProvider {

    private final String message;

    public ConstructorInjection(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ConstructorInjection class contains dependency: \n\t" + message;
    }

}
