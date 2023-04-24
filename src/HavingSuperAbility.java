public interface HavingSuperAbility {
    void
}


}


        }

        applySuperAbility




        String superAbilityType;

        Hero(
        String superAbilityType;

        Hero

        String superAbilityType;



        String superAbilityType;










        }
        }




        }


        String superAbilityType;

        Hero(
        }
        }


        Magic(




        }


        }



        }






        System.out.println(
        System



        }
        }


        }

        String superAbilityType;

        Hero(
        }
        }


        Magic(
        super(health, damage, superAbilityType);
        }

@Override

        System.
                }
                }


                }


                String superAbilityType;

                Hero(
                }
                }


                Magic(
                }


                String superAbilityType;

                Hero(
                }
                }


                Magic(
                super(health, damage, superAbilityType);
                }

@Override

        System.
                }
                }


                }


                String superAbilityType;

                Hero(
                }
                }


                Magic(
                }


                }


                int health;
                int damage;



                }
                }


                }

                ();
                }

// Абстрактный класс героя
abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }
}

// Класс Магия
class Magic extends Hero {
    Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(
                System.out.println(
                        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}


    }
            }


            }
            }

// Класс Медик


            Medic(class Medic extends
        super(health, damage, superAbilityType);
                Hero {

                }
                }


                }



                int healPoints;

                Medic(

                Medic(

                Medic(




                int health, int damage, String superAbilityType, int healPoints) {


                super(health, damage, superAbilityType);

                int healPoints;



                this.healPoints = healPoints;
                }


                }


                }

@Override

    }


            }



            }



// Метод увеличения опыта лечения на 10%

            System.

public void
        }
        }

        increaseExperience


        }


        }







        System.out.println(
        System.out.println

        System.out

        System



        }
        }


        }



        }


        }

        () {
        this.healPoints = (int) (this.healPoints * 1.1);
        }

@Override
public void applySuperAbility() {
        System.out.println(
        System.out.println("Medic применил суперспособность " + superAbilityType);
        }
        }


        }


        }
        }

// Класс Воин
class Warrior extends Hero {
    Warrior(
            Warrior(
            Warrior


            int health, int damage, String superAbilityType) {


        super(health, damage, superAbilityType);
    }


}


    }

@


@Override

    }
            }



public void applySuperAbility
        System.out.println(
        System.out.println

        System.out

        System



        }
        }




        }

        () {
        System.out.println("Warrior применил суперспособность " + superAbilityType);
        }
        }

        }
