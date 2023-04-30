package koschei.models;

import org.springframework.stereotype.Component;

// Бин Needle7 помечен как компонент, который конструируется через связывание по @Autowired с помощью конструктора в Egg6.
@Component
public class Needle7 {

    private Deth8 deth;
    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }
}
