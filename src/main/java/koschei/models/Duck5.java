package koschei.models;

// Duck5 связан с Egg6 через поле и аннотацию, которая подтянет бин Duck5 через метод getDuck() в классе AppConfig
public class Duck5 {
    private final Egg6 egg;

    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + "" + egg.toString();
    }
}
