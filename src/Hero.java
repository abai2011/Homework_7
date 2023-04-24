public class Hero {
    (int health, int damage, String superAbilityType) {


        this.health = health;


        this.damage = damage;


        this.superAbilityType = superAbilityType;
    }
    @Override
    public void applySuperAbility() {
        System.out.println(

                "Warrior применил суперспособность CRITICAL DAMAGE");
    }
}

//


// Реализация метода applySuperAbility() для героя-мага
@Override
public void applySuperAbility() {
        System.out.println("Magic применил суперспособность MAGIC SHIELD"

        );
        }
}
